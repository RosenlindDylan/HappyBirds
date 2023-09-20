import javax.swing.*;
import javax.swing.border.LineBorder;
import java.awt.*;


public class swing {
    static final int MIN_POW = 0;
    static final int MAX_POW = 100;
    static final int INIT_POW = 1;
    
    public static void main(String[] args) {
        JFrame frame = new JFrame("Swing!");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500, 500);

        // panel for the aim angle text
        JPanel panel1 = new JPanel();
        panel1.setLayout(new BorderLayout());
        LineBorder lineBorder = new LineBorder(Color.BLACK, 2);
        panel1.setBorder(lineBorder);

        // panel for pow slider???
        JPanel panel2 = new JPanel();
        panel2.setLayout(new BorderLayout());
        LineBorder lineBorder2 = new LineBorder(Color.BLACK, 2);
        panel2.setBorder(lineBorder2);

        JTextArea aimAngleText = new JTextArea("Aim angle: ");
        aimAngleText.setEditable(false);

        JTextArea powAngleText = new JTextArea("Power angle: ");
        powAngleText.setEditable(false);
        
        JSlider powSlider = new JSlider(JSlider.HORIZONTAL, MIN_POW, MAX_POW, INIT_POW);

        powSlider.setMajorTickSpacing(10);
        powSlider.setMinorTickSpacing(1);
        powSlider.setPaintTicks(true);
        powSlider.setPaintLabels(true);

        panel1.add(aimAngleText, BorderLayout.CENTER);
        panel2.add(powSlider, BorderLayout.CENTER);

        frame.add(panel1);
        frame.add(panel2);
        frame.setVisible(true);

    }
}

