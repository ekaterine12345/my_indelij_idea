package beans;

import beans.AppUsers;

import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class DB {

    private static final String USERNAME = "root";
    private static final String PASSWORD = "ekaterine123";
    private static final String CONN_STRING = "jdbc:mysql://localhost:3306/test_jdbc?characterEncoding=latin1&useConfigs=maxPerformance&useSSL=false";

    private java.sql.Connection connection;


    public DB() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

        try {
            connection = DriverManager.getConnection(CONN_STRING, USERNAME, PASSWORD);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }


    public boolean saveUser(AppUsers appUser) {


        if (appUser.getEmail() == null || appUser.getName() == null || appUser.getPassword() == null) {
            return false;
        }


        try {
            PreparedStatement preparedStatement = connection.prepareStatement("insert into app_users(email,name,password,country) values (?,?,?,?)");
            preparedStatement.setString(1, appUser.getEmail());
            preparedStatement.setString(2, appUser.getName());
            preparedStatement.setString(3, appUser.getPassword());
            preparedStatement.setString(4, appUser.getCountry());
            preparedStatement.executeUpdate();

        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
        return true;
    }


    public boolean updateUser(AppUsers appUser) {

        try {
            PreparedStatement preparedStatement = connection.prepareStatement("update app_users set name=?, email=?,password=?,country=? where id=?");
            preparedStatement.setString(1, appUser.getName());
            preparedStatement.setString(2, appUser.getEmail());
            preparedStatement.setString(3, appUser.getPassword());
            preparedStatement.setString(4, appUser.getCountry());
            preparedStatement.setInt(5, Math.abs(appUser.getId()));
            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }

        return true;
    }


    public boolean deleteUser(AppUsers appUser) {

        try {
            PreparedStatement preparedStatement = connection.prepareStatement("delete from app_users where id=?");
            preparedStatement.setInt(1, appUser.getId());
            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }

        return true;
    }

    public List<AppUsers> getAllRecods() {
        List<AppUsers> appUsersList = new ArrayList<AppUsers>();

        try {
            PreparedStatement preparedStatement = connection.prepareStatement("select * from app_users");
            ResultSet resultSet = preparedStatement.executeQuery();

            while (resultSet.next()) {
                AppUsers appUsers = new AppUsers();
                appUsers.setId(resultSet.getInt("id"));
                appUsers.setEmail(resultSet.getString("email"));
                appUsers.setName(resultSet.getString("name"));
                appUsers.setPassword(resultSet.getString("password"));
                appUsers.setCountry(resultSet.getString("country"));

                appUsersList.add(appUsers);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }


        return appUsersList;
    }

    public AppUsers getRecordById(int id) {


        try {
            PreparedStatement preparedStatement = connection.prepareStatement("select * from app_users where id =?");
            preparedStatement.setInt(1, id);
            ResultSet resultSet = preparedStatement.executeQuery();

            while (resultSet.next()) {
                AppUsers appUsers = new AppUsers();
                appUsers.setId(resultSet.getInt("id"));
                appUsers.setEmail(resultSet.getString("email"));
                appUsers.setName(resultSet.getString("name"));
                appUsers.setPassword(resultSet.getString("password"));
                appUsers.setCountry(resultSet.getString("country"));
                return appUsers;
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }


        return null;

    }

}

