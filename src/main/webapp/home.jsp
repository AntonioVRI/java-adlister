<%--
  Created by IntelliJ IDEA.
  User: anthony
  Date: 1/26/21
  Time: 12:30 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<%! int pageNumber =1;%>
<head>
    <title>HomePage</title>
</head>
<body>
    <h1>Hello World!</h1>

<%--Testing 123--%>
    <p>The page number is :<%=pageNumber%></p>

<h3></h3>
    <form action="user-profile.jsp" method="get">
        <input type="hidden" id="username" name="username" value="Bob">
        <input type="hidden" id="lastname" name="lastname" value="j">
        <button type="submit">Go there</button>

    </form>

</body>
</html>
