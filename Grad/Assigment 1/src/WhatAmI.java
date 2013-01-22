package problem_3;

import java.awt.Component;
import java.awt.Dimension;
import java.awt.Frame;
import java.awt.Point;
import java.net.InetAddress;

public class WhatAmI extends Frame {
	public WhatAmI() {
		SymWindow aSymWindow = new SymWindow();
		this.addWindowListener(aSymWindow);
		SymAction lSymAction = new SymAction();
		
		goButton.addActionListener(lSymAction);
		setLayout(null);
		setSize(405, 305);
		setVisible(false);
		goButton.setLabel("Go");
		add(goButton);
		goButton.setBackground(java.awt.Color.lightGray);
		goButton.setBounds(48, 48, 69, 30);
		
		add(firstName);
		firstName.setBounds(48, 132, 208, 25);
		
		add(lastName);
		lastName.setBounds(48, 192, 209, 28);
		
		firstNameLabel.setText("First Name");
		add(firstNameLabel);
		firstNameLabel.setBounds(48, 96, 100, 40);
		lastNameLabel.setText("Last Name");
		add(lastNameLabel);
		lastNameLabel.setBounds(48, 156, 100, 40);
		setTitle("Problem 3");
	}

	public WhatAmI(String title) {
		this();
		setTitle(title);

	}

	public static void main(String[] args) {
		try {
			(new WhatAmI()).setVisible(true);
		} catch (Throwable t) {
			System.err.println(t);
			t.printStackTrace();
			//Ensure the application exits with an error condition.
			System.exit(1);
		}
	}

	public void addNotify() {
		// Record the size of the window prior to calling parents addNotify.
		Dimension d = getSize();

		super.addNotify();

		if (fComponentsAdjusted)
			return;

		// Adjust components according to the insets
		setSize(getInsets().left + getInsets().right + d.width, getInsets().top
				+ getInsets().bottom + d.height);
		Component components[] = getComponents();
		for (int i = 0; i < components.length; i++) {
			Point p = components[i].getLocation();
			p.translate(getInsets().left, getInsets().top);
			components[i].setLocation(p);
		}
		fComponentsAdjusted = true;
	}

	// Used for addNotify check.
	boolean fComponentsAdjusted = false;

	java.awt.Button goButton = new java.awt.Button();

	java.awt.TextField firstName = new java.awt.TextField();

	java.awt.TextField lastName = new java.awt.TextField();

	java.awt.Label firstNameLabel = new java.awt.Label();

	java.awt.Label lastNameLabel = new java.awt.Label();

	class SymWindow extends java.awt.event.WindowAdapter {
		public void windowClosing(java.awt.event.WindowEvent event) {
			Object object = event.getSource();
			if (object == WhatAmI.this)
				Frame1_WindowClosing(event);
		}
	}

	void Frame1_WindowClosing(java.awt.event.WindowEvent event) {
		Frame1_WindowClosing_Interaction1(event);
	}

	void Frame1_WindowClosing_Interaction1(java.awt.event.WindowEvent event) {
		try {
			System.exit(0);
		} catch (Exception e) {
		}
	}

	class SymAction implements java.awt.event.ActionListener {
		public void actionPerformed(java.awt.event.ActionEvent event) {
			Object object = event.getSource();
			if (object == goButton)
				goButton_ActionPerformed(event);
		}
	}

	//****************************************************************************
	//End of ignorable code
	//****************************************************************************

	void goButton_ActionPerformed(java.awt.event.ActionEvent event) {
		// Do nothing
	}

}
