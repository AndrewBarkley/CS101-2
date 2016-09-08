//Fuck around code with graphics

//Zachary Mosley

import java.applet.*;
import java.awt.*;

public class FuckAroundCode extends Applet
{
	public void paint(Graphics g)
	{
		final int OUTSIDE_RADIUS = 200;
      final int CENTER_X = 100;
      final int CENTER_Y = 100;
      final int OUTER_BUTTON_RADIUS = 60;
      final int INNER_BUTTON_RADIUS = 50;
      
      //Draw red circle
      g.setColor(Color.red);
      g.fillOval(CENTER_X, CENTER_Y, OUTSIDE_RADIUS, OUTSIDE_RADIUS);
      //Draw white rectangle
      g.setColor(Color.white);
      g.fillRect(CENTER_X, CENTER_Y + (OUTSIDE_RADIUS / 2), 
                     OUTSIDE_RADIUS, OUTSIDE_RADIUS / 2);
      
      //Draw outside border
      g.setColor(Color.black);
      g.drawOval(CENTER_X, CENTER_Y, OUTSIDE_RADIUS, OUTSIDE_RADIUS);
      //Draw center white circle
      g.setColor(Color.white);
      g.fillOval(CENTER_X + OUTSIDE_RADIUS / 2 - OUTER_BUTTON_RADIUS / 2,
                   CENTER_Y + OUTSIDE_RADIUS / 2 - OUTER_BUTTON_RADIUS / 2,
                   OUTER_BUTTON_RADIUS, OUTER_BUTTON_RADIUS);
      //Draw other borders
      g.setColor(Color.black);
      g.drawOval(CENTER_X + OUTSIDE_RADIUS / 2 - OUTER_BUTTON_RADIUS / 2,
                   CENTER_Y + OUTSIDE_RADIUS / 2 - OUTER_BUTTON_RADIUS / 2,
                   OUTER_BUTTON_RADIUS, OUTER_BUTTON_RADIUS);                   
      g.drawOval(CENTER_X + OUTSIDE_RADIUS / 2 - INNER_BUTTON_RADIUS / 2,
                   CENTER_Y + OUTSIDE_RADIUS / 2 - INNER_BUTTON_RADIUS / 2,
                   INNER_BUTTON_RADIUS, INNER_BUTTON_RADIUS);           
      g.drawLine(CENTER_X,
                 CENTER_Y + OUTSIDE_RADIUS / 2,
                 CENTER_X + OUTSIDE_RADIUS / 2 - OUTER_BUTTON_RADIUS / 2,
                 CENTER_Y + OUTSIDE_RADIUS / 2);
      g.drawLine(CENTER_X + OUTSIDE_RADIUS,
                 CENTER_Y + OUTSIDE_RADIUS / 2,
                 CENTER_X + OUTSIDE_RADIUS / 2 + OUTER_BUTTON_RADIUS / 2,
                 CENTER_Y + OUTSIDE_RADIUS / 2);
	}//paint
}//FuckAroundCode