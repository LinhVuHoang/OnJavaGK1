package Interface;

public class MoveablePoint implements Movable{
    private int x;
    private int y;

    public MoveablePoint(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public String toString() {
        return "MoveablePoint{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }

    @Override
    public void moveUp() {
        y--;
    }

    @Override
    public void moveDown() {
        y++;
    }

    @Override
    public void moveLeft() {
        x--;
    }

    @Override
    public void moveRight() {
        x++;
    }
}
