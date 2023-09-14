public class Array00{
    public static void main(String [] args){
        String str[]={"name1","vel","mohan","saravanan"};
        int len=str.length;
        System.out.print(len);
        // System.out.print(str[1]+" "+str[0]+" "+str[2]+" "+str[3]);
        for(int i=0;i<len;i++){
            System.out.println(str[i]);
        }
    }
}