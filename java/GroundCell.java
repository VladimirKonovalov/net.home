package edu.netckracker.konovalov.hw1;

/**
 *
 * @author Vlladimir
 */

enum CellState {FREE, OCCUPIED};

public class GroundCell {
    private CellState state;
    private int x;
    private int y;
    
    public GroundCell(){
        state = CellState.FREE;
        x = 0;
        y = 0;
    }
    
    public GroundCell(int _x, int _y) {
        state = CellState.FREE;
        x = _x;
        y = _y;
    }
    
    public CellState getState(){
        return state;
    }
    public void occupyCell() {
        state = CellState.OCCUPIED;
    }
    public void freeCell(){
        state = CellState.FREE;
    }
}