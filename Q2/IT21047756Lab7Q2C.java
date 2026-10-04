public class IT21047756Lab7Q2C {
    public static void main(String[] args) {

        // Outer loop controls the numbers from 5 to 1
        for (int i = 5; i >= 1; i--) {

            // Inner loop prints the number
            for (int j = 1; j <= i; j++) {
                System.out.print(i);
            }

            // Move to the next line
            System.out.println();
        }
    }
}