package com.user.service;

import java.util.List;


import org.springframework.stereotype.Service;

import com.user.entity.User;


@Service
public class UserServiceImpl implements UserService {
  
	//fake data Dao
	List<User> list= List.of(
			
			new User(1001L, "Pritam", "9713651525"),
			new User(1002L, "Rajput", "9854454455"),
			new User(1003L, "Rakesh", "8745585876"),
			new User(1004L, "durgesh", "8745585876")
			);
			
	
	@Override
	public User getUserFromService(Long id) {
		//business logic 
		//get user by id
		return list.stream().filter(user->user.getUserId().equals(id)).findAny().orElse(null);
	}

}
