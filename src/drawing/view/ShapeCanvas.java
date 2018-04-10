package drawing.view;

import java.awt.*;
import java.awt.geom.Ellipse2D;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

import javax.imageio.ImageIO;
import javax.swing.JFileChooser;
import javax.swing.JPanel;

import drawing.controller.DrawingController;

public class ShapeCanvas extends JPanel
{
	private ArrayList<Polygon> triangleList;
	private ArrayList<Polygon> polygonList;
	private ArrayList<Ellipse2D> ellipsList;
	private ArrayList<Rectangle> rectangleList;
	private DrawingController app;
	
	private BufferedImage canvasImage;
	
	public ShapeCanvas(DrawingController app)
	{
		super();
		this.app = app;
		triangleList = new ArrayList<Polygon>();
		polygonList = new ArrayList<Polygon>();
		ellipsList = new ArrayList<Ellipse2D>();
		rectangleList = new ArrayList<Rectangle>();
		
		canvasImage = new BufferedImage(600, 600, BufferedImage.TYPE_INT_ARGB);
		this.setMinimumSize(new Dimension(600, 600));
		this.setPreferredSize(new Dimension(600, 600));
		this.setMaximumSize(getPreferredSize());
	}
	
	public void addShape(Shape current)
	{
		
	}
	
	public void clear()
	{
		
	}
	
	public void changeBackground()
	{
		
	}
	
	public void save()
	{
		
	}
	
	private Color randomColor()
	{
		return null;
	}
	
	private void updateImage()
	{
		
	}
	
	protected void paintComponent(Graphics graphics)
	{
		
	}
	

}
