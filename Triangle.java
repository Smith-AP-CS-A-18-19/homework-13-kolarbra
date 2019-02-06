import java.awt.geom.Rectangle2D;
/* All SmithShape triangles have one edge that is on
 * the horizontal and are defined by the angle (in degrees)
 * of the lower left corner.
 */

public class Triangle implements SmithShape {

   private int x;
   private int y;
   private int w;
   private int h;
   private double a;

/* The constructor for the Triangle object should be as below.
 * You may change the names of the parameters, but their order
 * must remain the same for the assignment to be scored
 * correctly
 */
 public Triangle(int xCoord, int yCoord, int width, int height, double angle) {
   x = xCoord;
   y = yCoord;
   w = width;
   h = height;
   a = angle;
 }

/* You will need to add a getAngle() method that returns
 * the angle of the triangle
 */

 public int getX() {
   return x;
 }

 public int getY() {
   return y;
 }

 public int getWidth() {
   return w;
 }

 public int getHeight() {
   return h;
 }

 public double getArea() {
   return w * h / 2;
 }

 public double getAngle() {
   return a;
 }

/* Add the method toSquare() to the Triangle class. This creates
 * and returns a new Rectangle2D object. The x and y of the new
 * Rectangle should be the same as the Triangle. The width and
 * height of the Rectangle2D should be the same (it is a square)
 * and the area should be equal to the area of the Triangle
 */

 public Rectangle2D toSquare() {
   Rectangle2D rect = new Rectangle2D.Double();
   double len = Math.sqrt(getArea());
   rect.setRect(x, y, len, len);
   return rect;
 }

/* Override the method toString(). It should return
 * the String:
 * Width: width
 * Height: height
 * Angle: angle
 * Remember that to insert a new line into a String,
 * use \n
 */

 @Override
 public String toString() {
   String to = "Width: " + w + "\nHeight: " + h + "\nAngle: " + a;
   return to;
 }

}
