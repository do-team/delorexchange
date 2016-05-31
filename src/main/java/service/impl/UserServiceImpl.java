package service.impl;

import java.util.List;

import dao.UserDAO;
import model.User;
import service.UserService;

public class UserServiceImpl implements UserService {

    private UserDAO dao;

    public UserServiceImpl(UserDAO dao) {
        this.dao = dao;
    }

    @Override
    public List<User> listAllUsers() {
        return dao.listAllUsers();
    }

}
