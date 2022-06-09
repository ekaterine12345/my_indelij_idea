import java.sql.*;

public class Amocana5 {
    private static final String USERNAME = "root";
    private static final String PASSWORD = "ekaterine123";
    private static final String CONN_STRING = "jdbc:mysql://localhost:3306/mydb?characterEncoding=latin1&useConfigs=maxPerformance";

    public static void main(String[] args) {

        Connection conn = null;

        try {
            conn = DriverManager.getConnection(CONN_STRING, USERNAME, PASSWORD);
            Statement stmt = conn.createStatement();
            ResultSet resultSet=stmt.executeQuery("select * from test_jdbc.person where age>10;");

            while (resultSet.next())
            {
                System.out.println(resultSet.getInt(1)+" "+resultSet.getString(2)+" "+
                        resultSet.getString(3)+" "+resultSet.getInt(4)+" "+resultSet.getString(5));
            }
        }

        catch (SQLException e) {
            System.err.println(e);
        }
    }
}
