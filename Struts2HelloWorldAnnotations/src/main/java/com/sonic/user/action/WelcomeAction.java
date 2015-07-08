/**
 * 
 */
package com.sonic.user.action;

import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Namespace;
import org.apache.struts2.convention.annotation.Result;
import org.apache.struts2.convention.annotation.ResultPath;
 
import com.opensymphony.xwork2.ActionSupport;
 
/**
 * 
 * @author Sandeep
 *
 */
@Namespace("/user")
@ResultPath(value="/")
public class WelcomeAction extends ActionSupport{
 
	private String username;
 
	public String getUsername() {
		return username;
	}
 
	public void setUsername(String username) {
		this.username = username;
	}
 
	@Action(value="welcome", results={
		@Result(name="success",location="/jsp/welcome.jsp")
	})
	public String execute() {
 
		return SUCCESS;
 
	}
}