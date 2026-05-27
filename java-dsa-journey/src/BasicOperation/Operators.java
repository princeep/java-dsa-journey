package BasicOperation;

public class Operators {
    public static void main(String[] args){
//    Arithmetic Operators
    int solvedThisWeek = 25;
    int solvedLastWeek = 15;

    int total = solvedThisWeek + solvedLastWeek;
    int difference = solvedThisWeek - solvedLastWeek;
    int projected = solvedThisWeek * 4;
    int average = solvedThisWeek / 7;
    int remainder = solvedThisWeek % 7;

        System.out.println(total);
        System.out.println(difference);
        System.out.println(projected);
        System.out.println(average);
        System.out.println(remainder);

//        Relational Operators

        int num1 = 10;
        int num2 = 20;

        System.out.println(num1==num2);
        System.out.println(num1!=num2);
        System.out.println(num1>=num2);
        System.out.println(num1>num2);
        System.out.println(num1<=num2);
        System.out.println(num1<num2);

//        Logical Operators
        boolean completedDSA = true;
        boolean completedCore = false;

        System.out.println(completedDSA && completedCore);
        System.out.println(completedDSA || completedCore);
        System.out.println(!completedCore);

//        Bitwise Operators
        int x = 6;
        int y = 3;
        System.out.println(x&y);
        System.out.println(x | y);
        System.out.println(x ^ y);
        System.out.println(~x);
        System.out.println(x << 1);
        System.out.println(x >> 1);

//        Ternary Operator
        int solveProblem = 250;
        String level = (solveProblem>=300)?"Advanced":"Intermediate";
        System.out.println(level);
}
}
