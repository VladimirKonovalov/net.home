package edu.netckracker.konovalov.hw;

/**
 * @author vlladimir
 */
public class Ground {

    private GroundCell[][] landscape;
    private int length = 0, width = 0;

    public Ground(int length, int width) {
        this.length = length;
        this.width = width;
        landscape = new GroundCell[length][width];
        for (int q = 0; q < length; q++) {
            for (int w = 0; w < width; w++) {
                landscape[q][w] = new GroundCell(CellState.FREE, q, w);
            }
        }
    }

    public int getLength() {
        return length;
    }

    public int getWidth() {
        return width;
    }

    public void setLength(int l) {
        this.length = l;
    }

    public void setWidth(int w) {
        this.width = w;
    }

    public GroundCell getLandscape(int x, int y) {
        return landscape[x][y];
    }

    public void setLandscape(GroundCell[][] ls) {
        landscape = ls;
    }

    public GroundCell[][] getLandscape() {
        return landscape;
    }
}
