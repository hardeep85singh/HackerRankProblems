package easy;

import java.util.Scanner;

public class StaticInitialization {

    static boolean flag = true;
    static int B;
    static int H;
    static{
        Scanner input = new Scanner(System.in);
        B = input.nextInt();
        H = input.nextInt();
        if(B <= 0 || H <= 0){
            System.out.println("java.lang.Exception: Breadth and height must be positive");
            flag = false;
        }
    }

    public static void main(String[] args){
        if(flag){
            int area=B*H;
            System.out.print(area);
        }

    }//end of main

}
