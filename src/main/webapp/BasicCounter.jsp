<%--
  Created by IntelliJ IDEA.
  User: Colezea
  Date: 19/07/2014
  Time: 16:59
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page import="JSPHelpers.*" %>
<html>
<head>
    <title>BasicCounter</title>
</head>
<body>
    <%! int count = 0; %>
    The page count is:
    <%=
        ++count
    %>
</body>
</html>
