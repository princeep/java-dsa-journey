package BasicOperation;

public class Loop {
    public static void main(String[] args) {
//        print table
        int n =6;
        for(int num=1;num<=10;num++){
            System.out.println(n+"X"+num+"="+n*num);
        }

//        print table 1 to n number
        for(int table= 1;table<=20;table++){
            for(int range =1;range<=10;range++){
                System.out.println(table*range);
            }
            System.out.println();
        }

        //    print all even and odd number between 1 to 100
        for (int i = 1; i <= 100; i++) {
            if(i%2==0){
                System.out.println("Even number"+i);
            }
            else{
                System.out.println("Odd number"+i);
            }
        }
    }
}
