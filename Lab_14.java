import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class Lab_14 extends Frame {
    public Lab_14(){
        setTitle("Sum");
        setLayout(null);
        setSize(300,300);

        TextField a= new TextField();
        TextField b= new TextField();
        TextField c= new TextField();

        Label firstLabel = new Label("First Num");
        firstLabel.setBounds(30,50,50,25);

        Label secondLabel = new Label("Second Num");
        secondLabel.setBounds(30,90,50,25);

        Label thirdLabel = new Label("Sum");
        thirdLabel.setBounds(30,120,50,25);

        a.setBounds(150,50,50,20);
        b.setBounds(150,85,50,20);
        c.setBounds(150,120,50,20);


        Button calc = new Button("Calculate");
        calc.setBounds(150,150,70,20);
        Button clear = new Button("Clear");
        clear.setBounds(150,175,50,20);

        add(clear);
        add(calc);
        add(firstLabel);
        add(secondLabel);
        add(thirdLabel);
        add(a);
        add(b);
        add(c);
        setVisible(true);
        calc.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int num1 = Integer.parseInt(a.getText());
                int num2 = Integer.parseInt(b.getText());
                String sum = String.valueOf(num1+ num2);
                c.setText(sum);
        }});
        clear.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                a.setText(null);
                b.setText(null);
                c.setText(null);
            }
        });
        addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
    }

    public static void main(String[] args) {
        Lab_14 n = new Lab_14();
    }
}
