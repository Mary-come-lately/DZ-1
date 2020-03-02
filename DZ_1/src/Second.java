import java.util.Scanner;

public class Second {
    public static void main(String[] args){
        Scanner a = new Scanner(System.in);
        int A = a.nextInt();
        Scanner b = new Scanner(System.in);
        int B = b.nextInt();
        Scanner c = new Scanner(System.in);
        int C = c.nextInt();

        if(A+B > C && A+C>B && B+C > A){
            System.out.println("the triangle is existing");
        }
        else{
            System.out.println("The triangle isn't existing");
        }
    }
}
