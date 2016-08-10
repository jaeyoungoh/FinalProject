package com.ex.finalproject.Gathering;

import java.util.List;

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
	
	@RequestMapping(value="/addGathering.do")
	public ModelAndView addGroup(GatheringDTO gathering){
		
		gathering.setGathering_num(1);
		gathering.setGathering_title("모임 A");
		gathering.setGathering_content("주말 농구 같이 하실분~");
		gatheringService.gatheringAdd(gathering);
		return null;
	}
	@RequestMapping(value="/listGathering.do")
	public ModelAndView listGroup(){
		ModelAndView mov = new ModelAndView("gathering/gatheringList");
		List<GatheringDTO> list =gatheringService.gatheringList();
		mov.addObject("list",list);
		return mov;
	}
}
