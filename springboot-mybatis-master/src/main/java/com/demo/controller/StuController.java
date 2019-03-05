package com.demo.controller;
import com.demo.service.IStu;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.xml.ws.soap.Addressing;


@Controller
public class StuController {
    @Autowired
    private IStu iStu;

    @GetMapping(value = "/select/{id}")
    @ResponseBody
    public String selectStu(@PathVariable int id){

        return iStu.select(id);

    }
}
