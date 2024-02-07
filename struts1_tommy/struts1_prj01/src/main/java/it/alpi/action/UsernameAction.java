package it.alpi.action;

import java.io.File;
import java.io.FileNotFoundException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;


import it.alpi.form.UsernameForm;

public class UsernameAction extends Action {
	
	public ActionForward execute(
			ActionMapping mapping,
			ActionForm form,
			HttpServletRequest request,
			HttpServletResponse response
			) throws Exception{
				
				UsernameForm usernameForm = (UsernameForm) form;
				
				String username = usernameForm.getUsername();
				
				request.setAttribute("username", username);
				
				boolean validUsername = UsernameValid(username);
				
				if(validUsername) {
					return mapping.findForward("allowed");
				}else {
					return mapping.findForward("not_allowed");
				}
				
		
		
	}
	
	public Boolean UsernameValid(String username) {
		// Read from the fake db 
		File fakeDb = new File("C:\\Users\\spadea\\eclipse-workspace\\struts1_prj01\\WebContent\\file\\fakeDb\\users_db.txt");
		
		try {
			java.util.Scanner sc = new java.util.Scanner(fakeDb);
			
			while ( sc.hasNextLine()) {
				
				String data = sc.nextLine();
				// If Username correspond to a username that is present in the fakedb return true else false
				if (data.equals(username)) {
					sc.close();
					return true;
				}
			}
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return false;
		
	}

}
