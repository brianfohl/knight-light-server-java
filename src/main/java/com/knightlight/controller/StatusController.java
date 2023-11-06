package com.knightlight.controller;

import com.knightlight.model.Status;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StatusController {
    @Autowired
    private Status status;

    @RequestMapping(value = "/activate")
    public Status setStatusOn() {
        status.setStatusOn();
        return status;
    }

    @RequestMapping(value = "/deactivate")
    public Status setStatusOff() {
        status.setStatusOff();
        return status;
    }

    @RequestMapping(value = "/")
    public Status getStatus() {
        return status;
    }
}
