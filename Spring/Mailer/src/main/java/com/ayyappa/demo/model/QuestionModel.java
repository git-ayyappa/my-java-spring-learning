package com.ayyappa.demo.model;

public class QuestionModel {
		private long qid;
		private String question;
		public QuestionModel() {
			super();
		}
		public QuestionModel(long qid, String question) {
			super();
			this.qid = qid;
			this.question = question;
		}
		public long getQid() {
			return qid;
		}
		public void setQid(long qid) {
			this.qid = qid;
		}
		public String getQuestion() {
			return question;
		}
		public void setQuestion(String question) {
			this.question = question;
		}
		@Override
		public String toString() {
			return "QuestionModel [qid=" + qid + ", question=" + question + "]";
		}
		
}
