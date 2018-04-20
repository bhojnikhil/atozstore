/**
 * 
 */
package com.surveyproject.atozstore.site.web.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author Nikhil
 *
 */
@Controller
public class ErrorController extends AToZStoreSiteBaseController
{
	private static final String viewPrefix = "error/";
	
	@Override
	protected String getHeaderTitle()
	{
		return "Error";
	}
	
	@RequestMapping("/403")
	public String accessDenied()
	{
		return viewPrefix+"accessDenied";
	}
	
	/*@RequestMapping("/error")
	public String error()
	{
		return viewPrefix+"error";
	}*/
}
