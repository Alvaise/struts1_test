package it.alpitour.action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

import it.alpitour.form.UsernameForm;

public class UsernameAction extends Action {
	
	public ActionForward execute(
			ActionMapping mapping,
			ActionForm form,
			HttpServletRequest request,
			HttpServletResponse response
			) throws Exception{
		
		UsernameForm username = (UsernameForm) form;
		
		String name = username.getUsername();
		if(name.length() > 0) {
			
			return mapping.findForward("success"); 
		}else {
			return mapping.findForward("failure");
		}
	}

}
