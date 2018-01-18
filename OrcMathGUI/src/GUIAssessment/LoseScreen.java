package GUIAssessment;

import java.util.List;

import guiTeacher.components.Action;
import guiTeacher.components.Button;
import guiTeacher.interfaces.Visible;
import guiTeacher.userInterfaces.FullFunctionScreen;

public class LoseScreen extends FullFunctionScreen{

	public LoseScreen(int width, int height) {
		super(width, height);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void initAllObjects(List<Visible> viewObjects) {
		Button lose = new Button((getWidth()-100)/2,getHeight()-40,150,50,"You Lost!",new Action() {

			@Override
			public void act() {
				 WinOrLoseGUI.game.setScreen(WinOrLoseGUI.lose);
			}});
		viewObjects.add(lose);
	}
}