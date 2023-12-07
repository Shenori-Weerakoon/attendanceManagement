package attendanceMng;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/updateServlet")
public class updateServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String attendanceID = request.getParameter("attendanceID");
		String eid = request.getParameter("eid");
		String date = request.getParameter("date");
		String loginTime = request.getParameter("loginTime");
		String logoutTime = request.getParameter("logoutTime");
		
		
		
		boolean isTrue;
		
		isTrue = attendanceDBUtil.updateAttendance(attendanceID, eid, date, loginTime, logoutTime);
		
		if(isTrue==true) {
			
			List<employee> workDetails = attendanceDBUtil.getAttendanceDetails(attendanceID);
			request.setAttribute("workDetails", workDetails);
			
			RequestDispatcher dis = request.getRequestDispatcher("successful.jsp");
			dis.forward(request, response);
		}else {
			
			RequestDispatcher dis = request.getRequestDispatcher("unsuccess.jsp");
			dis.forward(request, response);
		}
	}
	
	

}
