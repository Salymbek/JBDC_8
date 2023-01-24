package peaksoft.config.user;


import org.hibernate.Session;
import peaksoft.config.Utill.Util;
import peaksoft.config.model.User;

import java.util.List;

public class UserDaoImpl implements UserDao{
    @Override
    public void createUsersTable() {

    }

    @Override
    public void dropUsersTable() {
        Session session = Util.getSession().openSession();
        session.beginTransaction();
        session.createSQLQuery("drop table users").executeUpdate();
        session.getTransaction().commit();
        session.close();
    }

    @Override
    public void saveUser(String name, String lastName, byte age) {
        User user = new User(name,lastName,age);
        Session session = Util.getSession().openSession();
        session.beginTransaction();
        session.save(user);
        session.getTransaction().commit();
        session.close();
        System.out.println(name+" is a added to Database...");
    }

    @Override
    public void removeUserById(long id) {
        Session session = Util.getSession().openSession();
        session.beginTransaction();
        User user = session.get(User.class,id);
        session.remove(user);
        session.getTransaction().commit();
        session.close();
    }

    @Override
    public List<User> getAllUsers() {
        Session session = Util.getSession().openSession();
        session.beginTransaction();
        List<User>users=session.createQuery("from User").getResultList();
        session.getTransaction().commit();
        session.close();
        return users;

    }

    @Override
    public void cleanUsersTable() {
        Session session = Util.getSession().openSession();
        session.beginTransaction();
        session.beginTransaction();
        session.createQuery("delete from User").executeUpdate();
        session.getTransaction().commit();
        session.close();
    }






























//    @Override
//    public void getUser() {
//        try {
//
//
//            Connection connection = Utill.getConnection();
//            Statement statement = connection.createStatement();
//            ResultSet resultSet = statement.executeQuery("SELECT first_name from users");
//            while (resultSet.next()){
//                System.out.println(resultSet.getString("first_name"));
//
//            }
//            statement.close();
//        } catch (SQLException e) {
//            System.out.println(e.getMessage());
//        }
//    }
//
//    @Override
//    public void saveUser(String firstName, String lastName, int age) {
//        String sql="insert into users(firs_name,last_name,age) values (?,?,?);";
//
//
//        try (Connection connection = Utill.getConnection();){
//        PreparedStatement preparedStatement = connection.prepareStatement(sql)){
//
//            }
//        }





}
