package com.OpenAI.ChatBot;

public class ChatBotMessage {
	
		private String role;
	    private String content;//prompt
	    
	    public ChatBotMessage(String role, String content) {
			super();
			this.role = role;
			this.content = content;
		}

		public String getRole() {
			return role;
		}

		public void setRole(String role) {
			this.role = role;
		}

		public String getContent() {
			return content;
		}

		public void setContent(String content) {
			this.content = content;
		}
}
