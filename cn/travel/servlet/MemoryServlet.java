package cn.travel.servlet;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import org.apache.commons.fileupload.*;
import org.apache.commons.fileupload.disk.DiskFileItemFactory;
import org.apache.commons.fileupload.servlet.ServletFileUpload;

public class MemoryServlet extends HttpServlet {

	/**
	 * Constructor of the object.
	 */
	public MemoryServlet() {
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

	doPost(request, response);
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
		if("memoryadd".equals(opr)){
			boolean bRet = false;
			boolean bUpload = false;
			String uploadFileName = "";
			String fieldName = "";
			//解析请求之前先判断请求类型是否为文件上传类型
			boolean isMultipart = ServletFileUpload.isMultipartContent(request);
			//指定上传位置
			String uploadFilePath = request.getSession().getServletContext().getRealPath("upload/");
			
			File saveDir = new File(uploadFilePath);  
			//如果目录不存在，就创建目录  
			if(!saveDir.exists()){  //File对象.exists()用于判断文件是否存在，返回true/false
			    saveDir.mkdir();  //File对象.mkdir()用于创建指定的目录
			    
			}  
			
			if(isMultipart){
				//创建文件上传核心类 
				FileItemFactory factory = new DiskFileItemFactory(); // 实例化一个硬盘文件工厂,用来配置上传组件ServletFileUpload
				ServletFileUpload upload = new ServletFileUpload(factory); // 用以上工厂实例化上传组件
				try{
					//处理表单请求
					List<FileItem> items = upload.parseRequest(request);
					Iterator<FileItem> iter = items.iterator();
					while(iter.hasNext()){
						FileItem item = (FileItem)iter.next();
						if(item.isFormField()){// 如果是普通表单控件 
							fieldName = item.getFieldName();// 获得该字段名称
							if(fieldName.equals("title")){
								//news.setTitle(item.getString("UTF-8"));//获得该字段值 
							}else if(fieldName.equals("categoryId")){
								//news.setCategoryId(Integer.parseInt(item.getString()));
							}else if(fieldName.equals("summary")){
								//news.setSummary(item.getString("UTF-8"));
							}else if(fieldName.equals("newscontent")){
								//news.setContent(item.getString("UTF-8"));
							}else if(fieldName.equals("author")){
								//news.setAuthor(item.getString("UTF-8"));
							}
						}else{// 如果为文件域
							String fileName = item.getName();// 获得文件名(全路径)
							if(fileName != null && !fileName.equals("")){
								File fullFile = new File(fileName);
								File saveFile = new File(uploadFilePath,fullFile.getName());//将文件保存到指定的路径
								item.write(saveFile);
								uploadFileName = fullFile.getName();
								//news.setPicPath(uploadFileName);//
								bUpload = true;
							
							}
						
						}
					}
				}catch(Exception e){
					e.printStackTrace();
				}
				
			}	
			//System.out.println("上传成功之后的文件名：" + news.getPicPath());
			//调用后台的方法，将新闻信息插入数据库中
			/*bRet = newsService.add(news);
			if(bRet)
				response.sendRedirect("newsDetailList.jsp");
			else
				response.sendRedirect("newsDetailCreateSimple.jsp");*/
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
