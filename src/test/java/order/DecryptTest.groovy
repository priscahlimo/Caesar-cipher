package order

import org.junit.Test
import static org.junit.Assert.*;
class DecryptTest {

    @Test
    public void checkInput_checksIfInputIsString() throws Exception {
        Encrypt value = new Encrypt("z", 25);
        assertEquals(true, value.isString());
    }

    @Test
    public void checkInput_checksIfKeyIsBetween1to25() throws Exception {
        Encrypt value = new Encrypt("z", 25);
        assertEquals(true, value.isInRange());
    }

    @Test
    public void decryptsCharacter(){
        Decrypt decryptEncrypt = new Decrypt();
        assertEquals("z",decryptEncrypt.Decrypt(1, "x"));
    }
}
