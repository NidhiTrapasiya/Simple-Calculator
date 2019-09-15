import java.awt.*;
import java.awt.event.*;
public class Calculator implements ActionListener,WindowListener
{
    int c,n;
    String s1,s2,s3,s4,s5;
    Frame f;
    Button b,b1,b2,b3,b4,b5,b6,b7,b8,b9,b10,b11,b12,b13,b14,b15,b16;

    TextField tf;
    GridLayout g;
    Calculator()
    {
        f = new Frame("My calculator");
        //f.setLayout(new FlowLayout());
		f.setLayout(null);
        b = new Button("0");
        b.addActionListener(this);
        b1 = new Button("1");
        b1.addActionListener(this);
        b2 = new Button("2");
        b2.addActionListener(this);
        b3 = new Button("3");
        b3.addActionListener(this);
        b4 = new Button("4");
        b4.addActionListener(this);
        b5 = new Button("5");
        b5.addActionListener(this);
        b6 = new Button("6");
        b6.addActionListener(this);
        b7 = new Button("7");
        b7.addActionListener(this);
        b8 = new Button("8");
        b8.addActionListener(this);
        b9 = new Button("9");
        b9.addActionListener(this);
        b10 = new Button("+");
        b10.addActionListener(this);
        b11 = new Button("-");
        b11.addActionListener(this);
        b12 = new Button("*");
        b12.addActionListener(this);
        b13 = new Button("/");
        b13.addActionListener(this);
        b14 = new Button("%");
        b14.addActionListener(this);
        b15 = new Button("=");
        b15.addActionListener(this);
        b16 = new Button("C");
        b16.addActionListener(this);
        tf = new TextField(80);
        f.setSize(600,600);
        f.setVisible(true);
        tf.setBounds(100,100,270,70);
		b16.setBounds(400,100,70,70);
		b1.setBounds(100,400,70,70);
		b2.setBounds(200,400,70,70);
		b3.setBounds(300,400,70,70);
		b4.setBounds(100,300,70,70);
		b5.setBounds(200,300,70,70);
		b6.setBounds(300,300,70,70);
		b7.setBounds(100,200,70,70);
		b8.setBounds(200,200,70,70);
		b9.setBounds(300,200,70,70);
		b10.setBounds(100,500,70,70);
        b.setBounds(200,500,70,70);
		b11.setBounds(300,500,70,70);
		b12.setBounds(400,200,70,70);
		b13.setBounds(400,300,70,70);
		b14.setBounds(400,400,70,70);
		b15.setBounds(400,500,70,70);
		f.add(tf);
		f.add(b);
		f.add(b1);
		f.add(b2);
		f.add(b3);
		f.add(b4);
		f.add(b5);
		f.add(b6);
		f.add(b7);
		f.add(b8);
		f.add(b9);
		f.add(b10);
		f.add(b11);
		f.add(b12);
		f.add(b13);
		f.add(b14);
		f.add(b15);
		f.add(b16);
		f.addWindowListener(this);
		
    }
	public void windowOpened(WindowEvent w){}
	public void windowClosing(WindowEvent w)
	{
		System.exit(0);
	}
	public void windowClosed(WindowEvent w){}
	public void windowIconified(WindowEvent w){}
	public void windowDeiconified(WindowEvent w){}
	public void windowActivated(WindowEvent w){}
	public void windowDeactivated(WindowEvent w){}
    public void actionPerformed(ActionEvent e)
    {
        if(e.getSource()==b)
        {
            s3 = tf.getText();
            s4 = "0";
            s5 = s3+s4;
            tf.setText(s5);
        }
        if(e.getSource()==b1)
        {
            s3 = tf.getText();
            s4 = "1";
            s5 = s3+s4;
            tf.setText(s5);
        }
        if(e.getSource()==b2)
        {
            s3 = tf.getText();
            s4 = "2";
            s5 = s3+s4;
            tf.setText(s5);
        }if(e.getSource()==b3)
        {
            s3 = tf.getText();
            s4 = "3";
            s5 = s3+s4;
            tf.setText(s5);
        }
        if(e.getSource()==b4)
        {
            s3 = tf.getText();
            s4 = "4";
            s5 = s3+s4;
            tf.setText(s5);
        }
        if(e.getSource()==b5)
        {
            s3 = tf.getText();
            s4 = "5";
            s5 = s3+s4;
            tf.setText(s5);
        }
        if(e.getSource()==b6)
        {
            s3 = tf.getText();
            s4 = "6";
            s5 = s3+s4;
            tf.setText(s5);
        }
        if(e.getSource()==b7)
        {
            s3 = tf.getText();
            s4 = "7";
            s5 = s3+s4;
            tf.setText(s5);
        }
        if(e.getSource()==b8)
        {
            s3 = tf.getText();
            s4 = "8";
            s5 = s3+s4;
            tf.setText(s5);
        }
        if(e.getSource()==b9)
        {
            s3 = tf.getText();
            s4 = "9";
            s5 = s3+s4;
            tf.setText(s5);
        }
        if(e.getSource()==b10)
        {
            s1 = tf.getText();
            tf.setText("");
            c=1;
 
        }
        if(e.getSource()==b11)
        {
            s1 = tf.getText();
            tf.setText("");
            c=2;
 
        }
        if(e.getSource()==b12)
        {
            s1 = tf.getText();
            tf.setText("");
            c=3;
 
        }
        if(e.getSource()==b13)
        {
            s1 = tf.getText();
            tf.setText("");
            c=4;
 
        }
        if(e.getSource()==b14)
        {
            s1 = tf.getText();
            tf.setText("");
            c=5;
 
        }
        if(e.getSource()==b15)
        {
            s2 = tf.getText();
            if(c==1)
            {
                n = Integer.parseInt(s1)+Integer.parseInt(s2);
                tf.setText(String.valueOf(n));
            }
            else
            if(c==2)
            {
                n = Integer.parseInt(s1)-Integer.parseInt(s2);
                tf.setText(String.valueOf(n));
            }
            else
            if(c==3)
            {
                n = Integer.parseInt(s1)*Integer.parseInt(s2);
                tf.setText(String.valueOf(n));
            }
            if(c==4)
            {
                try
                {
                    int p=Integer.parseInt(s2);
                    if(p!=0)
                    {
                      n = Integer.parseInt(s1)/Integer.parseInt(s2);
                      tf.setText(String.valueOf(n));
                     }
                     else
                        tf.setText("infinite");
 
                }
                catch(Exception i){}
            }
            if(c==5)
            {
                n = Integer.parseInt(s1)%Integer.parseInt(s2);
                tf.setText(String.valueOf(n));
            }
        }
        if(e.getSource()==b16)
        {
            tf.setText("");
        }
		
    }
 
    public static void main(String[] abc)
    {
        Calculator v = new Calculator();
    }
}