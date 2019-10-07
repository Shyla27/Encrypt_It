public class Decrypter {
    public static String decrypt(String testWord, int key){
        String decrypted = "";
        if(key<1 || key>26){
            System.out.println("The key should be between 1 and 26");
        }else {
            for (int i = 0; i < testWord.length(); i++) {
                char position = testWord.charAt(i);
                if(Character.isLetter(position)){
                    if(Character.isLowerCase(position)){
                        char lower = (char)(position-key);
                        if(lower<'a'){
                            decrypted += (char)(position+(26-key));
                        }else{
                            decrypted += lower;
                        }
                    }
                    if(Character.isUpperCase(position)){
                        char upper = (char)(position-key);
                        if(upper<'A'){
                            decrypted += (char)(position+(26-key));
                        }else{
                            decrypted += upper;
                        }
                    }
                }else{
                    decrypted += position;
                }
            }
        }
        return decrypted;
    }
}
