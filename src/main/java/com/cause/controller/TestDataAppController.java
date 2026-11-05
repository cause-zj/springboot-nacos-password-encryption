package com.cause.controller;

import com.cause.domain.TestDataApp;
import com.cause.service.TestDataAppService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/test-data")
public class TestDataAppController {

    private final TestDataAppService testDataAppService;

    public TestDataAppController(TestDataAppService testDataAppService) {
        this.testDataAppService = testDataAppService;
    }

    @GetMapping
    public List<TestDataApp> list() {
        return testDataAppService.listAll();
    }
}
