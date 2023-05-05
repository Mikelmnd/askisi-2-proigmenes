

public class Main {
    public static void main(String[] args) {
        Subtractor subtractor = new Subtractor();
        Subtractor.Result result = null;
        result = subtractor.subtract(1,2);
        System.out.println(result);
    }
}
