/**
 * 
 */
package com.sonic.user.action;

/**
 * @author Sandeep
 *
 */
public class WelcomeUserAction{
	 
	/**
	 * 
	 */
	private String username;
 
	/**
	 * 
	 * @return
	 */
	public String getUsername() {
		return username;
	}
 
	/**
	 * 
	 * @param username
	 */
	public void setUsername(String username) {
		this.username = username;
	}
 
	/**
	 * 
	 * @return
	 */
	public String execute() {
 
		return "SUCCESS";
 
	}
}