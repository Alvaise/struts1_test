package com.example;

import org.apache.struts.action.Action;

public class HelloAction extends Action{
	
	@Override
    public ActionForward execute(
            ActionMapping mapping,
            ActionForm form,
            HttpServletRequest request,
            HttpServletResponse response) {

        HelloForm helloForm = (HelloForm) form;
        helloForm.setMessage("Hello, Struts 1!");

        return mapping.findForward("success");
    }

}
