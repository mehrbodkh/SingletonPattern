/**
 * Created by Mehrbod on 7/11/2017.
 */
public class TheWriter {
    private static TheWriter writer = null;

    private TheWriter() {}

    public static TheWriter getInstance() {
        if (writer == null) {
            synchronized (TheWriter.class) {
                writer = new TheWriter();
            }
        }

        return writer;
    }

    public void write(String sentence) {
        System.out.println(sentence);
    }
}
