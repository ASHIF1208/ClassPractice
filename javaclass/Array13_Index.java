public class Array13_Index{
    public static void main(String[]args){
        int arr[]={1,2,3,4,5,6,7,8,9,10};
        int len = arr.length;
        int ind = 9;
        int indexValue = -1;
        for(int i=0;i<len;i++){
            if(arr[i]==ind){
                indexValue = i;
                break;
            }
        }
        System.out.println(indexValue);
    }
}