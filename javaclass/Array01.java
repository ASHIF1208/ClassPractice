public class Array01{
    public static void main(String[]args){
        String Students[]={"ASHIF","SARAVANAN","JALAL","BASITH","ISMAIL","SHEIK","NOOR","SALMAN","VISHNU","SANTHOSH"};
        int len = Students.length;
        for(int i=len-1;i>=0;i--){
            System.out.println(Students[i]);
        }
    }
}