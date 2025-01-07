package com.munsun.cicdk3s.repository.impl;

import com.munsun.cicdk3s.repository.ScheduleRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest(classes = ScheduleRepositoryImpl.class)
class ScheduleRepositoryImplUnitTest {
    @Autowired
    private ScheduleRepository scheduleRepository;

    @Test
    void save() {

    }

    @Test
    void get() {
    }

    @Test
    void getByDate_Day() {
    }
}