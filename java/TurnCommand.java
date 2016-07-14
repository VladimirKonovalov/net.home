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
public class TurnCommand implements RoverCommand {
    private Turnable tabl;
    private Direction dir;

    public TurnCommand(String line) {
        switch(line) {
            case "North" :
                dir = Direction.North;
                break;
            case "East" :
                dir = Direction.East;
                break;
            case "South" :
                dir = Direction.South;
                break;
            case "West" :
                dir = Direction.West;
                break;
            default:
                System.out.println("error director");
                
        }
        
        
        
    }

    @Override
    public void execute(Rover rov) {
        tabl = rov;
        tabl.turnTo(dir);

    }
 
    
}


    
