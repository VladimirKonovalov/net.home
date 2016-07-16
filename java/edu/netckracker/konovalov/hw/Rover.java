package edu.netckracker.konovalov.hw;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * @author vlladimir
 */
public class Rover implements Moveable, Turnable, ProgramFileAware {

    private Direction direction;
    private GroundVisor visor = new GroundVisor();
    private int x, y;
    private RoverCommand q;
    private RoverCommandParser programParser = new RoverCommandParser(this);
    
    public Rover() {
        direction = null;
        x = 0;
        y = 0;
    }

    @Override
    public void move(int x, int y) {

        if ((visor.hasObstacles(x, y)) && (visor.getGround().getLandscape()[x][y].getCellState() != CellState.OCCUPIED)) {
            this.x = x;
            this.y = y;
        }
        System.out.println("Move to x(" + this.x + ") y(" + this.y + ") ");
    }
       
    @Override
    public void turnTo(Direction dir) {
        this.direction = dir;
        System.out.println("Turn to " + this.direction);
    }
//----------------------
    public void turnprint() {
        System.out.println("Turn to " + this.direction);
    }
    
    public void moveprint() {
        System.out.println("Move to x(" + this.x + ") y(" + this.y + ") ");
    }
//-----------------------------

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
            System.out.println("file " + str);
            q = programParser.readNextCommand(reader);
            while (q != null) {           
                q = programParser.readNextCommand(reader);
            }
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
