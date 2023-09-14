import java.util.Scanner; //21-06-2023
public class Arithmet_table{
    public static void main(String[]args){
        Scanner scan = new Scanner(System.in);
        String Name;
        String Class;
        float Tam_Marks;
        float Eng_Marks;
        float Math_Marks;
        
        System.out.print("Your Name: " );
        Name = scan.nextLine();

        System.out.print("Your Class: " );
        Class = scan.nextLine();

        System.out.print("Tamil Marks: " );
        Tam_Marks = scan.nextFloat();

        System.out.print("Eng_Marks: " );
        Eng_Marks = scan.nextFloat();

        System.out.print("Math_Marks: " );
        Math_Marks = scan.nextFloat();

        Float Total_Marks = Tam_Marks+Eng_Marks+Math_Marks; 
        Float Percentage = (Total_Marks/3);
         //System.out.println("Your Percentage : " + Percentage);

        System.out.println("---------------------------------------------------------------------------------------------------");
        System.out.println("NAME\t\tCLASS\t\tTAMIL MARK\t\tENGLISH MARK\t\tMATH MARK\t\t T0TAL Mark\t\tPERCENTAGE");
        System.out.println("---------------------------------------------------------------------------------------------------");
        System.out.println(Name+"\t\t"+Class+"\t\t"+Tam_Marks+"\t\t\t"+Eng_Marks+"\t\t\t"+Math_Marks+"\t\t"+Total_Marks+"\t\t\t"+Percentage);
        System.out.println("----------------------------------------------------------------------------------------------------");



    }
}