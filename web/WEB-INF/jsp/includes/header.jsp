<%--
    Document   : index
    Created on : Jan 11, 2017, 10:29:53 AM
    Author     : dmaharjan
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<c:set var="SITE_URL" value="${pageContext.request.contextPath}"/>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <spring:url value="/resources/css/bootstrap.min.css" var="bootstrap"/>
        <link href="${bootstrap}" rel="stylesheet"/>
        <title>JSP Page</title>
    </head>
    <body>
