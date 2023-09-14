public class Array04{
    public static void main(String[]args){
        int num []={1,2,3,4,5,6,7,8,9,10};
        int len = num.length;
        int middle = len/2;
        System.out.println((num[middle-1]+"\t"+num[middle]));
        System.out.println(num[middle-1]);
        System.out.println((float)(num[middle-1]+num[middle])/2); 
        
    }
} 