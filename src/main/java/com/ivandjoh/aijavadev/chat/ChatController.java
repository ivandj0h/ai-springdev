package com.ivandjoh.aijavadev.chat;

import org.springframework.ai.chat.client.ChatClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Flux;

@RestController
public class ChatController {

    private final ChatClient chatClient;

    public ChatController(ChatClient.Builder builder) {
        this.chatClient = builder.build();
    }

    @GetMapping("/chat")
    public String chat() {
        return chatClient.prompt()
                .user("Tell me an interesting fact about spring boot")
                .call()
                .content();
    }

    @GetMapping("/stream")
    public Flux<String> stream() {
        return chatClient.prompt()
                .user("i am visiting jakarta, " +
                        "can you tell me 10 interesting eating places that i have to visit?")
                .stream()
                .content();
    }
}
