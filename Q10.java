import javax.swing.*;

public class Q10 {
    public static void main(String[] args) {
        String name= JOptionPane.showInputDialog("what is your name?");
        String A= JOptionPane.showInputDialog(name+": what do you want me to do ?");
        System.out.println("I'm afraid I can't do it.");
        System.out.println(name);
    }
}
