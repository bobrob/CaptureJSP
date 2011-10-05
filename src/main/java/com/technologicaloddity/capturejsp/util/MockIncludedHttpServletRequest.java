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

import javax.servlet.DispatcherType;

import org.springframework.mock.web.MockHttpServletRequest;

/**
 * @author Bob Robinson, http://technologicaloddity.com
 *
 */
public class MockIncludedHttpServletRequest extends MockHttpServletRequest {
	
	public MockIncludedHttpServletRequest() {
		super();
	}
	
	@Override
	public DispatcherType getDispatcherType() {		
		return DispatcherType.INCLUDE;
	}

	@Override
	public boolean isAsyncSupported() {
		return false;
	}
}
