<%--
  Created by IntelliJ IDEA.
  User: lpf18
  Date: 2021/8/12
  Time: 17:00
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%
  pageContext.setAttribute("ctp",request.getContextPath());
%>
<html>
  <head>
    <title>$Title$</title>
  </head>
  <body>
  <form action="${ctp}/user" method="post">
    <input type="submit" value="新增">
  </form>
  <form action="${ctp}/user" method="post">
    <input type="hidden"name="_method" value="put">
    <input type="submit" value="更新">
  </form>
  <form action="${ctp}/user" method="post">
    <input type="hidden"name="_method" value="delete">
    <input type="submit" value="删除">
  </form>
  <a href="${ctp}/user">查询</a>
  </body>
</html>
