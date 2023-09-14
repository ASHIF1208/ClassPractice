public class Array22_FirstMissingNum{
    public static void main(String[]args){
        int num[]={0,2,2,1,1};
        int len = num.length;
        int temp;

        for(int i = 0;i<len;i++){
            for(int j = i+1;j<len;j++){
                if(num[i]>num[j]){
                    temp = num[i];
                    num[i] = num[j];
                    num[j] = temp;
                }
            }
        }
        int k=1;
        int s=0;
        for(int i = 0 ;i<len;i++){
           if(num[i]>0){
            for(int j=i+1;j<num.length-1;j++){
                if(k==num[i]){
                    if(num[i]!=num[i+1]){
                    k++;
                    break;
                    }
                }
                else{
                    System.out.print(k);
                    s++;
                    break;
                }
            }
            if(s!=0){
                break;
            }
            
        }
    }
}
}