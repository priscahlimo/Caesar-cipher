import order.Decrypt;
import order.Encrypt;
import java.util.Scanner;
public class App {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in );
        Encrypt encrypt = new Encrypt();
        Decrypt decrypt = new Decrypt();

        String Text;
        int Key;

        System.out.println("Hello! Choose 1. Encryption\n2. Decrypt\nChoose(1,2 or 3 to exit): ");
        int choice = input.nextInt();
        Text = input.nextLine();
        System.out.println("Choose the key you want to apply:");
        Key = input.nextInt();

        if (choice == 1) {
            System.out.println("Encryption");
            input.nextLine();

            System.out.println("Enter text to encrypt: Enter either lower or uppercase alphabet");
            Text = input.nextLine();

            String encrypted = encrypt.Encrypt(Key, Text);
            System.out.println("Encrypted text is: ");
            System.out.println(encrypted);
       }

        if (choice == 2) {
               System.out.println("Decryption");
               input.nextLine();
               System.out.println("Input either lowercase or uppercase alphabets");
                System.out.println("Enter cipher to decrypt: ");
               Text = input.nextLine();

              String decrypted = decrypt.Decrypt(Key, Text);
               System.out.println("Decrypted cipher is: ");
               System.out.println(decrypted);
        }
        else{
            if(choice==3){
                System.out.println("Exit");
            }
        }




   }
}
