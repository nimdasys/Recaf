package me.coley.recaf.ui.component.action;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JMenuItem;

/**
 * Menu item with associated runnable action called when the item is pressed.
 * 
 * @author Matt
 */
@SuppressWarnings("serial")
public class ActionMenuItem extends JMenuItem {
	public ActionMenuItem(String text, Runnable action) {
		this(text, new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				action.run();
			}
		});
	}

	public ActionMenuItem(String text, ActionListener action) {
		super(text);
		addActionListener(action);
	}
}
