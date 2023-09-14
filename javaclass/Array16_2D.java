public class Array16_2D{
    public static void main(String[]args){
        String name[][]={{"Ashif","Saravana","Salman"},{"Ajith","Vijay","Dhanush"},{"Ram","Sam","Jam"}};
        for(int i=0;i<name.length;i++){
            for(int j=0;j<name[0].length;j++){
                System.out.println("HELLO"+"\t"+name[i][j]);
            }
            System.out.println();
        }
    }
}