package com.tenco.temp2;

import java.util.Random;
import java.util.Scanner;

public class going {

	String name;
	int choose;
	Random rd = new Random();
	int a = 0;
	int b = 0;
	int p1hp;
	int p2hp;
	int p1sp;
	int p2sp;

	Scanner sc = new Scanner(System.in);

	Event ev = new Event();
	Items item = new Items();
	Person1 p1 = new Person1();
	Person2 p2 = new Person2();
	int ing;

	public void start() {

		System.out.println("캐릭터를 정해주세요");
		System.out.println("1. p1\t 2. p2");
		choose = sc.nextInt();
		if (choose == 1) {
			p1.setName("p1");
			p2.setName("computer");
		} else if (choose == 2) {
			p2.setName("p2");
			p1.setName("computer");
		} else {
			System.out.println("잘못된 입력입니다! 시작화면으로 되돌아갑니다");
			return;
		}

	}

	public void ing() {

		p1hp = p1.getHp();
		p2hp = p2.getHp();
		p1sp = p1.getSpeed();
		p2sp = p2.getSpeed();

		System.out.println("=======================================");
		System.out.println("현재 나의 체력 : ");
		if (choose == 1) {
			System.out.print(p1hp + "\n");
		} else {
			System.out.print(p2hp + "\n");
		}
		System.out.println("상대방의 체력 : ");
		if (choose == 1) {
			System.out.print(p2hp + "\n");
		} else
			System.out.print(p1hp + "\n");
		
		System.out.println("다음 행동을 정해주세요");
		System.out.println("1. 공격한다 2. 회복한다 3. 회피한다");
		System.out.print("선택 : ");
		ing = sc.nextInt();

		if (ing == 1) {

			p1sp = p1.getSpeed() - rd.nextInt(3);
			p2sp = p2.getSpeed() - rd.nextInt(3);

			 if(p1sp > p2sp) {
					System.out.print("p1이 먼저");
					p1.attackPerson(p2);
					System.out.print("\nP2가 ");
					p2.attackPerson(p1);

			} else if (p1sp == p2sp) {
				System.out.println("동시 사격하여 무효가 되었습니다");
				return;
			} else {
	
					System.out.print("p2가 먼저");
					p2.attackPerson(p1);
					System.out.print("\nP1이 ");
					p1.attackPerson(p2);
				
			}

		} else if (ing == 2) {
			
			}

		}

	public void event() {

		a = rd.nextInt(100);
		System.out.println("==========================================");
		System.out.println("현재 다음과 발생하는 이벤트는 다음과 같습니다");
		if (a > 50)
			ev.Normal();
		else if (a <= 50 && a > 40)
			ev.Windstorm1(p1);
		else if (a <= 40 && a > 30)
			ev.Windstorm2(p2);
		else if (a <= 30 && a > 20)
			ev.Rainstorm1(p1);
		else if (a <= 20 && a > 10)
			ev.Rainstorm2(p2);
		else if (a <= 10 && a < 5)
			ev.Thunderbolt1(p1);
		else
			ev.Thunderbolt2(p2);
		System.out.print("확률성에 의해 다음과 아이템을 장착 중입니다 : ");

		b = rd.nextInt(100);

		if (b > 95) {
			System.out.print("리볼버 + 2강\n");
			b = 0;
		} else if (b <= 95 && b > 85) {
			System.out.print("리볼버 + 1강\n");
			b = 0;
		} else if (b <= 85 && b > 50) {
			System.out.print("방탄복\n");
			System.out.print("방탄복");
			b = 0;
		} else {
			System.out.println("기본 리볼버");
			b = 0;
		}
	}
}
