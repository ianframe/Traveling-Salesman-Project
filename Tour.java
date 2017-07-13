public class Tour {

    // creates an empty tour
    public Tour()                                    
    {}
    // creates the 4-point tour a->b->c->d->a (for debugging)
    public Tour(Point a, Point b, Point c, Point d)  
    {}
    // returns the number of points in this tour
    public int size()
    {return 0;}
    
    // returns the length (total distance) of this tour
    public double length()
    {return 0.0;}
    
    // returns a string representation of this tour
    public String toString()
    {return null;}
    
    // draws this tour to standard drawing
    public void draw()
    {}
    
    // inserts p using the nearest neighbor heuristic
    public void insertNearest(Point p)
    {}
    
    // inserts p using the smallest increase heuristic
    public void insertSmallest(Point p)                   
    {}
    
    //tests this class by directly calling all constructors and methods
    public static void main(String[] args)
    {}
}
