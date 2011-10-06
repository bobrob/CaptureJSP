
package com.technologicaloddity.capturejsp.util;

import org.springframework.stereotype.Component;
import org.springframework.web.servlet.view.JstlView;
import org.springframework.web.servlet.view.UrlBasedViewResolver;

@Component
public class ViewResolver extends UrlBasedViewResolver {

	@Override
	protected Class<JstlView> getViewClass() {		
		return JstlView.class;
	}
	
	@Override
	protected String getSuffix() {
		return ".jsp";
	}
	
	@Override
	protected String getPrefix() {
		return "/WEB-INF/jsp/";
	}
	
	public String urlForView(String view) {
		String result = view;
		if(getPrefix() != null) {
			result = getPrefix() + result;
		}
		if(getSuffix() != null) {
			result = result + getSuffix();
		}
		return result;
	}
}
