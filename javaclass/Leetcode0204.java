public class Leetcode0204 {
    public static void main(String[] args) {
        Leetcode0204 solution = new Leetcode0204();
        int n = 20; 
        int count = solution.countPrimes(n);
        System.out.println("Number of prime numbers less than " + n + ": " + count);
    }
    public int countPrimes(int n) {
        if (n <= 2) {
            return 0;
        }

        boolean[] isPrime = new boolean[n];
        for (int i = 2; i < n; i++) {
            isPrime[i] = true;
        }

        for (int i = 2; i * i < n; i++) {
            if (!isPrime[i]) {
                continue;
            }
            for (int j = i * i; j < n; j += i) {
                isPrime[j] = false;
            }
        }

        int count = 0;
        for (int i = 2; i < n; i++) {
            if (isPrime[i]) {
                count++;
            }
        }

        return count;
    }
}
