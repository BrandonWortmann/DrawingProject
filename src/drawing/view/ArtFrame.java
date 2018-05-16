package drawing.view;

import javax.swing.JFrame;
import drawing.controller.DrawingController;

public class ArtFrame extends JFrame
{
	private ArtPanel appPanel;
	private DrawingController app;
	
	public ArtFrame(DrawingController app)
	{
		super();
		appPanel = new ArtPanel(app);
		this.app = app;
		
		setupFrame();
	}
	
	private void setupFrame()
	{
		this.setSize(1200,700);
		this.setContentPane(appPanel);
		this.setTitle("Creating modern art in Java");
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setVisible(true);
		
	}

}
