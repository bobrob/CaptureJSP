
package com.technologicaloddity.capturejsp.util;

import javax.servlet.DispatcherType;

import org.springframework.mock.web.MockHttpServletRequest;


public class MockIncludedHttpServletRequest extends MockHttpServletRequest {
	
	public MockIncludedHttpServletRequest() {
		super();
		this.setMethod(HttpMethod.GET.name());
	}
	
	public DispatcherType getDispatcherType() {		
		return DispatcherType.INCLUDE;
	}

	public boolean isAsyncSupported() {
		return false;
	}
}
