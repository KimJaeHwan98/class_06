package file.dto;

import java.io.Serializable;

import lombok.Data;

@Data

public class MemberDTO implements Serializable {
	private String id , name;
}
// 데이터 객체자체를 바이트형태로 바꿔서 저장시키게 해주는 인터페이스
// Serializable