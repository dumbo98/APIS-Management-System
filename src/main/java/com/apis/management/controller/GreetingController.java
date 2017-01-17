package com.apis.management.controller;

import com.apis.management.model.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * Created by scottkim on 1/15/17.
 */
@Controller
public class GreetingController {
    @Autowired
    MongoTemplate mongoTemplate;

    @RequestMapping("/greeting")
    public String greeting(@RequestParam(value="name", required=false, defaultValue="World") String name, Model model) {
        Name pname = new Name("Scott", "", "Kim");
        Address address = new Address("5876 Prairie Willow Way", "", "Centreville", "VA", "20120", Address.AddressType.HOME);
        Phone phone = new Phone("777-777-7777", Phone.PhoneType.HOME);

        mongoTemplate.save(new Record(new Person(pname, address, phone), null, null));
        model.addAttribute("name", name);
        return "greeting";
    }
}