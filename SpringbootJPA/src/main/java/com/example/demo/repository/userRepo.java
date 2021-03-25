package com.example.demo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.example.demo.model.user;

public interface userRepo extends CrudRepository<user,Integer>  

{
	List<user> findAll();
	List<user> findByName(String name);
	List<user> findByIdGreaterThan(int id);
	@Query("from user where name=?1 order by first_name ")
	List<user>  findByNameSorted(String first_name);

}
