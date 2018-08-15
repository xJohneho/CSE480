import java.util.Random;

public class LockeAI {

    static char[] passwordGenerator(int length){
        System.out.println("Generating password using random() : ");
        System.out.print("Your new password is : ");
        
        //Password to include upper and lower case letters, numbers, and symbols for increased protection
        String lower_char = "abcdefghijklmnopqrstuvwxyz";
        String upper_char = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String nums = "0123456789";
        String symbols = "!@#$%^&*_=+-/.?<>)";
 
        String values = upper_char + lower_char + nums + symbols;
        Random rndm = new Random();
 
        char[] password = new char[length];
 
        for (int i = 0; i < length; i++){
            password[i] = values.charAt(rndm.nextInt(values.length()));
        }
        return password;
    }
	public static void main(String[] args){
        int size = 10;
        System.out.println(passwordGenerator(size));
    }
 
}
