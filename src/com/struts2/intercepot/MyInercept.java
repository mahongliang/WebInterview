package com.struts2.intercepot;

import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.interceptor.AbstractInterceptor;

public class MyInercept extends AbstractInterceptor{

	@Override
	public String intercept(ActionInvocation invocation) throws Exception {
		// TODO Auto-generated method stub
		
		String output="pre-processing";
		System.out.println(output);
		String result = invocation.invoke();
		output="post-processing";
		System.out.println(output);
		System.out.println("result= "+result);
		return result;
	}

}
