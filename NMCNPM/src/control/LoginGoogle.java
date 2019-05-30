package control;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.gmail.Info;

@WebServlet("/LoginGoogle")
public class LoginGoogle extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public LoginGoogle() {
		super();
	}

//5.4 Xử lí thông tin gửi đến từ Form Google chuyển đến index.jsp
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");// định dạng tiếng việt
		response.setCharacterEncoding("UTF-8");
		response.setContentType("text/html;charset=utf-8");
		String id = request.getParameter("id");// lấy thông tin bên google gán vào chuỗi String
		String email = request.getParameter("email");
		String fullName = request.getParameter("fullName");
		String name = request.getParameter("name");
		String image = request.getParameter("image");

		Info info = new Info(id, email, name, fullName, image);
		ArrayList<Info> listInfo = new ArrayList<>();
		listInfo.add(info);
		request.setAttribute("listInfo", listInfo);//dùng setAttribute gán listInfo vào listInfo , để bên trang index.jsp gọi lại
													// listinfo lấy dữ liệu
		RequestDispatcher rd = request.getRequestDispatcher("/index.jsp");// chuyển yêu cầu đến trang index.jsp
		rd.forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
	}

}
