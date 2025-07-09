import java.awt.Color;
import java.awt.Font;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class WelcomePage {
    
    JFrame frame = new JFrame();
    JLabel welcomeLabel = new JLabel("Hello");

    WelcomePage(String userID){

        if (userID.equals("Caleb")){
            welcomeLabel.setText("Hello " + userID + ", now you have an inner banana!");
        }
        else if(userID.equals("Ricardo")){
            welcomeLabel.setText("Fala "+userID+",o maior Sheik das Arabias!");
        }
        else{
            welcomeLabel.setText("Hello " + userID);
        }

        welcomeLabel.setBounds(10, 150, 450, 70);

        welcomeLabel.setForeground(Color.YELLOW);
        welcomeLabel.setFont(new Font(null, Font.PLAIN, 20));

        frame.getContentPane().setBackground(Color.DARK_GRAY);
        frame.add(welcomeLabel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(420, 420);
        frame.setLayout(null);
        frame.setVisible(true);
    }
}
