public class CSEStudent extends Student {
    public String msg = "I want to transfer to CSE";

    @Override
    public String shout() {
        return msg;
    }
}


public class CSE111Student extends Student {
    public String msg = "I love Java Programming";

    @Override
    public String shout() {
        return msg;
    }
}