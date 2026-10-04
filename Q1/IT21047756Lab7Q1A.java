import java.util.Scanner; // Import Scanner for keyboard input

public class IT21047756Lab7Q1A {
    public static void main(String[] args) {

        // Create Scanner object to get keyboard input
        Scanner input = new Scanner(System.in);

        // Input marks for four subjects
        System.out.print("Enter marks for subject 1: ");
        int mark1 = input.nextInt();

        System.out.print("Enter marks for subject 2: ");
        int mark2 = input.nextInt();

        System.out.print("Enter marks for subject 3: ");
        int mark3 = input.nextInt();

        System.out.print("Enter marks for subject 4: ");
        int mark4 = input.nextInt();

        // Calculate the average of the four subjects
        double average = (mark1 + mark2 + mark3 + mark4) / 4.0;

        // Display the average
        System.out.println("Average: " + average);

        // Check the grade according to the average
        if (average >= 75 && average <= 100) {
            System.out.println("Grade: Distinction");
        }
        else if (average >= 50 && average < 75) {
            System.out.println("Grade: Credit");
        }
        else if (average >= 0 && average < 50) {
            System.out.println("Grade: Fail");
        }
        else {
            System.out.println("Invalid marks");
        }

        // Close Scanner
        input.close();
    }
}