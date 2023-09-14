public class Array09_Merge{
    public static void main(String[]args){
        int arr1[]={1,3,5,7,9,};
        int len1 = arr1.length;
        int arr2[]={2,4,6,8,10};
        int len2 = arr2.length;
        int arr3[]=new int[len1+len2];
        int len3 = arr3.length;
        int temp;
        int k = 0;
        int middle = len3/2;

        for(int i=0;i<len3;i++){
            
            if(len1>i){
                arr3[i]=arr1[i];
            }
            else{
                arr3[i]=arr2[k];
                k++;
            }
        }

        for(int i=0;i<len3;i++){ 
            for(int j = i+1; j<len3 ; j++){
                if(arr3[i]>arr3[j]){
                    temp = arr3[i];
                    arr3[i]=arr3[j];
                    arr3[j]=temp;
                }
            }
        }

        for(int i=0;i<len3;i++){
            System.out.println(arr3[i]);
        }

        if (len3 % 2 == 0) {
             System.out.println( ((float)(arr3[middle - 1] + arr3[middle]) / 2));
         } else {
             System.out.println(arr3[middle]);
         }
    }
}