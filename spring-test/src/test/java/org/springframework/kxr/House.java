package org.springframework.kxr;

/**
 * @Author: kongxr
 * @Date: 2023-02-28 13:54
 * @Description:
 */
public class House {

	private Dog dog;

	private Person person;

	public Dog getDog() {
		return dog;
	}

	public void setDog(Dog dog) {
		this.dog = dog;
	}

	public Person getPerson() {
		return person;
	}

	public void setPerson(Person person) {
		this.person = person;
	}

	@Override
	public String toString() {
		return "House{" +
				"dog=" + dog +
				", person=" + person +
				'}';
	}
}
