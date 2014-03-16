/**
 * @Project: Struts2Demo
 * @Title: GlobalResultTest.java
 * @Package com.ender.struts2.demo.helloWorld
 * @Description: TODO
 * Copyright: Copyright (c) 2010 
 * Company:ENDER.crop
 * 
 * @author ender
 * @date 2013-7-17 下午10:08:41
 * @version V1.0.0
 */
package com.ender.struts2.demo.helloWorld;

import java.io.UnsupportedEncodingException;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts2.ServletActionContext;


/**
 * @ClassName: GlobalResultTest
 * @Description: TODO
 * @author ender
 * @date 2013-7-17 下午10:08:41
 *
 */
public class GlobalResultTest {
	
	public String test404(){
		System.out.println("test404.action");
		return "404";
	}
	
	private String actionParam;
	
	public String testError() throws UnsupportedEncodingException{
		System.out.println("testErrorAction");
		//struts2 中获取httpservletrequest的方法
		HttpServletRequest request=ServletActionContext.getRequest();
		request.setCharacterEncoding("utf-8");
		//如果不使用成员变量set方法获取struts2中action内的param可以使用request.getAttribute方法
		String actionParam1 = (String) request.getAttribute("ActionParam");
		Map<String,String[]> map=request.getParameterMap();
		for(String s:map.keySet()){
			System.out.println("-----");
			System.out.println(s+":");
			System.out.println(map.get(s)[0].toString());
		}
		System.out.println("actionParam1:"+actionParam1);
		actionParam="["+actionParam+"]";
		request.setAttribute("errorMessage", actionParam);
		return "error";
	}

	/**
	 * @return the actionParam
	 */
	public String getActionParam() {
		return actionParam;
	}

	/**
	 * @param actionParam the actionParam to set
	 */
	public void setActionParam(String actionParam) {
		this.actionParam = actionParam;
	}
}
