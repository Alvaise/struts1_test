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
import it.alpi.util.Risposta;
import it.alpi.util.Utils;

public class QuizAction extends Action{
	
	public ActionForward execute(
			ActionMapping mapping,
			ActionForm form,
			HttpServletRequest request,
			HttpServletResponse response
			) throws Exception{
				
			QuizForm quiz = (QuizForm) form;
			
			List<QuizForm>questions = new ArrayList<>();
			
			List<String> q = getQuiz("C:\\Users\\spadea\\eclipse-workspace\\struts1_prj01\\WebContent\\file\\fakeDb\\question.txt");
			List<String> ra = getQuiz("C:\\Users\\spadea\\eclipse-workspace\\struts1_prj01\\WebContent\\file\\fakeDb\\right_answer.txt");
			List<String> wa = getQuiz("C:\\Users\\spadea\\eclipse-workspace\\struts1_prj01\\WebContent\\file\\fakeDb\\wrong_answer.txt");
			List<Risposta> risposte = new ArrayList<Risposta>();
			
			for (int i = 0; i < q.size(); i++) {
				quiz = new QuizForm();
				quiz.setQuestion(q.get(i));
				
				Risposta rg = new Risposta();
				rg.setIndex(0);
				rg.setDescrizione(ra.get(i));
				rg.setEsito(true);
				
				Risposta rs = new Risposta(); 
				rs.setIndex(0);
				rs.setDescrizione(wa.get(i));
				rs.setEsito(false);
				
				risposte.add(rs);
				risposte.add(rg);
				
				quiz.setRisposte(risposte);
				
				questions.add(quiz);
			}
		
			return mapping.findForward("success");
	
	}
	
	public ArrayList<String> getQuiz(String path) {
		
		ArrayList<String> list = Utils.readFile(path);
		
		return list;
		
		
	}
	
	

}
