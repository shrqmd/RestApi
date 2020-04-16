package com.portal.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.portal.model.User;
import com.portal.service.AvailabilityService;

@RestController
public class AvailabilityController {
	@Autowired
	AvailabilityService service;

	@RequestMapping(method = RequestMethod.GET, value = "/check")
	public String check() {
		return "...Working Fine...";
	}

	@PostMapping( value ="/login")
	public String getTemplate(@RequestBody User data) {
		return service.matchCredentials(data.getUserName(),data.getPassword());
	}

	@RequestMapping(method = RequestMethod.POST, value = "/register", consumes = MediaType.ALL_VALUE, produces = MediaType.ALL_VALUE)
	public String createTemplate(@RequestBody User t) {
		return service.addData(t);

	}

	@RequestMapping(method = RequestMethod.PUT, value = "/update/{userName}", consumes = MediaType.ALL_VALUE, produces = MediaType.ALL_VALUE)
	public String updateTemplate(@RequestBody User model, @PathVariable String userName) {
		return service.updateData(model, userName);
	}

	@RequestMapping(method = RequestMethod.DELETE, value = "/delete/{userName}", consumes = MediaType.ALL_VALUE, produces = MediaType.ALL_VALUE)
	public String deleteTemplate(@PathVariable String userName) {
		return service.deleteData(userName);

	}
}
