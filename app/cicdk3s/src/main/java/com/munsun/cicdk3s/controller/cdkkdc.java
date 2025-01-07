package com.munsun.cicdk3s.controller;

import com.munsun.cicdk3s.model.ScheduleDay;
import com.munsun.cicdk3s.repository.ScheduleRepository;
import jdk.jfr.ContentType;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseStatus;

import java.util.List;
import java.util.Map;

@Slf4j
@Controller
@RequiredArgsConstructor
public class cdkkdc {
    private final ScheduleRepository repository;

    @GetMapping("/")
    public String hello(Model model) {
        model.addAttribute("schedule", repository.get());
        return "index";
    }

    @PostMapping(value = "/schedule", consumes = "application/json")
    @ResponseStatus(HttpStatus.CREATED)
    public void schedule(@RequestBody List<ScheduleDay> schedule) {
        log.info(schedule.toString());
        repository.save(schedule);
    }
}