import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        System.out.println(" give me two numbers : ");
        Scanner sa = new Scanner(System.in);
        int s = sa.nextInt();
        int x = sa.nextInt();
        System.out.println(" 1) adding up those two");
        System.out.println(" 2) the bigger number minus the other");
        System.out.println(" 3) multiplication of those two");
        System.out.println(" 4) division of those two ");
        System.out.println(" which operation you want to choose, type the numbers  : ");
        int d = sa.nextInt();
        switch (d){
            case 1:
                System.out.println( s + x );
                break;
            case 2:
                if( s > x ){
                    System.out.println( s - x );
                }else {
                    System.out.println( x - s);
                }
                break;
            case 3:
                System.out.println( s * x );
                break;
            case 4:
                System.out.println( s / x);
                break;
default:
    System.out.println(" ERROR");






        }
    }
}
