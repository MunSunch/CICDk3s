package com.munsun.cicdk3s.repository.impl;

import com.munsun.cicdk3s.model.ScheduleDay;
import com.munsun.cicdk3s.repository.ScheduleRepository;
import org.springframework.stereotype.Repository;

import java.time.temporal.ChronoField;
import java.time.temporal.TemporalField;
import java.util.List;
import java.util.stream.Collectors;

@Repository
public class ScheduleRepositoryImpl implements ScheduleRepository {
    private List<ScheduleDay> schedule;

    @Override
    public void save(List<ScheduleDay> schedule) {
        this.schedule = schedule;
    }

    @Override
    public List<ScheduleDay> get() {
        return schedule;
    }

    @Override
    public List<ScheduleDay> getByDate_Day(int day) {
        return null;
    }
}
