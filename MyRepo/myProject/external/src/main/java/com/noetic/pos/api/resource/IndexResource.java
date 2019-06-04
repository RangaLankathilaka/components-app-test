package com.noetic.pos.api.resource;

import org.slf4j.Logger;

import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class IndexResource {
	private static Logger log = LoggerFactory.getLogger(IndexResource.class);

    @RequestMapping("/pos/info")
    public String hello() {

        log.info("Welcome to MICRO-SERVICE-POS API service-external");
        return " Welcome to MICRO-SERVICE-POS API service-external";
    }


}
