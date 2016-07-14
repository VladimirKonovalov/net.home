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
public class GroundVisor {
     
    private Ground ground; 

    public boolean hasObstacles(int i, int j) throws GroundVisorException{
        if((i < ground.getLength()) && ( j<ground.getWidth())) {
            return true;
        } else {
             
            throw new GroundVisorException("error");
        }
    }   

    public void setGround(Ground gr) {
        
        ground = gr;
//        ground.setLength(gr.getLength());
//        ground.setWidth(gr.getWidth());
//        ground.setLandscape(gr.getLandscape());
    }
    public Ground getGround() {
        return ground;
    }
}
