<%@page import="model.gmail.Info"%>
<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>index</title>
<style type="text/css">
.show {
	text-align: left;
	margin-bottom: 10px;
}
</style>
</head>
<body>
	<div style="text-decoration: none; font-size: 23px;">
		<a href="login.jsp" style="text-decoration: none;">Login</a> <a
			href="logOut" style="margin-left: 80%; text-decoration: none;">LogOut</a>
	</div>
	<%
		ArrayList<Info> listInfo = (ArrayList<Info>) request.getAttribute("listInfo");
		if (listInfo == null) {
	%>
	<div align="center">
		<h2>
			<%
				out.print("Please log in");
			%>
		</h2>
	</div>
	<%
		} else {
	%>
	<!-- 5.5 Hiện thị thông tin trên index.jsp -->
	<div style="margin-top: 20px">
		<div class="show">
			<img alt="" src="<%=listInfo.get(0).getImg()%>"><br>
		</div>
		<div class="show">
			<%
				out.print("Id: " + listInfo.get(0).getId());
			%>
		</div>
		<div class="show">
			<%
				out.print("Email: " + listInfo.get(0).getEmail());
			%>
		</div>
		<div class="show">
			<%
				out.print("Name: " + listInfo.get(0).getName());
			%>
		</div>
		<div class="show">
			<%
				out.print("Full Name: " + listInfo.get(0).getFullName());
			%>
		</div>
		<%
			}
		%>
	</div>
</body>
</html>