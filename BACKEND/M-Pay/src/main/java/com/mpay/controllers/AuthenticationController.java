package com.mpay.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.mpay.exceptions.LoginException;
import com.mpay.model.LoginDTO;
import com.mpay.services.LoginService;

@RestController
@RequestMapping("/mpay")
public class AuthenticationController {

	@Autowired
	private LoginService lService;


	@PostMapping("/login")
	public ResponseEntity<String> loginIntoAccountHandler(@RequestBody LoginDTO login) throws LoginException {
		String str = lService.LoginToAccount(login);
		return new ResponseEntity<String>(str, HttpStatus.OK);
	}

	@GetMapping("/logout")
	public ResponseEntity<String> logoutFromAccountHandler(@RequestParam String key) throws LoginException {
		String str = lService.LogOutFromAccount(key);
		return new ResponseEntity<String>(str, HttpStatus.OK);
	}

	

}
