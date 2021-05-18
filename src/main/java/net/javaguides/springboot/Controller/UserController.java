package net.javaguides.springboot.Controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import net.javaguides.springboot.Model.User;

@RestController
@RequestMapping("/users")
public class UserController {
	
	@PostMapping("")
	public void addUser(User user) {
		
	}
	
	@GetMapping("/{userid}")
	public User getUser(@PathVariable("userid") String userId) {
		return new User();
	}

}
