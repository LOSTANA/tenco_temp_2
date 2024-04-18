package com.tenco.temp2;

import java.util.Random;
import java.util.Scanner;

public class going {
	
	String name;
	int gun;
	Random rd = new Random();
	int a = 0;
	
	Scanner sc = new Scanner(System.in);
	
	Event ev = new Event();
	int choose;

	public void start() {

		System.out.println("캐릭터를 정해주세요");
		choose = sc.nextInt();
		if (choose == 1) {
			
		} else if (choose == 2) {

		} else {
			System.out.println("잘못된 입력입니다! 시작화면으로 되돌아갑니다");
			return;
		}

	}

	public void ing() {
		System.out.println("=======================================");
		System.out.println("다음 행동을 정해주세요");
		System.out.println("1. 공격한다 2. 회복한다 3. 회피한다");
		System.out.print("선택 : ");
		choose = sc.nextInt();

		if (choose == 1) {

		} else if (choose == 2) {

		} else if (choose == 3) {

		} else {

		}

	}
	
	public void event() {
		
		a = rd.nextInt(100);
		System.out.println("==========================================");
		System.out.println("현재 다음과 발생하는 이벤트는 다음과 같습니다");
		if(a>50)
			ev.Normal();
		else if(a>=50 || a < 35)
			ev.Windstorm();
		else if(a>=30 || a < 15 )
			ev.Rainstorm();
		else
			ev.Thunderbolt();
		System.out.println("확률성에 의해 다음과 아이템을 장착 중입니다 : ");
	}

}
