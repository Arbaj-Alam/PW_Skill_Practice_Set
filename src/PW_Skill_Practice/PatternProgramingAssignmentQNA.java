package PW_Skill_Practice;
import java.util.Scanner;

public class PatternProgramingAssignmentQNA {
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
        // Question no 3

        int num = sc.nextInt();
     /*     for( int i = 0 ; i < num ; i++){
              for (int j = 0 ; j < num ; j++){
                  if ( i ==0 || j == num-1 || j == 0 || i == num-1 || i + j <=(num -1)/2 || j -i >= (num-1)/2){
                      System.out.print(" * ");
                  }else {
                      System.out.print("   ");
                  }
              } System.out.println();
          }*/

        // Question no 4  print pw skills

      /*  for (int i = 0 ; i < num ; i++ ){

            for (int j = 0; j< num ; j++ ){
                if ( j ==0  || i == 0 && j < num-1 || i == (num-1 )/2 && j < num-1 || j == num -1 && i > 0 && i < ( num -1)/2){
                    System.out.print(" * ");
                }else {
                    System.out.print("   ");
                }
            }
            System.out.print( "");
            for (int j = 0; j< num ; j++ ){
                if ( j== 0 || j == num-1 || i == j && i >= (num-1)/2 || i +j == num-1 && i >= (num-1)/2 ){
                    System.out.print(" * ");
                }else {
                    System.out.print("   ");
                }
            }
            System.out.print( "         ");

            for (int j = 0; j< num ; j++ ){
                if ( i == 0 && j > 0 || i == num-1 && j < num-1 || j== 0  && i > 0 && i <(num-1)/2 ||
                        j == num-1 && i > (num-1)/2 && i < num-1 || i == (num-1)/2  &&j > 0 && j < num-1 ){
                    System.out.print(" * ");

                }else {
                    System.out.print("   ");
                }
            }
            System.out.print(" ");

            for (int j = 0; j< num ; j++ ){
                if (j== 0 || i + j == ( num-1 ) /2   || i - j == (num-1)/2){
                    System.out.print(" * ");
                }else {
                    System.out.print("   ");
                }
            }
            System.out.print(" ");

            for (int j = 0; j< num ; j++ ){
                if (i == 0 || i == num-1 || j == ( num-1 )/2 ){
                    System.out.print(" * ");
                }else {
                    System.out.print("   ");
                }
            }
            System.out.print(" ");

            for (int j = 0; j< num ; j++ ){
                if (j== 0 || i == num -1 ){
                    System.out.print(" * ");
                }else {
                    System.out.print("   ");
                }
            }
            System.out.print(" ");

            for (int j = 0; j< num ; j++ ){
                if (j== 0 || i == num -1  ){
                    System.out.print(" * ");
                }else {
                    System.out.print("   ");
                }
            }
            System.out.println();
        }*/

        // Question no 5 ARBAJ is printed here

      /*  for (int i = 0 ; i < num ; i++){

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
        }*/

    }
}
