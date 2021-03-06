package org.abyssinia.persistance.service;

import java.util.List;

import org.abyssinia.domain.User;

public interface UserService {
	public void save(User user);
	public void update(User user);
	public List<User> findAll(); 
	public User findOne(Long id);

}
