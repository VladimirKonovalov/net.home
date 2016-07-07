package edu.netckracker.konovalov.hw1;

/**
 *
 * @author Vlladimir
 */
enum Direction {NORTH, EAST, SOUTH, WEST};

interface Turnable {
    void turnTo(Direction _d);
}

interface Moveable {
    void move(int _x, int _y);
}

public class Rover implements Turnable, Moveable {
    
    private Direction direction;
    private int x;
    private int y;
    
    public Rover() {
        direction = Direction.NORTH;
        x = 0;
        y = 0;
    }
    
    public Rover(Direction _d, int _x, int _y) {
        direction = _d;
        x = _x;
        y = _y;
    }
    
    @Override
    public void turnTo(Direction _d) {
        direction = _d;
    }

    @Override
    public void move(int _x, int _y) {
        x = _x;
        y = _y;
    }
    
    String write(){
        String str = null;
        str = "Direction: "+direction+", x = "+x+", y = "+y+";";
        return str;
    }
}
