package peaksoft;

import peaksoft.config.service.UserService;
import peaksoft.config.service.UserServiceImpl;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) {

//        HibernateConfig.createSessionFactory();
        UserService userService = new UserServiceImpl();
        //saveUser
        userService.saveUser("Salym", "Khadzhakeldyev", (byte) 16);
        //remove by id
        userService.removeUserById(1L);
        //get all users
        userService.getAllUsers().forEach(System.out::println);
        //clean user table
        userService.cleanUsersTable();
        //drop user table
        userService.dropUsersTable();








    }
}
