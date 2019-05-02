package cn.travel.dao;

import java.util.List;

import cn.travel.entity.Memory;

public interface MemoryDao {
	public int addMemory(Memory memory);

	public int deleteMemory(Memory memory);

	public int updateMemory(Memory memory);

	public List<Memory> searchMemory();
}
