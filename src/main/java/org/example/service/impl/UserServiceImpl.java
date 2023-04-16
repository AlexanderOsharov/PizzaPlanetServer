package org.example.service.impl;

import org.example.domain.User;
import org.example.repository.UserRepository;
import org.example.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service // завернули в мешок
public class UserServiceImpl implements UserService {

    private final UserRepository repository;

    @Autowired // достает репозиторий из мешка
    public UserServiceImpl(UserRepository repository) {
        this.repository = repository;
    }

    @Override
    public User add(User user) {
        // логика по обработке данных
        return repository.save(user);
    }

    @Override
    public List<User> getAll() {
        return repository.findAll();
    }

    @Override
    public User getById(long id) {
        return repository.findById(id).orElseThrow();
    }

    @Override
    public User update(User user) {
        return repository.save(user);
    }

    @Override
    public void deleteByiId(long id) {
        repository.deleteById(id);
    }
}
