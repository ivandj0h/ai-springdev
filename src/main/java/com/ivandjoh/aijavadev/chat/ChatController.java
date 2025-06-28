package com.ivandjoh.aijavadev.chat;

import org.springframework.ai.chat.client.ChatClient;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ChatController {

    private final ChatClient chatClient;

    public ChatController(ChatClient.Builder builder) {
        this.chatClient = builder.build();
    }


}
