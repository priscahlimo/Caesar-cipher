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
        else if ((Text.isEmpty() || !Text.isEmpty()) && (Key < 0 || Key > 25)) {
            textEncrypted = "Key must be a number between 0 and 25";
        }


        char[] aCharacters = this.Text.toCharArray();

        for (char character : aCharacters) {
            if (!Text.isEmpty() && Key >= 1 && Key <= 25) {
                int valueOfChar = Character.valueOf(character) + Key;
                char shifted = (char) valueOfChar;

                textEncrypted += Character.toString(shifted);
            }
        }
        return textEncrypted;
    }

}
