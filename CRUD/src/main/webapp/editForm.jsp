<%@page import="beans.DB" %>
<%@ page import="beans.AppUsers" %>
<%@page import="beans.DB" %>
<jsp:useBean id="u" class="beans.AppUsers"/>
<jsp:setProperty property="*" name="u"/>

<%

    int id = Integer.parseInt(request.getParameter("id"));
    AppUsers user = new AppUsers();
    DB db = new DB();
    if (id > 0) {
        user = db.getRecordById(id);
    } else {

        db.updateUser(u);
        response.sendRedirect("viewUsers.jsp");
    }

%>
<html>

<body>

<h1>EDIT USER</h1>
<form action="editForm.jsp" method="post">

    <input type="hidden" name="id" value="<%=-1*user.getId()%>">
    NAME:<input type="text" name="name" value="<%=user.getName()%>"/></br>
    PASSWORD:<input type="password" name="password" value="<%=user.getPassword()%>"/></br>
    EMAIL:<input type="text" name="email" value="<%=user.getEmail()%>"/></br>
    <select name="country">
        <option>Georgia</option>
        <option>USA</option>
        <option>JAPAN</option>
    </select>
    </br>
    <input type="submit" value="EDIT USER"/>
</form>

</body>
</html>
