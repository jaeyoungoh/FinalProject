package com.ex.finalproject.Gathering;


import javax.annotation.Resource;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Component;

@Component(value="gatheringService")
public class GatheringServiceImple implements GatheringService {
	
	@Resource(name="sqlSession")
	private SqlSession sqlsession;
	
	public void setSqlsession(SqlSession sqlsession) {
		this.sqlsession = sqlsession;
	}

	@Override
	public void gatheringAdd(GatheringDTO gathering) {
		GatheringMapper gatheringMapper = sqlsession.getMapper(GatheringMapper.class);
		gatheringMapper.gatheringAdd(gathering);
	}
	

}
