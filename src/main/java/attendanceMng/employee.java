package attendanceMng;


public class employee {

	private String attendanceID;
	private String eid;
	private String loginTime;
	private String logoutTime;
	private String date;
	
	public employee(String attendanceID, String eid, String loginTime, String logoutTime, String date) {

		this.attendanceID = attendanceID;
		this.eid = eid;
		this.loginTime = loginTime;
		this.logoutTime = logoutTime;
		this.date = date;
	}





	public String getAttendanceID() {
		return attendanceID;
	}

	public String getEid() {
		return eid;
	}
	
	public String getDate() {
		return date;
	}

	public String getLoginTime() {
		return loginTime;
	}

	public String getLogoutTime() {
		return logoutTime;
	}

	

	
	
}
