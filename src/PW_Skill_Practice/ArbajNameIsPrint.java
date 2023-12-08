package PW_Skill_Practice;
import java.util.Scanner;
public class ArbajNameIsPrint {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println(" Enter the number which is greater then 6 nad less then 10 ");
        int num = sc.nextInt();

        for (int i = 0 ; i < num ; i++){

            // A char is here
            for (int j = 0; j< num ; j++ ){
                if( i + j == num -1 || i == (num-1)/2 && j >= (num-1)/2  ){
                    System.out.print(" * ");
                }else {
                    System.out.print("   ");
                }
            }
            for (int j = 0 ; j < num ; j++){
                if( i == j || i == (num-1)/2 && j < (num-1)/2){
                    System.out.print(" * ");
                }else {
                    System.out.print("   ");
                }
            }
            System.out.print(" ");
            // R char is here
            for (int j = 0; j< num ; j++ ){
                if ( j ==0  || i == 0 && j < num-1 || i == (num-1 )/2 && j < num-1 ||
                        j == num -1 && i > 0 && i < ( num -1)/2 || i == j && i > (num -1)/2){
                    System.out.print(" * ");
                }else {
                    System.out.print("   ");
                }
            }
            System.out.print("");
            // B char is here
            for (int j = 0; j< num ; j++ ){
                if (  j== 0 || i == 0  && j <num-1 || i == (num-1) / 2  && j <num-1 ||
                        j == num-1 && i>0 && i< (num-1) /2 || i == num-1 && j < num-1 || j == num-1 && i > (num-1)/2 && i < num-1){
                    System.out.print(" * ");
                }else {
                    System.out.print("   ");
                }
            }
            System.out.print("");
            // A char is here

            for (int j = 0; j< num ; j++ ){
                if( i + j == num -1 || i == (num-1)/2 && j >= (num-1)/2  ){
                    System.out.print(" * ");
                }else {
                    System.out.print("   ");
                }
            }
            for (int j = 0 ; j < num ; j++){
                if( i == j || i == (num-1)/2 && j < (num-1)/2){
                    System.out.print(" * ");
                }else {
                    System.out.print("   ");
                }
            }
            System.out.print("");
            // J char is here
            for (int j = 0; j< num ; j++ ){
                if ( i== 0 || j == num-1 && i < num-1 || i == num-1 && j > (num-1 )/2 && j < num-1 || j == (num-1)/2 && i >(num-1)/2 && i < num-1){
                    System.out.print(" * ");
                }else {
                    System.out.print("   ");
                }
            }

            System.out.println();
        }
    }
}
