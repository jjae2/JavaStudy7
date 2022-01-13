package com.prac.s1.diary;

import java.util.ArrayList;
import java.util.Scanner;

public class DiaryController {
	public void menu() {
	Scanner sc = new Scanner(System.in);
	boolean check = true;
	Diary diary = new Diary();
	ArrayList<DiaryDTO> ar = new ArrayList<>();
	DiaryDTO diaryDTO =new DiaryDTO();
	
	while(check) {
		System.out.println("1번. 전체명단 출력합니다.");
		System.out.println("2번. 이름검색 후 정보 출력합니다.");
		System.out.println("3번. 주소록 명단 추가합니다.");
		System.out.println("4번. 주소록 명단 제거합니다.");
		System.out.println("5번. 프로그램 종료");
		int select =sc.nextInt();
		switch(select) {
		case 1:
			System.out.println("전체명단을 출력합니다.");
			diary.diaryData();
			break;
		case 2:
			System.out.println("이름을 검색합니다.");
			diary.removeInfo(ar);
			break;
		case 3:
			System.out.println("주소록 명단을 추가합니다.");
			diary.addInfo();
			ar.add(diaryDTO);
			
			break;
		case 4:
			System.out.println("주소록 명단을 제거합니다.");
			break;
		default:
			System.out.println("프로그램을 종료합니다.");
			check = false;
			break;
		}
	}

	
}
}
