import java.io.*;
import java.awt.*;
import java.applet.*;
import java.awt.event.*;
/* 
<applet code="ballms" width=400 height=400>
</applet>
*/
public class ballms extends Applet implements MouseListener
{
	static int x=0;
	static int y=0;
	public void init()
	{
		addMouseListener(this);
	}
	public void mousePressed(MouseEvent me)
	{
		this.x=me.getX();
		this.y=me.getY();
		repaint();
	}
	public void mouseClicked(MouseEvent me)
	{
		this.x=me.getX();
		this.y=me.getY();
		repaint();
	}
	public void mouseReleased(MouseEvent me)
	{
	}
	public void mouseEntered(MouseEvent me)
	{
	}
	public void mouseExited(MouseEvent me)
	{
	}
	public void paint(Graphics g)
	{
		g.drawOval(this.x,this.y,30,30);
		g.fillOval(this.x,this.y,30,30);
	}
}
