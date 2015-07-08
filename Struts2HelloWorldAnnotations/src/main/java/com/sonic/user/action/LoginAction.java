/**
 * 
 */
package com.sonic.user.action;

import org.apache.struts2.convention.annotation.Namespace;
import org.apache.struts2.convention.annotation.Result;
import org.apache.struts2.convention.annotation.ResultPath;
 
import com.opensymphony.xwork2.ActionSupport;
 
@Namespace("/user")
@ResultPath(value="/")
@Result(name="success",location="/jsp/login.jsp")
public class LoginAction extends ActionSupport{

}
