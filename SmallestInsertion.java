import java.io.File;
import java.util.Scanner;
import java.io.FileNotFoundException; 

/*************************************************************************
 *  YOU DO NOT NEED TO MODIFY THIS FILE
 *
 *  Dependencies: java.util.Scanner StdDraw.java
 *
 *  Run nearest neighbor insertion heuristic for traveling
 *  salesperson problemand plot results. Pass the name of the text file
 *  located inside ./input as a command line argument.
 *
 *  % java SmallestInsertion tsp1000.txt
 *
 *************************************************************************/

public class SmallestInsertion {

    public static void main(String[] args) throws FileNotFoundException{

        File f = new File("./input/" + args[0]);
        Scanner s = new Scanner(f);

        // get dimensions
        String[] dimensions = s.nextLine().split(" ");
        int width = Integer.parseInt(dimensions[0]);
        int height = Integer.parseInt(dimensions[1]);
        int border = 20;
        StdDraw.setCanvasSize(width, height + border);
        StdDraw.setXscale(0, width);
        StdDraw.setYscale(-border, height);

        // turn on animation mode
        StdDraw.enableDoubleBuffering();

        // run smallest insertion heuristic
        Tour tour = new Tour();
        s.reset();
        while (s.hasNextDouble()) {
            double x = Double.parseDouble(s.next());
            double y = Double.parseDouble(s.next());
            Point p = new Point(x, y);
            tour.insertSmallest(p);

            // uncomment the lines below to animate
            // StdDraw.clear();
            // tour.draw();
            // StdDraw.textLeft(20, 0, "length = " + tour.length());
            // StdDraw.show();
            // StdDraw.pause(50);
        }

        // draw to standard draw
        tour.draw();
        StdDraw.show();
        
        // print tour to standard output
        StdOut.println(tour);
        StdOut.printf("Tour length = %.4f\n", tour.length());
        StdOut.printf("Number of points = %d\n", tour.size());
    }

}
