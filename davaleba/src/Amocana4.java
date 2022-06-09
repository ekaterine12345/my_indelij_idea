import java.sql.*;

public class Amocana4 {
    private static final String USERNAME = "root";
    private static final String PASSWORD = "ekaterine123";
    private static final String CONN_STRING = "jdbc:mysql://localhost:3306/mydb?characterEncoding=latin1&useConfigs=maxPerformance";

    public static void main(String[] args) {

        Connection conn = null;

        try {
            conn = DriverManager.getConnection(CONN_STRING, USERNAME, PASSWORD);
            Statement stmt = conn.createStatement();
            ResultSet resultSet=stmt.executeQuery("select * from test_jdbc.person;");

            int[] idArray = new int[200];
            int[] ageArray = new int[200];
            int i=0;

            while (resultSet.next())
            {
                int id1=resultSet.getInt(1);
                int age1=resultSet.getInt(4);

                i++;
                idArray[i]=id1;
                ageArray[i]=age1+1;
            }

            for (int j=1; j<=i; j++)
            {
                stmt.executeUpdate("update test_jdbc.person set age="+ageArray[j]+" where id="+idArray[j]+"");
            }

        }

        catch (SQLException e) {
            System.err.println(e);
        }
    }
}

