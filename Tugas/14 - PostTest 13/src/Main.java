import javax.swing.SwingUtilities;

public class Main {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            Kalkulator frame = new Kalkulator();
            frame.setVisible(true);
        });
    }
}
