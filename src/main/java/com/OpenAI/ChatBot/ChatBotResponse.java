package com.OpenAI.ChatBot;

import java.util.List;


public class ChatBotResponse {

    private List<Choice> choices;

    
    public static class Choice {

        public int getIndex() {
			return index;
		}
		public void setIndex(int index) {
			this.index = index;
		}
		public ChatBotMessage getMessage() {
			return message;
		}
		public void setMessage(ChatBotMessage message) {
			this.message = message;
		}
		private int index;
        private ChatBotMessage message;

    }

	public List<Choice> getChoices() {
		return choices;
	}

	public void setChoices(List<Choice> choices) {
		this.choices = choices;
	}

}