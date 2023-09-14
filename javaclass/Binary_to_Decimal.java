public class Binary_to_Decimal{
    public static void main(String[]args){
        int arr[]={0,1,0,0,1};
        int res = 0;
        int j = 0;
        for(int i = arr.length-1;i>=0;i--){
        res += arr[i]*pow(2,j);
        j++;
        }
        System.out.print(res);
    }
    public static int pow(int a,int j){
        if(j==0)
        return 1;
        int val = 1;
        for(int i =0; i<j;i++){
            val*=a;
        }
     return val;

    }
}