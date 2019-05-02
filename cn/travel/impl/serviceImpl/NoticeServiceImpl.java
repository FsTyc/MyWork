package cn.travel.impl.serviceImpl;

import java.util.List;

import cn.travel.entity.Notice;
import cn.travel.impl.daoImpl.NoticeDaoImpl;
import cn.travel.service.NoticeService;

public class NoticeServiceImpl implements NoticeService {
	NoticeDaoImpl noticeDaoImpl=new NoticeDaoImpl();
	@Override
	public int addNotice(Notice notice) {
		// TODO Auto-generated method stub
		return noticeDaoImpl.addNotice(notice);
	}

	@Override
	public int deleteNotice(Notice notice) {
		// TODO Auto-generated method stub
		return noticeDaoImpl.deleteNotice(notice);
	}

	@Override
	public int updateNotice(Notice notice) {
		// TODO Auto-generated method stub
		return noticeDaoImpl.updateNotice(notice);
	}

	@Override
	public List<Notice> searchNotice() {
		// TODO Auto-generated method stub
		return null;
	}

}
