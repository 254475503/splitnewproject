package com.yifanshi.splitnewproject.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class testcontroller {
    @RequestMapping("/test")
    @ResponseBody
    public String test()
    {
        return "test";
    }
    @RequestMapping("/jasperTerminal")
    public String jasperTerminal()
    {
        return "jasperTerminal";
    }

}
