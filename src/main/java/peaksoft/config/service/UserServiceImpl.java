package peaksoft.config.service;

import peaksoft.config.model.User;
import peaksoft.config.user.UserDao;
import peaksoft.config.user.UserDaoImpl;

import java.util.List;

public class UserServiceImpl implements UserService{

    UserDao userDao = new UserDaoImpl();
    @Override
    public void createUsersTable() {

    }

    @Override
    public void dropUsersTable() {
        userDao.dropUsersTable();
    }

    @Override
    public void saveUser(String name, String lastName, byte age) {
        userDao.saveUser(name,lastName,age);
    }

    @Override
    public void removeUserById(long id) {
        userDao.removeUserById(id);
    }

    @Override
    public List<User> getAllUsers() {
        return userDao.getAllUsers();
    }

    @Override
    public void cleanUsersTable() {
        userDao.cleanUsersTable();
    }




//    UserDao userDao = new UserDaoImpl();
//    @Override
//    public void getUser() {
//        userDao.getUser();
//    }
}
