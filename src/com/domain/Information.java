package com.domain;
import java.util.Date;
public class Information {
   private Integer iid;
   private String iname;
   private String iactor;
   private String idirect;
   private Date itime;
   
   private String idescription;
   
public Integer getIid() {
	return iid;
}
public void setIid(Integer iid) {
	this.iid = iid;
}
public String getIname() {
	return iname;
}
public void setIname(String iname) {
	this.iname = iname;
}
public String getIactor() {
	return iactor;
}
public void setIactor(String iactor) {
	this.iactor = iactor;
}
public String getIdirect() {
	return idirect;
}
public void setIdirect(String idirect) {
	this.idirect = idirect;
}
public Date getItime() {
	return itime;
}
public void setItime(Date itime) {
	this.itime = itime;
}

public String getIdescription() {
	return idescription;
}
public void setIdescription(String idescription) {
	this.idescription = idescription;
}
}
