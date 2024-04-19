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
	
	
	public void Rainstorm1 (Person1 p1) {
		System.out.println("비가 크게 내려립니다.");
		// 화약이 젓어서 공격력 0
	}
	
	public void Rainstorm2 (Person2 p2) {
		System.out.println("비가 크게 내려립니다.");
		// 화약이 젓어서 공격력 0
	}

	public void Windstorm1 (Person1 p1) {
		System.out.println("바람이 p1에게 유리하게 붑니다.");
		// p1이 speed +1 
	}
	
	public void Windstorm2 (Person2 p2) {
		System.out.println("바람이 p2에게 유리하게 붑니다.");
		// p2이 speed +1 

	}

	public void Thunderbolt1 (Person1 p1) {
		System.out.println("번개가 몰아칩니다.");
		// 난수로 방어력이 까진다 난수
	}
	
	public void Thunderbolt2 (Person2 p2) {
		System.out.println("번개가 몰아칩니다.");
		// 난수로 방어력이 까진다 난수
	}

	
}
