package com.eduardnow.acl.services;

import com.eduardnow.acl.entitites.User;
import com.eduardnow.acl.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserService {

    private final UserRepository repository;

    @Autowired
    public UserService(UserRepository repository) {
        this.repository = repository;
    }

    public Page<User> all(int page, int size) {
        return repository.findAll(PageRequest.of(page, size));
    }

    public Optional<User> getByUsername(String username) {
        return repository.findByUsername(username);
    }

    public Optional<User> create(User user) {
        return null;
    }

    public Optional<User> update(String username, User user) {
        return null;
    }

    public void delete(String username) {

    }
}
