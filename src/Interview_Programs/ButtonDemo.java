package Interview_Programs;

import java.awt.Button;
import java.awt.Font;
import java.awt.Frame;
import java.awt.Label;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ButtonDemo {

	public static void main(String[] args) {

		Frame f = new Frame("Button  Event");
		Label l = new Label("Details of Parents");
		l.setFont(new Font("Calibri", Font.BOLD, 16));
		Label n1 = new Label();
		Label d1 = new Label();
		Label a1 = new Label();

		l.setBounds(20, 20, 500, 50);
		n1.setBounds(20, 110, 500, 30);
		d1.setBounds(20, 150, 500, 30);
		a1.setBounds(20, 190, 500, 30);

		Button mb = new Button("Mother");
		mb.setBounds(20, 70, 50, 30);
		mb.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				{
					n1.setText("NAME:" + "    " + "DINGI");
					d1.setText("DESIGNATION:" + "   " + "Professor");
					a1.setText("AGE:" + "    " + "42");
				}

			}
		});

		Button fb = new Button("Father");
		fb.setBounds(80, 70, 50, 30);
		fb.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				n1.setText("NAME:" + "    " + "DINGA");
				d1.setText("DESIGNATION:" + "   " + "MANAGER");
				a1.setText("AGE:" + "    " + "44");

			}

		});

		f.add(mb);
		f.add(fb);
		f.add(l);
		f.add(n1);
		f.add(d1);
		f.add(a1);

		f.setSize(250, 250);
		f.setLayout(null);
		f.setVisible(true);

	}
}
