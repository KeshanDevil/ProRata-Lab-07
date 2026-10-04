import java.util.Scanner; // Import Scanner for keyboard input

public class IT21047756Lab7Q1B {
    public static void main(String[] args) {

        // Create Scanner object for keyboard input
        Scanner input = new Scanner(System.in);

        // Repeat the process for 3 students
        for (int student = 1; student <= 3; student++) {

            System.out.println("\nStudent " + student);

            // Get four subject marks in a single line
            System.out.print("Enter marks for 4 subjects: ");

            int mark1 = input.nextInt();
            int mark2 = input.nextInt();
            int mark3 = input.nextInt();
            int mark4 = input.nextInt();

            // Calculate the average
            double average = (mark1 + mark2 + mark3 + mark4) / 4.0;

            // Display the average
            System.out.println("Average: " + average);

            // Find the grade based on the average
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
        }

        // Close Scanner
        input.close();
    }
}