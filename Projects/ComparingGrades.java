// Comparing Grades Program.
// Usage of .equals and .mismatch array method.

import java.util.Scanner;
import java.util.Arrays;

public class ComparingGrades {
    public static void main(String[] args) {
        // loop the whole program to provide repeating computation option.
        while (true){
            // Initialize Scanner.
            Scanner input = new Scanner(System.in);

            // Output Context.
            System.out.println("\n----------Comparing Grades Program (2 people)------------");
            
            // Get the total number of subjects and initialize arrays and variables.
            System.out.print("Enter how many subjects will be calculated: ");
            int n = input.nextInt();
            String[] subjects = new String[n];
            double[] grades1 = new double[n];
            double[] grades2 = new double[n];
            
            // Get the names of the subjects
            System.out.println("\nEnter the name of the subjects below.");
            for (int i = 1; i <= n; i++){
                System.out.print("Subject " + i + ": ");
                subjects[i - 1] = input.next();
            }
            
            // Get the grade of each subject of Person1 and Person2.
            System.out.println("\nPerson1 enter your grades below: ");
            for (int i = 0; i < n; i++){
                System.out.print(subjects[i] + ": ");
                grades1[i] = input.nextDouble();
            }
            System.out.println("\nPerson2 enter your grades below: ");
            for (int i = 0; i < n; i++){
                System.out.print(subjects[i] + ": ");
                grades2[i] = input.nextDouble();
            }

            // Compute the sum and average of the grades of Person1 and Person2
            double sum1 = 0;
            for (double i: grades1)
                sum1 += i;
            double ave1 = sum1 / n;
            double sum2 = 0;
            for (double i: grades2) 
                sum2 += i;
            double ave2 = sum2 / n;

            // Use arrays method .equals and .mismatch to compare both of the grades.
            boolean equality = Arrays.equals(grades1, grades2);
            int comparison = Arrays.mismatch(grades1, grades2);

            // Apply conditions to print results based on the computed values.
            if (equality && (comparison == -1)){
                System.out.println("\n---------RESULT:----------");
                System.out.println("- All of the subjects' grades from both people are equal.");
            } else {
                for (int i = 0; i < n; i++){
                    if (comparison == i){
                        System.out.println("\n---------RESULT:----------");
                        System.out.println("- There is a difference on the given grades, (Particularly found the difference first in the " + subjects[i] + " subject).");
                        break;
                    }
                }
            }
            if (sum1 - sum2 != 0) System.out.printf("- There is a difference of %,.2f between the sum of the grades.\n", Math.abs(sum1 - sum2));
            else System.out.println("- There is no difference between the sum of the grades.");
            if (ave1 - ave2 != 0) System.out.printf("- There is a difference of %,.2f between the average of the grades.\n", Math.abs(ave1 - ave2));
            else System.out.println("- There is no difference between the average of the grades.");

            // Lastly, output the grades information of both people.
            System.out.println("\nPerson1 grades information: ");
            System.out.print("\tSubjects: ");
            for (int i = 0; i < n; i++){
                System.out.print("|" + subjects[i] + ": " + grades1[i] + "| ");
            }
            System.out.printf("\n\tSum: %,.2f", sum1);
            System.out.printf("\n\tAverage: %,.2f", ave1);

            System.out.println("\nPerson2 grades information: ");
            System.out.print("\tSubjects: ");
            for (int i = 0; i < n; i++){
                System.out.print("|" + subjects[i] + ": " + grades2[i] + "| ");
            }
            System.out.printf("\n\tSum: %,.2f", sum2);
            System.out.printf("\n\tAverage: %,.2f", ave2);

            // Ask user if he/she wants to compare grades again. This is to further determine if the while loop will break or continue.
            System.out.print("\n\nDo you want to compare grades again?(yes/no) >>> ");
            String answer = input.next();
            while (!(answer.equals("yes")) && !(answer.equals("no"))){ // Filter user input using a while loop.
                System.out.println("Invalid input.\n");
                System.out.print("Do you want to compare grades again?(yes/no) >>> ");
                answer = input.next();
            }
            if (answer.equals("no")){break;} 
            else {continue;}
        }
    }
}
