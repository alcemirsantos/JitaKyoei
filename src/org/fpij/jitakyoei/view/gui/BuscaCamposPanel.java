/*
 * Created by JFormDesigner on Tue Dec 08 21:37:20 GMT-03:00 2009
 */

package org.fpij.jitakyoei.view.gui;

import javax.swing.*;
import com.jgoodies.forms.layout.*;

/**
 * @author wansoul
 */
public class BuscaCamposPanel extends JPanel {

	private static final long serialVersionUID = 1L;
	public BuscaCamposPanel() {
		initComponents();
	}

	private void initComponents() {
		// JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
		label2 = new JLabel();
		textField1 = new JTextField();
		label1 = new JLabel();
		textField2 = new JTextField();
		CellConstraints cc = new CellConstraints();

		//======== this ========
		setName("this");
		setLayout(new FormLayout(
			"40dlu, $lcgap, default:grow",
			"default, $lgap, default"));

		//---- label2 ----
		label2.setText("Registro:");
		label2.setName("label2");
		add(label2, cc.xy(1, 1));

		//---- textField1 ----
		textField1.setName("textField1");
		add(textField1, cc.xy(3, 1));

		//---- label1 ----
		label1.setText("Nome:");
		label1.setName("label1");
		add(label1, cc.xy(1, 3));

		//---- textField2 ----
		textField2.setName("textField2");
		add(textField2, cc.xy(3, 3));
		// JFormDesigner - End of component initialization  //GEN-END:initComponents
	}

	// JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables
	private JLabel label2;
	private JTextField textField1;
	private JLabel label1;
	private JTextField textField2;
	// JFormDesigner - End of variables declaration  //GEN-END:variables
}
