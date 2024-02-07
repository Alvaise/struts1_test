package it.alpi.form;

import java.util.List;

import org.apache.struts.action.ActionForm;

import it.alpi.util.Question;

public class QuizForm extends ActionForm{
	
	private List<Question> questions;
	
	
	public List<Question> getQuestions() {
		return questions;
	}
	public void setQuestions(List<Question> questions) {
		this.questions = questions;
	}
	
	
}
