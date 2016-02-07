
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Point;
import javax.swing.BorderFactory;
import javax.swing.JPanel;

/**
 *
 * @author geco
 */
public class CanvasPanel extends JPanel {

    PointSequence ps;

    public CanvasPanel() {
        setBorder(BorderFactory.createLineBorder(Color.black));
        setBackground(Color.WHITE);
    }

    public Dimension getPreferredSize() {
        return new Dimension(300, 300);
    }

    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.setColor(Color.GRAY);
        g.drawString("Drag to draw", 10, 20);
        if (ps != null) {
            g.drawPolyline(ps.getXs(), ps.getYs(), ps.size());
        }
    }

    void drawPointSequence(PointSequence ps) {
        this.ps = ps; 
        this.repaint();
    }

}
