package org.terifan.nodeeditor;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.LinearGradientPaint;
import java.awt.Paint;
import java.awt.Point;
import java.awt.Stroke;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;
import org.terifan.ui.Anchor;


public class CheckBoxNodeItem extends AbstractNodeItem
{
	private static final long serialVersionUID = 1L;

	private final static float[] RANGES = new float[]{0f,1f};

	private boolean mState;


	public CheckBoxNodeItem(String aText, boolean aState)
	{
		super(aText);

		mState = aState;
	}


	@Override
	protected void paintComponent(NodeEditorPane aEditorPane, Graphics2D aGraphics, boolean aHover)
	{
		int x = mBounds.x;
		int y = mBounds.y;
		int h = mBounds.height;
		int sx = x+1;
		int sy = y+1;
		int ss = h-1;

		Paint oldPaint = aGraphics.getPaint();

		aGraphics.setColor(new Color(48, 48, 48));
		aGraphics.fillRoundRect(x, sy, ss, ss, 8, 8);

		aGraphics.setPaint(new LinearGradientPaint(0, sy + 1, 0, sy + 2 + ss - 2, RANGES, Styles.CHECKBOX_COLORS[mState ? 1 : 0]));
		aGraphics.fillRoundRect(x + 1, sy + 1, ss - 2, ss - 2, 8, 8);

		if (mState)
		{
			Stroke stroke = aGraphics.getStroke();

			aGraphics.setColor(new Color(188,188,188));
			aGraphics.setStroke(new BasicStroke(2));

			aGraphics.drawLine(sx + ss / 4, sy + ss * 2 / 3 - ss / 4, sx + ss / 4 *2, sy + ss * 2 / 3);
			aGraphics.drawLine(sx + ss / 4 * 2, sy + ss * 2 / 3, sx + ss - 1, sy);

			aGraphics.setStroke(stroke);
		}

		aGraphics.setPaint(oldPaint);

		mTextBox
			.setBounds(mBounds)
			.setAnchor(Anchor.WEST)
			.setMargins(3, ss + 5, 0, 0)
			.setForeground(mState ? Styles.BOX_FOREGROUND_SELECTED_COLOR : Styles.BOX_FOREGROUND_COLOR)
			.setFont(Styles.SLIDER_FONT)
			.render(aGraphics);
	}


	@Override
	protected void actionPerformed(NodeEditorPane aEditorPane, Point aClickPoint)
	{
		mState = !mState;
		aEditorPane.repaint();
	}


	@Override
	protected boolean mousePressed(NodeEditorPane aEditorPane, Point aClickPoint)
	{
		return true;
	}


	@Override
	public void writeExternal(ObjectOutput aOutput) throws IOException
	{
		super.writeExternal(aOutput);

		aOutput.writeBoolean(mState);
	}


	@Override
	public void readExternal(ObjectInput aIn) throws IOException, ClassNotFoundException
	{
		super.readExternal(aIn);
	}
}