public class Array05 {
    public static void main(String[] args) {
        int num[] = {1, 2, 3, 4, 5, 6, 7, 8, 9,10};
        int len=num.length;
        int middle = len / 2;
        if (len % 2 == 0) {
             System.out.println( ((float)(num[middle - 1] + num[middle]) / 2));
         } else {
             System.out.println(num[middle]);
         }
    }
}
