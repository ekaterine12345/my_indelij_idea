import java.sql.*;
import java.util.Scanner;

public class Main {
    private static final String USERNAME = "root";
    private static final String PASSWORD = "ekaterine123";
    private static final String CONN_STRING = "jdbc:mysql://localhost:3306/mydb?characterEncoding=latin1&useConfigs=maxPerformance";

    public static void main(String[] args) {

        int a,b,c;

        Scanner sc=new Scanner(System.in);

        a=sc.nextInt();
        b=sc.nextInt();
        c=sc.nextInt();

        Connection conn=null;

        try {
            conn = DriverManager.getConnection(CONN_STRING, USERNAME, PASSWORD);


            CallableStatement callableStatement=conn.prepareCall("{?= call mysum(?,?,?)}");
            callableStatement.registerOutParameter(1,Types.INTEGER);

            callableStatement.setInt(2,a);
            callableStatement.setInt(3,b);
            callableStatement.setInt(4,c);

            callableStatement.execute();

            System.out.println(callableStatement.getInt(1));



        }
        catch (SQLException e) {
            System.err.println(e);
        }

        
    }
}
