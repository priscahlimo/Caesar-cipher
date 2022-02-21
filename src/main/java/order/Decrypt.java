package order;

public class Decrypt {
    private int key;
    private String reversed;

    public String getReversed() {
        return reversed;
    }

    public void setReversed(String reversed) {
        this.reversed = reversed;
    }

    public int getKey() {
        return key;
    }

    public void setKey(int key) {
        this.key = key;
    }

    public String Decrypt(int key, String Text){

        this.key= key;
        this.reversed=Text;

        String textDecrypted="";

        if (key == 0 && !Text.isEmpty()) {
            textDecrypted = this.reversed;
        } else if (Text.isEmpty() && key >= 0 && key <= 25) {
            textDecrypted = "No text to encrypt,Enter text";
        } else if ((Text.isEmpty() || !Text.isEmpty()) && (key < 0 || key > 25)) {
          textDecrypted = "Key must be a number between 0 and 25";
        }
    };
}
