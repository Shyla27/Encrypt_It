import java.io.Console;

public class App {
    public static void main(String[] args){
        Console console = System.console();

        int responseInt = 0;
        boolean invalid = responseInt!=1 || responseInt!=2;

        while (invalid){
            System.out.println("\nWelcome to the Ceaser Cipher App. \n\nEnter 1 to encrypt or 2 to decrypt?");
            String response = console.readLine();
            responseInt = Integer.parseInt(response);
            switch (responseInt){
                case 1:
                    System.out.println("Enter the sentence you want to encrypt");
                    String inStr = console.readLine();
                    System.out.println("Enter the key to use to encrypt");
                    String keyString = console.readLine();
                    int key = Integer.parseInt(keyString);
                    Encrypter encrypter = new Encrypter();
                    String encrypted = encrypter.encrypt(inStr,key);
                    System.out.println("The encrypted text is:\n"+encrypted);
                    break;

                case 2:
                    System.out.println("Enter the sentence you want to decrypt");
                    String inStr2 = console.readLine();
                    System.out.println("Enter the key to use to decrypt");
                    String keyString2 = console.readLine();
                    int key2 = Integer.parseInt(keyString2);
                    Decrypter decrypter = new Decrypter();
                    String decrypted = decrypter.decrypt(inStr2,key2);
                    System.out.println("The decrypted text is:\n"+decrypted);
                    break;

                default:
                    System.out.println("You entered an invalid choice. Please choose between 1 for encrypt and 2 for decrypt");
                    break;
            }
        }
    }
}
