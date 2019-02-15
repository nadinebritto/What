public class Row {

    Cell left;
    Cell center;
    Cell right;

    public Row(String color){
        this.left = new Cell(color);
        this.center = new Cell(color);
        this.right = new Cell(color);
    }
}
