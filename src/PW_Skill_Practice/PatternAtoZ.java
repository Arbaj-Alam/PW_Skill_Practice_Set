package PW_Skill_Practice;

import java.util.Scanner;

public class PatternAtoZ {
    public static void main(String[] args ){

        Scanner sc = new Scanner(System.in);

        System.out.println(" Enter the Number . How many times you want to Print ");

        int num =  sc.nextInt();

        for (int i = 0 ; i < num ; i++ ){

            // 01 Here Pattern A is Created By Arbaj alam
            for (int j = 0 ; j < num ; j++){
                if (i - j == (num -1)/2 || i + j == (num-1) + (num-1)/ 2   ){
                    System.out.print("* ");
                }else {
                    System.out.print("  ");
                    System.out.println(" This change from intilize idea ");
                }
            }

             System.out.println();
        }


    }
}
