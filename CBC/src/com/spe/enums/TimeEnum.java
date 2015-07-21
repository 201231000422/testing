package com.spe.enums;

import java.util.ArrayList;
import java.util.List;

/**
 * work time Enum
 * @author chensiyuan
 *
 */
public enum TimeEnum {
	none(0,"无"),one(1,"1工时"),two(2,"两工时"),three(3,"三工时"),four(4,"四工时"),five(5,"五工时"),six(6,"六工时");
	
	private int value;
	private String desc;
	private static List<TimeEnum> enumList = new ArrayList<TimeEnum>();
	
	static{
		enumList.add(one);
		enumList.add(two);
		enumList.add(three);
		enumList.add(four);
		enumList.add(five);
		enumList.add(six);
	}
	
	TimeEnum(Integer value,String desc){
		this.value = value;
		this.desc  = desc;
	}
	
	public static String getDesc(Integer value){
		for(TimeEnum eachEnum : enumList){
			if(eachEnum.value == value){
				return eachEnum.toString();
			}
		}
		return null;
	}
	
	public static TimeEnum getEnum(Integer value){
		for(TimeEnum eachEnum : enumList){
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
