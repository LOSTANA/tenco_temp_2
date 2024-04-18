package com.tenco.temp2;

import java.util.Scanner;

public class MainMenu {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		going go = new going();
		
		int menu;

			System.out.println("========================================================");
			System.out.println("\t 서부시대 1vs1 배틀");
			System.out.println("========================================================");
			System.out.println();
			while (true) {
			System.out.println("1. 시작하기 2. 게임 종료");
			menu = sc.nextInt();
			
			if(menu == 1)
			{
				go.start();
				
				while(true) {
					
					go.event();
					
					go.ing();
					
				}
			}
			else if(menu == 2) {
				System.out.println("게임을 종료합니다");
				break;
			}
			else {
				System.out.println("잘못된 입력입니다 다시 입력해 주세요");
				continue;
			}
		}
	}

}
