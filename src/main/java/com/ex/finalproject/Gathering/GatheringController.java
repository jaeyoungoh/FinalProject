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
	
	// 그룹 추가하기
	@RequestMapping(value="/addGathering.do")
	public ModelAndView addGroup(GatheringDTO gathering){
		ModelAndView mov = new ModelAndView("gathering/Confirm");
		try{
			gatheringService.gatheringAdd(gathering);
			mov.addObject("result","true");

		}catch(Exception e){
			mov.addObject("result","false");

		}
		return mov;
	}
	//그룹 리스트 가져오기
	@RequestMapping(value="/listGathering.do")
	public ModelAndView listGroup(){
		ModelAndView mov = new ModelAndView("gathering/gatheringList");
		List<GatheringDTO> list =gatheringService.gatheringList();
		mov.addObject("list",list);
		return mov;
	}
	
	//TODO: 그룹 멤버 가입
	@RequestMapping(value="/joinGathering.do")
	public ModelAndView joinGroup(String id, String Gathering_num){
		ModelAndView mov = new ModelAndView("gathering/Confirm");
		try{
//			gatheringService.gatheringMemA>d(id, Gathering_num);
			mov.addObject("result","true");

		}catch(Exception e){
			mov.addObject("result","false");

		}
		return mov;
	}
	
	
	//TODO: 그룹 멤버 탈퇴
	@RequestMapping(value="/widthdrawGathering.do")
	public ModelAndView widthdrawGroup(String id, String Gathering_num){
		ModelAndView mov = new ModelAndView("gathering/Confirm");
		try{
//			gatheringService.gatheringMemWidthraw(id, Gathering_num);
			mov.addObject("result","true");

		}catch(Exception e){
			mov.addObject("result","false");

		}
		return mov;
	}
	//TODO: 그룹 검색
	public ModelAndView searchGroup(String type, String query){
		ModelAndView mov = new ModelAndView("gathering/Confirm");
//		List<GatheringDTO> list =gatheringService.gatheringSearch();
//		mov.addObject("list",list);
		return mov;

	}
	
}
