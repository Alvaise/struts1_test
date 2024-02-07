package it.alpi.util;

public class Question {
	private String questionText;
	private String correctAnswer;
	private String wrongAnswer;
	
	public Question(String questionText, String correctAnswer, String wrongAnswer) {
		this.questionText = questionText;
		this.correctAnswer = correctAnswer;
		this.wrongAnswer = wrongAnswer;
	}

	public String getQuestionText() {
		return questionText;
	}

	public void setQuestionText(String questionText) {
		this.questionText = questionText;
	}

	public String getCorrectAnswer() {
		return correctAnswer;
	}

	public void setCorrectAnswer(String correctAnswer) {
		this.correctAnswer = correctAnswer;
	}

	public String getWrongAnswer() {
		return wrongAnswer;
	}

	public void setWrongAnswer(String wrongAnswer) {
		this.wrongAnswer = wrongAnswer;
	}
	
	
}
