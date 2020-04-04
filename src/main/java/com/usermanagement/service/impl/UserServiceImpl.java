package com.usermanagement.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.usermanagement.exception.ResourceNotFoundException;
import com.usermanagement.model.User;
import com.usermanagement.repository.UserRepository;
import com.usermanagement.service.UserService;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private UserRepository userRepository;

	@Override
	public List<User> getAllUsers() {
		return userRepository.findAll();
	}

	@Override
	public User getUserById(Long userId) throws ResourceNotFoundException {
		return userRepository.findById(userId)
				.orElseThrow(() -> new ResourceNotFoundException("User not found for this id :: " + userId));
	}

	@Override
	public User createUser(User user) {
		return userRepository.save(user);
	}

	@Override
	public User updateUser(Long userId, User userDetails) throws ResourceNotFoundException {
		User user = getUserById(userId);
		user.setFullName(userDetails.getFullName());
		user.setEmailId(userDetails.getEmailId());
		user.setMobileNumber(userDetails.getMobileNumber());
		user.setDateOfBirth(userDetails.getDateOfBirth());
		user.setLoginType(userDetails.getLoginType());
		return userRepository.save(user);
	}

	@Override
	public void deleteUser(Long userId) throws ResourceNotFoundException {
		User user = getUserById(userId);
		userRepository.delete(user);
	}

}
