package cn.travel.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import cn.travel.entity.Traveller;
import cn.travel.entity.User;
import cn.travel.impl.serviceImpl.TravellerServiceImpl;
import cn.travel.impl.serviceImpl.UserServiceImpl;

public class UserServlet extends HttpServlet {
	UserServiceImpl userServiceImpl = new UserServiceImpl();
	TravellerServiceImpl travellerServiceImpl=new TravellerServiceImpl();
	String username = "";

	public UserServlet() {
		super();
	}

	public void destroy() {
		super.destroy(); // Just puts "destroy" string in log
		// Put your code here
	}

	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		this.doPost(request, response);
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

		if ("login".equals(opr)) {
			User user = new User();
			String userName = request.getParameter("nickname");
			String userPwd = request.getParameter("password");
			user.setUserName(userName);
			user.setUserPwd(userPwd);
			int num = userServiceImpl.login(user);
			if (num > 0) {
				request.getSession().setAttribute("userName", userName);
				Date loginTime=new Date();
				username = userName;
				userServiceImpl.updateUser(loginTime, userName);
				response.sendRedirect("/Travelweb2019/html/success.jsp");
			} else {
				response.sendRedirect("/Travelweb2019/html/error.jsp");
			}
		} else if ("user".equals(opr)) {
			response.sendRedirect("/Travelweb2019/html/user/state.jsp");
		} else if ("register".equals(opr)) {
			User user = new User();
			String userName = request.getParameter("nickname");
			String userPwd = request.getParameter("password");
			String email = request.getParameter("email");
			user.setUserName(userName);
			user.setUserPwd(userPwd);
			user.setEmail(email);
			int num = userServiceImpl.register(user);
			if (num > 0) {
				response.sendRedirect("/Travelweb2019/html/register_success.jsp");
			} else {
				response.sendRedirect("/Travelweb2019/html/register_error.jsp");
			}

		} else if ("acccountDetail".equals(opr)) {
			User user = new User();
			String sex = request.getParameter("optionsRadios");
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
			Date birthday = new Date();
			try {
				birthday = sdf.parse(request.getParameter("birthday"));
			} catch (ParseException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			String qq = request.getParameter("qq");
			String phone = request.getParameter("phone");
			String location = request.getParameter("location");
			String hobby = request.getParameter("hobby");
			String resume = request.getParameter("resume");
			String userName = username;
			user.setUserName(userName);
			user.setBirthday(birthday);
			user.setHobby(hobby);
			user.setLocation(location);
			user.setPhone(phone);
			user.setQq(qq);
			user.setResume(resume);
			user.setSex(sex);
			int num = userServiceImpl.addAcccountDetail(user);
			if (num > 0) {
				request.getSession().setAttribute("user", user);
				response.sendRedirect("/Travelweb2019/html/user/detail.jsp");
			} else {
				out.print("<script>alert('修改失败！')</script>");
				out.print("<script>window.location.href='/Travelweb2019/html/user/acccount_detail.jsp'</script>");
			}
		} else if ("passwordChange".equals(opr)) {
			String oldpassword = request.getParameter("oldpassword");
			String newpassword = request.getParameter("newpassword");
			String newpasswords = request.getParameter("newpasswords");
			User user = new User();
			String userName = username;
			String userPwd = oldpassword;
			user.setUserName(userName);
			user.setUserPwd(userPwd);
			int num = userServiceImpl.login(user);
			if(num>0){
				if(newpassword.equals(newpasswords)){
					user.setUserPwd(newpassword);
					int i=userServiceImpl.passwordChange(user);
					if(i>0){
						out.print("<script>alert('修改成功！')</script>");
						out.print("<script>window.location.href='/Travelweb2019/TravellerServlet?opr=searchTraveller'</script>");
						
					}else{
						out.print("<script>alert('修改失败！')</script>");
						out.print("<script>window.location.href='/Travelweb2019/html/user/password_change.jsp'</script>");

					}
				}
			}else{
				out.print("<script>alert('修改失败！')</script>");
				out.print("<script>window.location.href='/Travelweb2019/html/user/password_change.jsp'</script>");
			}

		}else if("travelAdd".equals(opr)){
			Traveller traveller=new Traveller();
			 String travellerTitle=request.getParameter("travellerTitle");
			 Date travellerReleaseTime=new Date();
			 Date travellerStartingTime=new Date();
			 Date travellerEndTime=new Date();
			 String userName=username;
			 SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
			 try {
			 travellerStartingTime=sdf.parse(request.getParameter("travellerStartingTime"));
				 travellerEndTime=sdf.parse(request.getParameter("travellerEndTime"));
			 } catch (ParseException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			 String phone=request.getParameter("phone");
			 String travellerDestination=request.getParameter("travellerDestination");
			 String travellerContent=request.getParameter("travellerContent");
			 traveller.setTravellerTitle(travellerTitle);
			 traveller.setTravellerReleaseTime(travellerReleaseTime);
			 traveller.setTravellerContent(travellerContent);
			 traveller.setTravellerDestination(travellerDestination);
			 traveller.setTravellerEndTime(travellerEndTime);
			 traveller.setTravellerStartingTime(travellerStartingTime);
			 traveller.setUserName(userName);
			 traveller.setPhone(phone);
			 int num=travellerServiceImpl.addTraveller(traveller);
			 if(num>0){
				 out.print("<script>alert('发布成功！')</script>");
				 userServiceImpl.updateTravelCount(userName);
				 response.sendRedirect("/Travelweb2019/TravellerServlet?opr=searchTraveller");
			 }else{
				 out.print("<script>alert('发布失败！')</script>");
				 out.print("<script>window.location.href='/Travelweb2019/html/user/travel_add.jsp'</script>");
			 }
		}else if("searchUser".equals(opr)){
			List<User> userList=userServiceImpl.searchUser();
			request.getSession().setAttribute("userList", userList);
			response.sendRedirect("/Travelweb2019/admin/auser_list.jsp");
		}else if("searchUserDetail".equals(opr)){
			String userName=request.getParameter("userName");
			User user=userServiceImpl.searchUser(userName);
			request.getSession().setAttribute("user", user);
			response.sendRedirect("/Travelweb2019/admin/auser_detail.jsp");
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
