package dev.chrisbehrens.spring_ai;

import org.springframework.ai.chat.client.ChatClient;
import org.springframework.boot.test.context.TestConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Primary;
import org.mockito.Mockito;

@TestConfiguration
public class TestConfig {

    @Bean
    @Primary
    public ChatClient mockChatClient() {
        return Mockito.mock(ChatClient.class);
    }
} 