package org.springframework.kxr.application_context;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * @Author: kongxr
 * @Date: 2023-03-03 9:25
 * @Description:
 */
@Component
public class ServiceB {

	@Autowired
	private ServiceA serviceA;

	public String toDo() {
		return serviceA.toString();
	}
}
