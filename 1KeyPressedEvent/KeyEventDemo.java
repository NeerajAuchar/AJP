import java.awt.*;
import java.applet.*;
import java.awt.event.*;

public class KeyEventDemo extends Applet implements KeyListener
{
	String msg = "";
	int X = 100, Y = 100; // output coordinates
		public void init()
		{
			addKeyListener(this);
		}
		public void keyPressed(KeyEvent ke)
		{
			showStatus("Key Down");
		}
		public void keyReleased(KeyEvent ke)
		{
			showStatus("Key Up");
		}
		public void keyTyped(KeyEvent ke)
		{
			msg += ke.getKeyChar();
			repaint();
		}

	// Display keystrokes.
	public void paint(Graphics g)
	{
		g.drawString(msg, X, Y);
	}
}
//

