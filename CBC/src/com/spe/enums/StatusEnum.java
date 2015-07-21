package com.spe.enums;

import java.util.ArrayList;
import java.util.List;

/**
 * status to present the transaction handle status 
 * @author ChenSiyuan
 *
 */
public enum StatusEnum {
	abort(-1,"�ϳ�"),waitForVerify(1,"��������Ӧ"),waitForHandle(2,"������"),commitToGovernor(2,"���ύ�г�"),waitForDispose(3,"�����"),disposed(4,"�Ѱ��");
	private int value;
	private String desc;
	private static List<StatusEnum> statusList = new ArrayList<StatusEnum>();
	
	static{
		statusList.add(abort);
		statusList.add(waitForVerify);
		statusList.add(waitForHandle);
		statusList.add(commitToGovernor);
		statusList.add(waitForDispose);
		statusList.add(disposed);
	}
	
	StatusEnum(Integer value,String desc){
		this.value = value;
		this.desc  = desc;
	}
	
	public static String getDesc(Integer value){
		for(StatusEnum eachEnum:statusList){
			if(eachEnum.value == value){
				return eachEnum.toString();
			}
		}
		return null;
	}
	
	public static StatusEnum getEnum(Integer value){
		for(StatusEnum eachEnum : statusList){
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
