/**
 * Licensed to Jasig under one or more contributor license
 * agreements. See the NOTICE file distributed with this work
 * for additional information regarding copyright ownership.
 * Jasig licenses this file to you under the Apache License,
 * Version 2.0 (the "License"); you may not use this file
 * except in compliance with the License. You may obtain a
 * copy of the License at:
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on
 * an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied. See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */
package org.jasig.portal.portlet.container.services;

import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.util.Collection;
import java.util.Locale;

import javax.portlet.CacheControl;
import javax.portlet.PortletMode;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.pluto.container.PortletContainer;
import org.apache.pluto.container.PortletRenderResponseContext;
import org.apache.pluto.container.PortletURLProvider;
import org.apache.pluto.container.PortletWindow;
import org.apache.pluto.container.PortletURLProvider.TYPE;
import org.jasig.portal.portlet.rendering.IPortletRenderer;

/**
 * @author Nicholas Blair, npblair@wisc.edu
 * @version $Revision$
 */
public class PortletRenderResponseContextImpl extends PortletResponseContextImpl implements
		PortletRenderResponseContext {

	PortletRenderResponseContextImpl(PortletContainer container,
			HttpServletRequest containerRequest,
			HttpServletResponse containerResponse, PortletWindow window) {
		super(container, containerRequest, containerResponse, window);
		// TODO Auto-generated constructor stub
	}

	/*
	 * PLT.12.6.1
	 * 
	 * @see org.apache.pluto.container.PortletRenderResponseContext#setNextPossiblePortletModes(java.util.Collection)
	 */
	@Override
	public void setNextPossiblePortletModes(Collection<PortletMode> portletModes) {
		
		
	}

	@Override
	public void setTitle(String title) {
		if(isCommitted()) {
			//ignore
		} else {
			getServletRequest().setAttribute(IPortletRenderer.ATTRIBUTE__PORTLET_TITLE, title);
		}
		
	}

	@Override
	public void flushBuffer() throws IOException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public int getBufferSize() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public CacheControl getCacheControl() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getCharacterEncoding() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getContentType() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Locale getLocale() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public OutputStream getOutputStream() throws IOException,
			IllegalStateException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public PortletURLProvider getPortletURLProvider(TYPE type) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public PrintWriter getWriter() throws IOException, IllegalStateException {
		return getServletResponse().getWriter();
	}

	@Override
	public boolean isCommitted() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void reset() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void resetBuffer() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void setBufferSize(int size) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void setContentType(String contentType) {
		// TODO Auto-generated method stub
		
	}

	

}
