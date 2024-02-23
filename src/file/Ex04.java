package file;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class Ex04 {
public static void main(String[] args) throws IOException {
	Scanner input = new Scanner(System.in);
	String path = "D:\\핀테크\\test\\test";
	
	System.out.println("파일명 입력");
	String fileName = input.next(); //파일명
	
	File filePath = new File(path+fileName+".txt");
	
	if(filePath.exists()) {
		System.out.println("이미 존재하는 파일입니다.");
	}else {
		FileOutputStream fos = new FileOutputStream(filePath);
		String msg;
		System.out.println("내용을 입력하세요");
		input.nextLine();
		msg = input.nextLine();
		fos.write(msg.getBytes()); //메모장 내용
		System.out.println("저장 되었습니다.");
		
	}
	
	
}
}
//사용자로부터 입력을받아서 이름.txt로 정보를 저장을 하겠다.

//내용을 바꾸면 이전의 내용은 사라지고 새로운내용으로 바뀐다

//내용을 수정할지 물어봐야한다 기존의 내용을 유지하는법

//공백은 next.Line 입력한다














