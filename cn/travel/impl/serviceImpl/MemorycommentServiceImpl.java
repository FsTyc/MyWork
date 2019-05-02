package cn.travel.impl.serviceImpl;

import java.util.List;

import cn.travel.entity.MemoryComment;
import cn.travel.impl.daoImpl.MemoryCommentDaoImpl;
import cn.travel.service.MemorycommentService;

public class MemorycommentServiceImpl implements MemorycommentService {
	MemoryCommentDaoImpl memoryCommentDaoImpl=new MemoryCommentDaoImpl();
	@Override
	public int addMemoryComment(MemoryComment memoryComment) {
		// TODO Auto-generated method stub
		return memoryCommentDaoImpl.addMemoryComment(memoryComment)
				;
	}

	@Override
	public int deleteMemoryComment(MemoryComment memoryComment) {
		// TODO Auto-generated method stub
		return memoryCommentDaoImpl.deleteMemoryComment(memoryComment);
	}

	@Override
	public int updateMemoryComment(MemoryComment memoryComment) {
		// TODO Auto-generated method stub
		return memoryCommentDaoImpl.updateMemoryComment(memoryComment);
	}

	@Override
	public List<MemoryComment> searchMemoryComment() {
		// TODO Auto-generated method stub
		return null;
	}

}
