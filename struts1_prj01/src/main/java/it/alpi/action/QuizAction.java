package it.alpi.action;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.util.LabelValueBean;


import it.alpi.form.QuizForm;
import it.alpi.util.Question;
import it.alpi.util.Utils;

public class QuizAction extends Action{
	
	public ActionForward execute(
			ActionMapping mapping,
			ActionForm form,
			HttpServletRequest request,
			HttpServletResponse response
			) throws Exception{
				
			
			List<String> questTxt = getQuiz("C:\\Users\\spadea\\eclipse-workspace\\struts1_prj01\\WebContent\\file\\fakeDb\\question.txt");
			List<String> answerTxt = getQuiz("C:\\Users\\spadea\\eclipse-workspace\\struts1_prj01\\WebContent\\file\\fakeDb\\right_answer.txt");
			List<String> wrongAnsTxt = getQuiz("C:\\Users\\spadea\\eclipse-workspace\\struts1_prj01\\WebContent\\file\\fakeDb\\wrong_answer.txt");
			
			List<Question> questions = new ArrayList<Question>();
			
			for (int i = 0; i < questTxt.size(); i++) {
				
				questions.add(new Question (questTxt.get(i),answerTxt.get(i),wrongAnsTxt.get(i)));
			}
			
			QuizForm quiz = (QuizForm) form;
			
			quiz.setQuestions(questions);
			
			return mapping.findForward("success");
	
	}
	
	public ArrayList<String> getQuiz(String path) {
		
		ArrayList<String> list = Utils.readFile(path);
		
		return list;
		
		
	}
	
	

}
