/**
 * 
 */
package com.surveyproject.atozstore.site.web.utils;

import javax.servlet.http.HttpServletRequest;

/**
 * @author Nikhil
 *
 */
public class WebUtils
{
	private WebUtils()
	{
	}
	public static final String IMAGES_PREFIX = "/products/images/";
	public static final String IMAGES_DIR = "C:/atozstore/products/";
	
	public static String getURLWithContextPath(HttpServletRequest request)
	{
		return request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort()
				+ request.getContextPath();
	}
}
