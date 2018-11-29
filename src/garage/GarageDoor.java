package garage;

/**
 * @author Elif
 */
public class GarageDoor {
    public void up(){System.out.println("Garage Door is on");}
    public void down(){System.out.println("Garage Door is off");}
    public void stop(){}
    public void lightOn(Light light){light.on();}
    public void lightOff(Light light){light.off();}
}
