class ClassObject{
    String name;
    int rollno;

    public void display(){
        System.out.println(name);
        System.out.println(rollno);
    }

    public static void main(String[]args){
        ClassObject Appform1 = new ClassObject();
        Appform1.name = "ASHIF";
        Appform1.rollno = 105;
        Appform1.display();
    }
}