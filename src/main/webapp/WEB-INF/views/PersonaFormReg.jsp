<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
"http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>New/Edit alm</title>
</head>
<body>
<div align="center">
    <h1>New/Edit Alm</h1>
    <form:form action="savePersona" method="post" modelAttribute="Persona">
        <table>
            <form:hidden path="personaId"/>
            <tr>
                <td>Nombre:</td>
                <td><form:input path="nombre" /></td>
            </tr>
            <tr>
                <td>ApellidoP:</td>
                <td><form:input path="apellidop" /></td>
            </tr>
            <tr>
                <td>ApellidoM:</td>
                <td><form:input path="apellidom" /></td>
            </tr>
            <tr>
                <td>direccion:</td>
                <td><form:input path="direccion" /></td>
            </tr>
            <tr>
                <td>Telefono:</td>
                <td><form:input path="telefono" /></td>
            </tr>
            <tr>
                <td>celular:</td>
                <td><form:input path="celular" /></td>
            </tr>
            <tr>
                <td>sexo:</td>
                <td><form:input path="sexo" /></td>
            </tr>
            <tr>
                <td>codigo de identidad:</td>
                <td><form:input path="ci" /></td>
            </tr>
            <tr>
                <td colspan="2" align="center"><input type="submit" value="Save"></td>
            </tr>
        </table>
    </form:form>
</div>
</body>
</html>