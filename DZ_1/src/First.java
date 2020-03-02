import java.util.Scanner;

public class First {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int number = s.nextInt();
        System.out.println(number);

        // проверка на положительность
        if(number > 0){
            System.out.println(number + " - is positive number");
        }
        else{
            System.out.println(number + " - is negative number");
        }

        //подсчет количества цифр
        int counter = 0;
        while(number != 0){
            counter++;
            number /= 10;
        }
        System.out.println(counter);
    }
}
