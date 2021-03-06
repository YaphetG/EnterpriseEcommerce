package org.abyssinia.persistance.service;

import java.util.List;


import org.abyssinia.domain.UserCredentials;

public interface UserCredentialService {
	public void save( UserCredentials userCredentials);
	public void update(UserCredentials userCredentials);
	public List<UserCredentials> findAll(); 
	public UserCredentials findOne(Long id);
}
