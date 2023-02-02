package web.dao;

import web.model.User;

import java.util.List;

public interface UsersDao {

    void addUser(User user);

    User findUserById(long id);

    void deleteUserById(long id);

    void updateUser(User user);

    List<User> listOfUsers();
}
