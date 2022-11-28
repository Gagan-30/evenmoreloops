package forloops;

import java.util.Scanner;

public class Forloops {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        Program1();
        Program2();
        Program3();
        Program4();
        Program5();
        Program6();
        Program7();
        Program8();
        Program9();
        Program10();
        Program11();
        Program12();
    }

    private static void Program1() {
        for (int i = 1; i <= 10; i++) {
            System.out.println(i + " Go");
        }
    }

    private static void Program2() {
        for (int i = 1; i <= 10; i++) {
            System.out.println(i + " turn");
        }

    }

    private static void Program3() {
        for (int i = 5; i <= 20; i++) {
            System.out.println(i + " turn");
        }

    }

    private static void Program4() {
        for (int i = 1; i <=12; i++) {
            System.out.println(i * 5 + " turn");
        }

    }

    private static void Program5() {
        int Turn = 0;
        for (int i = 5; i <= 15; i++) {

            System.out.println(i + Turn);
        }

    }

    private static void Program6() {

        for (int i = 16; i > 0; i--) {

            System.out.println(i + " Turn");
        }

    }

    private static void Program7() {
        for (int j = 1; j <=12; j++) {
            for (int k = 1; k <= 12; k++) {
                System.out.println(j * k);
            }
        }

    }

    private static void Program8() {
        int Total = 0;
        for (int Count = 1; Count < 100; Count++) {

            Total = Count + Total;
        }
        System.out.println(Total);
    }

    private static void Program9() {
        Scanner scan = new Scanner(System.in);

        int Total = 0;

        System.out.println("Enter the first number");
        int start = scan.nextInt();
        System.out.println("Enter the last number");
        int end = scan.nextInt();

        for (int i = start; i <= end; i++) {
            Total = Total + i;

        }
        System.out.println(Total);
    }

    private static void Program10() {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter Start number");
        int start = scan.nextInt();
        System.out.println("Enter Count number");
        int count = scan.nextInt();
        System.out.println("Enter Interval number");
        int interval = scan.nextInt();
        System.out.println("\nOutput:");
        int difference = start-interval;
        for (int n = 1; n <=count; n++) {
            System.out.println((interval*n)+difference);
        }

    }

    private static void Program11() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter rainfall");
        int max_rainfall = 0;
        for (int i = 1; i <= 12; i++) {

        }
        int rainfall = scan.nextInt();

        if (rainfall > max_rainfall) {
            max_rainfall = rainfall;
        }
        System.out.println("The maximum rainfall for the year was " + max_rainfall + ".");
    }

    private static void Program12() {
var input = new Scanner(System.in);
        int teamScore;
        int totalteams = 0;
        int totalSum = 0;
        int answer;
        double average = 0;
        int hightScore = 0;
        int lowestScore = 0;

        // Prompts user for input
        System.out.print("Enter 1 to input a score.\n");
        System.out.print("Enter 999 to get results and exit. >> ");
        answer = input.nextInt();

        if(answer != 1 && answer != 999)
        {
            System.out.print("Invaild number!\n");
            System.out.print("Enter 1 to input a score.\n");
            System.out.print("Enter 999 to get results and exit. >> ");
            answer = input.nextInt();
        }

         while(answer == 1)
         {
            System.out.print("Please enter a team score >> ");
            teamScore =  input.nextInt();

            if(teamScore < 0 || teamScore > 100)
            {
                System.out.print("Invalid score! \n");
                System.out.print("please enter a score that is not less than zero and" +
                        " and not more than 100. >> ");
                teamScore =  input.nextInt();
            }
            totalSum += teamScore;
            ++totalteams;

            lowestScore = teamScore;

            if(teamScore > hightScore)
            {
                hightScore = teamScore;
            }
            else if(teamScore < lowestScore) 
            {
                lowestScore = teamScore;
            }

            System.out.println("Your score was processed.");
            System.out.print("Enter 1 to input a score.\n");
            System.out.print("Enter 999 to get results and exit.\n");
            answer = input.nextInt();

         }

        average = totalteams * totalSum;

        System.out.println("The number of teams: " + totalteams);
        System.out.println("The total score is: "+ totalSum);
        System.out.println("The average of scores is: " + average);
        System.out.println("Highest score: " + hightScore);
        System.out.println("Lowest score: " + lowestScore);
}
}
