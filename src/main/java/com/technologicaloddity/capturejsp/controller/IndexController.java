package com.technologicaloddity.capturejsp.controller;

import java.util.*;

import javax.servlet.http.HttpServletResponse;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.technologicaloddity.capturejsp.util.SwallowingJspRenderer;

@Controller
public class IndexController {
	
	@Autowired
	private SwallowingJspRenderer jspRenderer;
	
	private static final Logger log = Logger.getLogger(IndexController.class);
		
	@RequestMapping(value="/index.html")
	public String handleRequest(Model model,HttpServletResponse response, @RequestParam(value="locale", required=false) String requestedLocale) {
		
		// Set the output of index.jsp to UTF-8, so we can see things like the Euro symbol
		response.setCharacterEncoding("UTF-8");
		response.setContentType("text/html; charset=utf-8");
		
		// Add a message to index.jsp's model
		model.addAttribute("message", "Hello Web World!");
		
		try {
			Locale locale = Locale.getDefault();
			
			// If the user passes in a ?locale=foo line, parse it and 
			// use that as a locale
			if(requestedLocale != null && StringUtils.hasText(requestedLocale)) {
				if(requestedLocale.contains("_")) {
					String[] parts = requestedLocale.split("_",2);
					locale = new Locale(parts[0], parts[1]);
				} else {
					locale = new Locale(requestedLocale);
				}
			}
			
			// build the map for the object that go to the JSP we want to render
			// that is to captureme.jsp
			Map<String,Object> jspMap = new HashMap<String,Object>();
			jspMap.put("localeUsed", locale);
			jspMap.put("jspMessage", "This is the value of jsp message");
			jspMap.put("costMessage", 4567.89);			
			String jspOutput = jspRenderer.render("capture/captureme", jspMap, locale);
			
			// add the String that represents the JSP to the model of the index page
			model.addAttribute("jspoutput", jspOutput);
			
		} catch(Exception e) {
			log.error(e);
		}
		return "index";
	}
	
}
