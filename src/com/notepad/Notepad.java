package com.notepad;

import javax.swing.*;

import java.awt.Color;
import java.awt.event.*;

/**
 * @author Mitodru
 */

public class Notepad implements ActionListener {
	JFrame f;
	JMenuBar mb;
	JMenu file, edit, help, color;
	JMenuItem cut, copy, paste, selectAll, wrapText, blue, red, cyan;
	JTextArea ta;

	Notepad() {
		f = new JFrame();

		cut = new JMenuItem("cut");
		copy = new JMenuItem("copy");
		paste = new JMenuItem("paste");
		selectAll = new JMenuItem("selectAll");
		wrapText = new JMenuItem("wrapText");

		blue = new JMenuItem("Blue");
		red = new JMenuItem("Red");
		cyan = new JMenuItem("Cyan");

		cut.addActionListener(this);
		copy.addActionListener(this);
		paste.addActionListener(this);
		selectAll.addActionListener(this);
		wrapText.addActionListener(this);
		blue.addActionListener(this);
		red.addActionListener(this);
		cyan.addActionListener(this);

		mb = new JMenuBar();
		mb.setBounds(5, 5, 400, 40);

		file = new JMenu("File");
		edit = new JMenu("Edit");
		help = new JMenu("Help");
		color = new JMenu("TextColor");

		edit.add(cut);
		edit.add(copy);
		edit.add(paste);
		edit.add(selectAll);
		edit.add(wrapText);

		color.add(blue);
		color.add(red);
		color.add(cyan);
		mb.add(file);
		mb.add(edit);
		mb.add(help);
		mb.add(color);

		ta = new JTextArea();
		ta.setBounds(5, 30, 460, 460);

		f.add(mb);
		f.add(ta);

		f.setLayout(null);
		f.setSize(500, 500);
		f.setVisible(true);
	}

	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == cut)
			ta.cut();
		if (e.getSource() == paste)
			ta.paste();
		if (e.getSource() == copy)
			ta.copy();
		if (e.getSource() == selectAll)
			ta.selectAll();
		if (e.getSource() == wrapText)
			ta.setWrapStyleWord(true);
		if (e.getSource() == blue)
			ta.setSelectedTextColor(Color.BLUE);
		if (e.getSource() == red)
			ta.setSelectedTextColor(Color.RED);
		if (e.getSource() == cyan)
			ta.setSelectedTextColor(Color.CYAN);
	}

	public static void main(String[] args) {
		new Notepad();
	}
}
