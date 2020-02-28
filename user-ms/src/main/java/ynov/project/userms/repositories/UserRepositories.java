package ynov.project.userms.repositories;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import ynov.project.userms.model.User;

public interface UserRepositories extends CrudRepository<User, Long> {

	public User findByUsername(String username);
	
	public Optional<User> findByUsernameAndPassword(String username, String password);
	
}
