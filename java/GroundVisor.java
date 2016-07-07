package edu.netckracker.konovalov.hw1;

/**
 *
 * @author Vlladimir
 */
public class GroundVisor{
    private Ground ground;

    public GroundVisor() {
        ground = new Ground();
    }
    public GroundVisor(int _x, int _y){
        ground = new Ground(_x, _y);
    }
    public boolean hasObstacles(int _x, int _y){
        if ((_x > ground.getLength()) || 
            (_y > ground.getWidth()) || 
            (_x < 0) || (_y < 0)) {
            throw new GroundVisorException("coords out of ground");
        }  
        boolean flag = false;
        if (ground.getState(_x, _y) == CellState.OCCUPIED) flag = true;
        return flag;
    }
    public int getLength(){
        return ground.getLength();
    }
    public int getWidth(){
        return ground.getWidth();
    }
}
