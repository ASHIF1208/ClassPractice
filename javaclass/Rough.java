// import java.util.*;
// public class Rough{
//     public static void main(String[]args){
//         int i=1;
//         while(i!=0){
//             Scanner scan = new Scanner(System.in);
//             System.out.print("Enter the Number: ");
//             i = scan.nextInt();
//         }
//     }
// }  
public class Rough{
    public static void main(String[]args){
        int arr[][]={{1,2,3},{1,2,3,4},{5,7,8}};
        for(int i = 0;i<arr.length;i++){
            for(int j =0;j<arr.length;j++){
                System.out.print(arr[i][i]);
            }
        }
    }
}             