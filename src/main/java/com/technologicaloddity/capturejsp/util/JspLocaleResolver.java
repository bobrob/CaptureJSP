/**
 * (c) 2011 Technological Oddity
 *     http://technologicaloddity.com
 *
 * I, Bob Robinson, the author of this work hereby release it
 * under the Creative Commons-By Attribution 3.0 license for
 * both commercial and non-commercial purposes.
 * See the license at:
 * http://creativecommons.org/licenses/by/3.0/
 */
package com.technologicaloddity.capturejsp.util;

import java.util.Locale;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.LocaleResolver;

/**
 * @author Bob Robinson, http://technologicaloddity.com
 *
 */
public class JspLocaleResolver implements LocaleResolver {

	private static final String JSP_LOCALE = "com.technologicaloddity.capturejsp.LOCALE";
		
	/* (non-Javadoc)
	 * @see org.springframework.web.servlet.LocaleResolver#resolveLocale(javax.servlet.http.HttpServletRequest)
	 */
	@Override
	public Locale resolveLocale(HttpServletRequest request) {
		Locale locale = (Locale)request.getAttribute(JSP_LOCALE);
		if(null==locale) {
			locale = Locale.getDefault();
		}
		return locale;
	}

	/* (non-Javadoc)
	 * @see org.springframework.web.servlet.LocaleResolver#setLocale(javax.servlet.http.HttpServletRequest, javax.servlet.http.HttpServletResponse, java.util.Locale)
	 */
	@Override
	public void setLocale(HttpServletRequest request, HttpServletResponse response, Locale locale) {
		if(locale == null) {
			locale = Locale.getDefault();
		}
		response.setLocale(locale);
		request.setAttribute(JSP_LOCALE, locale);

	}

}

