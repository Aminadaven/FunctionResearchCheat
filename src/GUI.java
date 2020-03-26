import java.awt.BorderLayout;
import java.awt.ComponentOrientation;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTabbedPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

@SuppressWarnings("serial")
public class GUI extends JFrame implements ActionListener {
	private JLabel qX2, qX, qY, sep, f1X2, f1X, f2X2, f2X, f2Y;
	private JTextField qA, qB, qC, f1A, f1B, f1C, f2A, f2B, f2C;
	private JButton q, r;
	private JTextArea tb;
	private JCheckBox qcpwa, qextrema, qpand, quadd, rcpwa, rextrema, rpand, ruadd, rdomain;
	private JTabbedPane tp;
	private JPanel quadratic, rational, root, exponential, f1, f2, others;
	private JScrollPane scroller;
	public GUI() {
		qX2 = new JLabel("x^2 +");
		qX = new JLabel("x +");
		qY = new JLabel("= y");
		f1X2 = new JLabel("x^2 +");
		f1X = new JLabel("x +");
		f2X2 = new JLabel("x^2 +");
		f2X = new JLabel("x +");
		f2Y = new JLabel(" = y");
		sep = new JLabel("---------");
		qA = new JTextField(2);
		qB = new JTextField(2);
		qC = new JTextField(2);
		f1A = new JTextField(1);
		f1B = new JTextField(1);
		f1C = new JTextField(1);
		f2A = new JTextField(1);
		f2B = new JTextField(1);
		f2C = new JTextField(1);
		qcpwa = new JCheckBox("נקודות חיתוך עם הצירים");
		qextrema = new JCheckBox("נגזרת");
		qpand = new JCheckBox("׳×׳—׳•׳�׳™ ׳©׳�׳™׳�׳™׳•׳× ׳•׳—׳™׳•׳‘׳™׳•׳×");
		quadd = new JCheckBox("׳×׳—׳•׳�׳™ ׳¢׳�׳™׳” ׳•׳™׳¨׳™׳“׳”");
		rcpwa = new JCheckBox("׳ ׳§׳•׳“׳•׳× ׳—׳™׳×׳•׳� ׳¢׳� ׳”׳¦׳™׳¨׳™׳�");
		rextrema = new JCheckBox("׳ ׳§׳•׳“׳× ׳§׳™׳¦׳•׳�");
		rpand = new JCheckBox("׳×׳—׳•׳�׳™ ׳©׳�׳™׳�׳™׳•׳× ׳•׳—׳™׳•׳‘׳™׳•׳×");
		ruadd = new JCheckBox("׳×׳—׳•׳�׳™ ׳¢׳�׳™׳” ׳•׳™׳¨׳™׳“׳”");
		rdomain = new JCheckBox("׳×׳—׳•׳� ׳”׳’׳“׳¨׳”");
		q = new JButton("Show me the answer!");
		r = new JButton("׳—׳©׳‘");
		tb = new JTextArea(19, 30);
		scroller = new JScrollPane(tb);
		tp = new JTabbedPane();
		quadratic = new JPanel();
		f1 = new JPanel();
		f2 = new JPanel();
		others = new JPanel();
		rational = new JPanel();
		root = new JPanel();
		exponential = new JPanel();

		qcpwa.setSelected(true);
		qextrema.setSelected(true);
		qpand.setSelected(true);
		quadd.setSelected(true);
		rcpwa.setSelected(true);
		rextrema.setSelected(true);
		rpand.setSelected(true);
		ruadd.setSelected(true);
		rdomain.setSelected(true);
		q.addActionListener(this);
		r.addActionListener(this);

		f1.setLayout(new BoxLayout(f1, BoxLayout.LINE_AXIS));
		f2.setLayout(new BoxLayout(f2, BoxLayout.LINE_AXIS));
		others.setLayout(new BoxLayout(others, BoxLayout.PAGE_AXIS));
		rational.setLayout(new BoxLayout(rational, BoxLayout.PAGE_AXIS));
		quadratic.setLayout(new BoxLayout(quadratic, BoxLayout.PAGE_AXIS));
		tp.setComponentOrientation(ComponentOrientation.RIGHT_TO_LEFT);

		quadratic.add(qA);
		quadratic.add(qX2);
		quadratic.add(qB);
		quadratic.add(qX);
		quadratic.add(qC);
		quadratic.add(qY);
		quadratic.add(qcpwa);
		quadratic.add(qextrema);
		quadratic.add(qpand);
		quadratic.add(quadd);
		quadratic.add(q);

		f1.add(f1A);
		f1.add(f1X2);
		f1.add(f1B);
		f1.add(f1X);
		f1.add(f1C);
		
		f2.add(f2A);
		f2.add(f2X2);
		f2.add(f2B);
		f2.add(f2X);
		f2.add(f2C);
		f2.add(f2Y);
		
		others.add(rdomain);
		others.add(rcpwa);
		others.add(rextrema);
		others.add(rpand);
		others.add(ruadd);
		others.add(r);
		
		rational.add(f1);
		rational.add(sep);
		rational.add(f2);
		rational.add(others);
		
		tp.addTab("Quadratic Equations", quadratic);
		/*
		tp.addTab("׳₪׳•׳ ׳§׳¦׳™׳” ׳¨׳¦׳™׳•׳ ׳�׳™׳×", rational);
		tp.addTab("׳₪׳•׳ ׳§׳¦׳™׳× ׳©׳•׳¨׳©", root);
		tp.addTab("׳₪׳•׳ ׳§׳¦׳™׳” ׳�׳¢׳¨׳™׳›׳™׳×", exponential);
		//*/
		
		add(scroller, BorderLayout.LINE_START);
		add(tp, BorderLayout.CENTER);
	}
	public static void main(String[] args) {
		GUI aminadav = new GUI();
		aminadav.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		aminadav.setTitle("Function Research Cheat by Aminadav");
		aminadav.pack();
		aminadav.setLayout(new BorderLayout());
		aminadav.setResizable(false);
		aminadav.setLocationRelativeTo(null);
		aminadav.setVisible(true);
	}
	@Override
	public void actionPerformed(ActionEvent click) {
		tb.setText("");
		double a, b, c;
		a = new Double(qA.getText());
		b = new Double(qB.getText());
		c = new Double(qC.getText());
		if(qcpwa.isSelected()) {
			cuttingPointsWithAxisX(a, b, c);
			cuttingPointWithAxisY(c);
		}
		if(qextrema.isSelected()) extrema(a, b, c);
		if(qpand.isSelected()) pand(a, b, c);
		if(quadd.isSelected()) uadd(a, b);
	}
	private void uadd(double a, double b) {
		double ezer = eXtrema(a, b);
		if(a > 0) {
			wrt("x > " + ezer + " ׳¢׳•׳�׳”");
			wrt("x < " + ezer + " ׳™׳•׳¨׳“׳×");
		}
		else {
			wrt("x < " + ezer + " ׳¢׳•׳�׳”");
			wrt("x > " + ezer + " ׳™׳•׳¨׳“׳×");
		}
		wrt("");
	}
	private void pand(double a, double b, double c) {
		double cp1, cp2;
		///**1 before and 1 after each cutting point, and for x and y;*/
		double[][] arr = new double[3][2];
		String[] ans = new String[3];
		cp1 = Math.min(cPX(a, b, c)[0], cPX(a, b, c)[1]);
		cp2 = Math.max(cPX(a, b, c)[0], cPX(a, b, c)[1]);
		arr[0][0] = cp1 - 1;
		arr[1][0] = cp1 + 1;
		arr[2][0] = cp2 + 1;
		for(int i = 0; i < 3; i++) arr[i][1] = y(a, b, c, arr[i][0]);
		if(arr[0][1] > 0) ans[0] = cp1 + " > x ׳—׳™׳•׳‘׳™";
		else ans[0] = cp1 + " > x ׳©׳�׳™׳�׳™";
		if(arr[1][1] > 0) ans[1] = cp1 + " < x < " + cp2 + " ׳—׳™׳•׳‘׳™";
		else ans[1] = cp1 + " < x < " + cp2 + " ׳©׳�׳™׳�׳™";
		if(arr[2][1] > 0) ans[2] = cp2 + " < x ׳—׳™׳•׳‘׳™";
		else ans[2] = cp2 + " < x ׳©׳�׳™׳�׳™";

		wrt(ans[0]);
		wrt(ans[1]);
		wrt(ans[2]);
		wrt("");
	}
	private double y(double a, double b, double c, double x) {
		return (a * x * x + b * x + c);
	}
	private void cuttingPointWithAxisY(double c) {
		wrt("0x^2 + 0x + " + c + " = y");
		wrt("x = 0, y = " + c);
		wrt("");
	}
	private void extrema(double a, double b, double c) {
		double ezer;
		wrt("2 * " + a + "x + " + b + " = y\'");
		wrt(2 * a + "x + " + b + " = y\'");
		wrt("");
		wrt(2 * a + "x + " + b + " = 0");
		wrt(2 * a + "x " + " = " + b * -1);
		ezer = (-1 * b) / (2 * a);
		wrt("x = " + ezer);
		wrt("");
		wrt("y = " + a + " * " + ezer + "^2 + " + b + " * " + ezer + " + " + c);
		ezer = a * Math.pow((-1 * b) / (2 * a), 2) + (b * (-1 * b) / (2 * a) + c);
		wrt("y = " + ezer);
		if(a > 0) {
			wrt("׳ ׳§׳•׳“׳× ׳�׳™׳ ׳™׳�׳•׳�");
		}
		else {
			wrt("׳ ׳§׳•׳“׳× ׳�׳§׳¡׳™׳�׳•׳�");
		}
		wrt("");
	}
	private void wrt(String str) {
		tb.setText(tb.getText() + " " + str + " \r\n");
	}
	private double[] cPX(double a, double b, double c) {
		double[] arr = new double[2];
		arr[0] = ((-1 * b) + Math.pow(-4 * a * c + b * b, 0.5)) / (2 * a);
		arr[1] = ((-1 * b) - Math.pow(-4 * a * c + b * b, 0.5)) / (2 * a);
		return arr;
	}
	/*
	private double[] eXtrema(double a, double b, double c) {
		double[] arr = new double[2];
		arr[0] = (-1 * b) / (2 * a);
		arr[1] = a * Math.pow((-1 * b) / (2 * a), 2) + (b * (-1 * b) / (2 * a) + c);
		return arr;
	}
	//*/
	private double eXtrema(double a, double b) {
		return (-1 * b) / (2 * a);
	}
	private void cuttingPointsWithAxisX(double a, double b, double c) {
		double ezer;
		wrt("a = " + a + " , b = " + b + " , c = " + c);
		wrt("");
		wrt("            -" + b + " +- (" + b + "^2 -4 * " + a + " * " + c + ")^0.5");
		wrt("x1,2 = " + "-----------------------------------------");
		wrt("                            2 * " + a);
		wrt("");
		wrt("            " + -1 * b + " +- (" + b * b + " + "+ -4 * a * c + ")^0.5");
		wrt("x1,2 = " + "--------------------------------");
		wrt("                          " + 2 * a);
		wrt("");
		ezer = -4 * a * c + b * b;
		wrt("            " + -1 * b + " +- (" + ezer + ")^0.5");
		wrt("x1,2 = " + "---------------------------");
		wrt("                      " + 2 * a);
		wrt("");
		ezer = Math.pow(-4 * a * c + b * b, 0.5);
		wrt("            " + -1 * b + " +- " + ezer);
		wrt("x1,2 = " + "----------------");
		wrt("                 " + 2 * a);
		wrt("");
		ezer = (-1 * b) + Math.pow(-4 * a * c + b * b, 0.5);
		wrt("        " + ezer);
		wrt("x1 = " + "-------");
		wrt("         " + 2 * a);
		wrt("");
		ezer = (-1 * b) - Math.pow(-4 * a * c + b * b, 0.5);
		wrt("        " + ezer);
		wrt("x2 = " + "-------");
		wrt("         " + 2 * a);
		wrt("");
		ezer = ((-1 * b) + Math.pow(-4 * a * c + b * b, 0.5)) / (2 * a);
		wrt("x1 = " + ezer + ", y1 = 0");
		ezer = ((-1 * b) - Math.pow(-4 * a * c + b * b, 0.5)) / (2 * a);
		wrt("x2 = " + ezer + ", y2 = 0");
		wrt("");
	}
}