package com.tenco.temp2;

public class Event {
	private int rain;
	private int wind;
	private int thunderbolt;
	private int normal;

	// getter
	public int getRain() {
		return rain;
	}

	public int getWind() {
		return wind;
	}

	public int getThunderbolt() {
		return thunderbolt;
	}


	public int getNormal() {
		return normal;
	}


	// 기능
	public void Normal() {
		System.out.println("날씨가 맑습니다.");
	}
	
	public void Rainstorm () {
		System.out.println(" 비가 크게 내려 ");
	}

	public void Windstorm1 (Person1 p1) {
		System.out.println("바람이 p1에게 유리하게 붑니다.");
		
	}
	
	public void Windstorm2 (Person2 p2) {
		System.out.println("바람이 p2에게 유리하게 붑니다.");

	}

	public void Thunderbolt () {
		System.out.println("번개가 몰아칩니다.");
	}

}
