import java.util.Scanner; //20-06-2023

public class user_input{
    public static void main(String[]args){
    Scanner scan = new Scanner(System.in);

    String name;
    String college;
    int phone;
    boolean pass;
    char grade;
    float cgpa;


    System.out.print("ENTER YOUR NAME: ");
    name = scan.nextLine();
    System.out.print("ENTER COLLEGE: ");
    college = scan.nextLine();
    System.out.print("ENTER NUMBER: ");
    phone = scan.nextInt();
    System.out.print("10TH PASS: ");
    pass = scan.nextBoolean();
    scan.nextLine();
    System.out.println("ENTER GRADE: ");
    grade = scan.next().charAt(0);
    System.out.println(grade);
    System.out.print("ENTER CGPA: ");
    cgpa = scan.nextFloat();

    System.out.println("------------------------------------------------------------------------------------");
    System.out.println("NAME\t\tCOLLEGE\t\tPHONE\t\t10th PASS\t\tGRADE\t\t CGPA");
    System.out.println("------------------------------------------------------------------------------------");
    System.out.println(name+"\t\t"+college+"\t\t"+phone+"\t\t"+pass+"\t\t"+grade+"\t\t"+cgpa);


}
}