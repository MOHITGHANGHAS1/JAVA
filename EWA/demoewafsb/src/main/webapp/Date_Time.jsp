<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ page import="java.util.*" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Current Date</title>
</head>
<body>
Today's date:
<%=(new java.util.Date()).toLocaleString()%>
</body>
</html>