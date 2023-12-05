package PW_Skill_Practice;

import java.util.Scanner;

public class PatternProgrammingAtoZ {
    public static void main(String[] args ){

        Scanner sc = new Scanner(System.in);

      //  System.out.println(" Enter the Number . How many times you want to Print ");

        //int num =  sc.nextInt();

        // Pattern A is created here by Arbaj Alam
     /*     int num = 5 ;
      for (int i = 0 ; i < num ; i++){
          for (int j = 0; j< num ; j++ ){
            if (  i == 1 && j > 0 && j< num-1 || i + j == (num-1) /2 || i==2 && j== 4){
                System.out.print(" * ");
            }else {
                System.out.print("   ");
            }
          }
          System.out.println();
      }*/


        // Here A is created for any number which is odd and greater then 5
      /*  System.out.println(" Enter the number, which is odd and greater then 5 ");
        int num =  sc.nextInt();
        for (int i = 0 ; i < num ; i++){
            for (int j = 0; j< num ; j++ ){
                if (  i == j && i >= (num-1)/2 || i + j == num -1 && j <=(num-1) /2|| i == num-3 && j>1 && j < num-2 ){
                    System.out.print(" * ");
                }else {
                    System.out.print("   ");
                }
            }
            System.out.println();
        }*/

        // Here B Pattern is created by  Arbaj alam

       /* System.out.println(" Enter the number, which is odd and greater then 3  ");
        int num =  sc.nextInt();
        for (int i = 0 ; i < num ; i++){
            for (int j = 0; j< num ; j++ ){
                if (  j== 0 || i == 0  && j <num-1 || i == (num-1) / 2  && j <num-1 ||
                        j == num-1 && i>0 && i< (num-1) /2 || i == num-1 && j < num-1 || j == num-1 && i > (num-1)/2 && i < num-1){
                    System.out.print(" * ");
                }else {
                    System.out.print("   ");
                }
            }
            System.out.println();
        }*/

        // Here C Pattern is created by Arbaj Alam

      /*  System.out.println(" Enter the number, which is odd and greater then 6 ");
        int num =  sc.nextInt();
        for (int i = 0 ; i < num ; i++){
            for (int j = 0; j< num ; j++ ){
                if ( j== 0 && i > 0 && i<num-1 || i== 0  && j > 0 && j < num-1 ||
                        i ==num-1 && j > 0 && j < num-1 || i== 1 && j== num-1 || i == num-2 && j == num-1){
                    System.out.print(" * ");
                }else {
                    System.out.print("   ");
                }
            }
            System.out.println();
        }*/

        // Here D Pattern is created by Arbaj Alam

     /*   System.out.println(" Enter the number, which is odd and greater then 3  ");
        int num =  sc.nextInt();
        for (int i = 0 ; i < num ; i++){
            for (int j = 0; j< num ; j++ ){
                if ( j == 0 || i == 0 && j < num-1 || i == num-1 && j < num-1 || j == num-1 && i > 0 && i < num-1){
                    System.out.print(" * ");
                }else {
                    System.out.print("   ");
                }
            }
            System.out.println();
        }*/

        // Here E pattern is created by Arbaj Alam

      /*  System.out.println(" Enter the number, which is odd and greater then 6  ");
        int num =  sc.nextInt();
        for (int i = 0 ; i < num ; i++){
            for (int j = 0; j< num ; j++ ){
                if (j==0 || i == 0 || i == (num-1)/ 2  && j <= (num-1)/2 || i == num-1){
                    System.out.print(" * ");
                }else {
                    System.out.print("   ");
                }
            }
            System.out.println();
        }*/

        // Here F pattern is created by Arbaj Alam
       /* System.out.println(" Enter the number, which is odd and greater then 6 ");
        int num =  sc.nextInt();
        for (int i = 0 ; i < num ; i++){
            for (int j = 0; j< num ; j++ ){
                if (  j == 0 || i == 0 || i == (num-1)/2 && j <= (num-1)/2 ){
                    System.out.print(" * ");
                }else {
                    System.out.print("   ");
                }
            }
            System.out.println();
        }*/

        // Here G is created by Arbaj Alam
       /* System.out.println(" Enter the number, which is odd and greater then 6");
        int num =  sc.nextInt();
        for (int i = 0 ; i < num ; i++){
            for (int j = 0; j< num ; j++ ){
                if (j== 0 && i > 0 && i< num-1 || i== 0 && j > 0 && j < num-1 || i == num-1 && j > 0 && j < num-1 ||
                i == (num-1)/2 && j >=(num-1)/2 || j== num-1 && i> (num-1)/2 && i < num-1
                        || j== num-1 && i == 1 || j== (num-1)/2 && i == (num-1)/2 + 1) {
                    System.out.print(" * ");
                }else {
                    System.out.print("   ");
                }
            }
            System.out.println();
        }*/

        // Here H is created by Arbaj Alam

      /*  System.out.println(" Enter the number, which is odd and greater then 6");
        int num =  sc.nextInt();
        for (int i = 0 ; i < num ; i++){
            for (int j = 0; j< num ; j++ ){
                if (j == 0 || j == num-1 || i == ( num-1)/2 ){
                    System.out.print(" * ");
                }else {
                    System.out.print("   ");
                }
            }
            System.out.println();
        }*/

        //  Here I is created by Arbaj Alam

    /*    System.out.println(" Enter the number, which is odd and greater then 6");
        int num =  sc.nextInt();
        for (int i = 0 ; i < num ; i++){
            for (int j = 0; j< num ; j++ ){
                if (i == 0 || i == num-1 || j == ( num-1 )/2 ){
                    System.out.print(" * ");
                }else {
                    System.out.print("   ");
                }
            }
            System.out.println();
        }*/

        // Here J Pattern  is created by Arbaj Alam

      /*  System.out.println(" Enter the number, which is odd and greater than 6");
        int num =  sc.nextInt();
        for (int i = 0 ; i < num ; i++){
            for (int j = 0; j< num ; j++ ){
                if ( i== 0 || j == num-1 && i < num-1 || i == num-1 && j > (num-1 )/2 && j < num-1 || j == (num-1)/2 && i >(num-1)/2 && i < num-1){
                    System.out.print(" * ");
                }else {
                    System.out.print("   ");
                }
            }
            System.out.println();
        }*/
        // Here K Pattern  is created by Arbaj Alam

      /*  System.out.println(" Enter the number, which is odd and greater than 6");
        int num =  sc.nextInt();
        for (int i = 0 ; i < num ; i++){
            for (int j = 0; j< num ; j++ ){
                if (j== 0 || i + j == ( num-1 ) /2   || i - j == (num-1)/2){
                    System.out.print(" * ");
                }else {
                    System.out.print("   ");
                }
            }
            System.out.println();
        }*/

        // Here L Pattern  is created by Arbaj Alam

      /*  System.out.println(" Enter the number, which is odd and greater than 6");
        int num =  sc.nextInt();
        for (int i = 0 ; i < num ; i++){
            for (int j = 0; j< num ; j++ ){
                if (j== 0 || i == num -1 && j <= (num-1)/2 ){
                    System.out.print(" * ");
                }else {
                    System.out.print("   ");
                }
            }
            System.out.println();
        }*/

        // Here M Pattern  is created by Arbaj Alam

     /*   System.out.println(" Enter the number, which is odd and greater than 6");
        int num =  sc.nextInt();
        for (int i = 0 ; i < num ; i++){
            for (int j = 0; j< num ; j++ ){
                if ( j== 0 || j == num-1 || i == j && i <= (num-1)/2 || i + j == num-1 && i <= (num-1)/2 ){
                    System.out.print(" * ");
                }else {
                    System.out.print("   ");
                }
            }
            System.out.println();
        }*/

        // Here N Pattern  is created by Arbaj Alam

     /*   System.out.println(" Enter the number, which is odd and greater than 6");
        int num =  sc.nextInt();
        for (int i = 0 ; i < num ; i++){
            for (int j = 0; j< num ; j++ ){
                if ( j== 0 || j == num-1 || i == j ){
                    System.out.print(" * ");
                }else {
                    System.out.print("   ");
                }
            }
            System.out.println();
        }*/

        // Here O Pattern  is created by Arbaj Alam

       /* System.out.println(" Enter the number, which is odd and greater than 6 and less than 8");
        int num =  sc.nextInt();
        for (int i = 0 ; i < num ; i++){
            for (int j = 0; j< num ; j++ ){
                if ( i== 0 && j > 0 && j < num-1 || i == num-1 && j > 0 && j < num-1 || j == 0 && i > 0 && i < num-1 || j == num-1 && i > 0 && i < num-1){
                    System.out.print(" * ");
                }else {
                    System.out.print("   ");
                }
            }
            System.out.println();
        }*/

        // Here P Pattern  is created by Arbaj Alam

    /*    System.out.println(" Enter the number, which is odd and greater than 6");
        int num =  sc.nextInt();
        for (int i = 0 ; i < num ; i++){
            for (int j = 0; j< num ; j++ ){
                if ( j ==0  || i == 0 && j < num-1 || i == (num-1 )/2 && j < num-1 || j == num -1 && i > 0 && i < ( num -1)/2){
                    System.out.print(" * ");
                }else {
                    System.out.print("   ");
                }
            }
            System.out.println();
        }*/
        // Here Q Pattern  is created by Arbaj Alam

     /*   System.out.println(" Enter the number, which is odd and greater than 6");
        int num =  sc.nextInt();
        for (int i = 0 ; i < num ; i++){
            for (int j = 0; j< num ; j++ ){
                if (  i== 0 && j > 0 && j < num-1 || i == num-1 && j > 0 && j < num-1 ||
                        j == 0 && i > 0 && i < num-1 || j == num-1 && i > 0 && i < num-1 || i == j && i > (num-1)/2 ){
                    System.out.print(" * ");
                }else {
                    System.out.print("   ");
                }
            }
            System.out.println();
        }
        for (int k =0 ; k<= num ; k++){
            if (k == num) {
                System.out.print(" * ");
            }else {
                System.out.print("   ");
            }
        }*/

        // Here R Pattern  is created by Arbaj Alam

      /*  System.out.println(" Enter the number, which is odd and greater than 6");
        int num =  sc.nextInt();
        for (int i = 0 ; i < num ; i++){
            for (int j = 0; j< num ; j++ ){
                if ( j ==0  || i == 0 && j < num-1 || i == (num-1 )/2 && j < num-1 ||
                        j == num -1 && i > 0 && i < ( num -1)/2 || i == j && i > (num -1)/2){
                    System.out.print(" * ");
                }else {
                    System.out.print("   ");
                }
            }
            System.out.println();
        }*/
        // Here S Pattern  is created by Arbaj Alam

      /*  System.out.println(" Enter the number, which is odd and greater than 6");
        int num =  sc.nextInt();
        for (int i = 0 ; i < num ; i++){
            for (int j = 0; j< num ; j++ ){
                if ( i == 0 && j > 0 || i == num-1 && j < num-1 || j== 0  && i > 0 && i <(num-1)/2 ||
                        j == num-1 && i > (num-1)/2 && i < num-1 || i == (num-1)/2  &&j > 0 && j < num-1 ){
                    System.out.print(" * ");

                }else {
                    System.out.print("   ");
                }
            }
            System.out.println();
        }*/


        // Here T Pattern  is created by Arbaj Alam

     /*   System.out.println(" Enter the number, which is odd and greater than 6");
        int num =  sc.nextInt();
        for (int i = 0 ; i < num ; i++){
            for (int j = 0; j< num ; j++ ){
                if ( j == ( num-1)/2 || i == 0){
                    System.out.print(" * ");
                }else {
                    System.out.print("   ");
                }
            }
            System.out.println();
        }*/
        // Here U Pattern  is created by Arbaj Alam

      /*  System.out.println(" Enter the number, which is odd and greater than 6");
        int num =  sc.nextInt();
        for (int i = 0 ; i < num ; i++){
            for (int j = 0; j< num ; j++ ){
                if ( j == 0 && i < num-1  || j == num-1  && i < num-1 || i == num-1 && j > 0 && j < num-1){
                    System.out.print(" * ");
                }else {
                    System.out.print("   ");
                }
            }
            System.out.println();
        }*/

        // Here V Pattern  is created by Arbaj Alam

     /*   System.out.println(" Enter the number, which is odd and greater than 6");
        int num =  sc.nextInt();
        for (int i = 0 ; i < num ; i++){
            for (int j = 0; j< num ; j++ ){
                if ( i == j && i <= (num-1)/2 || i + j == num-1 && i <= (num-1)/2 ){
                    System.out.print(" * ");
                }else {
                    System.out.print("   ");
                }
            }
            System.out.println();
        }*/


        // Here W Pattern  is created by Arbaj Alam

    /*    System.out.println(" Enter the number, which is odd and greater than 6");
        int num =  sc.nextInt();
        for (int i = 0 ; i < num ; i++){
            for (int j = 0; j< num ; j++ ){
                if ( j== 0 || j == num-1 || i == j && i >= (num-1)/2 || i +j == num-1 && i >= (num-1)/2 ){
                    System.out.print(" * ");
                }else {
                    System.out.print("   ");
                }
            }
            System.out.println();
        }*/


        // Here X Pattern  is created by Arbaj Alam

      /*  System.out.println(" Enter the number, which is odd and greater than 6");
        int num =  sc.nextInt();
        for (int i = 0 ; i < num ; i++){
            for (int j = 0; j< num ; j++ ){
                if ( i == j || i +j == num-1){
                    System.out.print(" * ");
                }else {
                    System.out.print("   ");
                }
            }
            System.out.println();
        }*/
        // Here Y Pattern  is created by Arbaj Alam

      /*  System.out.println(" Enter the number, which is odd and greater than 6");
        int num =  sc.nextInt();
        for (int i = 0 ; i < num ; i++){
            for (int j = 0; j< num ; j++ ){
                if ( i == j && i <(num-1)/2 || i + j == num-1 && i < (num-1 )/2 || j == (num-1)/2 && i>= (num-1)/2){
                    System.out.print(" * ");
                }else {
                    System.out.print("   ");
                }
            }
            System.out.println();
        }*/


        // Here Z Pattern  is created by Arbaj Alam
/*
        System.out.println(" Enter the number, which is odd and greater than 6");
        int num =  sc.nextInt();
        for (int i = 0 ; i < num ; i++){
            for (int j = 0; j< num ; j++ ){
                if ( i== 0 || i == num-1 || i + j == num-1 ){
                    System.out.print(" * ");
                }else {
                    System.out.print("   ");
                }
            }
            System.out.println();
        }*/


        // I completed all  this task which is print all the pattern Latter A to Z


    }
}

