package jm.task.core.jdbc.dao;
import jm.task.core.jdbc.util.Util;

import jm.task.core.jdbc.model.User;


import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;

public class UserDaoJDBCImpl implements UserDao {
    public UserDaoJDBCImpl() {


    }

    public void createUsersTable() {

        String command  = "CREATE TABLE `test_database`.`user` (" +
                "  `id` INT NOT NULL AUTO_INCREMENT," +
                "  `name` VARCHAR(45) NOT NULL," +
                "  `lastName` VARCHAR(45) NOT NULL," +
                "  `age` binary(16) NOT NULL," +
                "  PRIMARY KEY (`id`));" ;

        Util until = new Util();
        try (Connection conn = until.getConnection() ; Statement stmt = conn.createStatement()) {
            stmt.execute(command);
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }

    public void dropUsersTable() {
        String command  = "DROP TABLE `test_database`.`user`;" ;

        Util until = new Util();
        try (Connection conn = until.getConnection() ; Statement stmt = conn.createStatement()) {
            stmt.execute(command);
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }

    public void saveUser(String name, String lastName, byte age) {
        String command  = "INSERT INTO `test_database`.`user` (`name`, `lastName`, `age`) VALUES ("+name+"," +lastName+", "+age+");" ;

        Util until = new Util();
        try (Connection conn = until.getConnection() ; Statement stmt = conn.createStatement()) {
            stmt.executeUpdate(command);
        } catch (SQLException e) {
            e.printStackTrace();
        }


    }

    public void removeUserById(long id) {

        String command  = "DELETE FROM Products WHERE Id = "+id +";";

        Util until = new Util();
        try (Connection conn = until.getConnection() ; Statement stmt = conn.createStatement()) {
            stmt.execute(command);
        } catch (SQLException e) {
            e.printStackTrace();
        }



    }

    public List<User> getAllUsers() {
        return null;
    }

    public void cleanUsersTable() {


    }
}
