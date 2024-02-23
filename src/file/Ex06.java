	package file;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Ex06 {
	public static void main(String[] args) throws IOException {
		String path = "D:\\핀테크\\test\\test.txt";
		FileOutputStream fos = new FileOutputStream(path , true);
		fos.write('c');
		fos.close();
		fos = new FileOutputStream(path , true);
		fos.write('d');
		
		FileInputStream fis = new FileInputStream(path);
		int re = fis.read();
		System.out.println((char)re);
		
		while(true) {
			re = fis.read();
			if(re < 0) {
				System.out.println("내용이 없습니다 :" +re);
			}
			System.out.println( (char) re);
		
		}
	}
}


//true를 적어주면 기존의 내용이 저장되고 새로운 내용을 저장한다.
//다 사용하면 clos로 닫아준다

//다시쓰고싶으면 새로 열어줘야한다.

