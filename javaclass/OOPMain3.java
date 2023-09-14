public class OOPMain3{
    public static void main(String[]args){
        Section A = new Section("ASHIF",1);
        System.out.println(A.toString());

    }
}
public class Section{
    public String stdname;
    public int batch;
    public Section (String name,int batch){//Constructors parameterized constructors
        this.stdname= name;
        this.batch= batch;
         }

public String toString(){
    String str = "Student Details\n";
    str += "Student Name : " + this.stdname + "\n";
    str += " 1st or 2nd Batch : " + this.batch + "\n";
    return str;
}
}
