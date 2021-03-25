package com.example.demo.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.example.demo.model.user;
import com.example.demo.repository.userRepo;

@RestController
public class usercontroller {
	@Autowired
	userRepo repo;
	
	@RequestMapping("/")
	public String Home()
	{
		return "Home.jsp";
	}
	@RequestMapping("/adduser")
public String adduser(user user)
{
		repo.save(user);
	return "Home.jsp";
}
	@RequestMapping("/getuser")
	public ModelAndView getuser(@RequestParam int id)
	{
		ModelAndView mv= new ModelAndView("showuser.jsp");
			user user=repo.findById(id).orElse(new user());
			
			System.out.println(repo.findByName("tejaswi"));
			System.out.println(repo.findByIdGreaterThan(102));
			System.out.println(repo.findByNameSorted("te"));
			mv.addObject(user);
		return mv;
	}
	@RequestMapping("/users")
	
	public List<user> getusers()
	{
	    return repo.findAll();	
	}
	@RequestMapping("/users/{id}")

	public Optional<user> getusers(@PathVariable("id") int id)
	{
	    return repo.findById(id);	
	}
	/*
	 * @PostMapping("/adduser") public String adduser(user user) { repo.save(user);
	 * return "Home.jsp"; }
	 */
}
