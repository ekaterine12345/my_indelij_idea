import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class ServletRead extends HttpServlet {


    private static final String USERNAME = "root";
    private static final String PASSWORD = "ekaterine123";
    private static final String CONN_STRING = "jdbc:mysql://localhost:3306/test_jdbc?characterEncoding=latin1&useConfigs=maxPerformance&useSSL=false";


    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        try{
            try {
                Class.forName("com.mysql.cj.jdbc.Driver");
            } catch (ClassNotFoundException e) {
                e.printStackTrace();
            }
            java.sql.Connection conn= DriverManager.getConnection(CONN_STRING, USERNAME, PASSWORD);
            PreparedStatement preparedStatement=conn.prepareStatement("select * from registration");
            ResultSet resultSet=preparedStatement.executeQuery();
            resp.setContentType("text/html");

            resp.getWriter().write("<table>");
            resp.getWriter().write("<tr><td> ID NUM </td> <td> First Name </td> <td> Last Name </td> <td> Password </td></tr>");

            while (resultSet.next())
            {
                resp.getWriter().write("<tr><td>"+resultSet.getString(1)+"</td><td>"+resultSet.getString(2)+
                                          "</td><td>"+resultSet.getString(3)+"</td><td>"+resultSet.getString(4)+"</td></tr>");
            }
            resp.getWriter().write("<table>");
        }
        catch (SQLException e)
        {
            System.err.println(e);
        }

    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        this.doGet(req, resp);
    }
}
