public class Array20_2D{
    public static void main(String[]args){
        int arr[][]={{1,2,3},{4,5,6},{7,8,9}};
        int len = arr.length;
        int arr1[][]=new int [3][3];
        for (int i = 0;i<arr.length;i++){
            for (int j = 0;j<arr.length;j++){
                arr1[i][j]=arr[j][len-i-1];
                System.out.print(arr[i][j]+" "); 
            }
            System.out.println();
        }
        System.out.println("________");
        for(int i=0;i<arr.length;i++){
                for(int j=0;j<arr.length;j++){
                    System.out.print(arr1[i][j]+" ");
                }
                System.out.println();
            }
    }
}