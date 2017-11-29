package com.lzs.sourcecode;

import java.lang.reflect.Field;

/**
 * 
 * @author lvsazf
 *
 */
public class IntegerSwap {

	public static void main(String[] args) {

		Integer num1 = 2;
		Integer num2 = 3;
		System.out.println("num1: " + num1 + ";num2: " + num2);
		IntegerSwap swap = new IntegerSwap();
		swap.swap(num1, num2);
		System.out.println("num1: " + num1 + ";num2: " + num2);

	}

	public void swap(Integer num1, Integer num2) {
		try {
			Field field = Integer.class.getDeclaredField("value");
			field.setAccessible(true);
			int tmp = num1;
			field.set(num1, num2);
			field.setInt(num2, tmp);
		} catch (NoSuchFieldException e) {
			e.printStackTrace();
		} catch (SecurityException e) {
			e.printStackTrace();
		} catch (IllegalArgumentException e) {
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		}
	}

}
