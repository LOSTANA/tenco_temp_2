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
		System.out.println("비가 크게 내립니다.");

	}

	public void Windstorm () {
		System.out.println("바람이 심하게 붑니다.");

	}

	public void Thunderbolt () {
		System.out.println("번개가 몰아칩니다.");
	}

}
