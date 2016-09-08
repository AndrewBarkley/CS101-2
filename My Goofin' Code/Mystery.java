import java.applet.*;
import java.awt.*;

public class Mystery extends Applet
{
	public void paint(Graphics g)
	{
		final int FULCRUM_CENTER = 200;
		final int FULCRUM_BASE = 300;
		final int FULCRUM_HEIGHT = 50;
		final int FULCRUM_WIDTH = 50;
		final int BOARD_LENGTH = 250;
		final int BIG_X = 300;
		final int BIG_Y = 250;
		final int BIG_RADIUS = 50;
		final int SMALL_X = 80;
		final int SMALL_Y = 186;
		final int SMALL_RADIUS = 20;

		Polygon fulcrum = new Polygon();
		fulcrum.addPoint(FULCRUM_CENTER - FULCRUM_WIDTH / 2, FULCRUM_BASE);
		fulcrum.addPoint(FULCRUM_CENTER + FULCRUM_WIDTH / 2, FULCRUM_BASE);
		fulcrum.addPoint(FULCRUM_CENTER, FULCRUM_BASE - FULCRUM_HEIGHT);

		g.fillPolygon(fulcrum);

		g.drawLine(FULCRUM_CENTER - BOARD_LENGTH / 2,
					  FULCRUM_BASE - 2 * FULCRUM_HEIGHT,
					  FULCRUM_CENTER + BOARD_LENGTH / 2,
					  FULCRUM_BASE);

		g.fillOval(BIG_X, BIG_Y, BIG_RADIUS, BIG_RADIUS);
		g.fillOval(SMALL_X, SMALL_Y, SMALL_RADIUS, SMALL_RADIUS);
	}
}