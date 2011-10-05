/**
 * (c) 2010 Technological Oddity
 *     http://technologicaloddity.com
 *
 * I, Bob Robinson, the author of this work hereby release it
 * under the Creative Commons-By Attribution 3.0 license for
 * both commercial and non-commercial purposes.
 * See the license at:
 * http://creativecommons.org/licenses/by/3.0/
 */
package com.technologicaloddity.capturejsp.util;

import org.springframework.stereotype.Component;
import org.springframework.web.servlet.view.JstlView;
import org.springframework.web.servlet.view.UrlBasedViewResolver;

/**
 * @author Bob Robinson, http://technologicaloddity.com
 * 
 * Define a view resolver as a component, so that we don't have to define it as XML
 * 
 * Given view name "foo", this view resolver returns "/WEB-INF/jsp/foo.jsp"
 * 
 */
@Component
public class ViewResolver extends UrlBasedViewResolver {

	/* (non-Javadoc)
	 * @see org.springframework.web.servlet.view.UrlBasedViewResolver#getViewClass()
	 */
	@Override
	protected Class<JstlView> getViewClass() {		
		return JstlView.class;
	}
	
	/* (non-Javadoc)
	 * @see org.springframework.web.servlet.view.UrlBasedViewResolver#getSuffix()
	 */
	@Override
	protected String getSuffix() {
		return ".jsp";
	}
	
	/* (non-Javadoc)
	 * @see org.springframework.web.servlet.view.UrlBasedViewResolver#getPrefix()
	 */
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
