import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class UserKeyboard implements KeyListener
{

    private final GLHandler events;

    public UserKeyboard(GLHandler events)
    {
        this.events = events;
    }

    @Override
    public void keyTyped(KeyEvent e) {
        // TODO Auto-generated method stub

    }

    @Override
    public void keyPressed(KeyEvent e)
    {   // if key pressed is Q
        if (e.getKeyCode() == 81){
            this.events.translateLeftSpaceShipX();
        }
        // if key pressed is D
        else if (e.getKeyCode() == 68 ){
            this.events.translateRightSpaceShipX();

        }
        //if key pressed is Space
        else if (e.getKeyCode() == 32){
            this.events.shout();
        }

    }

    @Override
    public void keyReleased(KeyEvent e) {
        // TODO Auto-generated method stub

    }


}