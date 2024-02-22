package studio4;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import javax.swing.JFileChooser;
import javax.swing.SwingUtilities;

import edu.princeton.cs.introcs.StdDraw;

/**
 * @author Dennis Cosgrove (http://www.cse.wustl.edu/~cosgroved/)
 */
public class InterpretDrawingFile {

	public static void main(String[] args) throws FileNotFoundException {
		JFileChooser chooser = new JFileChooser("resources");
		chooser.showOpenDialog(null);
		File f = new File(chooser.getSelectedFile().getPath());
		Scanner in = new Scanner(f); //f because read file
	
    String type = in.next();
    int r = in.nextInt();
    int g = in.nextInt();
    int b  = in.nextInt();
	boolean filled = in.next() != null; 
	
	double x = in.nextDouble();
	double y = in.nextDouble();

	double halfWidth = in.nextDouble();
	double halfHeigh = in.nextDouble();
	StdDraw.setPenColor(r,g,b);
	
	String ellipse = "ellipse";
	String rectangle = "rectangle";
	String triangle = "triangle";
	
	if (type.equals(ellipse)) {
		if (filled ==true)
		{
		StdDraw.filledEllipse(x, y, halfWidth, halfHeigh);
		}
		else {
		StdDraw.ellipse(x, y, halfWidth, halfHeigh);
		}
	}
		
		else if (type.equals(rectangle)) {
			if (filled ==true)
			{
			StdDraw.filledRectangle(x, y, halfWidth, halfHeigh);
			} 
			else {
			StdDraw.rectangle(x, y, halfWidth, halfHeigh);
			}
		}
	}
	
}
