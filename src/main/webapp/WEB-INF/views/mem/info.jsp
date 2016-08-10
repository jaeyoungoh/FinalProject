<%@page import="org.json.simple.JSONObject"%>
<%@page import="org.json.simple.JSONArray"%>
<%@page import="com.ex.finalproject.Member.MemberDTO" %>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<% JSONObject infoData = new JSONObject();

	MemberDTO dto = (MemberDTO)request.getAttribute("dto");
	infoData.put("id", dto.getId());
	infoData.put("pwd", dto.getPwd());
	infoData.put("name", dto.getName());
	infoData.put("email", dto.getEmail());
%>
<%=infoData.toJSONString()%>

