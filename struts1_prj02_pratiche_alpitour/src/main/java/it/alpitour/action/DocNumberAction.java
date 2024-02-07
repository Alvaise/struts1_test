package it.alpitour.action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

import it.alpitour.form.DocNumberForm;

public class DocNumberAction extends Action{
	
	public ActionForward execute(
			ActionMapping mapping,
			ActionForm form,
			HttpServletRequest request,
			HttpServletResponse response
			) throws Exception{
			
			System.out.println("Doc Number Action");
			DocNumberForm docNumberForm = (DocNumberForm) form;
			
			String docNumber = docNumberForm.getDocumentNumber();
			
			request.setAttribute("docNumber", docNumber);
			
			if(docNumber.matches("^[0-9]{7}$")) {
				
				return mapping.findForward("validDocNumber");
			}
		
			return mapping.findForward("invalidDocNumber");
		
	}

}
