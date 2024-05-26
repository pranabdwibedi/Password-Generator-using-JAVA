import java.util.Scanner;
import java.lang.Math;
import java.lang.String;
public class PasswordGenerator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //ask the user to enter password length
        System.out.println("Enter Password Length : ");
        int PasswordLen = input.nextInt();

        String LowerCase = "qwertyuioplkjhgfdsazxcvbnm";
        String UpperCase = "QWERTYUIOPLKJHGFDSAZXCVBNM";
        String Symbols = "@_$#";
        String Password = new String();

        for(int i = 0; i < PasswordLen; i++){
            int selection = (int) (0+(4-0) * Math.random());
            switch (selection) {
                //0 for numbers
                case 0:
                    Password += String.valueOf((int)(0+(10-0)*Math.random()));
                    break;
                //1 for lower case
                case 1 :
                    int index_LowerCase = (int)(LowerCase.length() * Math.random());
                    Password += String.valueOf(LowerCase.charAt(index_LowerCase));
                    break;
                //2 for upper case
                case 2 :
                    int index_UpperCase = (int)(UpperCase.length() * Math.random());
                    Password += String.valueOf(UpperCase.charAt(index_UpperCase));
                    break;
                //3 for symbols
                case 3 :
                    int index_Symbols = (int)(Symbols.length() * Math.random());
                    Password += String.valueOf(Symbols.charAt(index_Symbols));
                    break;
            }
        }
        System.out.println("Password : "+Password);
    }
}
