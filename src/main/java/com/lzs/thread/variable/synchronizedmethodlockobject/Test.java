package com.lzs.thread.variable.synchronizedmethodlockobject;

import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.net.URLEncoder;

public class Test {
	public static void main(String[] args) {
		try {
			System.out.println(URLEncoder.encode("test11", "UTF-8"));
			System.out.println(URLDecoder.decode("哈哈","UTF-8"));
		} catch (UnsupportedEncodingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
