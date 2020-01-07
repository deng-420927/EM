package com.briup.bean;

import java.util.Date;

/**
 * 
 * @ClassName:  Environment   
 * @Description:用于分装采集好的数据
 * @author: DENG
 * @date:   2020年1月6日   
 *     
 * @Copyright: 2020 DENG All rights reserved.
 */
public class Environment {
	//名字
	private String name;
	//发送端id 
	private String srcId;
	//树莓派系统id
	private String desId;
	//实验箱区域模块id(1-8)
	private String devId;
	//模块上传感器地址 
	private String sersorAddress;
	//传感器个数
	private int count; 
	//指令标号
	private String cmd;
	//采集日期
	private double data;
	//状态标示(默认为1表示成功)
	private int status;
	//采集时间(单位毫秒)
	private Date gather_date;
	
	public Environment(String name, String srcId, String desId, String devId, String sersorAddress, int count,
			String cmd, double data, int status, Date gather_date) {
		super();
		this.name = name;
		this.srcId = srcId;
		this.desId = desId;
		this.devId = devId;
		this.sersorAddress = sersorAddress;
		this.count = count;
		this.cmd = cmd;
		this.data = data;
		this.status = status;
		this.gather_date = gather_date;
	}

	public Environment() {
		super();
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSrcId() {
		return srcId;
	}

	public void setSrcId(String srcId) {
		this.srcId = srcId;
	}

	public String getDesId() {
		return desId;
	}

	public void setDesId(String desId) {
		this.desId = desId;
	}

	public String getDevId() {
		return devId;
	}

	public void setDevId(String devId) {
		this.devId = devId;
	}

	public String getSersorAddress() {
		return sersorAddress;
	}

	public void setSersorAddress(String sersorAddress) {
		this.sersorAddress = sersorAddress;
	}

	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count = count;
	}

	public String getCmd() {
		return cmd;
	}

	public void setCmd(String cmd) {
		this.cmd = cmd;
	}

	public double getData() {
		return data;
	}

	public void setData(double data) {
		this.data = data;
	}

	public int getStatus() {
		return status;
	}

	public void setStatus(int status) {
		this.status = status;
	}

	public Date getGather_date() {
		return gather_date;
	}

	public void setGather_date(Date gather_date) {
		this.gather_date = gather_date;
	}

	@Override
	public String toString() {
		return "Environment [name=" + name + ", srcId=" + srcId + ", desId=" + desId + ", devId=" + devId
				+ ", sersorAddress=" + sersorAddress + ", count=" + count + ", cmd=" + cmd + ", data=" + data
				+ ", status=" + status + ", gather_date=" + gather_date + "]";
	}
	
	
}
