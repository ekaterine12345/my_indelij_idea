<%@page import="beans.UserBean" %>
<p>SUCCESS</p>

<%
    UserBean userBean = (UserBean) request.getAttribute("userBean");
    out.print("registeracia warmatebit dasrulda " + userBean.getUserName());
%>
