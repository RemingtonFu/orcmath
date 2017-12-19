package RFPlayground;

import guiTeacher.GUIApplication;

public class catalogmakergui extends GUIApplication {

	/**
	 * 
	 */
	private static final long serialVersionUID = -2452328323352199392L;

	public catalogmakergui(int width, int height) {
		super(width, height);
		setVisible(true);
		// TODO Auto-generated constructor stub
	}
	public static void main(String[] args){
		catalogmakergui sample = new catalogmakergui(800, 550);
		Thread go = new Thread(sample);
		go.start();
	}

	@Override
	public void initScreen() {
		catalogscreen s = new catalogscreen(getWidth(), getHeight());
		setScreen(s);
	}
}
