package practice_JAVA;

public class StudentTest1 {
    
    public static void main(String[] args) {
        // Student 클래스의 객체 생성
        Student student1 = new Student();
        student1.studentName = "안연수"; // student1 객체의 studentName 변수에 "안연수" 할당
        System.out.println(student1.getStudentName()); // student1 객체의 이름 출력

        Student student2 = new Student(); // 또 다른 Student 객체 생성
        student2.studentName = "안승연"; // student2 객체의 studentName 변수에 "안승연" 할당
        System.out.println(student2.getStudentName()); // student2 객체의 이름 출력
    }
    static class Student { // Student 클래스 정의
        String studentName; // 학생 이름을 나타내는 변수

        public String getStudentName() { // 학생 이름을 반환하는 메서드
            return studentName;
        }
    }
}