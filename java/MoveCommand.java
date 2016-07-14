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
public class MoveCommand implements RoverCommand{

    private Moveable mabl;
    private int length;
    private int wigth;
    public MoveCommand(int l, int w) {
        this.length = l;
        this.wigth = w;      
        
    }

    @Override
    public void execute(Rover rov) {
        mabl = rov;
        mabl.move(length, wigth);

    }
    
    
}
