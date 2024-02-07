package it.alpi.form;

import java.util.List;

import org.apache.struts.action.ActionForm;

import it.alpi.util.Risposta;

public class QuizForm extends ActionForm{
	
	private String question;
	private List<Risposta> risposte;


	public String getQuestion() {
		return question;
	}

	public void setQuestion(String question) {
		this.question = question;
	}

	public List<Risposta> getRisposte() {
		return risposte;
	}

	public void setRisposte(List<Risposta> risposte) {
		this.risposte = risposte;
	}

	
	
	

}
