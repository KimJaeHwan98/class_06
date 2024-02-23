package my_lombok;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
/*
@Setter
@Getter
@ToString
@NoArgsConstructor // 노아규먼트 메인 디티오가 생긴다 기본 생성자 만들어준다
@AllArgsConstructor // 모든 변수를 받아주는 생성자를 만든다
*/
@Data
@AllArgsConstructor //data를써도 이건 생성해줘야한다.
@NoArgsConstructor //이것도 생성
public class MainDTO {
private String name;
private int age;

}
//@ 컨트롤 스페이스바 set하면 셋터 자동생성
//@ getter도 똑같다.