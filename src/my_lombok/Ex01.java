package my_lombok;

class Ex01DTO { 
	String name;
	private int age;
	public Ex01DTO() {}
	public Ex01DTO(String name,int age) {
		this.name = name; this.age = age;
	}
	
	@Override
	public String toString() {
	return "Ex01DTO = [name : "+name+"]";
	}
	//위 내용을 하나씩 전부 생성해줘야해서 불편하다
}

public class Ex01 {
	public static void main(String[] args) {
		Ex01DTO dto = new Ex01DTO("홍길동" , 20);
		System.out.println(dto);
		
	}
	
}
