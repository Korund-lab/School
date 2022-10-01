package clocks;

import game.Snake;
import actions.Collison;

public class GameClock extends Thread
{
    public static boolean running = true;
    
    public void run()
    {
        while(running)
        {
            try
            {
                sleep(200);              
                Snake.move();               
                Snake.waitToMove = false;              
                Collison.collidePickUp();
                
                if(Collison.collideSelf())
                {
                    Snake.tails.clear();
                    Snake.score = 0;
                }
                
                if(Collison.collideWall())
                {
                    Snake.tails.clear();
                    Snake.head.setX(7);
                    Snake.head.setY(7);
                    Snake.score = 0;
                }
                
            }
            catch (InterruptedException e)
            {
                e.printStackTrace();
            }
        }
    }
}
