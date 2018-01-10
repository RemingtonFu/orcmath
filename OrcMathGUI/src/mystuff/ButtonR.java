package mystuff;

import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.RenderingHints;

import guiTeacher.components.Action;
import guiTeacher.components.Button;

public class ButtonR extends Button implements ButtonInterfaceRemington {
	
	private boolean buttonOn = false;
	private Color hColor;


	public ButtonR(int x, int y, int w, int h, String text, Action action) {
		super(x, y, w, h, "", null);
		update();
	}

	@Override
	public void setColor(Color color) {
		hColor = color;
		this.setBackground(color);
		update();
	}

	@Override
	public void highlight() {
		this.setColor(Color.BLACK);
		update();
	}

	@Override
	public void dim() {
		this.setColor(hColor);
		update();
	}
	
	public void drawButton(Graphics2D g, boolean hover) {
		g.setRenderingHint(RenderingHints.KEY_ANTIALIASING,
				RenderingHints.VALUE_ANTIALIAS_ON);
		drawShape(g, hover);
		g.setColor(getForeground());
	}

}