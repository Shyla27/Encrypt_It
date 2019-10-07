public class Encrypter {
    private int key;
    private String testWord;

    public  String encrypt(String newTestWord, int newKey){

        testWord = newTestWord;
        key = newKey;

        String cipher = "";

        if(key<1 || key>26){
            System.out.println("The key should be between 1 and 26");
        }else{
            for( int i=0; i<testWord.length(); i++) {
                char position = testWord.charAt(i);
                if(Character.isLetter(position)){
                    if(Character.isLowerCase(position)){
                        char lower = (char)(position+key);
                        if(lower>'z'){
                            cipher += (char)(position-(26-key));
                        }else{
                            cipher += lower;
                        }
                    }
                    if(Character.isUpperCase(position)){
                        char upper = (char)(position+key);
                        if(upper>'Z'){
                            cipher += (char)(position-(26-key));
                        }else{
                            cipher += upper;
                        }
                    }
                }else{
                    cipher += position;
                }
            }
        }

        return cipher;
    }
}
