import java.sql.*;
import java.util.Scanner;

public class Amocana2 {

    private static final String USERNAME = "root";
    private static final String PASSWORD = "ekaterine123";
    private static final String CONN_STRING = "jdbc:mysql://localhost:3306/mydb?characterEncoding=latin1&useConfigs=maxPerformance";

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        String name,lastname,sqesi;
        int id,age;

        Connection conn = null;

        try {
            conn = DriverManager.getConnection(CONN_STRING, USERNAME, PASSWORD);

            for (int i=1; i<=3; i++) {

                id=sc.nextInt();
                name=sc.next();
                lastname=sc.next();
                age=sc.nextInt();
                sqesi=sc.next();

                Statement stmt = conn.createStatement();
                PreparedStatement preparedStatement = conn.prepareStatement("insert into test_jdbc.person values (?,?,?,?,?)");
                preparedStatement.setInt(1, id);
                preparedStatement.setString(2, name);
                preparedStatement.setString(3, lastname);
                preparedStatement.setInt(4, age);
                preparedStatement.setString(5, sqesi);

                preparedStatement.executeUpdate();
            }

        } catch (SQLException e) {
            System.err.println(e);
        }
    }
}
