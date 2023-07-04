import java.awt.*;
import java.applet.*;
import java.awt.event.*;
public class House extends Applet implements MouseListener
{
 int a,b;
 public void init()
 {
 addMouseListener( this);
 }
 public void paint(Graphics g)
 {
 int x[]={125,475,300};
 int y[]={150,150,50};
 g.drawPolygon(x,y,3);
 g.setColor(Color.GRAY);
 g.fillPolygon(x,y,3);
 g.drawRect(150,150,300,200);
 g.setColor(Color.MAGENTA);
 g.fillRect(150,150,300,200);
 g.drawRect(310,220,50,75);
g.setColor(Color.GRAY);
 g.fillRect(310,220,50,75);
 g.drawRect(200,200,75,150);
 g.setColor(Color.blue);
 g.fillRect(200,200,75,150);
 if(a>200 && a<300 && b>200 && b<300)
 {
 g.setColor(Color.red);
 g.fillRect(200, 200, 75, 150);
 }
 }
 public void mouseClicked(MouseEvent e)
 {
 }
 public void mouseEntered(MouseEvent e)
 {
 }
 @Override
 public void mouseExited(MouseEvent e) {
 }
 public void mousePressed(MouseEvent e)
 {
 a=e.getX();
 b=e.getY();
 repaint();
 }
 public void mouseReleased(MouseEvent e)
 {
 }
}
