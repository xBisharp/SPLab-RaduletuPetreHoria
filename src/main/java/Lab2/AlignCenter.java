package Lab2;

public class AlignCenter implements AlignStrategy{
    @Override
    public void render(String text) {
        System.out.println(  "#" + text + "#");
    }
}