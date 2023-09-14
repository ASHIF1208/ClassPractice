import java.util.Scanner;
public class inputclass{
    public static void main(String[]args){
        Scanner SC = new Scanner(System.in);
        String name;
        int age;
        String branch;
        float cgpa;
        byte marks;
        char A;
        System.out.print("ENTER YOUR NAME:");
        name = SC.nextLine();
        System.out.print("ENTER YOUR AGE:");
        age = SC.nextInt();
        SC.nextLine();
        System.out.print("BRANCH:");
        branch = SC.nextLine();
        System.out.print("ENTER CGPA:");
        cgpa = SC.nextFloat();
        System.out.print("ENTER YOUR MARKS:");
        marks = SC.nextByte();
        System.out.print("ENTER YOUR GRADE:");
        A = SC.next().charAt(0);
        System.out.println(A);

        System.out.println( name+""+age+""+branch+""+cgpa+""+marks+""+A);


        
    }
}
