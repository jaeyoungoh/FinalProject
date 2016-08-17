<%@page import="com.ex.file.Upload_Image"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
    String imgEncodedStr = request.getParameter("image");
String fileName = request.getParameter("filename");
System.out.println("Filename: "+ fileName);
if(imgEncodedStr != null){
	Upload_Image.convertStringtoImage(imgEncodedStr, fileName);
    System.out.println("업로드 진행중입니다.");
    out.print("이미지 업로드가 완료 되었습니다. 파일을 확인하세요.");
} else{
    System.out.println("업로드를 실패하였습니다.");
    if(fileName == null){
        out.print("이미지가 존재하지 않습니다.");        	
    }
    out.print("이미지가 올바르지 않거나, 너무 큽니다.");    
}
%>