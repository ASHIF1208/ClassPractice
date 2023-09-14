public class Array21_Concatenation{
    public static void main(String[]args){
        int arr1[]={1,2,3,4};
        int len1 = arr1.length;
        int arr2[]= new int[len1+len1];
        int len2 = arr2.length;
        int k=0;
    
    for(int i = 0;i<len2;i++){
          if(len1>i){
                arr2[i]=arr1[i];
            }
            else{
                arr2[i]=arr1[k];
                k++;
            }
    }
    for(int i=0;i<len2;i++){
        System.out.print(arr2[i]);
    }
    
    }
}