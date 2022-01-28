public class Page {
    private String title;
    private String text;
    private int number;

    public Page(String title, String text) {
        this.title = title;
        this.text = text;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public void setText(String text) {
        this.text = text;
    }

    void addText(String text){
      this.text=this.text.concat(text);
    }

    void deleteText(){
        this.title="";
        this.text=" ";
    }

   String previewPage(){

       return this.title+"\n"+this.text;
   }


}
