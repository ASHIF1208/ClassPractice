public class ArrayFind{
    public static void main(String[]args){
        String contacts[]={"ASHIF 1234567890","SARAVANAN 3692581470","SANTHOS 4826048260"};
        String findContact = "SARAVANAN 3692581470";
        for(int i = 0;i<contacts.length;i++){
            if(contacts[i]==findContact){
                System.out.println(contacts[i]);
            }
        }
        
    }
}