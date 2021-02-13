package org.savek.controller;

import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.extern.log4j.Log4j2;
import org.savek.dto.TestDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Log4j2
public class SimpleController {

    @GetMapping("/api/simpleGet")
    String simpleGet() {
        return "Simple answer from server";
    }

    @PostMapping("/api/simplePost")
    void simplePost(@RequestBody TestDto testDto) {
       log.info(testDto);
    }
}
