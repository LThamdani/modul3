import javax.swing.*;

public class GuiByText extends JFrame {
    GuiByText(){
        setSize(640, 480);
        setLocationRelativeTo(null);
        setTitle("GuiByText");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        GuiByText GuiByText = new GuiByText();
        GuiByText.setVisible(true);
    }
}