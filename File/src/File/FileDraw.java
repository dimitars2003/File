package File;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.Rectangle2D;

import javax.swing.JComponent;

public class FileDraw extends JComponent{
	private Folder f;
	public FileDraw() {
		f = new Folder();
	}
	public FileDraw (Folder f) {
		this.f = f;
	}
	@Override
	public void paintComponent (Graphics graphics) {
		
		Graphics2D g =  (Graphics2D) graphics;
		drawFolder(10,10,40,30,g);
		g.setColor(Color.black);
		g.drawString(f.getName(), 60, 30);
		
		g.setColor(Color.black);
		g.drawLine(30, 40, 30, 80);
		
		
		
		int y = 0;
		
		FileSystemObject[] files = f.getFiles();
		System.out.println(files.length);
		for(int i = 0; i <files.length;i++) {
			if(files[i]!=null) {
				
				if(files[i].getClass().equals(Folder.class)) {
					g.setColor(Color.black);
					g.drawLine(30, 60+y, 50, 60+y);
					g.drawLine(30, 40+y, 30, 80+y);
					g.drawString(files[i].getName(), 105, 75+y);
					g.setColor(Color.yellow);
					drawFolder(55, 55+y, 40,30,g);
					y+=40;
				}
				else {
				g.setColor(Color.black);
				g.drawLine(30, 60+y, 50, 60+y);
				drawFile(55, 55+y, 20,30,g);
				g.drawLine(30, 40+y, 30, 80+y);
				g.drawString(files[i].getName(), 85, 75+y);
				y+=40;
				}
			}
			}
		
	}
	
	public void drawFolder(int x, int y, int lenght, int width, Graphics2D g) {
		g.setColor(Color.YELLOW);
		g.fill(new Rectangle2D.Double(x,y,lenght,width));
		g.draw(new Rectangle2D.Double(x, y, lenght, width));
	}
	public void drawFile(int x, int y, int lenght, int width, Graphics2D g) {
		g.setColor(Color.black);
		g.fill(new Rectangle2D.Double(x,y,lenght,width));
		g.draw(new Rectangle2D.Double(x, y, lenght, width));
	}
}
	