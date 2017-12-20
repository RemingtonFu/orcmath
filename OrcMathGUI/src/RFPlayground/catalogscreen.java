package RFPlayground;

import java.util.List;
import java.awt.Color;
import guiTeacher.components.*;
import guiTeacher.interfaces.Visible;
import guiTeacher.userInterfaces.FullFunctionScreen;
import javax.swing.JFrame;
import java.io.File;

public class catalogscreen extends FullFunctionScreen implements FileRequester{

	private TextArea text;
	private TextField keyField;
	private TextField materialField;
	private TextField shapeField;
	private Button createButton;
	private Button add;
	private Button delete;
	private Button save;
	private FileOpenButton fileOpen;
	

	public catalogscreen(int width, int height) {
		super(width, height);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void initAllObjects(List<Visible> viewObjects) {
		keyField = new TextField(40, 40, 200, 30, "Text goes here,", "description goes here.");
		viewObjects.add(keyField);
		materialField = new TextField(240, 40, 200, 30, "Text goes here,", "description goes here.");
		viewObjects.add(materialField);
		shapeField = new TextField(440, 40, 200, 30, "Text goes here,", "description goes here.");
		viewObjects.add(shapeField);
		createButton = new Button(40, 40, 200, 30, "Text goes here",Color.RED, new Action() {
			@Override
			public void act() {
				addClicked();	
			}
		});
		viewObjects.add(createButton);
		add = new Button(40, 40, 200, 30, "Text goes here",Color.BLUE,null);
		viewObjects.add(add);
		save = new Button(40, 40, 200, 30, "Text goes here",Color.GREEN,null);
		viewObjects.add(save);
		delete = new Button(40, 40, 200, 30, "Text goes here",Color.GRAY,null);
		viewObjects.add(delete);
		text = new TextArea(240, 40, 200, 30, "Text goes here");
		viewObjects.add(text);
		fileOpen = new FileOpenButton(240, 40, 200, 30, null, this);
		viewObjects.add(fileOpen);
		catalog = new //INPUT CATALOG HERE();
	}
	protected void addClicked() {
		text.setText("Key" +  + k);
		Keys k = new Keys(keyField.getText(), materialField.getText(), shapeField.getText());
		keyField.setText("");
		materialField.setText("");
		shapeField.setText("");
	}
	
	public void setFile(File f) {
		
	}
	
	public JFrame getWindow() {
		return null;
	}
}
