<%--
  Created by IntelliJ IDEA.
  User: Sagittarius
  Date: 2/26/2021
  Time: 8:43 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<from method="post" action="/RegistrationController">
      username: <input type="text" name="username"><br>
      password: <input type="password" name="password"><br>
<input type="submit" value="register">

</from>
</body>
</html>
