package com.ex.finalproject.Member;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;


@Controller
public class MemberController {
	
	@Resource
	private MemService memService;
	
	public void setMemService(MemService memService) {
		this.memService = memService;
	}
	
	//회원가입
	@RequestMapping(value="/join.do")
	public ModelAndView addMember(MemberDTO dto){
		ModelAndView mov = new ModelAndView("mem/Confirm");
		System.out.println(dto.toString());
		try{
			memService.memAdd(dto);
			mov.addObject("result","true");
		}catch(Exception e){
			mov.addObject("result", "false");
		}
		System.out.println("DB 추가 완료");
		return mov;
	}
	// 회원 수정
	@RequestMapping(value="/update.do")
	public ModelAndView updateMember(MemberDTO dto){
		ModelAndView mov = new ModelAndView("mem/Confirm");
		System.out.println(dto.toString());
		try{
			memService.memUpdae(dto);
			mov.addObject("result","true");
		}catch(Exception e){
			mov.addObject("result", "false");
		}
		System.out.println("DB 추가 완료");
		return mov;
	}
	// 회원 정보 가져오기
	@RequestMapping(value="/info.do")
	public ModelAndView infoMember(String id){
		ModelAndView mov = new ModelAndView("mem/info");
		MemberDTO dto = memService.memInfo(id);
		mov.addObject("dto",dto);
		return mov;
	}
	// 회원 탈퇴 회원으로 상태 변경
	@RequestMapping(value="/delete.do")
	public ModelAndView deleteMember(String id, String pwd){
		ModelAndView mov = new ModelAndView("mem/Confirm");
		try{
			memService.memDelete(id, pwd);
			mov.addObject("result","true");
		}catch(Exception e){
			mov.addObject("result", "false");
		}
		System.out.println("DB 추가 완료");
		return mov;
	}
	// 회원 로그인
	@RequestMapping(value="/login.do")
	public ModelAndView loginMember(String id, String pwd, HttpServletResponse response){
		ModelAndView mov = new ModelAndView("mem/Confirm");
		
		try {
			System.out.println(("검색된 멤버 정보"+ memService.memInfo(id)).toString());
			if((memService.memInfo(id))!=null)
			if((memService.memInfo(id)).getPwd().equals(pwd)){
				//로그인 성공
				mov.addObject("result","true");
			} else {
				mov.addObject("result","false");
				//로그인 실패
			}
			else{
				mov.addObject("result","false");
				//null 없는 것 일때 로그인 실패
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return mov;
	}
}
