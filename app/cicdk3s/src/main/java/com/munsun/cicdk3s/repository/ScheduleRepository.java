package com.munsun.cicdk3s.repository;

import com.munsun.cicdk3s.model.ScheduleDay;

import java.util.List;

public interface ScheduleRepository {
    void save(List<ScheduleDay> schedule);
    List<ScheduleDay> get();
    List<ScheduleDay> getByDate_Day(int day);
}
