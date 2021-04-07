package easy;
import java.util.Scanner;
public class OutputFormatting {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("================================");
        for (int i = 0; i < 3; i++){
            String s1 = sc.next();
            int x = sc.nextInt();
            if(x % 1000 <=9 ){
                System.out.printf("%-15s%d%d%d%n", s1, 0, 0, x);
            } else if(x % 1000 <= 99){
                System.out.printf("%-15s%d%d%n", s1,0, x);
            } else {
                System.out.printf("%-15s%d%n", s1, x);
            }
        }
        System.out.println("================================");
    }
}
