package mystuff;

import java.awt.Color;
import java.awt.Graphics2D;

import guiTeacher.components.Component;

public class Keys extends Component {

	private String model;
	private String material;
	private String shape;
	
	
	public Keys(String model, String material, String shape) {
		super(40, 40, 100, 100);
		update();
		this.model = model;
		this.material = material;
		this.shape = shape;
	}

	@Override
	public void update(Graphics2D g) {
		g.setColor(Color.BLUE);
		g.fillRect(0, 0, getWidth(), getHeight());
	}

	public String toString() {
		return(model+","+material+","+shape);
	}
}