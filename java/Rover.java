/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package home1;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Администратор
 */
public class Rover implements Moveable, Turnable, ProgramFileAware {

    private Direction direction;
    private GroundVisor visor = new GroundVisor();
    private int x, y;
    private RoverCommand q;
    private RoverCommandParser programParser = new RoverCommandParser(this);
    
    public Rover(){
        direction = null;
        x=0;
        y=0;
    }
    
    @Override
    public void move(int x, int y) {
      
        if ((visor.hasObstacles(x, y)) && (visor.getGround().getLandscape()[x][y].getCellState() != CellState.Occupied)){
            this.x=x;
            this.y=y;
        }  // иначе стоит на месте
        System.out.println("Move to x("+this.x+") y("+this.y+") ");
    }
    
    public void moveprint() {
        System.out.println("Move to x("+this.x+") y("+this.y+") ");
    }

    @Override
    public void turnTo(Direction dir) {
        this.direction=dir;  
        System.out.println("Turn to "+this.direction);
    }
    public void turnprint() {
        System.out.println("Turn to "+this.direction);
    }
    
    public GroundVisor getVisor() {
        return visor;
    }
    
    public void setVisor(GroundVisor vis) {
       visor = vis;
    }

    @Override
    public void executeProgramFile(String str) {
        
        try {
            FileReader f = new FileReader(str);
            BufferedReader reader = new BufferedReader(f);
            int count = 0;
            q=programParser.readNextCommand(reader);       
            while(q!=null)
            {
                q=programParser.readNextCommand(reader);
            }
            
            
            
// programParser.readNextCommand(str);
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Rover.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Rover.class.getName()).log(Level.SEVERE, null, ex);
        } catch (NullPointerException n) {
            Logger.getLogger(Rover.class.getName()).log(Level.SEVERE, null, n);
        }

    }
    
    public RoverCommandParser getProgramParser() {
        return programParser;
    }
    
    
}
