package com.adonnai.webapp.pastoralbuzz.service;

import javax.servlet.ServletContext;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.adonnai.webapp.pastoralbuzz.models.UserModel;

@RestController
@RequestMapping("/pastoralbuzz")
public class PastoralBuzzService {
	@Autowired
	ServletContext context;
	
	@RequestMapping(value="/register", method = RequestMethod.GET)
	public String useRegistration(@RequestParam(value="userDetails") UserModel user) {
		return "Hello world";
	}
}
