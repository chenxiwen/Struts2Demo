/**
 * @Project: Struts2Demo
 * @Title: HelloWorld.java
 * @Package com.ender.struts2.demo.helloWorld
 * @Description: TODO
 * Copyright: Copyright (c) 2010 
 * Company:ENDER.crop
 * 
 * @author ender
 * @date 2013-7-13 下午3:55:44
 * @version V1.0.0
 */
package com.ender.struts2.demo.helloWorld;

import com.opensymphony.xwork2.ActionSupport;

/**
 * @ClassName: HelloWorld
 * @Description: TODO
 * @author ender
 * @date 2013-7-13 下午3:55:44
 *
 */
public class HelloWorld {
	
	private String name;
	private String message;
	/**
	 * 
	  * @author ender
	  * welcome(welcome action)
	  * @Title: welcome
	  * @Description: TODO
	  * @param @return    设定文件
	  * @return String    返回类型
	  * @throws
	 */
	public String welcome(){
		return ActionSupport.SUCCESS;
	}

	/**
	 *  @author ender
	  * sayHi(the first method or action for struts2)
	  * @Title: sayHi
	  * @Description: TODO
	  * @param @return    设定文件
	  * @return String    返回类型
	  * @throws
	 */
	public String sayHi(){
		System.out.println("sayHi.action");
		setMessage("welcome to ender's struts demo!");
		return "success";
	}
	
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}


	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the message
	 */
	public String getMessage() {
		return message;
	}


	/**
	 * @param message the message to set
	 */
	public void setMessage(String message) {
		this.message = message;
	}
}
