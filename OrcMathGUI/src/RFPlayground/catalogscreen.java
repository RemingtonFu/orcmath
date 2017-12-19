package RFPlayground;

import java.util.List;

import guiTeacher.components.TextField;
import guiTeacher.interfaces.Visible;
import guiTeacher.userInterfaces.FullFunctionScreen;

public class catalogscreen extends FullFunctionScreen{

	private TextField descriptionField;
	private TextField titleField;
	private TextField authorField;
	private TextField pageNumField;
	

	public catalogscreen(int width, int height) {
		super(width, height);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void initAllObjects(List<Visible> viewObjects) {
		descriptionField = new TextField(40, 40, 200, 30, "Text goes here,", "description goes here.");
		viewObjects.add(descriptionField);
		descriptionField = new TextField(40, 40, 200, 30, "Text goes here,", "description goes here.");
		viewObjects.add(descriptionField);
		descriptionField = new TextField(40, 40, 200, 30, "Text goes here,", "description goes here.");
		viewObjects.add(descriptionField);
	}
}
