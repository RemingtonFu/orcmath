package mystuff;

import java.awt.Color;
import java.util.ArrayList;
import java.util.List;

import guiTeacher.components.*;
import guiTeacher.interfaces.Visible;
import guiTeacher.userInterfaces.ClickableScreen;

public class SimonScreenRemington extends ClickableScreen implements Runnable {
	
	private static TextLabel board;
	private ProgressInterfaceRemington progress;
	private ArrayList<MoveInterfaceRemington> arrlist;
	private ButtonInterfaceRemington[] buttons;
	private int roundnumber;
	private boolean validinput;
	private int sequenceidx;
	private int lastselectedbutton;
	private Color[] colors;
	
	public SimonScreenRemington(int width, int height) {
		super(width, height);
		Thread app= new Thread(this);
		app.start();
	}
	
	public void run() {
		 board.setText("");
	     nextRound();
	}
	
	private void nextRound() {
		validinput = false;
		roundnumber++;
		arrlist.add(randomMove());
		progress.setRound(roundnumber);
		progress.setSequenceSize(arrlist.size());
		changeText("It is Simon's turn.");
		board.setText("");
		playSequence();
		changeText("It's your turn.");
		validinput = true;
		sequenceidx = 0;
	}

	private void playSequence() {
		ButtonInterfaceRemington b = null;
		for(int i = 0; i < arrlist.size(); i++) {
			if(b != null) {
				b.dim();
				b = arrlist.get(i).getButton();
				b.highlight();
				
				try {
	                Thread.sleep((int)(1000*roundnumber));
	            } catch (InterruptedException e) {
	                // TODO Auto-generated catch block
	                e.printStackTrace();
	            }
				b.dim();
			}
		}
	}

	@Override
	public void initAllObjects(List<Visible> viewObjects) {
		addButtons();
		for(ButtonInterfaceRemington b:buttons) {
			viewObjects.add(b);
		}
		progress = getProgress();
		board= new TextLabel(200,60,200,200,"testing");
		arrlist= new ArrayList<MoveInterfaceRemington>();
		lastselectedbutton=-1;
		arrlist.add(randomMove());
		arrlist.add(randomMove());
		for(int i = 0; i < sequenceidx; i++) {
			arrlist.add(randomMove());
		}
		roundnumber=0;
		progress.setRound(roundnumber);
		viewObjects.add(progress);
		viewObjects.add(board);
	

	}
	private MoveInterfaceRemington randomMove() {
		int randomidx= (int)(Math.random()*buttons.length);
		while(randomidx==lastselectedbutton) {
			randomidx=(int)(Math.random()*buttons.length);
		}
		return getMove(randomidx);
	}

	private MoveInterfaceRemington getMove(int randomidx) {
		return new MoveR(buttons[randomidx]);
	}

	private ProgressInterfaceRemington getProgress() {
		return new ProgressR(150, 150, 200, 200);
	}

	private void addButtons() {
		
		colors = new Color[4];
		colors[0] = Color.MAGENTA;
		colors[1] = Color.GREEN;
		colors[2] = Color.PINK;
		colors[3] = Color.ORANGE;
		buttons= new ButtonInterfaceRemington[4];
		
		for(int i=0;i<buttons.length;i++) {
			final ButtonInterfaceRemington b=getAButton(i*100+50,100,50,50);
			b.setColor(colors[i]);
			b.setAction(new Action() {
				@Override
				public void act() {
					if(validinput) {
						Thread blink= new Thread(new Runnable() {
							
							@Override
							public void run() {
								b.highlight();
								try{
									Thread.sleep(800);
								} catch (InterruptedException e) {
									e.printStackTrace();
								}
								b.dim();
							}
						});
						blink.start();
						if(b == arrlist.get(sequenceidx).getButton()) {
		    		    	sequenceidx++;
		    		    }
		    		    else {
		    		    	progress.gameOver();
		    		    }
		    		    if(sequenceidx == arrlist.size()){
		    		        Thread nextRound = new Thread(SimonScreenRemington.this);
		    		        nextRound.start();
		    		    }		
					}
				}
			});
			buttons[i]=b;
		}
	}

	private ButtonInterfaceRemington getAButton(int x, int y,int w,int h) {
		return new ButtonR(x, y, w, h, "",null);	
	}

	public static TextLabel getLabel() {
		return board;
	}
	
	private void changeText(String string) {
		board.setText(string);
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
	}
}