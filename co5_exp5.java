import java.awt.*;
import java.awt.event.*;
public class  cal1 extends Frame implements ActionListener
{
	TextField tInput;
	Panel panel;
	String btnString[]={"7","8","9","+","4","5","6","-","3","2","1","*","c","0","=","/"};
	Button btn[] = new Button[16];
	int num1,num2,res=0;
	char op;
	public cal1(){
		tInput = new TextField(10);
		panel = new Panel();
		add(tInput,"North");
		add(panel,"Center");
		panel.setLayout(new GridLayout(4,4));
		for (int i=0;i<16;i++){
			btn[i]=new Button(btnString[i]);
			btn[i].addActionListener(this);
			panel.add(btn[i]);
		}
		addWindowListener(new WindowAdapter(){
			public void windowClosing(WindowEvent we){
				System.exit(0);
			}
	});
	
	}
	public void actionPerformed(ActionEvent ae){
		String str = ae.getActionCommand();
		if (str.equals('+')){
			op='+';
			num1=Integer.parseInt(tInput.getText());
		}
		else if (str.equals('-')){
			op='-';
			num1=Integer.parseInt(tInput.getText());
		}
		else if (str.equals('/')){
			op='/';
			num1=Integer.parseInt(tInput.getText());
		}
		else if (str.equals('*')){
			op='*';
			num1=Integer.parseInt(tInput.getText());
		}
		else if (str.equals('=')){
			num1=Integer.parseInt(tInput.getText());
			switch (op){
				case '+':
				
			}
		}
	}
	public static void main (String Args[]){
		cal1 c=new cal1();
		c.setTitle("Calculator");
		c.setSize(300, 300);
		c.setVisible(true);
	}
}