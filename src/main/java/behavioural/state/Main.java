package behavioural.state;

public class Main {
    public static void main(String[] args) {

        Document doc = new Document();
        DocumentContext ctx = new DocumentContext(doc.getId());
        ctx.update();

//        after draft
        ctx.update();

        //after apporval
        ctx.update();
    }
}
