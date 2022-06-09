<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>

<body>

<form action="adduser.jsp" method="post">
    NAME:<input type="text" name="name"></br>
    PASSWORD:<input type="password" name="password"></br>
    EMAIL:<input type="text" name="email"></br>
    <select name="country">
        <option>Georgia</option>
        <option>USA</option>
        <option>JAPAN</option>
    </select>
    </br>
    <input type="submit" value="ADD USER"/>
</form>

</body>
</html>
