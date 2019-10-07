import java.io.Console;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Console myConsole = System.console();
        Scanner myScanner = new Scanner(System.in);

        boolean runProgram = true;

        while (runProgram) {
            System.out.println("Welcome to a Caesar Ciphar program. Would you like to encrypt or decrypt a statement or would you like to exit?");
            String userAnswer = myConsole.readLine();


            if (userAnswer.equals("encrypt")) {
                System.out.println("Please enter a statement that you would like to encrypt:");
                String statement = myConsole.readLine();

                System.out.println("Please enter an encryption key");
                int key = myScanner.nextInt();

                CaesarCipher userEncryption = new CaesarCipher(statement, key);
                String encryption = userEncryption.isActuallyEncrypted(statement, key);

                System.out.println("The encrypted statement is: " + encryption);
            } else if (userAnswer.equals("decrypt")) {
                System.out.println("Please enter a statement to decrypt: ");
                String statementDecrypt = myConsole.readLine();

                System.out.println("Please enter an decryption key");
                int keyDecrypt = myScanner.nextInt();

                CaesarCipher userDecryption = new CaesarCipher(statementDecrypt, keyDecrypt);
                String decryption = userDecryption.toDecrypt(statementDecrypt, keyDecrypt);

                System.out.println("The decrypted statement is: " + decryption);
            } else if (userAnswer.equals("exit")){
                runProgram = false;
            }
            else {
                System.out.println("Sorry we could not recognise your input");
            }
        }
    }
}