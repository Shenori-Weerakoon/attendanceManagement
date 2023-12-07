package attendanceMng;

import java.util.Date;

public class successful {

	private int attendanceID;
	private int eid;
	private Date logintime;
	private Date logouttime;
	
	
	public successful(int attendanceID, int eid, Date logintime, Date logouttime, int workingHours) {
		super();
		this.attendanceID = attendanceID;
		this.eid = eid;
		this.logintime = logintime;
		this.logouttime = logouttime;
		
	}

	public int getAttendanceID() {
		return attendanceID;
	}

	

	public int getEid() {
		return eid;
	}

	

	public Date getLogintime() {
		return logintime;
	}

	

	public Date getLogouttime() {
		return logouttime;
	}

	

	

	
	
	
	
	
}
