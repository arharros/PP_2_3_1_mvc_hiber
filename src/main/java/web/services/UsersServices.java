package web.services;

import web.model.User;

import java.util.List;

public interface UsersServices {

    void addUser(User user);

    User findUserById(long id);

    void deleteUserById(long id);

    void updateUserById(long id, User user);

    List<User> listOfUsers();

}
