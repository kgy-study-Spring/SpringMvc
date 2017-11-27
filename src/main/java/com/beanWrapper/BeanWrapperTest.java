package com.beanWrapper;

import org.springframework.beans.BeanWrapper;
import org.springframework.beans.PropertyAccessorFactory;
import org.springframework.beans.PropertyValue;

public class BeanWrapperTest {

	public static void main(String[] args) {
		User user = new User();
		BeanWrapper bw = PropertyAccessorFactory.forBeanPropertyAccess(user);
		bw.setPropertyValue("username", "1");
		System.out.println(user.getUsername());
		PropertyValue value = new PropertyValue("username","2");
		bw.setPropertyValue(value);
		System.out.println(user.getUsername());
	}
}
