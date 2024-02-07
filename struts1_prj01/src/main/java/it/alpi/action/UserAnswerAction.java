package it.alpi.action;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

import it.alpi.util.Utils;

public class UserAnswerAction extends Action{
	
	public ActionForward execute(
			ActionMapping mapping,
			ActionForm form,
			HttpServletRequest request,
			HttpServletResponse response
			) throws Exception{
				
			List<String> rightAnswer = getQuiz("C:\\Users\\spadea\\eclipse-workspace\\struts1_prj01\\WebContent\\file\\fakeDb\\right_answer.txt");	
			
			System.out.println("User Action");
			return mapping.findForward("success");	
	}
			
public ArrayList<String> getQuiz(String path) {
		
		ArrayList<String> list = Utils.readFile(path);
		
		return list;
		
		
	}
}
