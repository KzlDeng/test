package model;

public class Class {
	
	private int classid;
	private String classname;
	private Major major;
	
	public Class() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Class(int classid, String classname, Major major) {
		super();
		this.classid = classid;
		this.classname = classname;
		this.major = major;
	}
	
	public int getClassid() {
		return classid;
	}
	public void setClassid(int classid) {
		this.classid = classid;
	}
	public String getClassname() {
		return classname;
	}
	public void setClassname(String classname) {
		this.classname = classname;
	}
	public Major getMajor() {
		return major;
	}
	public void setMajor(Major major) {
		this.major = major;
	}
}
