package order;

public class Encrypt {
    private int mKey;
    private String mText;

    Encrypt(String text, int key) {
        this.mText = text;
        this.mKey = key;
    }
}
