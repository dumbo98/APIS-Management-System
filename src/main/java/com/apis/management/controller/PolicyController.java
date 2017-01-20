package com.apis.management.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by scottkim on 1/18/17.
 */
@Controller
public class PolicyController {
    @RequestMapping("/policy")
    public String policy() {
        return "policyPage";
    }
}
