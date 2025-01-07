package com.munsun.cicdk3s;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.munsun.cicdk3s.model.ScheduleDay;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.json.JsonTest;

@JsonTest
public class MapperUnitTest {
    @Autowired
    private ObjectMapper mapper;

    @Test
    public void toScheduleDay() throws JsonProcessingException {
        String text = """
        {"date":"14 January 2025г. 13:50",
         "type":"Экзамен",
         "subject":"Параллельное и распределенное программирование",
         "teacher":"Портенко М. С.",
         "location":"12 корпус, 415 аудитория"
        }
        """;

        Assertions.assertDoesNotThrow(() -> {
            ScheduleDay day = mapper.readValue(text, ScheduleDay.class);
        });
    }
}
