
package com.technologicaloddity.capturejsp.util;

import javax.annotation.PostConstruct;

import org.springframework.context.support.ReloadableResourceBundleMessageSource;
import org.springframework.stereotype.Component;

@Component("messageSource")
public class TechOddMessageSource extends ReloadableResourceBundleMessageSource {

	@PostConstruct
	public void init() {
		setBasename("classpath:/messages/messages");
	}
	
}
