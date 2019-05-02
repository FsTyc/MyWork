package cn.travel.impl.daoImpl;

import java.util.Date;
import java.util.List;

import cn.travel.dao.StrategyDao;
import cn.travel.entity.Strategy;
import cn.travel.util.BaseDao;

public class StrategyDaoImpl extends BaseDao implements StrategyDao {

	@Override
	public List<Strategy> searchStrategy() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int addStrategy(Strategy strategy) {
		StringBuilder sql = new StringBuilder();
		sql.append("INSERT INTO `strategy`");
		sql.append("(`strategyTitle`,");
		sql.append("`strategyAppropriateTime`,");
		sql.append("`strategyAppropriateCrowd`,");
		sql.append("`strategyImg`,");
		sql.append("`strategyTypeID`,");
		sql.append("`strategyIntro`,");
		sql.append("`strategyEquip`,");
		sql.append("`strategyMatters`,");
		sql.append("`adminName`,");
		sql.append("`strategyReleaseTime`) ");
		sql.append("VALUES (?,?,?,?,?,?,?,?,?,?)");
		String sqls=sql.toString();
		String strategyTitle=strategy.getStrategyTitle();
		String strategyAppropriateTime=strategy.getStrategyAppropriateTime();
		String strategyAppropriateCrowd=strategy.getStrategyAppropriateCrowd();
		String strategyImg=strategy.getStrategyImg();
		int strategyTypeID=strategy.getStrategyTypeID();
		String strategyIntro=strategy.getStrategyIntro();
		String strategyEquip=strategy.getStrategyEquip();
		String strategyMatters=strategy.getStrategyMatters();
		String adminName=strategy.getAdminName();
		Date strategyReleaseTime=strategy.getStrategyReleaseTime();
		int num=super.executeUpdate(sqls,strategyTitle,
				strategyAppropriateTime,
				strategyAppropriateCrowd,
				strategyImg,
				strategyTypeID,
				strategyIntro,
				strategyEquip,
				strategyMatters,
				adminName,
				strategyReleaseTime);
		return num;
	}

	@Override
	public int deleteStrategy(Strategy strategy) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int updateStrategy(Strategy strategy) {
		// TODO Auto-generated method stub
		return 0;
	}

}
