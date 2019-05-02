package cn.travel.dao;

import java.util.List;

import cn.travel.entity.MemoryComment;

public interface MemoryCommentDao {
	public int addMemoryComment(MemoryComment memoryComment);

	public int deleteMemoryComment(MemoryComment memoryComment);

	public int updateMemoryComment(MemoryComment memoryComment);

	public List<MemoryComment> searchMemoryComment();
}
