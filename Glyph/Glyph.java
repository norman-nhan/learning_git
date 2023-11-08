public abstract class Glyph {
    public abstract void print();

    public static void main(String[] args) {
        Char c1 = new Char('a');
        Char c2 = new Char('b');
        
        Glyph elements[] = new Glyph[2];
        elements[0] = c1;
        elements[1] = c2;
        
        Line l = new Line(elements);
        l.print();
    }

}
