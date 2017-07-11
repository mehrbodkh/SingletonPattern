/**
 * Created by Mehrbod on 7/11/2017.
 */
public class Main {
    public static void main(String[] args) {
        TheWriter writer = TheWriter.getInstance();
        writer.write("Hello singleton");
    }
}
