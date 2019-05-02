package cn.travel.service;

import java.util.List;

import cn.travel.entity.Notice;

public interface NoticeService {
	public int addNotice(Notice notice);

	public int deleteNotice(Notice notice);

	public int updateNotice(Notice notice);

	public List<Notice> searchNotice();
}
