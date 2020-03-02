import java.util.Scanner;

public class Sixth {
    public static void main(String[] args){
        Scanner a = new Scanner(System.in);
        Scanner b = new Scanner(System.in);

        int num1 = a.nextInt();
        int num2 = b.nextInt();

        if(num1 > num2){
            System.out.println(num1 + " > " + num2);
        }
        else{
            System.out.println(num2 + " > " + num1);
        }

    }
}
