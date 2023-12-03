package PW_Skill_Practice;
import com.sun.security.jgss.GSSUtil;

import javax.sound.midi.Soundbank;
import java.util.Objects;
import java.util.Scanner;

public class Operators_and_Loops {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        //System.out.println( " Enter  the number . How many times You want to print ");

        // int num =  sc.nextInt();
        //  Question no 1 = if the input is greater than 5 and less than 10 , then print the value Otherwise Print it is not ;

       /* if (num< 5 ){
            System.out.println( num + " is less then 5 ");
        }else if (num > 5 )  {
            System.out.println(  num + " is greater then 5 ");
        }else {
            System.out.println(" The value is not greater than 5 and not less than 10 ");

        }*/

       // Question no 2 =  Write a program to print the value of input if it is even and divisible by 3.

      /*   if ( num % 2 == 0  ){
             System.out.println( num +  " It is an Even Number ");
         } else  if  (num % 3 == 0) {
             System.out.println( num + " It is Divided by 3 ");
         } else  {
             System.out.println(" It is not an Even Number  and Not Divided by 3  ");
         }*/

        // Question no 3 = Write a short program that gives the following as output -
        // For each multiple of 3, print "Fizz" instead of the number.For each multiple of 5, print "Buzz" instead of the number.
        // For numbers which are multiples of both 3 and 5, print "FizzBuzz" instead of the number. Otherwise, print the number itself
     /*   System.out.println("Enter the number You want to check ");
        int num = sc.nextInt();
        if( num % 3 == 0 ){
            if (num % 3 == 0 && num % 5 == 0){
                System.out.println(" FizzBuzz ");
            }else {
                System.out.println(" Fizz ");
            }
        } else if (num % 5 == 0 ){

                System.out.println(" Buzz ");

        }else {
                System.out.println(" opps type again ");
            }*/

        // Question no  4 =  Write a short program that prints each number from 1 to 100 on a new line, except if the number is a
        // multiple of 5 or 7.


       /* for (int b = 1 ; b <=100; b++ ){
            if ( b% 5 == 0  ){
                System.out.println(" I think it is multiple of 5  ");
            } else if (b % 7 == 0){
                System.out.println(" I think It is multiple of 7");
            }
            else {
                System.out.println(b);

            }
        }*/

        // Question no 5 =  Find if the input value is odd or even. If it’s odd print “Odd”, otherwise print “Even”.
        // Note: Input value will be between  1 & and & 10^6

       /* if ( num%2 == 0 ){
            System.out.println( num + " The number you type is Even  ");
        } else  if ( num % 3 == 0 ) {
            System.out.println(  num + " The number You type is Odd ");

        }else {
            System.out.println(" Type again ");
        }
       */
         // Question no 6 =  Find if the input character is ‘a’ or not.
        // Note: Input characters will be lowercase alphabets

      /*  String input = sc.next();
        if (Objects.equals(input, "a")) {
            System.out.println("The input character is 'a'");
        } else {
            System.out.println("The input character is not 'a'");
        }*/

        // Question no = 7  Write a program to identify people as “Child” (age < 12), “Teenager” (12 <= age < 18) or “Adult” (age >= 18)

/*
        System.out.println( " Enter your age ");
        int age  = sc.nextInt();
        if ( age < 12 ){
            System.out.println(" You are a child ");
        }else if ( age >= 12 && age < 18){
            System.out.println(" You are a Teenager ");
        }else if ( age >= 18 ){
            System.out.println( " You are an Adult ");
        }

*/

        // Question no = 8  Print the maximum of 3 numbers a, b, c taken as input

     /*   System.out.println( " Enter the First number ");
        int a = sc.nextInt();
        System.out.println( " Enter the second number ");
        int b = sc.nextInt();
        System.out.println( " Enter the third number ");
        int c = sc.nextInt();

        if ( a > b && a > c ){
            System.out.println( a  + "  is greater than all you type " + b + " , "+ c );
        } else if ( b > a && b > c ){
            System.out.println(  b + "  is greater than all off you type " + a + "  ,"+ c );
        } else if (c > a && c > b) {
            System.out.println( c  + " is greater than all of you type " + b+ " , " + c );
        }else if ( a == b && b == c  ) {
            System.out.println(" You type is all equal" + a  + " " + b  + " " + c  );
        }else {
            System.out.println( " Type again ");
        }*/

        // Question no = 9  Write a program to print the day name based upon the day number.
        //1 - Monday, 2 - Tuesday, etc

    /*    System.out.println(" Enter the number which is similar to day in a week ");
        int   num = sc.nextInt();
*/
        // With switch Statement
     /*   switch (num) {
            case 1 -> System.out.println(" monday ");
            case 2 -> System.out.println(" Tuesday ");
            case 3 -> System.out.println(" Wednesday ");
            case 4 -> System.out.println(" Thursday ");
            case 5 -> System.out.println(" friday ");
            case 6 -> System.out.println(" Saturday ");
            case 7 -> System.out.println(" Sunday ");
            default -> System.out.println(" Type again ");
        }*/
  // with for loop

       /* if (num == 1){
            System.out.println(" Monday");
        }else if (num == 2 ){
            System.out.println(" Tuesday ");
        }else if ( num == 3 ){
            System.out.println( " Wednesday ");
        }else if (num == 4 ){
            System.out.println(" thursday  ");
        }else if ( num == 5 ){
            System.out.println("friday ");
        }else if (num == 6 ){
            System.out.println( " Saturday ");
        }else if( num == 7 ){
            System.out.println(" Sunday ");
        }else {
            System.out.println(" Type again ");
        }*/

        // Question no 10 =  Print the sum of the first ‘n’ natural numbers using a for loop, where n is the input
         // While loop is started from here

   /*     System.out.println( " Enter the value you want to add for all natural numbers from stating with 1 and end with you give the number ");

        int num = sc.nextInt();
        int a = 1 ;
        int res = 0;
        while( a <= num ){
            res += a ;
            System.out.println( res);
            a++;
        }
        System.out.println( res);

*/
        // Question no 11 = Write a short program that prints each number from 1 to 100 on a new lineZ
        // For each multiple of 3, print "Fizz" instead of the number.
        // For each multiple of 5, print "Buzz" instead of the numberZ
        // For numbers which are multiples of both 3 and 5, print "FizzBuzz" instead of the number

   /*     int a = 1 ;
        while(a<=100){
            if (a%3==0 ){
                if (a % 3== 0 && a% 5== 0){
                    System.out.println(  a +" FizzBuzz" + " It is divided by 3 and 5 ");
                }else {
                    System.out.println( a + " Fizz " + " It is divided by 3 ");
                }
            }else if (a%5==0){
                System.out.println(a + " Buzz" + " It is divided by 5 ");
            }else{
                System.out.println( a +  " It is not divided by 3 or 5");
            }
            a++;
        }*/

        // Question no  12 =  Print the sum of the first 10 natural numbers using do while loop.
    /*     int a = 1 ;
         int res = 0;
        do {
            res += a ;
            a++;
        }
        while ( a <= 10);
        System.out.println(res);*/

        // Question no 13 = ? Print the first multiple of 5 which is also a multiple of 7?

     /*   int num = sc.nextInt();
        for ( int a = 1 ; a <= num ; a++ ){
            if (a % 5 == 0 && a% 7== 0 ){
                System.out.println( a + "  is multiple of 5 and also it is multiple of 7  " );
                break;
            }

        }*/

        // Question no 14 =  Tell if the number in the input is prime or not.

       /* System.out.println(" Enter the Number which you want to check if it is a prime number or not .");

        int num = sc.nextInt();
        if(num % num == 0 && num % 2 != 0 && num % 3 != 0  ){
            if ( num == 1 || num == 0  ){ // Here Exception is occurred Because we can not divide with 0 .
                System.out.println(" It is not a Prime number ");
            } else {
                System.out.println(num + " It is a Prime number ");
            }
        }else {
            System.out.println(" It is not a Prime number ");
        }*/

        // Question no 15 = Print all values between 1  and 100, except if it’s a multiple of 3

     /*    for (int a = 1 ; a <= 100 ;  a++){
             if (a % 3 == 0 )continue;
             {
                 System.out.println(a);
             }
         }*/

        // Question no 16 = Print all factors of the number in the input.
      /*  int num = sc.nextInt();
        for (int a = 1; a <=1000000 ; a++ ){
            System.out.println(" Enter number which you want to check how many factors of this numbers ");
            if ( num % a == 0) {
                System.out.println(  a + " Factors of  " + num  );

            }
        }*/


        // Here I complete the all practice problem form pw skills topic operators and experssion

    }

    }

