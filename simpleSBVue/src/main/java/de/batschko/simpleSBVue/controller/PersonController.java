package de.batschko.simpleSBVue.controller;

import de.batschko.simpleSBVue.entity.Person;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class PersonController {

    @RequestMapping(
        method = RequestMethod.GET,
        path = "/person",
        produces = MediaType.APPLICATION_JSON_VALUE
    )
    public Person getPerson(){
        List skills = new ArrayList<String>();
        skills.add("Java");
        skills.add("Nicolas Cage");

        String name = "Frank";
        int age = 55;
        Person person = new Person(name,age,skills);

        return person;
    }

}
