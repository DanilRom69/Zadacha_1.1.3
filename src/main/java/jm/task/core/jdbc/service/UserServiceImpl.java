package jm.task.core.jdbc.service;

import jm.task.core.jdbc.model.User;
import jm.task.core.jdbc.dao.UserDaoJDBCImpl;

import java.util.List;

public class UserServiceImpl implements UserService {
    private static UserDaoJDBCImpl userDaoJDBCImpl = new UserDaoJDBCImpl();

    public UserDaoJDBCImpl getUserDaoJDBCImpl() {
        return userDaoJDBCImpl;
    }

    public void createUsersTable() {

    }

    public void dropUsersTable() {

    }

    public void saveUser(String name, String lastName, byte age) {

    }

    public void removeUserById(long id) {

    }

    public List<User> getAllUsers() {
        return null;
    }

    public void cleanUsersTable() {

    }
}
