package attendanceMng;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/attendanceCtrl")
public class attendanceCtrl extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		// Retrieve parameters from the attendance interface form
		
		String attendanceID = request.getParameter("attendanceID");
		String eid = request.getParameter("eid");
        String loginTime = request.getParameter("loginTime");
        String logoutTime = request.getParameter("logoutTime");
        String date = request.getParameter("date");

        request.setAttribute("attendanceID", attendanceID);
        request.setAttribute("eid", eid);
        request.setAttribute("loginTime", loginTime);
        request.setAttribute("logoutTime", logoutTime);
        request.setAttribute("date", date);
        
        boolean isTrue;
        
        isTrue = attendanceDBUtil.insertAttendance(attendanceID, eid, date, loginTime, logoutTime);
        
        if(isTrue == true) {
        	
        	List<employee> empdetails = attendanceDBUtil.getemployee(attendanceID);
        	request.setAttribute("empdetails", empdetails);
        	
        	RequestDispatcher dis = request.getRequestDispatcher("viewAtt.jsp");
        	dis.forward(request, response);
        }else {
        	RequestDispatcher dis2 = request.getRequestDispatcher("unsuccess.jsp");
        	dis2.forward(request, response);
        }
        	
        	
        
	}

}
