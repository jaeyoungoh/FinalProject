<%@page import="java.util.Iterator"%>
<%@page import="org.json.simple.JSONArray"%>
<%@page import="org.json.simple.JSONObject"%>
<%@page import="com.ex.finalproject.Gathering.GatheringDTO"%>
<%@page import="java.util.List" %>

<%@ page language="java" contentType="text/JSON; charset=UTF-8" pageEncoding="UTF-8"%>

<%

	JSONArray gatheringDatas = new JSONArray();
	List<GatheringDTO> list = (List)request.getAttribute("list");
	Iterator ir = list.iterator();
	
	while(ir.hasNext()){
		GatheringDTO dto = (GatheringDTO)ir.next();
		JSONObject gatheringData = new JSONObject();
		gatheringData.put("Gathering_num", dto.getGathering_num());
		gatheringData.put("Gathering_title", dto.getGathering_title());
		gatheringData.put("Gathering_content", dto.getGathering_content());
		gatheringData.put("Gathering_location", dto.getGathering_location());
		gatheringData.put("Gathering_category", dto.getGathering_category());
		gatheringData.put("Gathering_hashtag", dto.getGathering_hashtag());
		gatheringData.put("Gathering_max_age", dto.getGathering_max_age());
		gatheringData.put("Gathering_rating", dto.getGathering_rating());
		gatheringData.put("Gathering_photo", dto.getGathering_photo());
		gatheringData.put("Gathering_max_cnt", dto.getGathering_max_cnt());
		gatheringData.put("Gathering_max_sex", dto.getGathering_max_sex());
		gatheringData.put("Gathering_type", dto.getGathering_type());
		gatheringData.put("Gathering_gallery", dto.getGathering_gallery());
		gatheringDatas.add(gatheringData);
		
	}
	out.print(gatheringDatas.toJSONString());	
%>