package web.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import web.dao.UsersDao;
import web.model.User;

import java.util.List;

@Service
public class UsersServicesImp implements UsersServices {

    private UsersDao usersDao;

    @Autowired
    public void setUsersDao(UsersDao usersDao) {
        this.usersDao = usersDao;
    }

    @Transactional
    @Override
    public void addUser(User user) {
        usersDao.addUser(user);
    }

    @Transactional(readOnly = true)
    @Override
    public User findUserById(long id) {
        return usersDao.findUserById(id);
    }

    @Transactional
    @Override
    public void deleteUserById(long id) {
        usersDao.deleteUserById(id);
    }

    @Transactional
    @Override
    public void updateUserById(long id, User user) {
        User userForEdit = usersDao.findUserById(id);
        userForEdit.setName(user.getName());
        userForEdit.setLastName(user.getLastName());
        userForEdit.setEmail(user.getEmail());
        usersDao.updateUser(user);
    }

    @Transactional(readOnly = true)
    @Override
    public List<User> listOfUsers() {
        return usersDao.listOfUsers();
    }
}
