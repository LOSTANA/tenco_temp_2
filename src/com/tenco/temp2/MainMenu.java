package com.tenco.temp2;

import java.util.Scanner;

public class MainMenu {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);



		int p1hp;
		int p2hp;
		String p1name;
		String p2name;

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
				System.out.println("캐릭터를 정해주세요");
				System.out.println("1. p1\t 2. p2");
				Person1 p1 = new Person1("p1");
				Person2 p2 = new Person2("p2");
				int choose = sc.nextInt();
				if (choose == 1) {
					p2.setName("computer");
				} else if (choose == 2) {
					p1.setName("computer");
				} else {
					System.out.println("잘못된 입력입니다! 시작화면으로 되돌아갑니다");
					return;
				}
				while (true) {

					System.out.println(p1.getHp());
					if (p1.getHp() <= 0 && p2.getHp() <= 0) {
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

		sc.close();

	}

}
