import beans.DB;
import beans.UserBean;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class RegistrationController extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        UserBean userBean = new UserBean();
        userBean.setUserName(req.getParameter("username"));
        userBean.setPassword(req.getParameter("password"));

        resp.setContentType("text/html");
        resp.getWriter().write("<h1>"+userBean.getUserName()+" "+userBean.getPassword()+"</h1>");

        DB db = new DB();

        if (db.saveUser(userBean)) {

            req.setAttribute("userBean", userBean);
            RequestDispatcher requestDispatcher = req.getRequestDispatcher("success.jsp");
            requestDispatcher.forward(req, resp);
        } else {

            RequestDispatcher requestDispatcher = req.getRequestDispatcher("error.jsp");
            requestDispatcher.forward(req, resp);
        }
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        this.doGet(req, resp);
    }
}


