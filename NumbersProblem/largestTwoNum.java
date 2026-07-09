import java.util.Scanner;

public class largestTwoNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("ENTER A TWO NUMBER FOR FIND THE LARGEST NUMBER:");
        System.out.print("ENTER A FIRST NUMBER:");
        int a=sc.nextInt();
        System.out.print("ENTER A SECOND NUMBER:");
        int b=sc.nextInt();
        if(a>b){
            System.out.print("A is greater tha B:" +a);
        }
        else if(a ==b){
            System.out.print("both Number equal" +a);
        }
        else{
            System.out.print("B is greater tha A:" +b);

        }

        sc.close();
        
    }
    
}
