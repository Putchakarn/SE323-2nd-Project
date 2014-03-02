<%--
  Created by IntelliJ IDEA.
  User: nuico_000
  Date: 3/1/14
  Time: 2:39 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@taglib prefix="sec" uri="http://www.springframework.org/security/tags" %>
<html>
<head>
    <title></title>
</head>
<body>

<h1>The User list2</h1>



<table border="1" cellspacing="0" cellpadding="0">
    <thead>
    <td width="213" valign="top"><p><strong>No.</strong></p></td>
    <td width="213" valign="top"><p><strong>Name</strong></p></td>
    <td width="213" valign="top"><p><strong>Username id</strong></p></td>
    <td width="213" valign="top"><p><strong>Type</strong></p></td>
    <td width="213" valign="top"><p><strong>Picture</strong></p></td>
    </thead>
    <c:forEach items="${users}" var="user" varStatus="status">
        <tr>
            <td width="213" valign="top"><p><strong>${status.count}</strong></p></td>
            <td width="213" valign="top"><p><strong>${user.name}</strong></p></td>
            <td width="213" valign="top"><p><strong>${user.username}</strong></p></td>
            <c:choose>
                <c:when test="${user.role == 1}">
                    <td width="213" valign="top"><p><strong>Admin</strong></p></td>
                </c:when>
                <c:otherwise>
                    <td width="213" valign="top"><p><strong>Customer</strong></p></td>
                </c:otherwise>
            </c:choose>
            <td width="213" valign="top">${user.image.id}<img src="image/${user.image.id}"/> </td>
        </tr>
    </c:forEach>
</table>
</body>
</html>