package edu.netckracker.konovalov.hw;

/**
 * @author vlladimir
 */
public class GroundVisor {

    private Ground ground;

    public boolean hasObstacles(int i, int j) throws GroundVisorException {
        if ((i < ground.getLength()) && (j < ground.getWidth())) {
            return true;
        } else {
            throw new GroundVisorException("error");
        }
    }

    public void setGround(Ground gr) {
        ground = gr;
    }

    public Ground getGround() {
        return ground;
    }
}
