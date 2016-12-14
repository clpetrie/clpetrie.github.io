import java.applet.*;
import java.awt.*;
import java.awt.event.*;

public class codeman extends Applet implements ActionListener {
    public void init() {
	button1 = new Button("Button 1");
	add(button1);
	button1.addActionListener(this);

	button2 = new Button("Button 2");
	add(button2);
	button2.addActionListener(this);
    }

    public void actionPerformed(ActionEvent e) {
	if (e.getSource() == button1) 
	    System.out.println("Button 1 was pressed");
	else
	    System.out.println("Button 2 was pressed");
    }

    TextArea answers = new TextArea("I am ready for your first trip.", // Initial text 8,                                 // Number of rows
				    60,                                // Number of columns
				    TextArea.SCROLLBARS_NONE           // Do not include scroll bars
				    );

    Button button1, button2;
}