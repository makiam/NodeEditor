package org.terifan.ui.resizablepanel;

import java.awt.BorderLayout;
import java.awt.Rectangle;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import org.terifan.ui.NullLayout;


public class Test
{
	public static void main(String ... args)
	{
		try
		{
			ResizablePanel panel1 = new ResizablePanel(new Rectangle(100,100,200,200), "Enter some text");
			panel1.add(new JScrollPane(new JTextArea()), BorderLayout.CENTER);

			ResizablePanel panel2 = new ResizablePanel(new Rectangle(200,200,200,200), "More text");
			panel2.add(new JScrollPane(new JTextArea()), BorderLayout.CENTER);

			JFrame frame = new JFrame();
			frame.setLayout(new NullLayout());
			frame.add(panel1);
			frame.add(panel2);
			frame.setSize(1024, 768);
			frame.setLocationRelativeTo(null);
			frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			frame.setVisible(true);
		}
		catch (Throwable e)
		{
			e.printStackTrace(System.out);
		}
	}
}
