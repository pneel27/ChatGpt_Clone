package com.OpenAI.ChatBot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("/chatbot")
public class ChatBotController {

    @Value("${openai.model}")
    private String model;

    @Value(("${openai.api.url}"))
    private String apiURL;

    @Autowired
    private RestTemplate template;

    @GetMapping("/prompt")
    public String chat(@RequestParam("prompt") String prompt){
        ChatBotRequest request=new ChatBotRequest(model, prompt);
        ChatBotResponse chatGptResponse = template.postForObject(apiURL, request, ChatBotResponse.class);
        return chatGptResponse.getChoices().get(0).getMessage().getContent();
    }
}
