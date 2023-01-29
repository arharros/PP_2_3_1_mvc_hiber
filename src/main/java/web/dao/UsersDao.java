package web.dao;

import web.model.User;

import java.math.BigInteger;
import java.util.List;

public interface UsersDao {

    void addUser();

    void deleteUserById(BigInteger id);

    void updateUserById(BigInteger id, User user);

    List<User> listOfUsers();
}
