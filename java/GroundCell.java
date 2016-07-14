/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package home1;

/**
 *
 * @author Администратор
 */
public class GroundCell {
    protected CellState state;
    private int x, y = 0;
    public GroundCell(CellState val,int x,int y)  {
        state = val;
        this.x=x;
        this.y=y;
    }
    
    public CellState getCellState() {
        return this.state;
    }
}
