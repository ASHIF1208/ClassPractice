public class Array10_Suffle{
    public static void main(String[]args){
         int arr[]={1,2,3,4,5,6,7,8,9,10};
         int len = arr.length;
         int arr1[]=new int [len];
         int j=0;
         for(int i=0;i<len/2;i++){
            arr1[j]=arr[i];
            j++;
            arr1[j]=arr[i+5];
            j++;
         }
         for(int i=0;i<len;i++){
            System.out.println(arr1[i]);
         }

        
    }
}