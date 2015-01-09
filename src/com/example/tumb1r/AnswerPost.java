package com.example.tumb1r;

public class AnswerPost extends Post {

	private String askingName;
	private String askingUrl;
	private String question;
	private String answer;
	
	public AnswerPost(long id, String type, long timestamp, String state, String tags, String askingName, String askingUrl, String question, String answer) {
		super(id, type, timestamp, state, tags);
		this.askingName = askingName;
		this.askingUrl = askingUrl;
		this.question = question;
		this.answer = answer;
	}

	public String getAskingName() {
		return askingName;
	}



	public void setAskingName(String askingName) {
		this.askingName = askingName;
	}



	public String getAskingUrl() {
		return askingUrl;
	}



	public void setAskingUrl(String askingUrl) {
		this.askingUrl = askingUrl;
	}



	public String getQuestion() {
		return question;
	}



	public void setQuestion(String question) {
		this.question = question;
	}



	public String getAnswer() {
		return answer;
	}



	public void setAnswer(String answer) {
		this.answer = answer;
	}



	@Override
	public String toString() {
		return question + "(" + this.getType() + ")";
	}
	
	public String getHeader() {
		return question;
	}
}
