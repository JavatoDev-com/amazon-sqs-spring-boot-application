package com.javatodev.app.configuration;

import com.javatodev.app.service.MessageQueueService;

import org.springframework.context.annotation.Configuration;

import jakarta.annotation.PostConstruct;
import lombok.RequiredArgsConstructor;

@Configuration
@RequiredArgsConstructor
public class AppConfiguration {

    private final MessageQueueService messageQueueService;

    @PostConstruct
    public void initializeMessageQueue() {
        messageQueueService.createMessageQueue();
    }

}
