<%@ page import = "java.io.*,java.util.*" %>
<%@page import="beans.LoginDao"%>

<jsp:useBean id="obj" class="beans.LoginBean"/>

<jsp:setProperty property="*" name="obj"/>

<%
boolean status=LoginDao.validate(obj);
if(status){

         // New location to be redirected
        String site = "http://localhost:8010/Forest22/Frame.htm" ; 
response.setStatus(response.SC_MOVED_TEMPORARILY); 
response.setHeader("Location", site);
      
session.setAttribute("session","TRUE");
}
else
{
out.print("Sorry, email or password error");
%>
<jsp:include page="index.jsp"></jsp:include>
<%
}
%>