public class Rough03{
    public static void main(String[]args){
        // int n = 20;
        // for(int i =2; i<n;i++){
        //     if(i%2==0){
        //         System.out.print(i);
        //     }
        // }
        // System.out.println();
        // for (int i = 2 ; i<n;i=i+2){
        //     System.out.print(i);
        // }
        int a = 10;
        float f = 10f;
        f=a;
        a=(int)f;
        System.out.println(f+"\t"+a);

        int[] numbers = {1, 5, 8, 4, 5};
        for (int num : numbers) {
            System.out.print(num + " ");
        }
        System.out.println();

    }
}