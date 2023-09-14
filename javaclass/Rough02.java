public class Rough02{
    public static void main(String []args){
        int arr[] = { 10,20,30,40,50,60};
        int last = arr.length-1;
        for(int i = 0; i<arr.length;i++){
            int temp = arr[i];
            arr[i]=arr[last];
            arr[last]=temp;
            last--;
        }
        for(int i = 0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
    }
}