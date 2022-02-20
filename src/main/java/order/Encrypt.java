package order;

public class Encrypt {
    private int Key;
    private String Text;

    public String getText() {
        return Text;
    }

    public  void setText( String Text){
        this.Text=  Text;
    }

    public int getKey(){
        return Key;
    }

    public void setKey(int Key) {
        this.Key = Key;
    }

    public String Encrypt(int Key, String Text){
        this.Key=Key;
        this.Text = Text;

        String textEncrypted="";

        if(Key==0 && !Text.isEmpty()){

            textEncrypted =Text;
        }
        else if (Text.isEmpty() && Key>= 0 && Key <= 25) {
            textEncrypted= "Please enter the text to be encrypted";
        }
    };
}
