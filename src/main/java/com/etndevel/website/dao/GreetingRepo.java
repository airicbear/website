package com.etndevel.website.dao;

import org.springframework.data.repository.CrudRepository;

import com.etndevel.website.model.Greeting;

public interface GreetingRepo extends CrudRepository<Greeting, Long> {
}
