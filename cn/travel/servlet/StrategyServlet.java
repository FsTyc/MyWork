package cn.travel.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import cn.travel.entity.Strategy;
import cn.travel.impl.serviceImpl.StrategyServiceImpl;

public class StrategyServlet extends HttpServlet {

	/**
	 * Constructor of the object.
	 */
	public StrategyServlet() {
		super();
	}

	/**
	 * Destruction of the servlet. <br>
	 */
	public void destroy() {

		super.destroy(); // Just puts "destroy" string in log
		// Put your code here
	}
	
	
	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
			this.doPost(request, response);
	}

	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		StrategyServiceImpl strategyServiceImpl=new StrategyServiceImpl();
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		String opr=request.getParameter("opr");
		if("strategyAdd".equals(opr)){
			Strategy strategy=new Strategy();
			strategy.setStrategyTitle(request.getParameter("strategyTitle"));
			strategy.setStrategyAppropriateTime(request.getParameter("strategyAppropriateTime"));
			strategy.setStrategyAppropriateCrowd(request.getParameter("strategyAppropriateCrowd"));
			strategy.setStrategyImg(request.getParameter("strategyImg"));
			strategy.setStrategyID(new Integer(request.getParameter("strategyID")));
			strategy.setStrategyIntro(request.getParameter("strategyIntro"));
			strategy.setStrategyEquip(request.getParameter("strategyEquip"));
			strategy.setStrategyMatters(request.getParameter("strategyMatters"));
			strategy.setAdminName(request.getSession().getAttribute("adminName").toString());
			strategy.setStrategyReleaseTime(new Date());
			int num=strategyServiceImpl.addStrategy(strategy);
			if(num==1){
				out.print("<script>alert('添加成功')</script>");
			}else{
				out.print("<script>alert('添加失败')</script>");
			}
		}
		
		
		
		out.flush();
		out.close();
	}

	
	public void init() throws ServletException {
		// Put your code here
	}

}
