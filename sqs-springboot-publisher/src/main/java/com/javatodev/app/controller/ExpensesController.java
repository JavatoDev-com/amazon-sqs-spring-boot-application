package com.javatodev.app.controller;

import com.javatodev.app.model.dto.CreateExpenseDto;
import com.javatodev.app.service.MessageQueueService;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@RestController
@RequiredArgsConstructor
@RequestMapping(value = "/api/v1/expenses")
public class ExpensesController {

    private final MessageQueueService messageQueueService;

    @PostMapping
    public ResponseEntity<Void> createExpense(@RequestBody CreateExpenseDto createExpenseDto) {
        messageQueueService.publishExpense(createExpenseDto);
        return ResponseEntity.ok().build();
    }

}
