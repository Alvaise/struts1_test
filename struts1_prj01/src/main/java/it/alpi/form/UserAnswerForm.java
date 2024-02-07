package it.alpi.form;

import java.util.List;

import org.apache.struts.action.ActionForm;

import it.alpi.util.UserAnswer;

public class UserAnswerForm extends ActionForm{
	
	private List<UserAnswer> answers;

	/**
	 * @return the answers
	 */
	public List<UserAnswer> getAnswers() {
		return answers;
	}

	/**
	 * @param answers the answers to set
	 */
	public void setAnswers(List<UserAnswer> answers) {
		this.answers = answers;
	}
	
	

}
