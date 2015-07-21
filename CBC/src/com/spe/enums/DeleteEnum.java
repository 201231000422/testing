package com.spe.enums;

import java.util.ArrayList;
import java.util.List;

public enum DeleteEnum {
	
	noDelete(0,"未删除"),isDeleted(1,"已删除");
	
	private int value;
	private String desc;
	private static List<DeleteEnum> enumList = new ArrayList<DeleteEnum>();
	
	static {
		enumList.add(isDeleted);
		enumList.add(noDelete);
	}
	
	DeleteEnum(Integer value,String desc){
		this.value = value;
		this.desc = desc;
	}
	
	public static String getDesc(Integer value){
		for(DeleteEnum eachEnum : enumList){
			if(eachEnum.value == value){
				return eachEnum.toString();
			}
		}
		return null;
	}
	
	public static DeleteEnum getEnum(Integer value){
		for(DeleteEnum eachEnum : enumList){
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
	
	/**
	 * 判断是否被删除
	 * @param value
	 * @return
	 */
	public static boolean isDelete(Integer value){
		if(value == DeleteEnum.isDeleted.getValue()){
			return true;
		}
		return false;
	}
	
}
