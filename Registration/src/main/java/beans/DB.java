package beans;

import beans.UserBean;

import java.sql.*;

public class DB {
    private static final String USERNAME = "root";
    private static final String PASSWORD = "ekaterine123";
    private static final String CONN_STRING = "jdbc:mysql://localhost:3306/test_jdbc?autoReconnect=true&useSSL=false";
    private java.sql.Connection connection=null;

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

    public boolean saveUser(UserBean userBean) {

        try {
            PreparedStatement preparedStatement = connection.prepareStatement("insert into user_registration(username,password) values(?,?)");
            preparedStatement.setString(1, userBean.getUserName());
            preparedStatement.setString(2, userBean.getPassword());

            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            return false;
        }
        return true;
    }
}
