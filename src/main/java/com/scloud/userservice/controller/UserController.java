package com.scloud.userservice.controller;

import com.scloud.userservice.dto.UserDTO;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/user/")
public class UserController {

	@GetMapping("{userId}")
	public ResponseEntity<UserDTO> getById(@PathVariable("userId") Integer id) {
		return new ResponseEntity<>(UserDTO.builder().id(id)
				.name("Nitin")
				.email("nitin.rajput20@gmail.com")
				.phone("8368889823")
				.build(), HttpStatus.OK);
	}
}
