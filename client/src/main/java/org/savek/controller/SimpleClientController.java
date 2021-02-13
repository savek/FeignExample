package org.savek.controller;

import org.savek.client.SimpleFeignClient;
import org.savek.dto.TestDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SimpleClientController {
    @Autowired
    SimpleFeignClient simpleFeignClient;

    @GetMapping("/client/simpleGet")
    String simpleGet() {
        return simpleFeignClient.getSimple();
    }

    @GetMapping("/client/simplePost/{someText}")
    String simplePost(@PathVariable String someText) {
        TestDto testDto = new TestDto("Some value from client: " + someText);
        simpleFeignClient.postSimple(testDto);

        return "Send value: " + someText;
    }
}
