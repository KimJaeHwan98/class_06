	package file;

import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Ex07 {
	public static void main(String[] args) throws Exception {
			String path = "D:\\핀테크\\test\\test.txt";
			FileOutputStream fos = new FileOutputStream(path);
			BufferedOutputStream bos = new BufferedOutputStream(fos);
				for(char ch = '0';ch <='9';ch++) {
					Thread.sleep(1);
					//fos.write(ch);
					bos.write(ch);
				}
				bos.flush();
				bos.write('a');
				bos.close();    //데이터도 전송하고 연결통로도 끊겠다 이제 write사용불가
				bos.write('b');    //데이터도 전송하고 연결통로도 끊겠다 이제 write사용불가
				fos.close();
	}
}
//한번에 하나만 일을하는 코드 처리 속도가 느리다.
//하나의 공간에 모아서 한번에 이동시키는 코드를 같은 공간에 만든다.
//보조스트링을 사용하는 이유
//보조스트링 BufferedOutputStream bos = new BufferedOutputStream(fos);
//하나의 또다른 저장소를 만들고 거기에 문자를 나열한다./
//저장소에 저장된 파일을 파일로 전송을 해야한다 전달코드:bos.flush();(저장된값을 비워주는 코드
