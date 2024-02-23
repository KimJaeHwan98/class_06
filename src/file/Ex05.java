package file;

import java.util.Scanner;

public class Ex05 {
public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	String s1, s2;
	int num;
	while(true) {
	try {
		System.out.println("수 입력");
		num = input.nextInt();
		System.out.println("입력 값 : " + num);
	}	catch (Exception e) {
		s1 = input.nextLine();
		System.err.println(s1+" : 수 입력하세요");
		}
	}
	
	//버퍼라는 문제 발생.
	
	
	
	
	
	/*
	System.out.println("1.문자열 입렵");
	s1 = input.next();
	System.out.println("2.문자열 입렵");
	input.nextLine();
	s2 = input.nextLine();
	System.out.println("s1 :"+s1+"s111111");
	System.out.println("s2 :"+s2+"sss22222");
	*/
}
}
//next();사용자한테 입력은 키보드로 받는다 어퍼에 111이 저장값이 들어오면
//엔터를 치면 입력값을 다 받았구나라고 인식
//111 은 입력받고 빠져나온다.
//222도 똑같다

//Line은 엔터값을 기준으로 값을 빼온다.