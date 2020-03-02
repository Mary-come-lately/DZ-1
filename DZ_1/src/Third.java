import java.util.Scanner;

public class Third {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int number = s.nextInt();
        if(number > 0){
            System.out.println(number + 1);
        }
        else if(number < 0){
            System.out.println(number - 2);
        }
        else if(number == 0){
            System.out.println(10);
        }
    }
}
