package com.portal.repository;

import com.portal.model.User;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.repository.CrudRepository;

@Configuration
public interface AvailabilityRepo extends CrudRepository<User, String> {



}
