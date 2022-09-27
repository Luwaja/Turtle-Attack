// Luke James
// 16 September 2022
// Assignment 2 - View.java
// Function: Add features to game (button, color, image)

import javax.swing.JPanel;
import java.awt.Graphics;
import java.awt.image.BufferedImage;
import javax.imageio.ImageIO;
import java.io.IOException;
import java.io.File;
import javax.swing.JButton;
import java.awt.Color;

class View extends JPanel
{
	Model model;
	JButton b1;
	BufferedImage turtle_image;

	View(Controller c, Model m)
	{
		b1 = new JButton("Press this button if you love the turtle (it will dissapear if he loves you too)");
		b1.addActionListener(c);
		this.add(b1);
		c.setView(this);

		model = m;

		try
		{
			this.turtle_image = ImageIO.read(new File("turtle.png"));
		}
		catch(Exception e)
		{
			e.printStackTrace(System.err);
			System.exit(1);
		}
	}

	void removeButton()
	{
		this.remove(b1);
		this.repaint();
	}

	public void paintComponent(Graphics g)
	{
		g.setColor(new Color(128, 255, 255));
		g.fillRect(0, 0, this.getWidth(), this.getHeight());
		g.drawImage(this.turtle_image, model.turtle_x, model.turtle_y, null);
	}
}
