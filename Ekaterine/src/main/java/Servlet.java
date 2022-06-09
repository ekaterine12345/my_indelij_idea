import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.*;

public class Servlet extends HttpServlet {

    private static final String USERNAME = "root";
    private static final String PASSWORD = "ekaterine123";
    private static final String CONN_STRING = "jdbc:mysql://localhost:3306/test_jdbc?autoReconnect=true&useSSL=false";


    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws  IOException {
//        int a=Integer.parseInt(req.getParameter("a"));
//        int b=Integer.parseInt(req.getParameter("b"));
//        int sum=a+b,product=a*b;

       String name=req.getParameter("firstname");
       String lastname=req.getParameter("lastname");
       int id=Integer.parseInt(req.getParameter("id"));
       String password=req.getParameter("password");

       // resp.setContentType("text/html");
       // resp.getWriter().write("<h1>"+name+" "+lastname+" "+id+" "+password+"</h1>");


        Connection conn = null;

        try {
            System.out.println(id);
            try {
                Class.forName("com.mysql.cj.jdbc.Driver");
            } catch (ClassNotFoundException e) {
                e.printStackTrace();
            }
            conn = DriverManager.getConnection(CONN_STRING, USERNAME, PASSWORD);
            PreparedStatement preparedStatement=conn.prepareStatement("insert into registration (id,name,lastname,password) values(?,?,?,?)");
            preparedStatement.setInt(1,id);
            preparedStatement.setString(2,name);
            preparedStatement.setString(3,lastname);
            preparedStatement.setString(4,password);

            preparedStatement.executeUpdate();

        }

        catch (SQLException e) {
            System.err.println(e);
        }


    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        this.doGet(req, resp);
    }
}
