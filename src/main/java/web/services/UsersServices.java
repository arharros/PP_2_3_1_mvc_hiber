package web.services;

import web.model.User;

import java.util.List;

public interface UsersServices {

    void addUser(User user);

    List<User> listOfUsers();

    User findUserById(long id);

    void deleteUserById(long id);

}
