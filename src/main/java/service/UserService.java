package service;

import java.util.List;

import javax.faces.model.SelectItem;

import model.User;

public interface UserService {

    List<User> listAllUsers();

}
