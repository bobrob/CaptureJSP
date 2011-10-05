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

import javax.annotation.PostConstruct;

import org.springframework.context.support.ReloadableResourceBundleMessageSource;
import org.springframework.stereotype.Component;

/**
 * @author Bob Robinson, http://technologicaloddity.com
 *
 */
@Component("messageSource")
public class CaptureMessageSource extends ReloadableResourceBundleMessageSource {

	@PostConstruct
	public void init() {
		setBasename("classpath:/messages/messages");
	}
	
}
