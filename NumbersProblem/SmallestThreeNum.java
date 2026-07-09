import java.util.*;

public class SmallestThreeNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("ENTER A TWO NUMBER FOR FIND THE smallest NUMBER:");
        System.out.print("ENTER A FIRST NUMBER:");
        int nums_1=sc.nextInt();
        System.out.print("ENTER A SECOND NUMBER:");
        int nums_2=sc.nextInt();
        System.out.print("ENTER A THIRD NUMBER:");
        int nums_3=sc.nextInt();

        if(nums_1<nums_2){ 
            if(nums_1<nums_3){
                System.out.print(" first number is small");
            }
            else{
                System.out.print("third number is small");

            }
            if(nums_2<nums_3){
                System.out.print("second number is small");
            }
        }else{
            System.out.print("third number is small");
        }
            
        
       
    



        sc.close();
}
    
}
