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
public class GroundVisorException extends RuntimeException {

    /**
     * Creates a new instance of <code>GroundVisorException</code> without
     * detail message.
     */
    public GroundVisorException() {
    }

    /**
     * Constructs an instance of <code>GroundVisorException</code> with the
     * specified detail message.
     *
     * @param msg the detail message.
     */
    public GroundVisorException(String msg) {
        super(msg);
        System.out.println("error GroundVisorException");
    }
}
