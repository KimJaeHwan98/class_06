package file;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public class Ex01 {
public static void main(String[] args) throws IOException {
	File path = new File("D:\\핀테크\\test\\test.txt");
	//여기로 출력할꺼다
	FileOutputStream fos = new FileOutputStream(path);
	//불러온다
	fos.write(97); //내용추가가능
	fos.write('a'); //throws로 예외처리해야한다.
	fos.write("test".getBytes()); //바이트 인트 처리가능 바이트형태의 배열로 변경해줘야한다
}
}
//연결 통로다