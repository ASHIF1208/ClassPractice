public class For_Loop_reverse {
    public static void main(String[]args) {
        int x = 12;
        int newReversed = 0;
        for (;x != 0;x /= 10) {
            int digit = x % 10;
            newReversed = newReversed * 10 + digit;
            
        }
        System.out.println("Reversed integer: " + newReversed);
    }
}