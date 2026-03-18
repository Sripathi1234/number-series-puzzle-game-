import java.util.Scanner;

public class NumberSeriesGame {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int score = 0;
        boolean playAgain = true;

        System.out.println("===== NUMBER SERIES PUZZLE GAME =====");

        while (playAgain) {

            System.out.println("\nChoose a Game:");
            System.out.println("1. Addition Series");
            System.out.println("2. Multiplication Series");
            System.out.println("3. Fibonacci Series");
            System.out.println("4. Square Series");
            System.out.print("Enter your choice: ");

            int choice = sc.nextInt();

            int rule1 = 5;
            int rule2 = 2;

            switch (choice) {

                // 🔹 Addition Series
                case 1:
                    int start = (int) (Math.random() * 5) + 1;
                    System.out.println("\nAddition Series:");
                    System.out.print(start + " ");

                    for (int i = 1; i < 5; i++) {
                        if (i % 2 == 0) {
                            start += rule2;
                        } else {
                            start += rule1;
                        }
                        System.out.print(start + " ");
                    }

                    System.out.print("\nEnter next number: ");
                    int ans1 = sc.nextInt();
                    int correct1 = start + rule1;

                    if (ans1 == correct1) {
                        System.out.println("✅ Correct!");
                        score++;
                    } else {
                        System.out.println("❌ Wrong! Answer: " + correct1);
                    }
                    break;

                // 🔹 Multiplication Series
                case 2:
                    int mid = (int) (Math.random() * 5) + 1;
                    System.out.println("\nMultiplication Series:");
                    System.out.print(mid + " ");

                    for (int i = 1; i < 5; i++) {
                        if (i % 2 == 0) {
                            mid *= rule2;
                        } else {
                            mid *= rule1;
                        }
                        System.out.print(mid + " ");
                    }

                    System.out.print("\nEnter next number: ");
                    int ans2 = sc.nextInt();
                    int correct2 = mid * rule1;

                    if (ans2 == correct2) {
                        System.out.println("✅ Correct!");
                        score++;
                    } else {
                        System.out.println("❌ Wrong! Answer: " + correct2);
                    }
                    break;

                // 🔹 Fibonacci Series
                case 3:
                    int a = 1, b = 1;
                    System.out.println("\nFibonacci Series:");
                    System.out.print(a + " " + b + " ");

                    for (int i = 0; i < 3; i++) {
                        int c = a + b;
                        System.out.print(c + " ");
                        a = b;
                        b = c;
                    }

                    System.out.print("\nEnter next number: ");
                    int ans3 = sc.nextInt();
                    int correct3 = a + b;

                    if (ans3 == correct3) {
                        System.out.println("✅ Correct!");
                        score++;
                    } else {
                        System.out.println("❌ Wrong! Answer: " + correct3);
                    }
                    break;

                // 🔹 Square Series
                case 4:
                    int num = 1;
                    System.out.println("\nSquare Series:");
                    for (int i = 1; i <= 5; i++) {
                        System.out.print((i * i) + " ");
                    }

                    System.out.print("\nEnter next number: ");
                    int ans4 = sc.nextInt();
                    int correct4 = 36;

                    if (ans4 == correct4) {
                        System.out.println("✅ Correct!");
                        score++;
                    } else {
                        System.out.println("❌ Wrong! Answer: " + correct4);
                    }
                    break;

                default:
                    System.out.println("Invalid choice!");
            }

            System.out.println("\nCurrent Score: " + score);

            System.out.print("Do you want to play again? (yes/no): ");
            String choiceAgain = sc.next();

            if (!choiceAgain.equalsIgnoreCase("yes")) {
                playAgain = false;
            }
        }

        System.out.println("\n🎯 Final Score: " + score);
        System.out.println("Thanks for playing!");

        sc.close();
    }
}