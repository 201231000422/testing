package com.spe.util;

import java.util.UUID;

public class UuidUtil {
	
	public static String generateUUID(){
		
		UUID uuid = UUID.randomUUID();
		return uuid.toString().replace("-", "");
	}
	
}
