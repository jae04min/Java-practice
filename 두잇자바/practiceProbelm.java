package practice_JAVA;

public class practiceProbelm {

	public static void main(String[] args) {
		person person1 = new person();
		person1.name = "jaemin";
		person1.age = 40;
		person1.isMarried = true;
		person1.child = 3;
		
		System.out.println("Name: " + person1.name);
        System.out.println("Age: " + person1.age);
        System.out.println("Married: " + person1.isMarried);
        System.out.println("Number of Children: " + person1.child);

	}
	static class person{
		int age;
		String name;
		boolean isMarried;
		int child;
	}

}
