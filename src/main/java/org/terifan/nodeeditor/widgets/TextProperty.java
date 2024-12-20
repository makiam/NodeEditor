package org.terifan.nodeeditor.widgets;

import org.terifan.nodeeditor.Direction;
import org.terifan.nodeeditor.NodeEditorPane;
import org.terifan.nodeeditor.Property;
import org.terifan.ui.Anchor;

import java.awt.*;


public class TextProperty extends Property<TextProperty> {
    private static final long serialVersionUID = 1L;


    public TextProperty(String aText) {
        super(aText);
    }


    @Override
    protected void paintComponent(NodeEditorPane aPane, Graphics2D aGraphics, boolean aHover) {
        getTextBox()
                .setBounds(getBounds())
                .setAnchor(getConnectors().isEmpty() || getConnectors().get(0).getDirection() == Direction.IN ? Anchor.WEST : Anchor.EAST)
                .render(aGraphics);
    }
}