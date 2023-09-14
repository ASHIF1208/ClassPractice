public class Array23{
    public static void main(String[]args){
        int arr[]={2,7,8,10};
        int len=arr.length;
        int num[] = new int[2];
        int target = 9;

        for(int i=0;i<len;i++){
            for(int j=1;j<len;j++){
                if(arr[i]+arr[j]==target){
                    num[0]=++i;
                    num[1]=++j;
                }
            }
        }
        System.out.print(num[0]+""+num[1]);
    }
}