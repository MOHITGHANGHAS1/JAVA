<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Sum of Two Numbers</title>

</head>
<body>
<form name="NewFile" method="sumbit">
Enter First Number: <input type="text"name="n1"/><br/>
Enter Second Number: <input type="text"name="n2"/><br/>
<br/>
<input type="submit" value="Find Sum"/>

</form>
<%!
int find_sum(int p,int q)
{
	return p+q;
}
%>
<%
String inp1=request.getParameter("n1");
String inp2=request.getParameter("n2");
if((inp1!=null)&&(inp2!=null))
{
int px=Integer.parseInt(inp1);	
int py=Integer.parseInt(inp2);	

int sum=find_sum(px,py);
out.println("<br/>Sum ="+sum);
}
%>
</body>
</html>