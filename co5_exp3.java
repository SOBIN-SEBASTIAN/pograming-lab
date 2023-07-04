import java.applet.*;
import java.awt.*;
import java.awt.event.*;

public class Marks extends Applet implements ActionListener {
public void init() {
Label label1 = new Label("Enter The  Marks : ");

textField1 = new TextField(5);
textField2 = new TextField(5);
textField3 = new TextField(5);
textField4 = new TextField(5);
textField5 = new TextField(5);

Res = new Button("Result");
Res.addActionListener(this);

Label label2 = new Label("Persentage of Mark is :- ");
textField6 = new TextField(20);

add(label1);
add(textField1);
add(textField2);
add(textField3);
add(textField4);
add(textField5);
add(Res);
add(label2);
add(textField6);
}
int s,t;
public void actionPerformed(ActionEvent e) {
int u = Integer.parseInt(textField1.getText());
int v = Integer.parseInt(textField2.getText());
int w = Integer.parseInt(textField3.getText());
int x = Integer.parseInt(textField4.getText());
int y = Integer.parseInt(textField5.getText());
s=(u+v+w+x+y);
t=((s/500)*100);
textField6.setText("Result is "+t);
repaint();
}
public void paint(Graphics g)
{
g.drawOval(200,200,300,300);
g.drawOval(250,250,50,50);
g.drawOval(400,250,50,50);
if(t<50){
	g.drawArc(275,400,150,100,0,180);
}
else{
	g.drawArc(275,350,150,100,0,-180);
}

}
TextField textField1, textField2,textField3,textField4,textField5,textField6;
Button Res;
}