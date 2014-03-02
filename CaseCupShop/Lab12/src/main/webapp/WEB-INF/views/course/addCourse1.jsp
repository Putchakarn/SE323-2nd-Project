<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%><html xmlns="http://www.w3.org/1999/xhtml">
<head>
<title>Add new Course</title>
</head>

<body>
<h1 align="center"><strong>Add new cart</strong></h1>
<form:form commandName="cart" action="/cart/registerCourse">
    <table width="200" border="1" align="center">
        <tr>
            <th scope="row">Name</th>
            <td>
                <label>
                    <form:input path="name"/>
                </label>    </td>
            <td>
                <form:errors path="name"/>
            </td>
        </tr>
        <tr>
            <th scope="row">Course id </th>
            <td><label>
                <form:input path="id"/>
            </label></td>
            <td>
                <form:errors path="id"/>
            </td>
        </tr>
        <tr>
            <th scope="row">Lecturer Name </th>
            <td><label>
                <form:select path="admin">
                    <form:option value="" label="---Please Select---"/>
                    <form:options items="${lecturerList}" itemValue="id" itemLabel="name" />
                </form:select>

            </label></td>
            <td>
                <form:errors path="admin"/>
            </td>
        </tr>
        <tr>
            <th scope="row">Customer  Name </th>
            <td><label>
                <form:select path="customers" multiple="true">
                    <form:options items="${studentList}" itemValue="id" itemLabel="name" />
                </form:select>

            </label></td>
            <td>
                <form:errors path="customers"/>
            </td>
        </tr>

        <tr>
            <th scope="row">&nbsp;</th>
            <td><label></label>&nbsp;<label>
                <input type="submit" name="Submit" value="Submit" />
            </label></td>
        </tr>
    </table>
</form:form>
<p>&nbsp;</p>
</body>
</html>

