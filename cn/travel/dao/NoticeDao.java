package cn.travel.dao;

import java.util.List;

import cn.travel.entity.Notice;

public interface NoticeDao {
	public int addNotice(Notice notice);

	public int deleteNotice(Notice notice);

	public int updateNotice(Notice notice);

	public List<Notice> searchNotice();
}
