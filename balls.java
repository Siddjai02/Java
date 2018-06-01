import java.io.*;
import java.awt.*;
import java.awt.event.*;
import java.applet.*;
/*
<applet code="balls" width=400 height=400>
</applet>
*/
public class balls extends Applet implements Runnable
{
	int y=10;
	Thread t;
	int a=15,b=15,c=15;
	public void init()
	{
		setBackground(Color.white);
		t=new Thread(this);
		t.start();
	}
	public void run()
	{
		while(true)
		{
			repaint();
			try
			{
				Thread.sleep(67);
			}
			catch(Exception e)
			{
			}
		}
	}
	boolean a1=false,b1=false,c1=false;
	boolean flg=false;
	int p=0;
	public void paint(Graphics g)
	{
		
		g.drawOval(y,50,50,50);
		
		Color c1=new Color(a,b,c);
		
			if(a==255)
			{

				a=15;
			}
		
		
			if(b==255)
				b=15;
		
		
			if(c==255)
				c=15;
		if(p==0)
		{
			a=a+20;
			p=1;
		}
		else if(p==1)
		{
			b=b+20;
			p=3;
		}
		else
		{
			c=c+20;
			p=0;
		}	
		
			
		g.setColor(c1);	
		g.fillOval(y,50,50,50);
		if(y==350)
		{
			flg=true;
		}
		if(y==10)
		{
			flg=false;
		}
		if(flg==true)
		{
			y=y-10;
		}
		if(flg==false)
		{
			y=y+10;
		}
		
		
	}
}
