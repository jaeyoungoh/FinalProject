package com.ex.finalproject.Group;


import javax.annotation.Resource;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Component;

@Component(value="groupService")
public class GroupServiceImple implements GroupService {
	
	@Resource(name="sqlSession")
	private SqlSession sqlsession;
	
	public void setSqlsession(SqlSession sqlsession) {
		this.sqlsession = sqlsession;
	}

	@Override
	public void groupAdd(GroupDTO group) {
		GroupMapper groupMapper = sqlsession.getMapper(GroupMapper.class);
		groupMapper.groupAdd(group);
	}
	

}
