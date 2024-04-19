package com.tenco.temp2;

import java.util.Scanner;

public class MainMenu {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		Person1 p1 = new Person1();
		Person2 p2 = new Person2();

		int p1hp;
		int p2hp;

		going go = new going();

		int menu;

		System.out.println("========================================================");
		System.out.println("\t 서부시대 1vs1 배틀");
		System.out.println("========================================================");
		System.out.println();
		while (true) {
			System.out.println("1. 시작하기 2. 게임 종료");
			menu = sc.nextInt();

			if (menu == 1) {
				go.start();

				while (true) {
					p1hp = p1.getHp();
					p2hp = p2.getHp();
					System.out.println(p1hp);
					if (p1hp <= 0 && p2hp <= 0) {
						System.out.println("게임을 종료합니다");
						break;
					} else {
						go.event();
						go.ing();

					}
				}
			} else if (menu == 2) {
				System.out.println("게임을 종료합니다");
				break;
			} else {
				System.out.println("잘못된 입력입니다 다시 입력해 주세요");
				continue;
			}
		}
<<<<<<< HEAD
		sc.close();
=======
			sc.close();
>>>>>>> 581efb33ba9e5da951183dc172c2d65c0125de46
	}

}
