package P1.MultiLine;

import java.io.InputStreamReader;

public class TestML {
    private LineML l;
    private ConsoleML c;
    public TestML(){
        l = new LineML();
        c = new ConsoleML();
        l.addPropertyChangeListener(c);
    }
    public LineML getLineML(){
        return l;
    }

    public static void main(String [] args){
        TestML t = new TestML();
        EditableBufferedReaderML in = new EditableBufferedReaderML(
                new InputStreamReader(System.in),t.getLineML());
        String str = null;
        try {
            System.out.print(Key.orderDELETE);
            System.out.print(Key.orderRESET);        
            in.setRaw();
            str = in.readLine();
            in.unsetRaw();

        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println("\nline is: " + str);
        
    }
}