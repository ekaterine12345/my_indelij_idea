import java.sql.*;

public class Main {
    private static final String USERNAME = "root";
    private static final String PASSWORD = "ekaterine123";
    private static final String CONN_STRING = "jdbc:mysql://localhost:3306/mydb?characterEncoding=latin1&useConfigs=maxPerformance";
    public static void main(String[] args) {


        Connection conn = null;

        try {
            conn = DriverManager.getConnection(CONN_STRING, USERNAME, PASSWORD);
            System.out.println("Connected");
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT * FROM students");
            while (rs.next()) {
                System.out.println(rs.getInt(1) + "  " + rs.getString(2) + "  " + rs.getString(3));
            }
        } catch (SQLException e) {
            System.err.println(e);
        }
    }

}

//*ALTER USER 'root'@'localhost' IDENTIFIED WITH mysql_native_password BY 'password'