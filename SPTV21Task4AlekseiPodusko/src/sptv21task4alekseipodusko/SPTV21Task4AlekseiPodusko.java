package sptv21task4alekseipodusko;

import java.util.Arrays;
import java.util.Random;

public class SPTV21Task4AlekseiPodusko {

    public static void main(String[] args) {
       Random random =new Random();
       int[] numbers = new int[100];
       int sum=0;
       int mid=0;
       for(int i=0;i<numbers.length;i++){
            numbers[i]=random.nextInt(100);
            System.out.printf("%3d",numbers[i]);
            sum +=numbers[i];
            mid=sum/100;
            
    }
    System.out.println("");
    int max = numbers[1];
    for(int i=1;i<numbers.length;i++){
        if (numbers[i]>max){
            max = numbers[i];
           
        }
    }
    Arrays.sort(numbers);
    for(int i=0;i<numbers.length; i++){
        System.out.printf("%3d",numbers[i]);
        if(i%10==0){
            System.out.println();
        }
    }
    System.out.println();
    System.out.println("Max number is "+max);
    System.out.println("Sum "+sum);
    System.out.println("Mid "+mid);
}
}