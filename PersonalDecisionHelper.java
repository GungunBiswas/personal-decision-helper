import java.util.Scanner;

public class PersonalDecisionHelper {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("===== Personal Decision Helper =====");
        System.out.print("Enter number of options: ");
        int n = sc.nextInt();
        sc.nextLine();

        String[] options = new String[n];
        int[] scores = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.print("\nEnter option " + (i + 1) + ": ");
            options[i] = sc.nextLine();

            System.out.print("Enter number of PROS: ");
            int pros = sc.nextInt();

            System.out.print("Enter number of CONS: ");
            int cons = sc.nextInt();
            sc.nextLine();

            // Simple decision logic
            scores[i] = pros * 2 - cons;
        }

        int bestIndex = 0;
        for (int i = 1; i < n; i++) {
            if (scores[i] > scores[bestIndex]) {
                bestIndex = i;
            }
        }

        System.out.println("\n===== Result =====");
        System.out.println("Best Decision: " + options[bestIndex]);
        System.out.println("Decision Score: " + scores[bestIndex]);

        sc.close();
    }
}
