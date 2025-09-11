package TCS_CodeVita;

import java.util.*;

public class FruitBowl {
    static class Point implements Comparable<Point> {
        int x, y;
        Point(int x, int y){ this.x = x; this.y = y; }
        public int compareTo(Point p) {
            if (this.x != p.x) return this.x - p.x;
            return this.y - p.y;
        }
    }
    // Returns negative if right turn (or straight), positive if left turn
    static int orientation(Point a, Point b, Point c) {
        return (b.x - a.x) * (c.y - b.y) - (b.y - a.y) * (c.x - b.x);
    }
    static double distance(Point a, Point b) {
        return Math.sqrt((a.x-b.x)*(a.x-b.x) + (a.y-b.y)*(a.y-b.y));
    }
    static List<Point> lowerHull(Point[] pts) {
        Arrays.sort(pts);
        List<Point> hull = new ArrayList<>();
        for (Point p : pts) {
            while (hull.size() >= 2 && orientation(hull.get(hull.size()-2), hull.get(hull.size()-1), p) < 0) {
                hull.remove(hull.size()-1);
            }
            hull.add(p);
        }
        // Filter: only the unique sequence from the leftmost to the rightmost (no closing)
        return hull;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Point[] pts = new Point[n];
        for (int i = 0; i < n; i++) {
            pts[i] = new Point(sc.nextInt(), sc.nextInt());
        }
        List<Point> hull = lowerHull(pts);
        double peri = 0;
        for (int i = 1; i < hull.size(); i++)
            peri += distance(hull.get(i-1), hull.get(i));
        System.out.println(Math.round(peri));
    }
}
