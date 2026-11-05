package com.cause.service;

import com.cause.dao.TestDataAppMapper;
import com.cause.domain.TestDataApp;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
class TestDataAppServiceTest {

    @Mock
    private TestDataAppMapper testDataAppMapper;

    @InjectMocks
    private TestDataAppService testDataAppService;

    @Test
    void listAllReturnsRowsFromMapper() {
        TestDataApp row = new TestDataApp();
        row.setId(1L);
        row.setName("sample-alpha");
        row.setCategory("demo");
        when(testDataAppMapper.selectList(null)).thenReturn(List.of(row));

        List<TestDataApp> rows = testDataAppService.listAll();

        assertEquals(1, rows.size());
        assertEquals("sample-alpha", rows.get(0).getName());
    }
}
