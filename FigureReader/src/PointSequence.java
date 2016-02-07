
import java.awt.Point;
import java.util.ArrayList;

public class PointSequence {
    private ArrayList<Point> points;
    int[] xs;
    int[] ys;
    private int period;
    
    public PointSequence(int period){
        this.period = period;
        this.points = new ArrayList<Point>();
        this.xs = new int[]{0};
        this.ys = new int[]{0};
    }

    void addPoint(Point p) {
        points.add(p);
    }
    public int size(){
        return points.size();
    }
    public int[] getXs(){
        if(this.xs.length==points.size()) return xs;
        int[] xs = new int[points.size()];
        for (int i = 0; i < xs.length; i++) {
            xs[i] = (int) points.get(i).getX();
        }
        this.xs=xs;
        return xs;
    }
   public int[] getYs(){
       if(this.ys.length==points.size()) return ys;
        int[] ys = new int[points.size()];
        for (int i = 0; i < ys.length; i++) {
            ys[i] = (int) points.get(i).getY();
        }
        this.ys = ys;
        return ys;
    }
}
