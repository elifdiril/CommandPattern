package garage;

/**
 * @author Elif
 */
public class SimpleRemoteControl {
    Command slot;
    public SimpleRemoteControl(){}
    public void setCommand(Command command){ slot= command;}
    public void buttonWasPressed(){
        slot.execute();
    }
}
