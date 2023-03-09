package org.springframework.kxr;

/**
 * @Author: kongxr
 * @Date: 2023-02-28 10:24
 * @Description:
 */
public class Dog extends Species{

	private String masterName;

	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getMasterName() {
		return masterName;
	}

	public void setMasterName(String masterName) {
		this.masterName = masterName;
	}

	@Override
	public String toString() {
		return "Dog{" +
				"masterName='" + masterName + '\'' +
				", name='" + name + '\'' +
				'}';
	}
}
