<%--
  Created by IntelliJ IDEA.
  User: longdk
  Date: 11/29/18
  Time: 9:12 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>Simple dictionary</title>
  </head>
  <body>
  <h2>Simple dictionary</h2>
  <form action="/translate" method="post">
    <input type="text" name="txtSearch" placeholder="Enter your word">
    <input type="submit" id="submit" value="Search">
  </form>
  </body>
</html>
