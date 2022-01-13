package com.prac.s1.diary;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.StringTokenizer;


public class Diary {
	private String data;
	private Scanner sc;

	public Diary() {
		this.data = "안재이,재이,jj@naver.com,010-0111-0111,05.24,";
		this.data = this.data + "장채린,채린,cc@gmail,010-1111-2222,09.01,";
		this.sc = new Scanner(System.in);
	}
	public DiaryDTO removeInfo(ArrayList<DiaryDTO> ar) {
		//삭제하고 싶은 이름받아서 삭제
		//arraylist에서 삭제
		DiaryDTO diaryDTO=null;
		System.out.println("삭제할 이름을 입력하세요");
		String name =this.sc.next();
		for(int i=0;i<ar.size();i++) {
			if(ar.get(i).getName().equals(name)) {
				diaryDTO=ar.remove(i);
				break;
			}
		}
		return diaryDTO;
	}
	public ArrayList<DiaryDTO> diaryData() {

		StringTokenizer st = new StringTokenizer(this.data, ",");
		ArrayList<DiaryDTO> ar = new ArrayList<>();

		while (st.hasMoreTokens()) {
			DiaryDTO diaryDTO = new DiaryDTO();
			diaryDTO.setName(st.nextToken());
			diaryDTO.setNick(st.nextToken());
			diaryDTO.setEmail(st.nextToken());
			diaryDTO.setNumber(st.nextToken());
			diaryDTO.setBd(st.nextToken());
			ar.add(diaryDTO);
		}
		for (int i = 0; i < ar.size(); i++) {
			DiaryDTO diaryDTO = ar.get(i);
				System.out.println("이름은 :: " + diaryDTO.getName());
				System.out.println("별명은 :: " + diaryDTO.getNick());
				System.out.println("이메일은 :: " + diaryDTO.getEmail());
				System.out.println("전화번호는 :: " + diaryDTO.getNumber());
				System.out.println("생일은 :: " + diaryDTO.getBd());
				System.out.println("===============");
			}
		return ar;
	}


	public DiaryDTO addInfo() {
	
		DiaryDTO diaryDTO = new DiaryDTO();
		
		System.out.println("이름을 입력하세요. ");
		diaryDTO.setName(sc.next());
		System.out.println("별명을 입력하세요. ");
		diaryDTO.setNick(sc.next());
		System.out.println("이메일을 입력하세요. ");
		diaryDTO.setEmail(sc.next());
		System.out.println("전화번호를 입력하세요. ");
		diaryDTO.setNumber(sc.next());
		System.out.println("생일을 입력하세요. ");
		diaryDTO.setBd(sc.next());
		
			
		return diaryDTO;
		
	}
}
