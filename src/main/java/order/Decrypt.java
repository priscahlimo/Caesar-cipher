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

    public String Decrypt(int key, String reversed){

        this.key= key;
        this.reversed=reversed;

        String textDecrypted="";


    };
}
