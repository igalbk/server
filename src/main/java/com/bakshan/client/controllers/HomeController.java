package com.bakshan.client.controllers;

import com.bakshan.client.dtos.ResponseRecord;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

    @GetMapping(path = "/home/getAll")
    public ResponseRecord getSomething(final @RequestParam String name, final @RequestParam Integer num) {
        return new ResponseRecord(name,num,num+1);
    }
}
