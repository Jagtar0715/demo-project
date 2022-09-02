import java.util.*;

public class assignmentLoops {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
       // int a = sc.nextInt();
        //int b = sc.nextInt();
        // int num = sc.nextInt();
        //while(num<=100){
        //System.out.println(num);
        // num++;
        // months(2);
guessGame(number);

    }

    public static void months(int days) {
        switch (days) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                System.out.println(" 31 days");
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                System.out.println("30 days");
                break;
            case 2:
                System.out.println("28 days");
                break;
        }


        //public static void cal ( int operators){

           // Scanner sc = new Scanner(System.in);
            //int number = sc.nextInt();
            //int a = sc.nextInt();
            //int b = sc.nextInt();
            //switch (number) {
              //  case '+':
                //    System.out.println(a + b);
                  //  break;
                //case '-':
                  //  System.out.println(a - b);
                    //break;
                //case '*':
                  //  System.out.println(a * b);
                    //break;
                //case '/':
                  //  System.out.println(a / b);
                    //break;
                //case '%':
                  //  System.out.println(a % b);
                    //break;



            }
      //  }


    //}

    public static void guessGame(int n) {
        //return n ;
        int random = (int)(Math.random()*10);
        Scanner sc = new Scanner(System.in);
        boolean guess = true;
        while (guess) {
            System.out.println("guess number : ");
            int number = sc.nextInt();
            if (random == number) {
                System.out.println("true");
                break;
            } else if (random > number) {
                System.out.println("try greater  number ");
            } else {
                System.out.println("try smaller number");
            }

        }




    }

}