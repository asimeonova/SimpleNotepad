import java.nio.channels.ScatteringByteChannel;
import java.util.*;

public class SimpleNotepadDemo {
    public static void main(String[] args) {
        SimpleNotepad notepad = new SimpleNotepad();

        notepad.createPage("First page", "First page content");
        notepad.createPage("Second page", "Second page content");
        notepad.previewAllPages();


        try {
            notepad.replaceText(100, "new text");
        } catch (PageNotFoundException e) {
            e.printStackTrace();
        }


        try {
            notepad.deleteText(10);
        }
        catch (PageNotFoundException e){
            e.printStackTrace();
        }
        System.out.println("-----------");
        notepad.previewAllPages();





    }
}
