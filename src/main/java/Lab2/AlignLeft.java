package Lab2;

public class AlignLeft implements AlignStrategy {
    @Override
    public void render(String text) {
        System.out.println("Paragraph: "  + text + "#");
    }
}