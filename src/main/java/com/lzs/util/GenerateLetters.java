package com.lzs.util;

public class GenerateLetters {
	
	/**
	 * <p>MethodName: generateAToZ</p>
	 * <p>Description: 生成A-Za-z的英文字母</p>
	 * @return
	 * @Date 2017年5月17日上午10:00:08
	 * @author luzs
	 */
	public static String generateAToZ(){
		StringBuffer sb = new StringBuffer();
		char i = 'A', j = 'a';
		char aa, bb;
		for (int n = 0; n < 26; n++) {
			aa = (char) (i + n);
			bb = (char) (j + n);
			sb.append(aa).append(bb);
		}
		
		return sb.toString();
	}
	
}
