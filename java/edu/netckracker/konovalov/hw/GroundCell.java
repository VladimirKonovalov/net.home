package edu.netckracker.konovalov.hw;

/**
 * @author vlladimir
 */
public class GroundCell {

    protected CellState state;
    private int x = 0, y = 0;

    public GroundCell(CellState val, int x, int y) {
        state = val;
        this.x = x;
        this.y = y;
    }

    public CellState getCellState() {
        return this.state;
    }
}
