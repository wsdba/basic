package com.ladeal.basic.action;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.ActionSupport;

public class BaseAction extends ActionSupport{
	protected HttpServletRequest getRequest(){
		return ServletActionContext.getRequest();
	}
	
	protected HttpServletResponse getResponse(){
		return ServletActionContext.getResponse();
	}
	
	protected HttpSession getSession(){
		return getRequest().getSession();
	}
	
	protected String getStrParam(String key){
		return getStrParam(key);
	}
	
	protected void outJson(String error){
        this.getResponse().setContentType("text/html;charset=UTF-8");
        try
        {
            PrintWriter out = getResponse().getWriter();
            out.write(error);
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
	}
}
