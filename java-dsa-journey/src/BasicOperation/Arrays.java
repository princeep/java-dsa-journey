package BasicOperation;

public class Arrays {

    public static void main(String[] args) {

        //    Problem 1: Sum of Elements
        int[] arr = {2, 4, 60, 8, 10};
        int sum = 0;
        for (int i = 0; i < arr.length;i++) {
            sum += arr[i];
        }
            System.out.println("Sum of Array" + sum);

//        Problem 2: Maximum and Minimum Element
        int min = arr[0];
        int max = arr[0];

        for(int i=0;i<arr.length;i++){
            if(max>arr[i]){
                max = arr[i];
            }
            if(min<arr[i]){
                min = arr[i];
            }
        }
        System.out.println("Max Element"+ max);
        System.out.println("Min Element"+ min);

    }

    }

