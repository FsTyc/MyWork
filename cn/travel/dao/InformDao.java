package cn.travel.dao;

import java.util.List;

import cn.travel.entity.Inform;

public interface InformDao {
	public int addInform(Inform inform);

	public int deleteInform(Inform inform);

	public int updateInform(Inform inform);

	public List<Inform> searchInform();
}
