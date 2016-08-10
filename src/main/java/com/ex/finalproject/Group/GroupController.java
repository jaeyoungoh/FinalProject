package com.ex.finalproject.Group;

import java.io.IOException;
import java.io.PrintWriter;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;


@Controller
public class GroupController {
	
	@Resource
	private GroupService groupService;
	
	public void setGroupService(GroupService groupService) {
		this.groupService = groupService;
	}
	
	@RequestMapping(value="/addGroup.do")
	public ModelAndView addGroup(GroupDTO group){
		
		group.setGathering_num(1);
		group.setGathering_title("모임 A");
		group.setGathering_content("주말 농구 같이 하실분~");
		groupService.groupAdd(group);
		return null;
	}
}
