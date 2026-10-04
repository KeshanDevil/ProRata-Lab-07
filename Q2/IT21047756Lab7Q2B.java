public class IT21047756Lab7Q2B {
    public static void main(String[] args) {

        // Outer loop displays numbers from 1 to 5
        for (int i = 1; i <= 5; i++) {

            // Display the number
            System.out.print(i + " - ");

            // Inner loop displays stars
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }

            // Move to the next line
            System.out.println();
        }
    }
}