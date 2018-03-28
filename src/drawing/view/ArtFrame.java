package drawing.view;

import javax.swing.JFrame;
import javax.swing.JPanel;
import drawing.controller.DrawingController;

public class ArtFrame extends JFrame
{
	private DrawingController appController;
	private ArtPanel artPanel;
	
	public ArtFrame(DrawingController appController)
	{
		super();
		this.appController = appController;
	}

}
