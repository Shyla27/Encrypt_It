import org.junit.*;
import static org.junit.Assert.*;

public class EncrypterTest {
    @Test
    public void encrypt_forLetter_String(){
        Encrypter encrypter = new Encrypter();
        assertEquals("w",encrypter.encrypt("v",1));
    }

    @Test
    public void encrypt_forWord_String(){
        Encrypter encrypter = new Encrypter();
        assertEquals("wfsjtfodf",encrypter.encrypt("verisence",1));
    }

    @Test
    public void encrypt_forCase_String(){
        Encrypter encrypter = new Encrypter();
        assertEquals("wfsjtFodf",encrypter.encrypt("verisEnce",1));
    }

    @Test
    public void encrypt_forWrappingZtoA_String(){
        Encrypter encrypter = new Encrypter();
        assertEquals("QEB NRFZH YOLTK CLU GRJMP LSBO QEB IXWV ALD",encrypter.encrypt("THE QUICK BROWN FOX JUMPS OVER THE LAZY DOG",23));
    }

    @Test
    public void encrypt_forNonLetter_String(){
        Encrypter encrypter = new Encrypter();
        assertEquals("wfsjtFodf!",encrypter.encrypt("verisEnce!",1));
    }
    @Test
    public void encrypt_forSentence_String(){
        Encrypter encrypter = new Encrypter();
        assertEquals("QEB NRFZH YOLTK CLU GRJMP LSBO QEB IXWV ALD",encrypter.encrypt("THE QUICK BROWN FOX JUMPS OVER THE LAZY DOG",23));
    }
}
