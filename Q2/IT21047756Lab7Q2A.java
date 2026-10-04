public class IT21047756Lab7Q2A {
    public static void main(String[] args) {

        // Outer loop controls the rows
        for (int i = 1; i <= 4; i++) {

            // Inner loop prints 5 dollar signs in each row
            for (int j = 1; j <= 5; j++) {
                System.out.print("$ ");
            }

            // Move to the next line
            System.out.println();
        }
    }
}