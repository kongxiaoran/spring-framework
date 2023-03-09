package org.springframework.kxr;

/**
 * @Author: kongxr
 * @Date: 2023-02-28 10:22
 * @Description:
 */
public class Species {
	private String planetName;

	public Species() {
		this.planetName = "地球";
	}

	public String getPlanetName() {
		return planetName;
	}

	public void setPlanetName(String planetName) {
		this.planetName = planetName;
	}
}
