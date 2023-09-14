public class Person_details {
    public static void main(String[] args) {
        Person Per01 = new Person();
        Per01.Name = "ASHIF";
        Per01.Age = 21;
        Per01.phNum = 1234567890L;

        System.out.println(Display(Per01)); 

        Person Per02 = new Person();
        Per02.Name = "SARAVANAN";
        Per02.Age = 19;
        Per02.phNum = 2468008642L;

        System.out.println(Display(Per02));

        Person Per03 = new Person();
        Per03.Name = "Santhosh";
        Per03.Age = 24;
        Per03.phNum = 3692570369L;

        System.out.println(Display(Per03));

        Person Per04 = new Person();
        Per04.Name = "Santhosh kanan";
        Per04.Age = 27;
        Per04.phNum = 4826048260L;

        System.out.println(Display(Per04));
    }

    // public static String Display(Person person) {
    //     return person.Name + " " + person.Age + " " + person.phNum;
    // }
}

public class Person {
    public String Name;
    public int Age;
    public long phNum;
public static String Display(Person person) {
        return person.Name + " " + person.Age + " " + person.phNum;
     }
}

