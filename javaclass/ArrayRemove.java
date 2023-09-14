public class ArrayRemove{
    public static void main(String[]args){
        String contacts[]= {"ASHIF 2468013692","SARAVANAN 1357924680","SANTHOSH 4826048260",null};
        String removeNull = null;
       // String temp;

        for(int i = 0;i<contacts.length;i++){
            if(contacts.equals(removeNull)){
                for(;i<contacts.length-1;i++){
                contacts[i]=contacts[i+1];
                }
                break;
        }
        System.out.println(contacts[i]);
    }
    }
    }