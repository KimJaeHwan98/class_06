package file;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class Ex02 {
public static void main(String[] args) throws IOException {
	Scanner input = new Scanner(System.in);
	
	String path = "D:\\핀테크\\test/test2.txt"; //File을 사용해도되고 경로지정은 역슬래쉬2개 슬래쉬는1개 둘다 가능
	FileOutputStream fos = new FileOutputStream(path);

	System.out.println("출력할 내용 입력");
	String name = input.next();
	
	fos.write(name.getBytes());
	System.out.println("저장 되었습니다!!!");
	
	}	
}
//연결된 통로를 만들어주는 기능
//사용자로부터 콘솔로 입력받고 해당하는 값이 파일로 출력된다.
//String 이랑 File이랑 기능 차이점이 있다(사용은 둘중 하나해도 상관없다)
