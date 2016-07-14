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
public class main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        
        
        
        // TODO code application logic here
        Rover r = new Rover();
        Moveable Move = new Rover();
        Turnable Turn = new Rover();
        
       r.getVisor().setGround(new Ground(20,20)); 

       r.executeProgramFile("command.txt");
       
       
       
    }
    
}
