package peaksoft.config.user;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.boot.jaxb.cfg.spi.JaxbCfgHibernateConfiguration;
import peaksoft.config.cfg.HibernateConfig;
import peaksoft.config.model.User;

import java.util.List;

public class UserDaoImpl implements UserDao{
    @Override
    public void createUsersTable() {

    }

    @Override
    public void dropUsersTable() {
        Session session = HibernateConfig.createSessionFactory().openSession();
        session.beginTransaction();
        session.
    }

    @Override
    public void saveUser(String name, String lastName, byte age) {
        Session session = HibernateConfig.createSessionFactory().openSession();
        session.beginTransaction();
        session.save(name);
        session.save(lastName);
        session.save(age);
        session.getTransaction().commit();
        session.close();
        System.out.println(name+" is a added to Database...");

    }

    @Override
    public void removeUserById(long id) {
        Session session = HibernateConfig.createSessionFactory().openSession();
        session.beginTransaction();
        User user = session.get(User.class,id);
        session.remove(user);
        session.getTransaction().commit();
        session.close();
        System.out.println("Remove by id...");
    }

    @Override
    public List<User> getAllUsers() {
        Session session = HibernateConfig.createSessionFactory().openSession();
        session.beginTransaction();
        List<User>users=session.createQuery("from User").getResultList();
        session.getTransaction().commit();
        session.close();
        return users;

    }

    @Override
    public void cleanUsersTable() {
        Session session = HibernateConfig.createSessionFactory().openSession();
        session.beginTransaction();
        session.beginTransaction();
        session.clear();
        session.getTransaction().commit();
        session.close();
        System.out.println();
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
