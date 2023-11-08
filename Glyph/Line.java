public class Line extends Glyph {
    private Glyph[] elements;

    public Line(Glyph[] elements) {
        this.elements = elements;
    }

    public void print() {
        for(int i = 0; i < elements.length; i++) {
            elements[i].print();
        }
    }
}
