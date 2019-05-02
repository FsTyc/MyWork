package cn.travel.service;

import java.util.List;

import cn.travel.entity.Inform;

public interface InformService {
	public int addInform(Inform inform);

	public int deleteInform(Inform inform);

	public int updateInform(Inform inform);

	public List<Inform> searchInform();
}
