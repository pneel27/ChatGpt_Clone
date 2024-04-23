package com.OpenAI.ChatBot;

import java.util.ArrayList;
import java.util.List;

import lombok.Data;

@Data
public class ChatBotRequest {

    private String model;
    private List<ChatBotMessage> messages;

    public ChatBotRequest(String model, String prompt) {
        this.model = model;
        this.messages = new ArrayList<>();
        this.messages.add(new ChatBotMessage("user",prompt));
    }
}