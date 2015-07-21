package com.spe.enums;

import java.util.List;

public enum SecureLevelEnum {
 noLevel(0,"无级别"),levelOne(1,"级别一"),levenTwo(2,"级别二");

	 private int value;
	 private String desc;
	 private static List<SecureLevelEnum> enumList;
	 static {
		 enumList.add(noLevel);
		 enumList.add(levelOne);
		 enumList.add(levenTwo);
	 }
	 SecureLevelEnum(Integer value,String desc){
		 this.value = value;
		 this.desc  = desc;
	 }
	 
	 public static String getDesc(Integer value){
			for(SecureLevelEnum eachEnum : enumList){
				if(eachEnum.value == value){
					return eachEnum.toString();
				}
			}
			return null;
		}
		
		public static SecureLevelEnum getEnum(Integer value){
			for(SecureLevelEnum eachEnum : enumList){
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
