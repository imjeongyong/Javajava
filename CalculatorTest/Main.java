import java.awt.Button;
import java.awt.Color;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.Panel;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.StringTokenizer;

public class Main extends WindowAdapter implements ActionListener {
	private Frame calculator;
	private TextField console;
	private Panel input;
	private Button b7, b8, b9, bd, b4, b5, b6, bmu, b1, b2, b3, bmi, bdot, b0, beq, bp;

	public Main() {
		calculator = new Frame("Calculator");
		calculator.setSize(400, 500);

		console = new TextField(10);
//		console.setText("console");

		input = new Panel(new GridLayout(4, 4));
		input.setBackground(Color.MAGENTA);

		b7 = new Button("7");
		b8 = new Button("8");
		b9 = new Button("9");
		bd = new Button("/");
		b4 = new Button("4");
		b5 = new Button("5");
		b6 = new Button("6");
		bmu = new Button("*");
		b1 = new Button("1");
		b2 = new Button("2");
		b3 = new Button("3");
		bmi = new Button("-");
		bdot = new Button(".");
		b0 = new Button("0");
		beq = new Button("=");
		bp = new Button("+");
	}

	public void windowClosing(WindowEvent e) {
		System.exit(0);
	}

	public void startFrame() {
		
		calculator.addWindowListener(this);
		calculator.add(console, "North");
		calculator.add(input, "Center");

		b7.addActionListener(this);
		b8.addActionListener(this);
		b9.addActionListener(this);
		bd.addActionListener(this);
		b4.addActionListener(this);
		b5.addActionListener(this);
		b6.addActionListener(this);
		bmu.addActionListener(this);
		b1.addActionListener(this);
		b2.addActionListener(this);
		b3.addActionListener(this);
		bmi.addActionListener(this);
		bdot.addActionListener(this);
		b0.addActionListener(this);
		beq.addActionListener(this);
		bp.addActionListener(this);

		input.add(b7);
		input.add(b8);
		input.add(b9);
		input.add(bd);
		input.add(b4);
		input.add(b5);
		input.add(b6);
		input.add(bmu);
		input.add(b1);
		input.add(b2);
		input.add(b3);
		input.add(bmi);
		input.add(bdot);
		input.add(b0);
		input.add(beq);
		input.add(bp);

		calculator.setVisible(true);
	}

	public void actionPerformed(ActionEvent e) {
		String inp = "";

		if (e.getActionCommand().equals("7")) {
			inp = inp + "7";
			console.setText(inp);
			System.out.print(inp);
		}
		if (e.getActionCommand().equals("8")) {
			inp = inp + "8";
			console.setText(inp);
			System.out.print(inp);
		}
		if (e.getActionCommand().equals("9")) {
			inp = inp + "9";
			console.setText(inp);
			System.out.print(inp);
		}
		if (e.getActionCommand().equals("4")) {
			inp = inp + "4";
			console.setText(inp);
			System.out.print(inp);
		}
		if (e.getActionCommand().equals("5")) {
			inp = inp + "5";
			console.setText(inp);
			System.out.print(inp);
		}
		if (e.getActionCommand().equals("6")) {
			inp = inp + "6";
			console.setText(inp);
			System.out.print(inp);
		}
		if (e.getActionCommand().equals("1")) {
			inp = inp + "1";
			console.setText(inp);
			System.out.print(inp);
		}
		if (e.getActionCommand().equals("2")) {
			inp = inp + "2";
			console.setText(inp);
			System.out.print(inp);
		}
		if (e.getActionCommand().equals("3")) {
			inp = inp + "3";
			console.setText(inp);
			System.out.print(inp);
		}
		if (e.getActionCommand().equals("0")) {
			inp = inp + "0";
			console.setText(inp);
			System.out.print(inp);
		}
		if (e.getActionCommand().equals("+")) {
			inp = inp + "+";
			console.setText(inp);
			System.out.print(inp);
		}
		if (e.getActionCommand().equals("-")) {
			inp = inp + "-";
			console.setText(inp);
			System.out.print(inp);
		}
		if (e.getActionCommand().equals("*")) {
			inp = inp + "*";
			console.setText(inp);
			System.out.print(inp);
		}
		if (e.getActionCommand().equals("/")) {
			inp = inp + "/";
			console.setText(inp);
			System.out.print(inp);
		}
		if (e.getActionCommand().equals(".")) {
			inp = inp + ".";
			console.setText(inp);
			System.out.print(inp);
		}
		if (e.getActionCommand().equals("=")) {
			StringTokenizer st = new StringTokenizer(inp,"+|-|*|/");
			int countTokens = st.countTokens();
			for(int i =0; i<countTokens;i++) {
				String token = st.nextToken();
				System.out.println(token);
			}
		}
	}

	public static void main(String[] args) {
		Main cal = new Main();
		cal.startFrame();
	}
}