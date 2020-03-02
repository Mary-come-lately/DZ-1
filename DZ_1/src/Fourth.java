import java.util.Scanner;

public class Fourth {
    public static void main(String[] args){
        Scanner a = new Scanner(System.in);
        Scanner b = new Scanner(System.in);
        Scanner c = new Scanner(System.in);

        int num1 = a.nextInt();
        int num2 = b.nextInt();
        int num3 = c.nextInt();
        int count = 0;
        if(num1 > 0){
            count++;
        }
        if(num2>0){
            count++;
        }
        if(num3 > 0){
            count++;
        }
        System.out.println(count);
    }
}
