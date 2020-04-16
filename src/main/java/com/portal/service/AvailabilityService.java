package com.portal.service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import com.portal.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.portal.repository.AvailabilityRepo;

@Service
public class AvailabilityService {
	@Autowired
	AvailabilityRepo repo;
	boolean isUserAdmin;
	public void isAdmin(String userName) {
		List<User> result = new ArrayList<>();
		repo.findById(userName).ifPresent(result::add);
		isUserAdmin=result.stream().map(User ->(CharSequence)User.getIsAdmin()).anyMatch("true"::contains);
		System.out.println("==============="+isUserAdmin);

	}
	public String updateData(User model, String userName) {
		isAdmin(userName);
		if(isUserAdmin) {
			repo.save(model);
		}else
		{
			return "You are not Admin User";
		}
		return userName+" data updated Successfully";
	}

	public String deleteData(String userName) {
		isAdmin(userName);
		if(isUserAdmin) {
			repo.deleteById(userName);
		}else
		{
			return "You are not Admin User";
		}

		return userName + " Deleted Succesfully...";
	}

	public String addData(User t) {
		if(t.getPassword().equals(t.getRpassword()))
		{
			repo.save(t);
		}else
		{
			return "Please Match the Password";
		}

		return "Inserted Successfully..";

	}
	public String matchCredentials(String userName,String password) {
		List<User> result = new ArrayList<>();
		repo.findById(userName).ifPresent(result::add);
		boolean isUesr=result.stream().map(User ->(CharSequence)User.getPassword()).anyMatch(password::contains);
		if(isUesr==true) {
			return "Login Succesfully";
		}
		return "UserId/Password not Match";
	}

}
