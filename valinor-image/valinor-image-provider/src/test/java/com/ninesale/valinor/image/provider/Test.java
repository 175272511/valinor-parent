package com.ninesale.valinor.image.provider;

import java.util.ArrayList;
import java.util.List;

public class Test {

	public static void main(String[] args) {
		String ids = "3,4,5";
		String[] idArray = ids.split(",");
		List<Long> list = new ArrayList<Long>();
		for(int i=0;i<idArray.length;i++){
			list.add(Long.parseLong(idArray[i])); 
		}
		System.out.println(list.size()); 
	}
}
