public class OOPMain1{
    public static void main(String[]args){
            Car Maruti = new Car();
            Maruti.colour = "Blue";
            Maruti.make = "India";
            System.out.println(Maruti.colour+" "+Maruti.make);

            Car Toyato = new Car();
            Toyato.colour = "Red";
            Toyato.make = "China";
            System.out.println(Toyato.colour+" "+Toyato.make);

            Car Skoda = new Car();
            Skoda.colour = "White";
            Skoda.make = "Kerala";
            
            Car BMW = new Car();
            BMW.colour = "Black";
            BMW.make = "India";
            System.out.println(BMW.colour+" "+BMW.make);

            Skoda.colour = "Red";
            System.out.println(Skoda.colour+" "+Skoda.make);

    }
}
public class Car{
    public String colour;
    public String make;
}