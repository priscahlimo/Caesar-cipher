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
}
