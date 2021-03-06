package com.usermanagement.service;

import java.util.List;

import com.usermanagement.exception.ResourceNotFoundException;
import com.usermanagement.model.User;

public interface UserService {
	public List<User> getAllUsers();

	public User getUserById(Long userId) throws ResourceNotFoundException;

	public User createUser(User user);

	public User updateUser(Long userId, User userDetails) throws ResourceNotFoundException;

	public void deleteUser(Long userId) throws ResourceNotFoundException;
}
