package com.spe.enums;

import java.util.ArrayList;
import java.util.List;

public enum DepartmentEnum {
	
	admin(0,"最高权限"),governor(1,"行长"),networkManagementCenter(2,"网管中心"),distributionCentre(3,"配送中心"),netDot(4,"网点(支行)"),functionalDepartment(5,"职能部门(网点下属机构");
	
	private int value;
	private String desc;
	private static List<DepartmentEnum> enumList = new ArrayList<DepartmentEnum>();
	
	static {
		enumList.add(admin);
		enumList.add(governor);
		enumList.add(networkManagementCenter);
		enumList.add(distributionCentre);
		enumList.add(netDot);
		enumList.add(functionalDepartment);
	}
	
	DepartmentEnum(Integer value,String desc){
		this.value = value;
		this.desc  = desc;
	}
	
	public static String getDesc(Integer value){
		for(DepartmentEnum eachEnum : enumList){
			if(eachEnum.value == value){
				return eachEnum.toString();
			}
		}
		return null;
	}
	
	public static DepartmentEnum getEnum(Integer value){
		for(DepartmentEnum eachEnum : enumList){
			if(eachEnum.value == value){
				return eachEnum;
			}
		}
		return null;
	}
	
	@Override
	public String toString(){
		return this.desc;
	}

	public int getValue() {
		return value;
	}

	public String getDesc() {
		return desc;
	}

	
	
	
}
