package com.cafe.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.cafe.excepction.excepction;
import com.cafe.model.user;
import com.cafe.repository.repository;

@RestController
@RequestMapping("/api/v1/")

public class UserController {

	@Autowired
	private repository repo;

//	get all user
	@GetMapping("/user")
	public List<user> getAllUser() {
		return repo.findAll();
	}

//	create user
	@PostMapping("/user")
	public user createUser(@RequestBody user user) {
		return repo.save(user);

	}
//	get user by Contact
	@GetMapping("/user/{id}")
	public ResponseEntity<user> getuserid(@PathVariable Integer id ) {
		user user = repo.findById(id).orElseThrow(() -> new excepction("employee not exit with contact Number" + id ));
		return ResponseEntity.ok(user);

}


//	update user
	@PutMapping("/user/{id}")
	public ResponseEntity<user> updateuser(@PathVariable Integer id, @RequestBody user user) {
		user user2 = repo.findById(id).orElseThrow(() -> new excepction("employee not exit with id" + id));
		user2.setName(user.getName());
		user2.setContactNumber(user.getContactNumber());
 		user2.setEmail(user.getEmail());
		user updateuser = repo.save(user2);
		return ResponseEntity.ok(updateuser);

	}

//	delete employee
	@DeleteMapping("/user/{id}")
	public ResponseEntity<Map<String, Boolean>> deleteuser(@PathVariable Integer id) {
		user user3 = repo.findById(id).orElseThrow(() -> new excepction("employee not exit with id" + id));
		repo.delete(user3);
		Map<String, Boolean> res = new HashMap<>();  
		res.put("deleted", Boolean.TRUE);
		return ResponseEntity.ok(res);

	}
	

	}
