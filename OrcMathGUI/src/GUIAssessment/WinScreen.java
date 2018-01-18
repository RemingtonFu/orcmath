package GUIAssessment;

import java.util.List;

import guiTeacher.components.Action;
import guiTeacher.components.Button;
import guiTeacher.interfaces.Visible;
import guiTeacher.userInterfaces.FullFunctionScreen;

public class WinScreen extends FullFunctionScreen{

	public WinScreen(int width, int height) {
		super(width, height);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void initAllObjects(List<Visible> viewObjects) {
		Button win = new Button((getWidth()-100)/2,getHeight()-40,100,30,"You Won!",new Action() {

			@Override
			public void act() {
				 WinOrLoseGUI.game.setScreen(WinOrLoseGUI.win);
			}});
		viewObjects.add(win);
	}
}