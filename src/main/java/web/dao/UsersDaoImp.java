package web.dao;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import web.model.User;

import javax.persistence.EntityManagerFactory;
import java.math.BigInteger;
import java.util.List;

@Repository
public class UsersDaoImp implements UsersDao {


    @Override
    public void addUser() {

    }

    @Override
    public void deleteUserById(BigInteger id) {

    }

    @Override
    public void updateUserById(BigInteger id, User user) {

    }

    @Override
    public List<User> listOfUsers() {

        return null;
    }
}
