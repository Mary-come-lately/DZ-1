import java.util.Scanner;

public class Fifth {
    public static void main(String[] args){
        Scanner a = new Scanner(System.in);
        Scanner b = new Scanner(System.in);
        Scanner c = new Scanner(System.in);

        int num1 = a.nextInt();
        int num2 = b.nextInt();
        int num3 = c.nextInt();
        int count_pos = 0;
        int count_neg = 0;

        if(num1 > 0){
            count_pos++;
        }
        else{
            count_neg++;
        }
        if(num2>0){
            count_pos++;
        }
        else{
            count_neg++;
        }
        if(num3 > 0){
            count_pos++;
        }
        else{
            count_neg++;
        }
        System.out.println(count_pos);
        System.out.println(count_neg);
    }
}
