package com.cause.service;

import com.cause.dao.TestDataAppMapper;
import com.cause.domain.TestDataApp;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TestDataAppService {

    private final TestDataAppMapper testDataAppMapper;

    public TestDataAppService(TestDataAppMapper testDataAppMapper) {
        this.testDataAppMapper = testDataAppMapper;
    }

    public List<TestDataApp> listAll() {
        return testDataAppMapper.selectList(null);
    }
}
