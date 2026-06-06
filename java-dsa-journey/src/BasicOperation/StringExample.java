package BasicOperation;

public class StringExample {
    public static void main(String[] args) {

        String str = "Prince";
        System.out.println(str.length());

        String stri = "Code";

        for (int i = 0; i < stri.length(); i++) {
            System.out.println(str.charAt(i));
        }

//        Count Length Without length()
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            count++;
        }
        System.out.println("number of character" + count);

//        Count Vowels
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch == 'a' || ch == 'A' || ch == 'e' || ch == 'E' || ch == 'i' || ch == 'I' || ch == 'o' || ch == 'O' || ch == 'u' || ch == 'U') {
                System.out.println(ch + " is vowel");
            } else {
                System.out.println(ch + "is consonunt");
            }
        }
//        Reverse a String
        String rev = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            rev = rev + str.charAt(i);
        }
        System.out.println("Reverse string is " + rev);

//        Check Palindrome
        String reversed = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            reversed += str.charAt(i);
        }

        if (str.equals(reversed)) {
            System.out.println("Palindrome");
        } else {
            System.out.println("Not Palindrome");

        }
    }
}