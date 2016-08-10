package com.ex.finalproject.Gathering;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;


@Controller
public class GatheringController {
	
	@Resource
	private GatheringService gatheringService;
	
	public void setGroupService(GatheringService gatheringService) {
		this.gatheringService = gatheringService;
	}
	
	@RequestMapping(value="/addGroup.do")
	public ModelAndView addGroup(GatheringDTO gathering){
		
		gathering.setGathering_num(1);
		gathering.setGathering_title("모임 A");
		gathering.setGathering_content("주말 농구 같이 하실분~");
		gatheringService.gatheringAdd(gathering);
		return null;
	}
}
