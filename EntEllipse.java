//package www
//AutoCAD Entity--Ellipse
import java.util.*;
//import java.util.HashMap;

/**
*@author David Wu<809758521@qq.com>
*@version 0.5
*/
public class EntEllipse extends EntBase {
    /**
     * code  0 -Entity name.
     */
    public String EntityName = "ELLIPSE";

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
    public String SubClassLabel = "AcDbEllipse";

    /**
     * code  10,20,30 -Center Point location (in WCS).
     */
    wPoint cPoint;

    /**
     * code  11,21,31 -Center Point location (in WCS).
     */
    wPoint lPoint;

    /**
     * code  40 - Radius.
     */
    public     double       ratio          = 0.0;

	
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
    public EntEllipse() {
        this.cPoint = new wPoint();
		this.ratio = 0.0;
		this.sAngle = 0.0;
		this.eAngle = 2 * Math.PI;
		Handle = FileDXF.ApplyHandle();
    }

    /**
     * Constructor (double x_value,double y_value,double ratio_value,double sAngle_value,double eAngle_value)
     * @param x_value -x of the Ellipse's center point;
     * @param y_value -y of the Ellipse's center point;
     * @param ratio_value -ratio of the Ellipse;
     * @param sAngle_value - start angle of the Ellipse;
     * @param eAngle_value - end angle of the Ellipse;
     */
    public EntEllipse(double x_value,double y_value,double ratio_value,double sAngle_value,double eAngle_value) {
        this.cPoint = new wPoint(x_value,y_value);
		this.ratio = ratio_value;
		this.sAngle = sAngle_value;
		this.eAngle = eAngle_value;
		Handle = FileDXF.ApplyHandle();
    }

    /**
     * Constructor (wPoint2D Pc,double ratio_value,double sAngle_value,double eAngle_value)
     * @param Pc - center point of the Ellipse;
     * @param ratio_value -ratio of the Ellipse;
     * @param sAngle_value - start angle of the Ellipse;
     * @param eAngle_value - end angle of the Ellipse;
     */
    public EntEllipse(wPoint2D Pc,double ratio_value,double sAngle_value,double eAngle_value) {
        this.cPoint = new wPoint(Pc);
		this.ratio = ratio_value;
		this.sAngle = sAngle_value;
		this.eAngle = eAngle_value;
		Handle = FileDXF.ApplyHandle();
    }

    /**
     * Constructor (double x_value,double y_value,double z_value,double ratio_value,double sAngle_value,double eAngle_value)
     * @param x_value -x of the Ellipse's center point;
     * @param y_value -y of the Ellipse's center point;
     * @param z_value -z of the Ellipse's center point;
     * @param ratio_value - ratio of the Ellipse;
     * @param sAngle_value - start angle of the Ellipse;
     * @param eAngle_value - end angle of the Ellipse;
     */
    public EntEllipse(double x_value,double y_value,double z_value,double ratio_value,double sAngle_value,double eAngle_value) {
        this.cPoint = new wPoint(x_value,y_value,z_value);
		this.ratio = ratio_value;
		this.sAngle = sAngle_value;
		this.eAngle = eAngle_value;
		Handle = FileDXF.ApplyHandle();
    }

    /**
     * Constructor (wPoint lP,double ratio_value,double sAngle_value,double eAngle_value)
     * @param lP - center point of the Ellipse;
     * @param ratio_value -ratio of the Ellipse;
     * @param sAngle_value - start angle of the Ellipse;
     * @param eAngle_value - end angle of the Ellipse;
     */
    public EntEllipse(wPoint lP,double ratio_value,double sAngle_value,double eAngle_value) {
        this.cPoint = new wPoint(0,0,0); 
		this.lPoint = lP;
		this.ratio = ratio_value;
		this.sAngle = sAngle_value;
		this.eAngle = eAngle_value;
		Handle = FileDXF.ApplyHandle();
    }

    /**
     * Constructor (cP,lP,ratio_value,sAngle_value,eAngle_value)
     * @param cP - center point of the Ellipse;
     * @param lP - End point of the Ellipse on the long axis;
     * @param ratio_value - Ratio of the Ellipse;
     * @param sAngle_value - start angle of the Ellipse;
     * @param eAngle_value - end angle of the Ellipse;
     */
    public EntEllipse(wPoint cP,wPoint lP,double ratio_value,double sAngle_value,double eAngle_value) {
        this.cPoint = cP; 
		this.lPoint = lP;
		this.ratio = ratio_value;
		this.sAngle = sAngle_value;
		this.eAngle = eAngle_value;
		Handle = FileDXF.ApplyHandle();
    }

    /**
     * Constructor (Po,Pa,Pb)
     * @param Po - Center point of the Ellipse;
     * @param Pa - Start point of the Ellipse;
     * @param Pb - End point of the Ellipse;
     */
    public EntEllipse(wPoint2D Po,wPoint2D Pa,wPoint2D Pb) {
        double radis,sAngle_value,eAngle_value;
		double rb;
		
		ratio = Math.sqrt(Math.pow(Pa.x-Po.x,2) + Math.pow(Pa.y-Po.y,2));
		rb  = Math.sqrt(Math.pow(Pa.x-Po.x,2) + Math.pow(Pa.y-Po.y,2));
		
		if (Math.abs(rb-ratio) > 0.2){
			System.out.println("Invalid input. delta ratio=" + Math.abs(rb-ratio));
		}
		
		sAngle_value = Math.toDegrees(Math.atan2((Pa.y - Po.y) , (Pa.x - Po.x)));
		
		eAngle_value = Math.toDegrees(Math.atan2((Pb.y - Po.y) , (Pb.x - Po.x)));
		
		this.cPoint = new wPoint(Po.x,Po.y,0.0);
		this.ratio = ratio;
		this.sAngle = sAngle_value;
		this.eAngle = eAngle_value;
		Handle = FileDXF.ApplyHandle();
    }

    /**
     * Constructor (oneEllipse)
     * @param oneEllipse -one object derived from class EntEllipse;
     */
    public EntEllipse(EntEllipse oneEllipse) {
        this.cPoint = oneEllipse.cPoint;
		this.ratio = oneEllipse.ratio;
		this.sAngle = oneEllipse.sAngle;
		this.eAngle = oneEllipse.eAngle;
        this.thickness = oneEllipse.thickness;
        this.xExtrusionDirection = oneEllipse.xExtrusionDirection;
        this.yExtrusionDirection = oneEllipse.yExtrusionDirection;
        this.zExtrusionDirection = oneEllipse.zExtrusionDirection;
 		Handle = FileDXF.ApplyHandle();
   }

    /**
     * MakesAngleSmaller (oneEllipse)
     * @param oneEllipse - One Ellipse to make the sAngle smaller than the eAngle;
    */
    public void MakeSAngleSmaller(EntEllipse oneEllipse) {
		if (oneEllipse.sAngle > oneEllipse.eAngle){
			double angle;
			angle = oneEllipse.sAngle;
			oneEllipse.sAngle = oneEllipse.eAngle;
			oneEllipse.eAngle = angle;
		}
    }

    /**
     * Print2D()
     * Terminal output x,y of cPoint and end_point.(one Ellipse for one point)
     */
    public void Print2D() {
        System.out.println("Start point:  "+"x = " + this.cPoint.x+"   y = " + this.cPoint.y);
        System.out.println("ratio:  "+"x = " + this.ratio);
        System.out.println("Start angle=  " + this.sAngle+"   End angle= " + this.eAngle);
    }

    /**
     * Print3D()
     * Terminal output x,y,z of cPoint and end_point.(one Ellipse for one point)
     */
    public void Print3D() {
        System.out.println("Start point:  "+"x = "+this.cPoint.x+"   y = " + this.cPoint.y+"   z = " + this.cPoint.z);
        System.out.println("ratio:  "+"x = " + this.ratio);
        System.out.println("Start angle=  " + this.sAngle+"   End angle= " + this.eAngle);
    }

    /**
     * GetAngle()
     * Get the angle of the Ellipse
     */
    public double GetAngle() {
        double angle;
		
		angle = this.eAngle - this.sAngle;
		
		return angle;
    }

    /**
     * GetArcLength()
     * Get the Ellipse length of the Ellipse
     */
    public double GetArcLength() {
        double arclength;
		
		arclength = 2 * Math.PI * this.ratio * (this.eAngle - this.sAngle) / 360.0;
		
		return arclength;
    }

    /**
     * GetArea()
     * Get the area of the Ellipse
     */
    public double GetArea() {
        double area;
		
		area = Math.PI * Math.pow(this.ratio,2) * (this.eAngle - this.sAngle) / 360.0;
		
		return area;
    }

    /**
     * GetDXFData()
     * @return the dxf data of entity Ellipse.
	 * <pre>Output example:
	 *   0
	 * ELLIPSE
	 *   5
	 * 1B8
	 * 330
	 * 1F
	 * 100
	 * AcDbEntity
	 *   8
	 * 0
	 * 100
	 * AcDbEllipse
	 *  10
	 * 0.0
	 *  20
	 * 0.0
	 *  30
	 * 0.0
	 *  11
	 * 0.0
	 *  21
	 * -100.0
	 *  31
	 * 0.0
	 * 210
	 * 0.0
	 * 220
	 * 0.0
	 * 230
	 * 1.0
	 * 40
	 * 0.5
	  * 41
	 * 0.0
	 *  42
	 * 6.283185307179585</pre>
     */
    public List<String> GetDXFData() {
        List<String> DXF_STR = new ArrayList<>();

        DXF_STR.add("  0");
        DXF_STR.add(this.EntityName);
        
		DXF_STR.add("  5");
        DXF_STR.add(this.Handle);
		
		DXF_STR.add("330");
        DXF_STR.add("1F");
        //DXF_STR.add("8");
        //DXF_STR.add(this.layer);
		DXF_STR.add("100");
        DXF_STR.add(this.ClassLabel);
		DXF_STR.addAll(super.GetDXFData());
		DXF_STR.add("100");
        DXF_STR.add(this.SubClassLabel);

		DXF_STR.addAll(cPoint.GetDXFData());

        DXF_STR.add("  11");
        DXF_STR.add(Double.toString(this.lPoint.x));
        DXF_STR.add("  21");
        DXF_STR.add(Double.toString(this.lPoint.y));
        DXF_STR.add("  31");
        DXF_STR.add(Double.toString(this.lPoint.z));
		
		DXF_STR.add("  210");
        DXF_STR.add(Double.toString(this.xExtrusionDirection));
        DXF_STR.add("  220");
        DXF_STR.add(Double.toString(this.yExtrusionDirection));
        DXF_STR.add("  230");
        DXF_STR.add(Double.toString(this.zExtrusionDirection));
		
        DXF_STR.add("  40");
        DXF_STR.add(Double.toString(this.ratio));

        DXF_STR.add("  41");
        DXF_STR.add(Double.toString(this.sAngle));
        DXF_STR.add("  42");
        DXF_STR.add(Double.toString(this.eAngle));
        //DXF_STR.add("  39");
        //DXF_STR.add(Double.toString(this.thickness));

        return DXF_STR;
    }

}