public class Rough{
    public static void main(String[]args){
        // for(int i=51;i<=60;i++){
        //     System.out.println(i);
        // }

        // for(int i=51;i<=60;i++){
        //     if(i%2==)
        //      System.out.println(i);
        //  }

        // int arr[]={1,2,3,4,5,6,7,8,9,10};
        // int len = arr.length;
        // for(int i=arr.length;i>0;i--){
        //     System.out.print(i);
        // }

        // int arr[]={1,3,5,6,8,0,2,5,6,3,};
        // int len = arr.length;
        // int temp;
        // for(int i =0;i<len;i++){
        //     for(int j = i+1;j<len;j++){
        //         if(arr[i]>arr[j]){
        //             temp= arr[i];
        //             arr[i]=arr[j];
        //             arr[j]=temp;

        //         }
        //     }
        // }
        // for(int i=0;i<len;i++){
        //     System.out.print(arr[i]);
        // }

        int arr[]={1,3,5,7,9} ;
        int len = arr.length;
        int target = 5;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==target){
                System.out.print(arr[i]);
            }
        }
    }
}