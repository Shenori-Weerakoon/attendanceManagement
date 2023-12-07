package attendanceMng;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/deleteServlet")
public class deleteServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String attendanceID = request.getParameter("attendanceID");
		boolean isTrue;
		
		isTrue = attendanceDBUtil.deleteAttendance(attendanceID);
		
		if(isTrue == true) {
			RequestDispatcher dis = request.getRequestDispatcher("recordAttendance.jsp");
			dis.forward(request, response);
		}else {
			
			RequestDispatcher dis = request.getRequestDispatcher("error.jsp");
			dis.forward(request, response);
		}
		
	}

}
