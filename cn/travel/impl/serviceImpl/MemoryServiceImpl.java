package cn.travel.impl.serviceImpl;

import java.util.List;

import cn.travel.entity.Memory;
import cn.travel.entity.MemoryComment;
import cn.travel.impl.daoImpl.MemoryDaoImpl;
import cn.travel.service.MemoryService;

public class MemoryServiceImpl implements MemoryService {
	MemoryDaoImpl memoryDaoImpl=new MemoryDaoImpl();
	
	public int addMemory(Memory memory) {
		// TODO Auto-generated method stub
		return memoryDaoImpl.addMemory(memory);
	}

	@Override
	public int deleteMemory(Memory memory) {
		// TODO Auto-generated method stub
		return memoryDaoImpl.deleteMemory(memory);
	}

	@Override
	public int updateMemory(Memory memory) {
		// TODO Auto-generated method stub
		return memoryDaoImpl.updateMemory(memory);
	}

	@Override
	public List<Memory> searchMemory() {
		// TODO Auto-generated method stub
		return null;
	}

}
