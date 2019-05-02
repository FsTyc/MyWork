package cn.travel.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import cn.travel.entity.Admin;
import cn.travel.impl.serviceImpl.AdminServiceImpl;

public class AdminServlet extends HttpServlet {
	AdminServiceImpl adminServiceImpl=new AdminServiceImpl();
	/**
	 * Constructor of the object.
	 */
	public AdminServlet() {
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
	 * @param request the request send by the client to the server
	 * @param response the response send by the server to the client
	 * @throws ServletException if an error occurred
	 * @throws IOException if an error occurred
	 */
	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		this.doPost(request, response);
	}

	/**
	 * The doPost method of the servlet. <br>
	 *
	 * This method is called when a form has its tag value method equals to post.
	 * 
	 * @param request the request send by the client to the server
	 * @param response the response send by the server to the client
	 * @throws ServletException if an error occurred
	 * @throws IOException if an error occurred
	 */
	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		String opr=request.getParameter("opr");
		if("login".equals(opr)){
			Admin admin=new Admin();
			admin.setAdminName(request.getParameter("username"));
			admin.setAdminPwd(request.getParameter("password"));
			int num=adminServiceImpl.adminLogin(admin);
			if(num>0){
				request.getSession().setAttribute("admin", admin);
				out.print("<script>alert('登录成功！')</script>");
				out.print("<script>window.location.href='/Travelweb2019/admin/admin_add.jsp'</script>");
			}else{
				out.print("<script>alert('登录失败！')</script>");
				out.print("<script>window.location.href='/Travelweb2019/admin/login.jsp'</script>");
			}
		}else if("addAdmin".equals(opr)){
			Admin admin=new Admin();
			admin.setAdminName(request.getParameter("user"));
			admin.setAdminPwd(request.getParameter("password"));
			int num=adminServiceImpl.addAdmin(admin);
			if(num>0){
				out.print("<script>alert('添加成功！')</script>");
				out.print("<script>window.location.href='/Travelweb2019/admin/admin_add.jsp'</script>");
			}else{
				out.print("<script>alert('添加不成功！')</script>");
				out.print("<script>window.location.href='/Travelweb2019/admin/admin_add.jsp'</script>");
			}
		}
	
		out.flush();
		out.close();
	}

	/**
	 * Initialization of the servlet. <br>
	 *
	 * @throws ServletException if an error occurs
	 */
	public void init() throws ServletException {
		// Put your code here
	}

}
