package GUIAssessment;

import guiTeacher.GUIApplication;

public class ClickerGUI extends GUIApplication {
	public static ClickerGUI test;
	public static ClickerScreen myscreen;
	
	public ClickerGUI(int width, int height) {
		super(width, height);
		setVisible(true);
	}
	

	@Override
	public void initScreen() {
		myscreen= new ClickerScreen(getWidth(),getHeight());
		setScreen(myscreen);

	}
	public static void main(String[] args) {
		test = new ClickerGUI(500,500);
		Thread go= new Thread(test);
		go.start();
	}

}
