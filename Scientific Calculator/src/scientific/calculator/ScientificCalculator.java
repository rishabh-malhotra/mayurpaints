package scientific.calculator;
import java.awt.*;
import javax.swing.*;

public class ScientificCalculator extends JFrame
{   
    public static void main(String[] args) 
    {        
        FirstJFrame ob = new FirstJFrame();
        ob.setVisible(true);
        ob.detail = 1;
        ob.about();
        ob.tfvalue = 3;
        
    }    
}
