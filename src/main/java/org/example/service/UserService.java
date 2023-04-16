package org.example.service;

import org.example.domain.User;
import org.example.repository.UserRepository;

import java.util.List;

public interface UserService {

    User add(User user);

    List<User> getAll();

    User getById(long id);

    User update(User user);

    void deleteByiId(long id);
}
