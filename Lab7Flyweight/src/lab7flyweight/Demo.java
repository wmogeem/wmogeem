
package lab7flyweight;
import java.util.List;
import java.util.Random;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import java.util.LinkedList;
public class Demo {

  private static String[] elements = new String[]{"Tree", "Palm", "Cloud", "Flower"};
  private JPanel panel;
  private JFrame frame;
  public Demo(){
    frame = new JFrame();
    frame.setTitle("Flyweight images");
    frame.setVisible(true);
    frame.setSize(800, 600);
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    panel = new JPanel();
    frame.add(panel);
  }
  public void addImage(ImageIcon img, int x, int y){
    JLabel label = new JLabel();
    label.setIcon(img);
    System.out.println("Adding image icon " + img.getDescription());
    System.out.println(String.format("Location (%d,%d)", x, y));
    label.setLocation(x, y);
    this.panel.add(label);
  }
    public static void main(String[] args) {
    Demo demo = new Demo();
    ImageElementsFactory factory = new ImageElementsFactory();

    List<ImageElement> elementList = new LinkedList<>();

    System.out.println(
        "Number of flyweights: " +
        factory.numberOfFlyweights());

    Random r = new Random();
    for (int i = 0; i < 10000; i++) {
      String name  = elements[r.nextInt(elements.length)] + ".png";
      ImageElement e = factory.getFlyweight(name);
      elementList.add(e);
      System.out.println("Image: " + e.getImageElement().toString());
      demo.addImage(e.getImageElement(), 200*i, 200*i);
    }

    int j = 0;

    for (ImageElement l : elementList) {
      System.out.println(l.myPosition(j++));
    }

    System.out.println(
        "Number of flyweights: " +
        factory.numberOfFlyweights());
  }
}
