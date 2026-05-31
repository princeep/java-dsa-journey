package BasicOperation;

public class Loop {
    public static void main(String[] args) {
//       1 print table
        int n =6;
        for(int num=1;num<=10;num++){
            System.out.println(n+"X"+num+"="+n*num);
        }

//       2 print table 1 to n number
        for(int table= 1;table<=20;table++){
            for(int range =1;range<=10;range++){
                System.out.println(table*range);
            }
            System.out.println();
        }

        //  3  print all even and odd number between 1 to 100
        for (int i = 1; i <= 100; i++) {
            if(i%2==0){
                System.out.println("Even number"+i);
            }
            else{
                System.out.println("Odd number"+i);
            }
        }

//        4: Print Numbers from 1 to 5 Using while
        int i=1;
        while (i<=5){
            System.out.println(i);
            i++;
        }

//        5: Countdown Using while
        int moduleLeft = 5;
        while (moduleLeft>=1){
            System.out.println("Module Left"+moduleLeft);
            moduleLeft--;
        }

//        6: Basic do-while
        int user =1;
        do{
            System.out.println("user"+user);
            user++;
        }
        while (user<=5);
    }
}
