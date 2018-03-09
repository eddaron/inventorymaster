<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
"http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <meta name="viewport" content="width=device-witch, user-scalable=no, initial-scale=1.0, maximun-scale=1.0, minimun-scale=1.0">
    <title>Contact Manager Home</title>
    <meta charset="utf-8">

    <link rel="stylesheet" type="text/css" href="style.css">

</head>

<body>
<div align="center">
    <h1>Alm List</h1>
    <h3><a href="/newPersona">New Alm</a></h3>
    <table border="1">
        <th>No</th>
        <th>Nombre</th>
        <th>ApellidoP</th>
        <th>pellidom</th>
        <th>Direccion</th>
        <th>Telefono</th>
        <th>sexo</th>
        <th>carnet</th>
        <th>Action</th>

        <c:forEach var="persona" items="${listPersona}" varStatus="status">
            <tr>
                <td>${status.index + 1}</td>
                <td>${persona.nombre}</td>
                <td>${persona.apellidop}</td>
                <td>${persona.apellidom}</td>
                <td>${persona.direccion}</td>
                <td>${persona.telefono}</td>
                <td>${persona.celular}</td>
                <td>${persona.sexo}</td>
                <td>${persona.ci}</td>
                <td>
                    <a href="editPersona?id=${persona.personaId}">Edit</a>
                    &nbsp;&nbsp;&nbsp;&nbsp;
                    <a href="/deletePersona?id=${persona.personaId}">Delete</a>
                </td>

            </tr>
        </c:forEach>
    </table>
</div>

</body>
</html>
