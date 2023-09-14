public class While_Loop00 {
    public static void main(String[]args) {
        int x = 965356;
        int newReversed = 0;
        while (x != 0) {
            int digit = x % 10;
            newReversed = newReversed * 10 + digit;
            x /= 10;
        }
        System.out.println("Reversed integer: " + newReversed);
    }
}