package Water;

import javax.swing.*;

public class Water
{
    public static void main(String[] args)
    {
        String Weight;
        String Exercise;
        int Num1;
        int Num2;

        Weight = JOptionPane.showInputDialog("How much do you Weight?");
        Num1 = Integer.parseInt(Weight);
        
        double Water = (Num1) * 0.666;

        JOptionPane.showMessageDialog(null,"You should drink  Oz of water a day" + Water);
    }
}
