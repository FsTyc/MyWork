package cn.travel.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import cn.travel.entity.UserState;
import cn.travel.impl.serviceImpl.UserStateServiceImpl;

public class UserStateServlet extends HttpServlet {
	UserStateServiceImpl userStateServiceImpl=new UserStateServiceImpl();
	/**
	 * Constructor of the object.
	 */
	public UserStateServlet() {
		super();
	}

	/**
	 * Destruction of the servlet. <br>
	 */
	public void destroy() {
		super.destroy(); // Just puts "destroy" string in log
		// Put your code here
	}

	/**
	 * The doGet method of the servlet. <br>
	 * 
	 * This method is called when a form has its tag value method equals to get.
	 * 
	 * @param request
	 *            the request send by the client to the server
	 * @param response
	 *            the response send by the server to the client
	 * @throws ServletException
	 *             if an error occurred
	 * @throws IOException
	 *             if an error occurred
	 */
	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		doPost(request, response);
	}

	/**
	 * The doPost method of the servlet. <br>
	 * 
	 * This method is called when a form has its tag value method equals to
	 * post.
	 * 
	 * @param request
	 *            the request send by the client to the server
	 * @param response
	 *            the response send by the server to the client
	 * @throws ServletException
	 *             if an error occurred
	 * @throws IOException
	 *             if an error occurred
	 */
	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		String opr = request.getParameter("opr");
		if ("addUserState".equals(opr)) {
			String stateComment=request.getParameter("stateComment");
			Date userStateTime=new Date();
			UserState userState=new UserState();
			userState.setStateComment(stateComment);
			userState.setUserName(request.getSession().getAttribute("userName").toString());
			userState.setUserStateTime(userStateTime);
			int num=userStateServiceImpl.addUserState(userState);
			if(num>0){
				out.print("<script>alert('发表成功！')</script>");
				out.print("<script>window.location.href='/Travelweb2019/UserStateServlet?opr=searchUserState'</script>");
			}else{
				out.print("<script>alert('发表失败！')</script>");
			}
		}else if("searchUserState".equals(opr)){
			List<UserState> userStatelist=userStateServiceImpl.searchUserState(request.getSession().getAttribute("userName").toString());
			StringBuilder searchList=new StringBuilder("");
			
			for(int i=0;i<userStatelist.size();i++){
				searchList.append("<li class='fn-clear'><div>");
				searchList.append("<p><a class='comment_user' href='#'>发布时间："+userStatelist.get(i).getUserStateTime()+"</a>");
				searchList.append("<label style='float:right'><a class='comment_user' href='#'>删除</a></label></p><div class='comment_box'>");
				searchList.append("<div class='comment_cnt'>"+userStatelist.get(i).getStateComment() +"</div>");
				searchList.append("</div></div></li>");
			}
			String searchLists=searchList.toString();
			out.print(searchLists);
		}
		out.flush();
		out.close();
	}

	/**
	 * Initialization of the servlet. <br>
	 * 
	 * @throws ServletException
	 *             if an error occurs
	 */
	public void init() throws ServletException {
		// Put your code here
	}

}
