<%@ page language="java" contentType="text/JSON; charset=UTF-8" pageEncoding="UTF-8"%>
<%
System.out.print((String)request.getAttribute("result"));
Boolean result =Boolean.parseBoolean((String)request.getAttribute("result"));
System.out.print("현재 불리언 코드 : " + result);
if(result){
	out.print("{\"msg\":\"Success\"}");
System.out.print("{\"msg\":\"Success\"}");
	
		
}else{
	out.print("{\"msg\":\"Fail\"}");
}

%>