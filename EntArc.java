//package www
//AutoCAD Entity--Arc
import java.util.*;
//import java.util.HashMap;

/**
*@author David Wu<809758521@qq.com>
*@version 0.5
*/
public class EntArc extends EntBase {
    /**
     * code  0 -Entity name.
     */
    public String EntityName = "ARC";

    /**
     * code  5 - Handle.
     */
    public String Handle;
    /**
     * code  100 -Class Label.
     */
    public String ClassLabel = "AcDbEntity";

    /**
     * code  100 -Sub Class Label.
     */
    public String SubClassLabel = "AcDbArc";

    /**
     * code  10,20,30 -Center Point location (in WCS).
     */
    wPoint cPoint;

    /**
     * code  40 - Radius.
     */
    public     double       radius          = 0.0;


    /**
     * code  50 - sAngle Degrees.
     */
    public     double       sAngle          = 0.0;


    /**
     * code  51 - eAngle Degrees.
     */
    public     double       eAngle          = 0.0;


    /**
    * code  39 - Thickness (optional; default  =  0).
    */
    public double thickness = 0.0;

    /**
     * code 210,220,230 -
     *            Extrusion direction. Present if the extrusion direction is
     *            not parallel to the world Z axis.
     */
    public double   xExtrusionDirection = 0;
    public double   yExtrusionDirection = 0;
    public double   zExtrusionDirection = 1;

    /**
     * Constructor (empty).
     */
    public EntArc() {
        this.cPoint = new wPoint();
        this.radius = 0.0;
        this.sAngle = 0.0;
        this.eAngle = 0.0;
        Handle = FileDXF.ApplyHandle();
    }

    /**
     * Constructor (double x_value,double y_value,double radius_value,double start_angle,double end_angle)
     * @param x_value -x of the arc's center point;
     * @param y_value -y of the arc's center point;
     * @param radius_value -radius of the arc;
     * @param start_angle - start angle of the arc;
     * @param end_angle - end angle of the arc;
     */
    public EntArc(double x_value,double y_value,double radius_value,double start_angle,double end_angle) {
        this.cPoint = new wPoint(x_value,y_value);
        this.radius = radius_value;
        this.sAngle = start_angle;
        this.eAngle = end_angle;
        Handle = FileDXF.ApplyHandle();
    }

    /**
     * Constructor (wPoint2D cPoint,double radius_value,double start_angle,double end_angle)
     * @param cPoint - center point of the arc;
     * @param radius_value -radius of the arc;
     * @param start_angle - start angle of the arc;
     * @param end_angle - end angle of the arc;
     */
    public EntArc(wPoint2D cPoint,double radius_value,double start_angle,double end_angle) {
        this.cPoint = new wPoint(cPoint);
        this.radius = radius_value;
        this.sAngle = start_angle;
        this.eAngle = end_angle;
        Handle = FileDXF.ApplyHandle();
    }

    /**
     * Constructor (double x_value,double y_value,double z_value,double radius_value,double start_angle,double end_angle)
     * @param x_value -x of the arc's center point;
     * @param y_value -y of the arc's center point;
     * @param z_value -z of the arc's center point;
     * @param radius_value - radius of the arc;
     * @param start_angle - start angle of the arc;
     * @param end_angle - end angle of the arc;
     */
    public EntArc(double x_value,double y_value,double z_value,double radius_value,double start_angle,double end_angle) {
        this.cPoint = new wPoint(x_value,y_value,z_value);
        this.radius = radius_value;
        this.sAngle = start_angle;
        this.eAngle = end_angle;
        Handle = FileDXF.ApplyHandle();
    }

    /**
     * Constructor (wPoint cPoint,double radius_value,double start_angle,double end_angle)
     * @param cPoint - center point of the arc;
     * @param radius_value -radius of the arc;
     * @param start_angle - start angle of the arc;
     * @param end_angle - end angle of the arc;
     */
    public EntArc(wPoint cPoint,double radius_value,double start_angle,double end_angle) {
        this.cPoint = cPoint;
        this.radius = radius_value;
        this.sAngle = start_angle;
        this.eAngle = end_angle;
        Handle = FileDXF.ApplyHandle();
    }

    /**
     * Constructor (Po,Pa,Pb)
     * @param Po - Center point of the Arc;
     * @param Pa - Start point of the Arc;
     * @param Pb - End point of the Arc;
     */
    public EntArc(wPoint2D Po,wPoint2D Pa,wPoint2D Pb) {
        double radis,start_angle,end_angle;
        double rb;

        radius = Math.sqrt(Math.pow(Pa.x-Po.x,2) + Math.pow(Pa.y-Po.y,2));
        rb  = Math.sqrt(Math.pow(Pa.x-Po.x,2) + Math.pow(Pa.y-Po.y,2));

        if (Math.abs(rb-radius) > 0.2) {
            System.out.println("Invalid input. delta radius=" + Math.abs(rb-radius));
        }

        start_angle = Math.toDegrees(Math.atan2((Pa.y - Po.y) , (Pa.x - Po.x)));

        end_angle = Math.toDegrees(Math.atan2((Pb.y - Po.y) , (Pb.x - Po.x)));

        this.cPoint = new wPoint(Po.x,Po.y,0.0);
        this.radius = radius;
        this.sAngle = start_angle;
        this.eAngle = end_angle;
        Handle = FileDXF.ApplyHandle();
    }

    /**
     * Constructor (one_arc)
     * @param one_arc -one object derived from class EntArc;
     */
    public EntArc(EntArc one_arc) {
        this.cPoint = one_arc.cPoint;
        this.radius = one_arc.radius;
        this.sAngle = one_arc.sAngle;
        this.eAngle = one_arc.eAngle;
        this.thickness = one_arc.thickness;
        this.xExtrusionDirection = one_arc.xExtrusionDirection;
        this.yExtrusionDirection = one_arc.yExtrusionDirection;
        this.zExtrusionDirection = one_arc.zExtrusionDirection;
        Handle = FileDXF.ApplyHandle();
    }

    /**
     * MakesAngleSmaller (theArc)
     * @param theArc - One Arc to make the sAngle smaller than the end_angle;
    */
    public void MakeSAngleSmaller(EntArc theArc) {
        if (theArc.sAngle > theArc.eAngle) {
            double angle;
            angle = theArc.sAngle;
            theArc.sAngle = theArc.eAngle;
            theArc.eAngle = angle;
        }
    }

    /**
     * Print2D()
     * Terminal output x,y of cPoint and end_point.(one arc for one point)
     */
    public void Print2D() {
        System.out.println("Start point:  "+"x = " + this.cPoint.x+"   y = " + this.cPoint.y);
        System.out.println("radius:  "+"x = " + this.radius);
        System.out.println("Start angle=  " + this.sAngle+"   End angle= " + this.eAngle);
    }

    /**
     * Print3D()
     * Terminal output x,y,z of cPoint and end_point.(one arc for one point)
     */
    public void Print3D() {
        System.out.println("Start point:  "+"x = "+this.cPoint.x+"   y = " + this.cPoint.y+"   z = " + this.cPoint.z);
        System.out.println("radius:  "+"x = " + this.radius);
        System.out.println("Start angle=  " + this.sAngle+"   End angle= " + this.eAngle);
    }

    /**
     * GetAngle()
     * Get the angle of the arc
     */
    public double GetAngle() {
        double angle;

        angle = this.eAngle - this.sAngle;

        return angle;
    }

    /**
     * GetArcLength()
     * Get the arc length of the arc
     */
    public double GetArcLength() {
        double arclength;

        arclength = 2 * Math.PI * this.radius * (this.eAngle - this.sAngle) / 360.0;

        return arclength;
    }

    /**
     * GetArea()
     * Get the area of the arc
     */
    public double GetArea() {
        double area;

        area = Math.PI * Math.pow(this.radius,2) * (this.eAngle - this.sAngle) / 360.0;

        return area;
    }

    /**
     * GetDXFData()
     * @return the dxf data of entity arc.
     * <pre>Output example:
     *   0
     * ARC
     *   5
     * 25F
     *   100
     * AcDbEntity
     *   8
     * 0
     *   100
     * AcDbCircle
     *   10
     * 132.54153503527186
     *   20
     * 253.8
      *  30
     * 0.0
     *   40
     * 21.0
     *   210
     * 0.0
      *  220
     * 0.0
     *   230
     * 1.0
     *   100
     * AcDbArc
     *   50
     * 90.0
      *  51
     * 163.8153602092225
     *   39
     * 0.0</pre>
     */
    public List<String> GetDXFData() {
        List<String> DXF_STR = new ArrayList<>();

        DXF_STR.add("  0");
        DXF_STR.add(this.EntityName);

        DXF_STR.add("  5");
        DXF_STR.add(this.Handle);

        DXF_STR.add("330");
        DXF_STR.add("1F");

        DXF_STR.add("100");
        DXF_STR.add(this.ClassLabel);
        DXF_STR.add("330");
        DXF_STR.add("1F");

        //DXF_STR.add("8");
        //DXF_STR.add(this.layer);
        DXF_STR.addAll(super.GetDXFData());
        DXF_STR.add("100");
        DXF_STR.add("AcDbCircle");

        DXF_STR.addAll(cPoint.GetDXFData());

        DXF_STR.add("  40");
        DXF_STR.add(Double.toString(this.radius));
        /*
        DXF_STR.add("  210");
        DXF_STR.add(Double.toString(this.xExtrusionDirection));
        DXF_STR.add("  220");
        DXF_STR.add(Double.toString(this.yExtrusionDirection));
        DXF_STR.add("  230");
        DXF_STR.add(Double.toString(this.zExtrusionDirection));
        */
        DXF_STR.add("100");
        DXF_STR.add(this.SubClassLabel);

        DXF_STR.add("  50");
        DXF_STR.add(Double.toString(this.sAngle));
        DXF_STR.add("  51");
        DXF_STR.add(Double.toString(this.eAngle));
        //DXF_STR.add("  39");
        //DXF_STR.add(Double.toString(this.thickness));

        return DXF_STR;
    }

}