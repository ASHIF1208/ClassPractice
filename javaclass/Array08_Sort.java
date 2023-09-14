public class Array08_Sort{
    public static void main(String[]args){
        
        int arr[]={1,4,8,2,3,6,0,2,6,4};
        int len=arr.length;
        int temp;

        for(int i =0;i<len;i++){
            for(int j = i+1;j<len;j++){
                if(arr[i]>arr[j]){
                    temp= arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;

                }

            }
        }
        for(int i=0;i<len;i++){
            System.out.println(arr[i]);
        }
    }
}