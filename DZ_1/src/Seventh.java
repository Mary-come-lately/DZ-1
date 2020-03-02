import java.util.Scanner;

public class Seventh {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int programmers = s.nextInt();

        switch (programmers % 10) {
            case 0: case 5: case 6: case 7: case 8: case 9:
                System.out.println(programmers + " Программистов");
                break;
            case 1:
                System.out.println(programmers + " Программист");
                break;
            case 2: case 3: case 4:
                System.out.println(programmers + " Программиста");
                break;
        }

        switch (programmers % 100) {
            case 10: case 15: case 16: case 17: case 18: case 19:
                System.out.println(programmers + " Программистов");
                break;
            case 11: case 12: case 13: case 14:
                System.out.println(programmers + " Программистов");
                break;
        }

    }
}
