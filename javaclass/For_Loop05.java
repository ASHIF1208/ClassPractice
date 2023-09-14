public class For_Loop05{
    public static void main(String[] args) {
        int rows = 15; // Number of rows in the semi-triangle pattern
        int a = 1; // Number of asterisks to be printed
        int count = 0; // Counter variable to keep track of asterisks

        for (int i = 1; i <= (rows * 2) ; i++) {
            if (count < a) {
                System.out.print("* ");
                count++;
            } else {
                System.out.println(); // Move to the next line
                a++;
                count = 0;
            }
        }
    }
}
