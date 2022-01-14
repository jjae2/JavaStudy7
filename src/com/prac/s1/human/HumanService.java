package com.prac.s1.human;

import java.util.List;
import java.util.Scanner;

public class HumanService {
	
	private Scanner sc;
	
	public HumanService() {
		sc = new Scanner(System.in);
	}
	//이름을 입력 받아서 같은 이름이 있는 humanDTO의 인덱스 번호 찾기
	//찾아서 삭제
	//리턴 삭제여부 어떤데이터가오면 삭제 됐다 안됐다 0:성공 1:실패 s:성공 f;실패 true:성공 false:실패
	public boolean removeHuman(List<HumanDTO>ar) {
		System.out.println("이름을 입력");
		String name =sc.next();//name이라는 래퍼런스타입이라 heap공간에 새로생김
		HumanDTO humanDTO=null;
		boolean check= false;
		for(int i=0; i<ar.size();i++) {
			if(name.equals(ar.get(i).getName())){
				humanDTO= ar.remove(i);
//				check=ar.remove(ar.get(i));
				check=true;
				break; 
			}
		}
		return check;
	}
	
	
	
	//이름을 입력받아서 같은 이름이 있는 HumanDTO 찾아서 리턴 view에서 humanDTO가 필요해서 리턴
	public HumanDTO searchHuman(List<HumanDTO> ar) {
		System.out.println("이름을 입력");
		String name =sc.next();//name이라는 래퍼런스타입이라 heap공간에 새로생김
		HumanDTO humanDTO=null;
		for(int i=0; i<ar.size();i++) {
			if(name.equals(ar.get(i).getName())){
				humanDTO= ar.get(i);
				break;
			}
		}
		return humanDTO;
	}
	
	public HumanDTO addHuman() {
		HumanDTO humanDTO = new HumanDTO();
		System.out.println("이름 입력");
		humanDTO.setName(sc.next());
		System.out.println("별명 입력");
		humanDTO.setNick(sc.next());
		System.out.println("이메일 입력");
		humanDTO.setEmail(sc.next());
		System.out.println("전화번호 입력");
		humanDTO.setPhone(sc.next());
		System.out.println("생일 입력");
		humanDTO.setBirth(sc.next());
		return humanDTO;
	}

}