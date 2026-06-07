package BasicOperation;

public class BasicMaths {
//        1: Count Digits in a Number
public static void main(String[] args) {
    int n = 12345;
    int count = 0;

    while (n > 0) {
        count++;
        n = n / 10;
    }
    System.out.println("Number of digits = " + count);


//    2: Sum of Digits

    int num = 1234;
    int sum = 0;

    while (num > 0) {
        int digit = num % 10;
        sum = sum + digit;
        num = num / 10;
    }

    System.out.println("Sum of digits = " + sum);
      }
}

