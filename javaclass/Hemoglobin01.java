import java.util.*;
public class Hemoglobin01{
    public static void main(String[]args){
        Scanner scan = new Scanner(System.in);
        String Gender;
        int age;
        float Hglbn=0;
        System.out.println("Enter Gender (M for Male,F for Female,C for Children,N for Newborn) : ");
        Gender = scan.nextLine();
        if(Gender.equalsIgnoreCase("N")){

            System.out.println("Enter age in Month (1-12): ");
            age = scan.nextInt();
            if(age>=1 && age <=2){
                System.out.println("Enter Hemoglobin level count");
                Hglbn = scan.nextFloat();
                if(Hglbn>=10.0 && Hglbn <=18.0){
                    System.out.println("Hemoglobin level is Normal");
                }
                 else{
                System.out.println("Hemoglobin level is AbNormal");
                }
            }
            else if(age>2 && age<=6){
                System.out.println("Enter Hemoglobin level count");
                if(Hglbn>=9.5 && Hglbn<=14.0){
                    System.out.println("Hemoglobin level is Normal");
                }
                 else{
                System.out.println("Hemoglobin level is AbNormal");
                }
            }
            else if(age>6 && age<=12){
                System.out.println("Enter Hemoglobin level count");
                if(Hglbn>=10.5 && Hglbn<=13.5){
                    System.out.println("Hemoglobin level is Normal");
                }
                 else{
                    System.out.println("Hemoglobin level is AbNormal");
                }
            }
            else {
                System.out.println("Error:Please enter correct age in number..");
            }
        }
        else if(Gender.equalsIgnoreCase("C")){
            System.out.println("Enter age in age(1-12): ");
            age = scan.nextInt();
            if(age>=1 && age <=6){
                System.out.println("Enter Hemoglobin level count: ");
                Hglbn = scan.nextFloat();
                if(Hglbn>=11.5 && Hglbn <=13.5){
                    System.out.println("Hemoglobin level is Normal");
                }
                 else{
                     System.out.println("Hemoglobin level is AbNormal");
                }
            }
            else if(age>=6 && age <=12){
                System.out.println("Enter Hemoglobin level count: ");
                if(Hglbn>=11.5 && Hglbn <=15.5){
                    System.out.println("Hemoglobin level is Normal");
                }
                 else{
                System.out.println("Hemoglobin level is AbNormal");
            }
            }
            else{
                System.out.println("Please enter the Correct Age..");
            }
        }
        else if(Gender.equalsIgnoreCase("M")){
            System.out.println("Enter age : ");
            age = scan.nextInt();
            if(age>=12 && age<=18){
                System.out.println("Enter Hemoglobin level count:");
                Hglbn = scan.nextFloat();
                if(Hglbn>=13.0 && Hglbn<=16.0){
                    System.out.println("Hemoglobin level is Normal");
                }
                else{
                    System.out.println("Hemoglobin level is AbNormal");
                }
            }
            else if(age>=18){
                System.out.println("Enter Hemoglobin level count: ");
                if(Hglbn>=13.6 && Hglbn<=17.7){
                    System.out.println("Hemoglobin level is Normal");
                }
                else{
                    System.out.println("Hemoglobin level is Abnormal");
                }
            }
            }

        else if(Gender.equalsIgnoreCase("F")){
            System.out.println("Enter age : ");
            age = scan.nextInt();
            if(age>=12 && age<=18){
                System.out.println("Enter Hemoglobin level count:");
                Hglbn = scan.nextFloat();
                if(Hglbn>=12.0 && Hglbn<=16.0){
                    System.out.println("Hemoglobin level is Normal");
                }
                else{
                    System.out.println("Hemoglobin level is AbNormal");
                }
            }
            else if(age>=18){
                System.out.println("Enter Hemoglobin level count: ");
                if(Hglbn>=12.1 && Hglbn<=15.1){
                    System.out.println("Hemoglobin level is Normal");
                }
                else{
                    System.out.println("Hemoglobin level is Abnormal");
                }
            }
            }    
        }
}


