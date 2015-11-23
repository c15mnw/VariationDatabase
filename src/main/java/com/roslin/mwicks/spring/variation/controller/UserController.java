package com.roslin.mwicks.spring.variation.controller;

import java.util.List;
 
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.roslin.mwicks.spring.variation.dummy.DummyDB;
import com.roslin.mwicks.spring.variation.model.other.User;


@Controller
public class UserController {
 
    private static DummyDB dummyDB = new DummyDB();
 
    /*
    @RequestMapping(value = "${pageContext.request.contextPath}/indexOLD", method = RequestMethod.GET)
    public ModelAndView index() {
 
        User userForm = new User();
 
        return new ModelAndView("user", "userForm", userForm);
    }
    */
 
    @RequestMapping(value = "${pageContext.request.contextPath}/get_country_list", 
                    method = RequestMethod.GET)
    public @ResponseBody List<String> getCountryList(@RequestParam("term") String query) {
        List<String> countryList = dummyDB.getCountryList(query);
         
        return countryList;
    }
 
    @RequestMapping(value = "${pageContext.request.contextPath}/get_tech_list", 
                    method = RequestMethod.GET)
    public @ResponseBody List<String> getTechList(@RequestParam("term") String query) {
        List<String> countryList = dummyDB.getTechList(query);
         
        return countryList;
    }
}
