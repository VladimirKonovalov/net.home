package edu.netckracker.konovalov.hw1;

/**
 *
 * @author Vlladimir
 */
public class Ground {
    private GroundCell[][] landscape;
    private int length;
    private int width;
    Ground() {
        landscape = null;
        length = 0;
        width = 0;
    }
    Ground(int _l, int _w) {
        length = _l;
        width = _w;
        landscape = new GroundCell[length][width];
        for (int i = 0; i < length; i++)
            for(int j = 0; j < width; j++)
                landscape[i][j] = new GroundCell(i,j);
    }
    public CellState getState(int _x, int _y) {
        return landscape[_x][_y].getState();
    }
    public void occupyCell(int _x, int _y) {
        landscape[_x][_y].occupyCell();
    }
    public void freeCell(int _x, int _y){
        landscape[_x][_y].freeCell();
    }
    public int getLength() {
        return length;
    }
    public int getWidth() {
        return width;
    }
}
