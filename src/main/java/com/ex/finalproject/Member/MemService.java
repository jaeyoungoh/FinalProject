package com.ex.finalproject.Member;

import java.util.List;

public interface MemService {
	
	public void memDelete(String id, String pwd);
	public void memUpdae(MemberDTO dto);
	public List<MemberDTO> memAllSelect();
	public void memAdd(MemberDTO dto);
	
	//수정부분
	public MemberDTO memInfo(String id);
	

}
