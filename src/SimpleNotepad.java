import java.util.ArrayList;
import java.util.List;

public class SimpleNotepad implements INotepad {
    private List<Page> pages;


    public SimpleNotepad() {
        this.pages = new ArrayList<>();
    }

    @Override
    public void createPage(String title, String text) {
            Page page=new Page(title, text);
            pages.add(page);
            page.setNumber(pages.size());

    }

    @Override
    public void replaceText(int pageNumberToFind, String text) throws PageNotFoundException {
        findPage(pageNumberToFind).setText(text);
        //findPage(pageNumberToFind).deleteText();
        //findPage(pageNumberToFind).addText(text);

    }


    @Override
    public void deleteText(int pageNumberToDelete) throws PageNotFoundException {
        findPage(pageNumberToDelete).deleteText();
    }

    @Override
    public void previewAllPages() {
        for (Page page : pages) {
            System.out.println(page.previewPage());
            ;
        }
    }


    Page findPage(int pageNumber) throws PageNotFoundException {
        for (Page page : pages) {
            if (page.getNumber() == pageNumber) {
                return page;
            }
        }
                throw new PageNotFoundException();

        }
    }

