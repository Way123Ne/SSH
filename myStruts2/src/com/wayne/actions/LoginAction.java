package com.wayne.actions;

import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

import com.wayne.forms.UserForm;

public class LoginAction extends Action {

	@Override
	public ActionForward execute(ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response)
			throws Exception {
		// TODO Auto-generated method stub
//		return super.execute(mapping, form, request, response);
		
		UserForm userForm = (UserForm) form;
		System.out.println("用户名:"+userForm.getUsername());
		
		//简单验证
		if("123".equals(userForm.getPassword())){
			request.setAttribute("username",userForm.getUsername());
			return mapping.findForward("ok");
		}else{
			return mapping.findForward("err");
		}
	}

	

}
