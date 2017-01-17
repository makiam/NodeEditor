package org.terifan.nodeeditor;

import java.awt.Color;
import java.awt.Font;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;


public class Styles
{
	private final static int a = 220;
	private final static int b = 254; // alpha must be less than 255 to force Java to blend alpha correctly!

//	public final static float CONNECTOR_STROKE_WITH_INNER = 1.4f;
//	public final static float CONNECTOR_STROKE_WIDTH_OUTER = 3.0f;
	public final static float CONNECTOR_STROKE_WIDTH_INNER = 1.75f;
	public final static float CONNECTOR_STROKE_WIDTH_OUTER = 4.0f;
	public final static Color CONNECTOR_COLOR_OUTER = new Color(30, 30, 30);
	public final static Color CONNECTOR_COLOR_INNER_FOCUSED = new Color(255, 255, 255);
	public final static Color CONNECTOR_COLOR_INNER = new Color(128, 128, 128);
	public final static Color CONNECTOR_COLOR_INNER_SELECTED = new Color(192, 0, 0);
	public final static Color CONNECTOR_COLOR_OUTER_SELECTED = new Color(128, 0, 0);
	public final static Color CONNECTOR_COLOR_INNER_DRAGGED = new Color(240, 160, 62);

	public final static int TITLE_HEIGHT = 20;
	public final static int TITLE_HEIGHT_PADDED = TITLE_HEIGHT + 5;
	public final static int BORDE_RADIUS = 18;
	public final static int BUTTON_WIDTH = 16;
	public final static Color BOX_FOREGROUND_COLOR = new Color(0, 0, 0, b);
	public final static Color BOX_FOREGROUND_ARMED_COLOR = new Color(255, 255, 255);
	public final static Color BOX_FOREGROUND_SELECTED_COLOR = new Color(255, 255, 255, b);
	public final static Color BOX_BACKGROUND_COLOR = new Color(90, 90, 90, a);
	public final static Color BOX_BACKGROUND_SELECTED_COLOR = new Color(90, 90, 90, a);
	public final static Color BOX_BORDER_COLOR = new Color(37, 37, 37, a);
	public final static Color BOX_BORDER_SELECTED_COLOR = new Color(208, 145, 66);
	public final static Color BOX_BORDER_TITLE_COLOR = new Color(77, 77, 77, a);
	public final static Color BOX_BORDER_TITLE_SEPARATOR_COLOR = new Color(68,68,68, 128);
	public final static Color BOX_TITLE_TEXT_SHADOW_COLOR = new Color(90, 90, 90, a);
	public final static Color PANE_BACKGROUND_COLOR = new Color(57, 57, 57);
	public final static Color PANE_GRID_COLOR_1 = new Color(47, 47, 47);
	public final static Color PANE_GRID_COLOR_2 = new Color(41, 41, 41);
	public final static Color PANE_GRID_COLOR_3 = new Color(30, 30, 30);
	public final static Color PANE_SELECTION_RECTANGLE_LINE = new Color(255, 255, 255);
	public final static Color PANE_SELECTION_RECTANGLE_BACKGROUND = new Color(255, 255, 255, 15);
	public final static int MIN_WIDTH = 80;

	public final static Font BOX_FONT = new Font("Segoe UI", Font.PLAIN, 12);
	public final static Font BOX_ITEM_FONT = new Font("Segoe UI", Font.PLAIN, 12);
	public final static Font SLIDER_FONT = new Font("Segoe UI", Font.PLAIN, 10);
	public final static Color SLIDER_BORDER_COLOR = new Color(48, 48, 48);
	public final static Color SLIDER_ARROW_COLOR = new Color(118, 118, 118);
	public final static Color COMBOBOX_ARROW_COLOR = new Color(190,190,190);

	public final static Color[][][] SLIDER_COLORS =
	{
		// normal
		{
			new Color[]{new Color(159,159,159), new Color(179,179,179)},
			new Color[]{new Color(126, 126, 126), new Color(107,107,107)},
			new Color[]{BOX_FOREGROUND_COLOR, BOX_FOREGROUND_COLOR}
		},
		// hover
		{
			new Color[]{new Color(174,174,174), new Color(194,194,194)},
			new Color[]{new Color(127,127,127), new Color(147,147,147)},
			new Color[]{BOX_FOREGROUND_COLOR, BOX_FOREGROUND_COLOR}
		},
		// armed
		{
			new Color[]{new Color(132,132,132), new Color(152,152,152)},
			new Color[]{new Color(107,107,107), new Color(127,127,127)},
			new Color[]{BOX_FOREGROUND_ARMED_COLOR, BOX_FOREGROUND_ARMED_COLOR}
		}
	};

	public final static Color[][] CHECKBOX_COLORS =
	{
		// normal
		new Color[]{new Color(83,83,83),new Color(55,55,55)},
		// selected
		new Color[]{new Color(55,55,55),new Color(83,83,83)}
	};

	static Color[][] BUTTON_COLORS =
	{
		new Color[]{new Color(166,166,166),new Color(137,137,137)},
		new Color[]{new Color(181,181,181),new Color(153,153,153)},
		new Color[]{new Color(85,85,85),new Color(113,113,113)}
	};

	public static int POPUP_FOOTER_HEIGHT = 5;
	public static int POPUP_HEADER_HEIGHT = 35;
	public static int POPUP_DEFAULT_OPTION_HEIGHT = 20;
	public static Color POPUP_FOREGROUND = new Color(255, 255, 255);
	public static Color POPUP_HEADER_FOREGROUND = new Color(128,128,128);
	public static Color POPUP_SELECTION_BACKGROUND = new Color(255, 0, 0, 128);
	public static Color POPUP_HEADER_LINE = new Color(55, 55, 55);
	public static Color POPUP_BACKGROUND = new Color(16,16,16, 220);

	public static BufferedImage DIRECTORY_ICON;

	static
	{
		try
		{
			DIRECTORY_ICON = ImageIO.read(ButtonNodeItem.class.getResource("directory.png"));
		}
		catch (IOException e)
		{
			e.printStackTrace(System.err);
			System.exit(0);
		}
	}
}
