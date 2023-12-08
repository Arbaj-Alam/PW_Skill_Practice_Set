package PW_Skill_Practice;

// Please Read This !  and then  Go Ahead

// This is a programme in which you are Print your name in * Pattern in Latter by Latter
// First Step , you have to tell us How many latter in your name
// Second Step , Type your name in Capital,  Latter by Latter .
// Ex :- my name is Arbaj , then I type A then press Enter and then type  R  and press Enter ...... J  and press Enter

import java.util.Scanner;

class AllAlphabet {
    public void A() {
        int num = 7;
        for (int i = 0; i < num; i++) {

            // A char is here
            for (int j = 0; j < num; j++) {
                if (i + j == num - 1 || i == (num - 1) / 2 && j >= (num - 1) / 2) {
                    System.out.print(" * ");
                } else {
                    System.out.print("   ");
                }
            }
            for (int j = 0; j < num; j++) {
                if (i == j || i == (num - 1) / 2 && j < (num - 1) / 2) {
                    System.out.print(" * ");
                } else {
                    System.out.print("   ");
                }
            }
            System.out.println();
        }


    }

    public void B() {

        int num = 7;

            for (int i = 0; i < num; i++) {
                for (int j = 0; j < num; j++) {
                    if (j == 0 || i == 0 && j < num - 1 || i == (num - 1) / 2 && j < num - 1 ||
                            j == num - 1 && i > 0 && i < (num - 1) / 2 || i == num - 1 && j < num - 1 || j == num - 1 && i > (num - 1) / 2 && i < num - 1) {
                        System.out.print(" * ");
                    } else {
                        System.out.print("   ");
                    }
                }
                System.out.println();
            }
    }

    public void C() {
        int num = 7;
        for (int i = 0; i < num; i++) {
            for (int j = 0; j < num; j++) {
                if (j == 0 && i > 0 && i < num - 1 || i == 0 && j > 0 && j < num - 1 ||
                        i == num - 1 && j > 0 && j < num - 1 || i == 1 && j == num - 1 || i == num - 2 && j == num - 1) {
                    System.out.print(" * ");
                } else {
                    System.out.print("   ");
                }
            }
            System.out.println();
        }
    }

    public void D() {
        int num = 7;
        for (int i = 0; i < num; i++) {
            for (int j = 0; j < num; j++) {
                if (j == 0 || i == 0 && j < num - 1 || i == num - 1 && j < num - 1 || j == num - 1 && i > 0 && i < num - 1) {
                    System.out.print(" * ");
                } else {
                    System.out.print("   ");
                }
            }
            System.out.println();
        }
    }

    public void E() {
        int num = 7;
        for (int i = 0; i < num; i++) {
            for (int j = 0; j < num; j++) {
                if (j == 0 || i == 0 || i == (num - 1) / 2 && j <= (num - 1) / 2 || i == num - 1) {
                    System.out.print(" * ");
                } else {
                    System.out.print("   ");
                }
            }
            System.out.println();
        }
    }

    public void F() {
        int num = 7;
        for (int i = 0; i < num; i++) {
            for (int j = 0; j < num; j++) {
                if (j == 0 || i == 0 || i == (num - 1) / 2 && j <= (num - 1) / 2) {
                    System.out.print(" * ");
                } else {
                    System.out.print("   ");
                }
            }
            System.out.println();
        }
    }

    public void G() {
        int num = 7;
        for (int i = 0; i < num; i++) {
            for (int j = 0; j < num; j++) {
                if (j == 0 && i > 0 && i < num - 1 || i == 0 && j > 0 && j < num - 1 || i == num - 1 && j > 0 && j < num - 1 ||
                        i == (num - 1) / 2 && j >= (num - 1) / 2 || j == num - 1 && i > (num - 1) / 2 && i < num - 1
                        || j == num - 1 && i == 1 || j == (num - 1) / 2 && i == (num - 1) / 2 + 1) {
                    System.out.print(" * ");
                } else {
                    System.out.print("   ");
                }
            }
            System.out.println();
        }
    }

    public void H() {
        int num = 7;
        for (int i = 0; i < num; i++) {
            for (int j = 0; j < num; j++) {
                if (j == 0 || j == num - 1 || i == (num - 1) / 2) {
                    System.out.print(" * ");
                } else {
                    System.out.print("   ");
                }
            }
            System.out.println();
        }
    }

    public void I() {
        int num = 7;
        for (int i = 0; i < num; i++) {
            for (int j = 0; j < num; j++) {
                if (i == 0 || i == num - 1 || j == (num - 1) / 2) {
                    System.out.print(" * ");
                } else {
                    System.out.print("   ");
                }
            }
            System.out.println();
        }
    }

    public void J() {
        int num = 7;
        for (int i = 0; i < num; i++) {
            for (int j = 0; j < num; j++) {
                if (i == 0 || j == num - 1 && i < num - 1 || i == num - 1 && j > (num - 1) / 2 && j < num - 1
                        || j == (num - 1) / 2 && i > (num - 1) / 2 && i < num - 1) {
                    System.out.print(" * ");
                } else {
                    System.out.print("   ");
                }
            }
            System.out.println();
        }
    }

    public void K() {
        int num = 7;
        for (int i = 0; i < num; i++) {
            for (int j = 0; j < num; j++) {
                if (j == 0 || i + j == (num - 1) / 2 || i - j == (num - 1) / 2) {
                    System.out.print(" * ");
                } else {
                    System.out.print("   ");
                }
            }
            System.out.println();
        }
    }

    public void L() {
        int num = 7;
        for (int i = 0; i < num; i++) {
            for (int j = 0; j < num; j++) {
                if (j == 0 || i == num - 1 && j <= (num - 1) / 2) {
                    System.out.print(" * ");
                } else {
                    System.out.print("   ");
                }
            }
            System.out.println();
        }
    }

    public void M() {
        int num = 7;
        for (int i = 0; i < num; i++) {
            for (int j = 0; j < num; j++) {
                if (j == 0 || j == num - 1 || i == j && i <= (num - 1) / 2 || i + j == num - 1 && i <= (num - 1) / 2) {
                    System.out.print(" * ");
                } else {
                    System.out.print("   ");
                }
            }
            System.out.println();
        }
    }

    public void N() {
        int num = 7;
        for (int i = 0; i < num; i++) {
            for (int j = 0; j < num; j++) {
                if (j == 0 || j == num - 1 || i == j) {
                    System.out.print(" * ");
                } else {
                    System.out.print("   ");
                }
            }
            System.out.println();
        }
    }

    public void O() {
        int num = 7;
        for (int i = 0; i < num; i++) {
            for (int j = 0; j < num; j++) {
                if (i == 0 && j > 0 && j < num - 1 || i == num - 1 && j > 0 && j < num - 1
                        || j == 0 && i > 0 && i < num - 1 || j == num - 1 && i > 0 && i < num - 1) {
                    System.out.print(" * ");
                } else {
                    System.out.print("   ");
                }
            }
            System.out.println();
        }
    }

    public void P() {
        int num = 7;
        for (int i = 0; i < num; i++) {
            for (int j = 0; j < num; j++) {
                if (j == 0 || i == 0 && j < num - 1 || i == (num - 1) / 2 && j < num - 1 || j == num - 1 && i > 0 && i < (num - 1) / 2) {
                    System.out.print(" * ");
                } else {
                    System.out.print("   ");
                }
            }
            System.out.println();
        }
    }

    public void Q() {
        int num = 7;
        for (int i = 0; i < num; i++) {
            for (int j = 0; j < num; j++) {
                if (i == 0 && j > 0 && j < num - 1 || i == num - 1 && j > 0 && j < num - 1 ||
                        j == 0 && i > 0 && i < num - 1 || j == num - 1 && i > 0 && i < num - 1 || i == j && i > (num - 1) / 2) {
                    System.out.print(" * ");
                } else {
                    System.out.print("   ");
                }
            }
            System.out.println();
        }
        for (int k = 0; k <= num; k++) {
            if (k == num) {
                System.out.print(" * ");
            } else {
                System.out.print("   ");
            }
        }
    }

    public void R() {
        int num = 7;
        for (int i = 0; i < num; i++) {
            for (int j = 0; j < num; j++) {
                if (j == 0 || i == 0 && j < num - 1 || i == (num - 1) / 2 && j < num - 1 ||
                        j == num - 1 && i > 0 && i < (num - 1) / 2 || i == j && i > (num - 1) / 2) {
                    System.out.print(" * ");
                } else {
                    System.out.print("   ");
                }
            }
            System.out.println();
        }
    }

    public void S() {
        int num = 7;
        for (int i = 0; i < num; i++) {
            for (int j = 0; j < num; j++) {
                if (i == 0 && j > 0 || i == num - 1 && j < num - 1 || j == 0 && i > 0 && i < (num - 1) / 2 ||
                        j == num - 1 && i > (num - 1) / 2 && i < num - 1 || i == (num - 1) / 2 && j > 0 && j < num - 1) {
                    System.out.print(" * ");

                } else {
                    System.out.print("   ");
                }
            }
            System.out.println();
        }
    }

    public void T() {
        int num = 7;
        for (int i = 0; i < num; i++) {
            for (int j = 0; j < num; j++) {
                if (j == (num - 1) / 2 || i == 0) {
                    System.out.print(" * ");
                } else {
                    System.out.print("   ");
                }
            }
            System.out.println();
        }
    }

    public void U() {
        int num = 7;
        for (int i = 0; i < num; i++) {
            for (int j = 0; j < num; j++) {
                if (j == 0 && i < num - 1 || j == num - 1 && i < num - 1 || i == num - 1 && j > 0 && j < num - 1) {
                    System.out.print(" * ");
                } else {
                    System.out.print("   ");
                }
            }
            System.out.println();
        }
    }

    public void V() {
        int num = 7;
        for (int i = 0; i < num; i++) {
            for (int j = 0; j < num; j++) {
                if (i == j && i <= (num - 1) / 2 || i + j == num - 1 && i <= (num - 1) / 2) {
                    System.out.print(" * ");
                } else {
                    System.out.print("   ");
                }
            }
            System.out.println();
        }
    }

    public void W() {
        int num = 7;
        for (int i = 0; i < num; i++) {
            for (int j = 0; j < num; j++) {
                if (j == 0 || j == num - 1 || i == j && i >= (num - 1) / 2 || i + j == num - 1 && i >= (num - 1) / 2) {
                    System.out.print(" * ");
                } else {
                    System.out.print("   ");
                }
            }
            System.out.println();
        }
    }

    public void X() {
        int num = 7;
        for (int i = 0; i < num; i++) {
            for (int j = 0; j < num; j++) {
                if (i == j || i + j == num - 1) {
                    System.out.print(" * ");
                } else {
                    System.out.print("   ");
                }
            }
            System.out.println();
        }
    }

    public void Y() {
        int num = 7;
        for (int i = 0; i < num; i++) {
            for (int j = 0; j < num; j++) {
                if (i == j && i < (num - 1) / 2 || i + j == num - 1 && i < (num - 1) / 2 || j == (num - 1) / 2 && i >= (num - 1) / 2) {
                    System.out.print(" * ");
                } else {
                    System.out.print("   ");
                }
            }
            System.out.println();
        }
    }

    public void Z() {
        int num = 7;
        for (int i = 0; i < num; i++) {
            for (int j = 0; j < num; j++) {
                if (i == 0 || i == num - 1 || i + j == num - 1) {
                    System.out.print(" * ");
                } else {
                    System.out.print("   ");
                }
            }
            System.out.println();
        }
    }

}
class Compare {
    AllAlphabet Latter = new AllAlphabet();
    public void  CompareChar (char  inputLatter , String Space){

        if ( inputLatter == 'A')        {
            Latter.A();
        } else if ( inputLatter == 'B') {
            Latter.B();
        }else if ( inputLatter == 'C')  {
            Latter.C();
        }else if ( inputLatter == 'D')  {
            Latter.D();
        } else if ( inputLatter == 'E') {
            Latter.E();
        } else if ( inputLatter == 'F') {
            Latter.F();
        } else if ( inputLatter == 'G') {
            Latter.G();
        } else if ( inputLatter == 'H') {
            Latter.H();
        } else if ( inputLatter == 'I') {
            Latter.I();
        } else if ( inputLatter == 'J') {
            Latter.J();
        } else if ( inputLatter == 'K') {
            Latter.K();
        } else if ( inputLatter == 'L') {
            Latter.L();
        } else if ( inputLatter == 'M') {
            Latter.M();
        }else if ( inputLatter == 'N') {
            Latter.N();
        }else if ( inputLatter == 'O') {
            Latter.O();
        }else if ( inputLatter == 'P') {
            Latter.P();
        }else if ( inputLatter == 'Q') {
            Latter.Q();
        }else if ( inputLatter == 'R') {
            Latter.R();
        }else if ( inputLatter == 'S') {
            Latter.S();
        }else if ( inputLatter == 'T') {
            Latter.T();
        }else if ( inputLatter == 'U') {
            Latter.U();
        }else if ( inputLatter == 'V') {
            Latter.V();
        }else if ( inputLatter == 'W') {
            Latter.W();
        }else if ( inputLatter == 'X') {
            Latter.X();
        }else if ( inputLatter == 'Y') {
            Latter.Y();
        }else if ( inputLatter == 'Z') {
            Latter.Z();
        }

    }
}


class UserInput {
    Scanner sc = new Scanner(System.in);
    Compare com= new Compare();
    public void StoreUserInput(){

        System.out.println("Please enter How many Latter's in your Name ");
        int totalInput = sc.nextInt();
        char[] inputArr = new char[totalInput];
        System.out.println("Type your Name in Capital  , Latter by Latter ");
        for (int i = 0 ; i< totalInput ; i++){
            inputArr[i] = sc.next().charAt(0);
        }
        System.out.println(" Your name is here ");
        for (int i = 0 ; i < totalInput; i++){
            com.CompareChar(inputArr[i] , " ");
           /* System.out.println();
            System.out.println();*/
        }


    }

}
public class AnyNamePrint {
    public static void main(String[] args) {
        UserInput ui  = new UserInput();
         ui.StoreUserInput();


  }

}
