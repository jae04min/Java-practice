package practice_JAVA;

public class practiceProblem152p2번 {

	public static void main(String[] args) {
		order email = new order();
		email.num = 20240322;
		email.ID = "abc123";
		email.Date = "2024년03월22일";
		email.name = "김재민";
		email.Box = "PD0345-12";
		email.Address = "인천시 계양구 귤현동";
		System.out.println("주문 번호: " + email.num);
		System.out.println("주문자 아이디: "+ email.ID);
		System.out.println("주문 날짜: " + email.Date);
		System.out.println("주문자 이름: "+ email.name);
		System.out.println("주문 상품 번호: "+ email.Box);
		System.out.println("배송 주소: " +  email.Address);
	}
	static class order{
		
		int num;
		String ID;
		String Date;
		String name;
		String Box;
		String Address;
		
	}

}