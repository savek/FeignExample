package org.savek.client;

import org.savek.dto.TestDto;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@FeignClient(name = "simple", url = "${client.server.url}")
public interface SimpleFeignClient {

    @RequestMapping(method = RequestMethod.GET, value = "/api/simpleGet")
    String getSimple();

    @RequestMapping(method = RequestMethod.POST, value = "/api/simplePost", consumes = "application/json")
    void postSimple(TestDto testDto);
}
