package practice;

import java.util.Scanner;

public class num1 {
    public static void main(String[] args) {
    	
        Scanner scanner = new Scanner(System.in);

        System.out.print("2자리의 정수(10~99)를 입력하세요: ");
        int number = scanner.nextInt();

        int tennumber = number / 10;
        int onenumber = number % 10;

        if (tennumber == onenumber) {
            System.out.println("Yes! 10의 자리와 1의 자리가 같습니다");
        } else {
            System.out.println("No! 10의 자리와 1의 자리가 같지 않습니다.");
        }

        scanner.close();
    }
}

