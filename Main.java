package actions;

import gui.Gui;
import clocks.GameClock;

public class Main
{
    public void main()
    {
        Gui g = new Gui();
        GameClock gc = new GameClock();
        
        g.create();
        gc.start();
    }
}
