//package www
//This Version support AC1009,the dxf file created can be imported into all the versions of AutoCAD
//AutoCAD DXF File -- Six Sections: Header Classes Tables Blocks Entities Objects
import java.util.*;

/**
*@author David Wu<809758521@qq.com>
*@version 0.5
*/
public class FileDXF_Parts extends FileDXF_Complex {

    /**
     * pLabel - the part label of the part.
     */
    public PartLabel pLabel;

    /**
     * Constructor (empty).
     */
    public FileDXF_Parts() {
        pLabel = new PartLabel();
    }

    /**
     * AddRectanglePart(length,height)
     * <pre>Add one rectangle into the Entities' Section
     * @param length - the length of the rectangle ;
     * @param height - the height vertex of the rectangle ;
     *	</pre>
    */
    public void AddRectanglePart(double length,double height) {
        String myLabelSTR;
        wPoint2D bPoint;
        double textHeight;


        this.AddRectangle(length,height);

        myLabelSTR = pLabel.GetLabelSTR();
        textHeight = height / 20;
        bPoint = new wPoint2D(0,- textHeight * 2);

        this.dxf_filename = this.pLabel.PartNumber + ".dxf";

        if ( myLabelSTR.length() > 0) {
            this.AddText(bPoint,textHeight,myLabelSTR);
        }
    }

    /**
     * AddSectorPart(radius,Angle)
     * <pre>Add one Sector Part into the Entities' Section
     * @param radius - the length of the rectangle ;
     * @param Angle - the Angle of the sector Part ;
     *	</pre>
    */
    public void AddSectorPart(double radius,double Angle) {
        String myLabelSTR;
        double textHeight;
        wPoint2D bPoint;

        this.AddSector(radius,Angle);

        myLabelSTR = pLabel.GetLabelSTR();
        textHeight = radius / 20;
        bPoint = new wPoint2D(0,- textHeight * 2);

        this.dxf_filename = this.pLabel.PartNumber + ".dxf";

        if ( myLabelSTR.length() > 0) {
            this.AddText(bPoint,textHeight,myLabelSTR);
        }
    }

    /**
     * AddCirclePart(radius)
     * <pre>Add one Circle Part into the Entities' Section
     * @param radius - the length of the rectangle ;
     *	</pre>
    */
    public void AddCirclePart(double radius) {
        String myLabelSTR;
        double textHeight;
        wPoint2D bPoint;

        this.AddCircle(radius);

        myLabelSTR = pLabel.GetLabelSTR();
        textHeight = radius / 20;
        bPoint = new wPoint2D(0,- radius - textHeight * 2);

        this.dxf_filename = this.pLabel.PartNumber + ".dxf";

        if ( myLabelSTR.length() > 0) {
            this.AddText(bPoint,textHeight,myLabelSTR);
        }
    }

    /**
      * AddDonutPart(r1,r2,Angle)
      * <pre>Add one donut into the Entities' Section
      * @param r1 - small radius of the donut;
      * @param r2 - big radius of the donut;
      * @param Angle - start angle of the donut;
     *	</pre>
     */
    public void AddDonutPart(double r1,double r2,double Angle) {
        String myLabelSTR;
        double textHeight;
        wPoint2D bPoint;

        this.AddDonut(r1,r2,Angle);

        myLabelSTR = pLabel.GetLabelSTR();
        textHeight = r2 / 20;
        bPoint = new wPoint2D(0,- textHeight * 2);

        this.dxf_filename = this.pLabel.PartNumber + ".dxf";

        if ( myLabelSTR.length() > 0) {
            this.AddText(bPoint,textHeight,myLabelSTR);
        }
    }

    /**
      * AddShapeL5Part(A,B,C,D)
      * <pre>Add L5 into the Entities' Section
      * @param A - ;
      * @param B - ;
      * @param F - ;
      * @param D - ;
     *	</pre>
     */
    public void AddShapeL5Part(double A,double B,double F,double D) {
        String myLabelSTR;
        double textHeight;
        wPoint2D bPoint;

        this.AddShapeL5(A,B,F,D);

        myLabelSTR = pLabel.GetLabelSTR();
        textHeight = (A + B) / 40;
        bPoint = new wPoint2D(0,- textHeight * 2);

        this.dxf_filename = this.pLabel.PartNumber + ".dxf";

        if ( myLabelSTR.length() > 0) {
            this.AddText(bPoint,textHeight,myLabelSTR);
        }
    }

    /**
      * AddShape1Part(A,B)
      * <pre>Add shape 12 into the Entities' Section
      * @param A - ;
      * @param B - ;
     *	</pre>
     */
    public void AddShape1Part(double A,double B) {
        String myLabelSTR;
        double textHeight;
        wPoint2D bPoint;

        this.AddShape1(A,B);

        myLabelSTR = pLabel.GetLabelSTR();
        textHeight = (A + B) / 40;
        bPoint = new wPoint2D(0,- textHeight * 2);

        this.dxf_filename = this.pLabel.PartNumber + ".dxf";

        if ( myLabelSTR.length() > 0) {
            this.AddText(bPoint,textHeight,myLabelSTR);
        }
    }

    /**
      * AddShape2Part(A,B,C,D,E,F)
      * <pre>Add shape 2 into the Entities' Section
      * @param A - ;
      * @param B - ;
      * @param C - ;
      * @param D - ;
      * @param E - ;
      * @param F - ;
     *	</pre>
     */
    public void AddShape2Part(double A,double B,double C,double D,double E,double F) {
        String myLabelSTR;
        double textHeight;
        wPoint2D bPoint;

        this.AddShape2(A,B,C,D,E,F);

        myLabelSTR = pLabel.GetLabelSTR();
        textHeight = (A + B) / 40;
        bPoint = new wPoint2D(0,- textHeight * 2);

        this.dxf_filename = this.pLabel.PartNumber + ".dxf";

        if ( myLabelSTR.length() > 0) {
            this.AddText(bPoint,textHeight,myLabelSTR);
        }
    }

    /**
      * AddShape3Part(A,B,C,D,E)
      * <pre>Add shape 3 into the Entities' Section
      * @param A - ;
      * @param B - ;
      * @param C - ;
      * @param D - ;
      * @param E - ;
     *	</pre>
     */
    public void AddShape3Part(double A,double B,double C,double D,double E) {
        String myLabelSTR;
        double textHeight;
        wPoint2D bPoint;

        this.AddShape3(A,B,C,D,E);

        myLabelSTR = pLabel.GetLabelSTR();
        textHeight = (A + B) / 40;
        bPoint = new wPoint2D(0,- textHeight * 2);

        this.dxf_filename = this.pLabel.PartNumber + ".dxf";

        if ( myLabelSTR.length() > 0) {
            this.AddText(bPoint,textHeight,myLabelSTR);
        }
    }

    /**
      * AddShape4Part(A,B,C)
      * <pre>Add shape 4 into the Entities' Section
      * @param A - ;
      * @param B - ;
      * @param C - ;
     *	</pre>
     */
    public void AddShape4Part(double A,double B,double C) {
        String myLabelSTR;
        double textHeight;
        wPoint2D bPoint;

        this.AddShape4(A,B,C);

        myLabelSTR = pLabel.GetLabelSTR();
        textHeight = (A + B) / 40;
        bPoint = new wPoint2D(0,- textHeight * 2);

        this.dxf_filename = this.pLabel.PartNumber + ".dxf";

        if ( myLabelSTR.length() > 0) {
            this.AddText(bPoint,textHeight,myLabelSTR);
        }
    }

    /**
      * AddShape5Part(A,B)
      * <pre>Add shape 5 into the Entities' Section
      * @param A - ;
      * @param B - ;
     *	</pre>
     */
    public void AddShape5Part(double A,double B) {
        String myLabelSTR;
        double textHeight;
        wPoint2D bPoint;

        this.AddShape5(A,B);

        myLabelSTR = pLabel.GetLabelSTR();
        textHeight = (A + B) / 40;
        bPoint = new wPoint2D(0,- A / 2- textHeight * 2);

        this.dxf_filename = this.pLabel.PartNumber + ".dxf";

        if ( myLabelSTR.length() > 0) {
            this.AddText(bPoint,textHeight,myLabelSTR);
        }
    }

    /**
      * AddShape9Part(A,B,C,D)
      * <pre>Add shape 9 into the Entities' Section
      * @param A - ;
      * @param B - ;
      * @param C - ;
      * @param D - ;
     *	</pre>
     */
    public void AddShape9Part(double A,double B,double C,double D) {
        String myLabelSTR;
        double textHeight;
        wPoint2D bPoint;

        this.AddShape9(A,B,C,D);

        myLabelSTR = pLabel.GetLabelSTR();
        textHeight = (A + B) / 40;
        bPoint = new wPoint2D(0,- textHeight * 2);

        this.dxf_filename = this.pLabel.PartNumber + ".dxf";

        if ( myLabelSTR.length() > 0) {
            this.AddText(bPoint,textHeight,myLabelSTR);
        }
    }

    /**
      * AddShape12Part(A,B,C,D,E)
      * <pre>Add shape 12 into the Entities' Section
      * @param A - ;
      * @param B - ;
      * @param C - ;
      * @param D - ;
      * @param E - ;
     *	</pre>
     */
    public void AddShape12Part(double A,double B,double C,double D,double E) {
        String myLabelSTR;
        double textHeight;
        wPoint2D bPoint;

        this.AddShape12(A,B,C,D,E);

        myLabelSTR = pLabel.GetLabelSTR();
        textHeight = (A + B) / 40;
        bPoint = new wPoint2D(0,- textHeight * 2);

        this.dxf_filename = this.pLabel.PartNumber + ".dxf";

        if ( myLabelSTR.length() > 0) {
            this.AddText(bPoint,textHeight,myLabelSTR);
        }
    }

    /**
      * AddShape13Part(A,B,C,D)
      * <pre>Add shape 13 into the Entities' Section
      * @param A - ;
      * @param B - ;
      * @param C - ;
      * @param D - ;
     *	</pre>
     */
    public void AddShape13Part(double A,double B,double C,double D) {
        String myLabelSTR;
        double textHeight;
        wPoint2D bPoint;

        this.AddShape13(A,B,C,D);

        myLabelSTR = pLabel.GetLabelSTR();
        textHeight = (A + B) / 40;
        bPoint = new wPoint2D(0,-D - textHeight * 2);

        this.dxf_filename = this.pLabel.PartNumber + ".dxf";

        if ( myLabelSTR.length() > 0) {
            this.AddText(bPoint,textHeight,myLabelSTR);
        }
    }

    /**
      * AddShape14Part(A,B,C,D,E,F)
      * <pre>Add shape 14 into the Entities' Section
      * @param A - ;
      * @param B - ;
      * @param C - ;
      * @param D - ;
      * @param E - ;
      * @param F - ;
     *	</pre>
     */
    public void AddShape14Part(double A,double B,double C,double D,double E,double F) {
        String myLabelSTR;
        double textHeight;
        wPoint2D bPoint;

        this.AddShape14(A,B,C,D,E,F);

        myLabelSTR = pLabel.GetLabelSTR();
        textHeight = A  / 20;
        bPoint = new wPoint2D(0,- textHeight * 2);

        this.dxf_filename = this.pLabel.PartNumber + ".dxf";

        if ( myLabelSTR.length() > 0) {
            this.AddText(bPoint,textHeight,myLabelSTR);
        }
    }

    /**
      * AddShape15Part(A)
      * <pre>Add shape 15 into the Entities' Section
      * @param A - ;
     *	</pre>
     */
    public void AddShape15Part(double A) {
        String myLabelSTR;
        double textHeight;
        wPoint2D bPoint;

        this.AddShape15(A);

        myLabelSTR = pLabel.GetLabelSTR();
        textHeight = A / 20;
        bPoint = new wPoint2D(0,- A / 2.0- textHeight * 2);

        this.dxf_filename = this.pLabel.PartNumber + ".dxf";

        if ( myLabelSTR.length() > 0) {
            this.AddText(bPoint,textHeight,myLabelSTR);
        }
    }

    /**
      * AddShape16Part(A,B,C,D,N)
      * <pre>Add shape 16 into the Entities' Section
      * @param A - ;
      * @param B - ;
      * @param C - ;
      * @param D - ;
      * @param N - ;
     *	</pre>
     */
    public void AddShape16Part(double A,double B,double C,double D,int N) {
        String myLabelSTR;
        double textHeight;
        wPoint2D bPoint;

        this.AddShape16(A,B,C,D,N);

        myLabelSTR = pLabel.GetLabelSTR();
        textHeight = (A + B) / 40;
        bPoint = new wPoint2D(0,- A / 2- textHeight * 2);

        this.dxf_filename = this.pLabel.PartNumber + ".dxf";

        if ( myLabelSTR.length() > 0) {
            this.AddText(bPoint,textHeight,myLabelSTR);
        }
    }

    /**
      * AddShape24Part(A,B,C,D,E)
      * <pre>Add shape 24 into the Entities' Section
      * @param A - ;
      * @param B - ;
      * @param C - ;
      * @param D - ;
      * @param E - ;
     *	</pre>
     */
    public void AddShape24Part(double A,double B,double C,double D,double E) {
        String myLabelSTR;
        double textHeight;
        wPoint2D bPoint;

        this.AddShape24(A,B,C,D,E);

        myLabelSTR = pLabel.GetLabelSTR();
        textHeight = (A + B) / 40;
        bPoint = new wPoint2D(0,- textHeight * 2);

        this.dxf_filename = this.pLabel.PartNumber + ".dxf";

        if ( myLabelSTR.length() > 0) {
            this.AddText(bPoint,textHeight,myLabelSTR);
        }
    }

    /**
      * AddShape25Part(A,B,C,D)
      * <pre>Add shape 25 into the Entities' Section
      * @param A - ;
      * @param B - ;
      * @param C - ;
      * @param D - ;
     *	</pre>
     */
    public void AddShape25Part(double A,double B,double C,double D) {
        String myLabelSTR;
        double textHeight;
        wPoint2D bPoint;

        this.AddShape25(A,B,C,D);

        myLabelSTR = pLabel.GetLabelSTR();
        textHeight = (A + B) / 40;
        bPoint = new wPoint2D(0,- textHeight * 2);

        this.dxf_filename = this.pLabel.PartNumber + ".dxf";

        if ( myLabelSTR.length() > 0) {
            this.AddText(bPoint,textHeight,myLabelSTR);
        }
    }

    /**
      * AddShape26Part(A,B,C,D,E)
      * <pre>Add shape 26 into the Entities' Section
      * @param A - ;
      * @param B - ;
      * @param C - ;
      * @param D - ;
      * @param E - ;
     *	</pre>
     */
    public void AddShape26Part(double A,double B,double C,double D,double E) {
        String myLabelSTR;
        double textHeight;
        wPoint2D bPoint;

        this.AddShape26(A,B,C,D,E);

        myLabelSTR = pLabel.GetLabelSTR();
        textHeight = (A + B) / 40;
        bPoint = new wPoint2D(0,- textHeight * 2);

        this.dxf_filename = this.pLabel.PartNumber + ".dxf";

        if ( myLabelSTR.length() > 0) {
            this.AddText(bPoint,textHeight,myLabelSTR);
        }
    }

    /**
      * AddShape30Part(A,B,C,D)
      * <pre>Add shape 30 into the Entities' Section
      * @param A - ;
      * @param B - ;
      * @param C - ;
      * @param D - ;
     *	</pre>
     */
    public void AddShape30Part(double A,double B,double C,double D) {
        String myLabelSTR;
        double textHeight;
        wPoint2D bPoint;

        this.AddShape30(A,B,C,D);

        myLabelSTR = pLabel.GetLabelSTR();
        textHeight = (A + B) / 40;
        bPoint = new wPoint2D(0,- textHeight * 2);

        this.dxf_filename = this.pLabel.PartNumber + ".dxf";

        if ( myLabelSTR.length() > 0) {
            this.AddText(bPoint,textHeight,myLabelSTR);
        }
    }

    /**
      * AddShape51Part(A,B,C,D)
      * <pre>Add shape 51 into the Entities' Section
      * @param A - ;
      * @param B - ;
      * @param C - ;
      * @param D - ;
     *	</pre>
     */
    public void AddShape51Part(double A,double B,double C,double D) {
        String myLabelSTR;
        double textHeight;
        wPoint2D bPoint;

        this.AddShape51(A,B,C,D);

        myLabelSTR = pLabel.GetLabelSTR();
        textHeight = (A + B) / 40;
        bPoint = new wPoint2D(0,- textHeight * 2);

        this.dxf_filename = this.pLabel.PartNumber + ".dxf";

        if ( myLabelSTR.length() > 0) {
            this.AddText(bPoint,textHeight,myLabelSTR);
        }
    }

    /**
      * AddShape56Part(A,B,C)
      * <pre>Add shape 56 into the Entities' Section
      * @param A -
      * @param B -
      * @param C -
     *	</pre>
     */
    public void AddShape56Part(double A,double B,double C) {
        String myLabelSTR;
        double textHeight;
        wPoint2D bPoint;

        this.AddShape56(A,B,C);

        myLabelSTR = pLabel.GetLabelSTR();
        textHeight = (A + B) / 40;
        bPoint = new wPoint2D(0,- A /2 - textHeight * 2);

        this.dxf_filename = this.pLabel.PartNumber + ".dxf";

        if ( myLabelSTR.length() > 0) {
            this.AddText(bPoint,textHeight,myLabelSTR);
        }
    }

    /**
      * AddShape57Part(A,B,C)
      * <pre>Add shape 57 into the Entities' Section
      * @param A - Center point of the donut;
      * @param B - small radius of the donut;
      * @param C - big radius of the donut;
     *	</pre>
     */
    public void AddShape57Part(double A,double B,double C) {
        String myLabelSTR;
        double textHeight;
        wPoint2D bPoint;

        this.AddShape57(A,B,C);

        myLabelSTR = pLabel.GetLabelSTR();
        textHeight = A / 20;
        bPoint = new wPoint2D(0,- textHeight * 2);

        this.dxf_filename = this.pLabel.PartNumber + ".dxf";

        if ( myLabelSTR.length() > 0) {
            this.AddText(bPoint,textHeight,myLabelSTR);
        }
    }

    /**
      * AddShape60Part(A,B)
      * <pre>Add shape 60 into the Entities' Section
      * @param A -
      * @param B -
     *	</pre>
     */
    public void AddShape60Part(double A,double B) {
        String myLabelSTR;
        double textHeight;
        wPoint2D bPoint;

        this.AddShape60(A,B);

        myLabelSTR = pLabel.GetLabelSTR();
        textHeight = (A + B) / 40;
        bPoint = new wPoint2D(0,- A /2 - textHeight * 2);

        this.dxf_filename = this.pLabel.PartNumber + ".dxf";

        if ( myLabelSTR.length() > 0) {
            this.AddText(bPoint,textHeight,myLabelSTR);
        }
    }

    /**
      * AddShape63Part(A,B)
      * <pre>Add shape 63 into the Entities' Section
      * @param A - Center point of the donut;
      * @param B - small radius of the donut;
     *	</pre>
     */
    public void AddShape63Part(double A,double B) {
        String myLabelSTR;
        double textHeight;
        wPoint2D bPoint;

        this.AddShape63(A,B);

        myLabelSTR = pLabel.GetLabelSTR();
        textHeight = (A + B) / 40;
        bPoint = new wPoint2D(0,- textHeight * 2);

        this.dxf_filename = this.pLabel.PartNumber + ".dxf";

        if ( myLabelSTR.length() > 0) {
            this.AddText(bPoint,textHeight,myLabelSTR);
        }
    }

    /**
      * AddShape67Part(A,B,C,N)
      * <pre>Add shape 67 into the Entities' Section
      * @param A - ;
      * @param B - ;
      * @param C - ;
      * @param N - ;
     *	</pre>
     */
    public void AddShape67Part(double A,double B,double C,int N) {
        String myLabelSTR;
        double textHeight;
        wPoint2D bPoint;

        this.AddShape67(A,B,C,N);

        myLabelSTR = pLabel.GetLabelSTR();
        textHeight = (A + B) / 40;
        bPoint = new wPoint2D(0,- A / 2- textHeight * 2);

        this.dxf_filename = this.pLabel.PartNumber + ".dxf";

        if ( myLabelSTR.length() > 0) {
            this.AddText(bPoint,textHeight,myLabelSTR);
        }
    }

    /**
      * AddShape69Part(A,B,D,E,F,G,H)
      * <pre>Add shape 69 into the Entities' Section
      * @param A - Length;
      * @param B -
      * @param D - ;
      * @param E - ;
      * @param F - ;
      * @param G - ;
      * @param H - ;
     *	</pre>
     */
    public void AddShape69Part(double A,double B,double D,double E,double F,double G,double H) {
        String myLabelSTR;
        double textHeight;
        wPoint2D bPoint;

        this.AddShape69(A,B,D,E,F,G,H);

        myLabelSTR = pLabel.GetLabelSTR();
        textHeight = ( A + B ) / 40;
        bPoint = new wPoint2D(0,- textHeight * 2);

        this.dxf_filename = this.pLabel.PartNumber + ".dxf";

        if ( myLabelSTR.length() > 0) {
            this.AddText(bPoint,textHeight,myLabelSTR);
        }
    }

    /**
      * AddShape82Part(H,W,S)
      * <pre>Add shape 82 into the Entities' Section
      * @param H - ;
      * @param W - ;
      * @param S - ;
     *	</pre>
     */
    public void AddShape82Part(double H,double W,double S) {
        String myLabelSTR;
        double textHeight;
        wPoint2D bPoint;

        this.AddShape82(H,W,S);

        myLabelSTR = pLabel.GetLabelSTR();
        textHeight = (H + W) / 40;
        bPoint = new wPoint2D(0,- textHeight * 2);

        this.dxf_filename = this.pLabel.PartNumber + ".dxf";

        if ( myLabelSTR.length() > 0) {
            this.AddText(bPoint,textHeight,myLabelSTR);
        }
    }

    /**
      * AddShape83Part(H,W,S,T)
      * <pre>Add shape 82 into the Entities' Section
      * @param H - ;
      * @param W - ;
      * @param S - ;
      * @param T - ;
     *	</pre>
     */
    public void AddShape83Part(double H,double W,double S,double T) {
        String myLabelSTR;
        double textHeight;
        wPoint2D bPoint;

        this.AddShape83(H,W,S,T);

        myLabelSTR = pLabel.GetLabelSTR();
        textHeight = (H + W) / 40;
        bPoint = new wPoint2D(0,- textHeight * 2);

        this.dxf_filename = this.pLabel.PartNumber + ".dxf";

        if ( myLabelSTR.length() > 0) {
            this.AddText(bPoint,textHeight,myLabelSTR);
        }
    }

    /**
      * AddShape87Part(A,B,C)
      * <pre>Add shape 87 into the Entities' Section
      * @param A - Length;
      * @param B - ;
      * @param C - Radius;
     *	</pre>
     */
    public void AddShape87Part(double A,double B,double C) {
        String myLabelSTR;
        double textHeight;
        wPoint2D bPoint;

        this.AddShape87(A,B,C);

        myLabelSTR = pLabel.GetLabelSTR();
        textHeight = ( A + B ) / 40;
        bPoint = new wPoint2D(0,- textHeight * 2);

        this.dxf_filename = this.pLabel.PartNumber + ".dxf";

        if ( myLabelSTR.length() > 0) {
            this.AddText(bPoint,textHeight,myLabelSTR);
        }
    }

    /**
      * AddShape801Part(A,B,C,D)
      * <pre>Add one gusset into the Entities' Section
      * @param A - Length;
      * @param B - Length;
      * @param C - Length;
      * @param D - Angle;
     *	</pre>
     */
    public void AddShape801Part(double A,double B,double C,double D) {
        String myLabelSTR;
        double textHeight;
        wPoint2D bPoint;

        this.AddShape801(A,B,C,D);

        myLabelSTR = pLabel.GetLabelSTR();
        textHeight = (A + B) / 40;
        bPoint = new wPoint2D(0,- textHeight * 2);

        this.dxf_filename = this.pLabel.PartNumber + ".dxf";

        if ( myLabelSTR.length() > 0) {
            this.AddText(bPoint,textHeight,myLabelSTR);
        }
    }

    /**
      * AddShape802Part(A,B,C)
      * <pre>Add one gusset into the Entities' Section
      * @param A - Length;
      * @param B - Length;
      * @param C - Chamfer size;
     *	</pre>
     */
    public void AddShape802Part(double A,double B,double C) {
        String myLabelSTR;
        double textHeight;
        wPoint2D bPoint;

        this.AddShape802(A,B,C);

        myLabelSTR = pLabel.GetLabelSTR();
        textHeight = A / 20;
        bPoint = new wPoint2D(0,- textHeight * 2);

        this.dxf_filename = this.pLabel.PartNumber + ".dxf";

        if ( myLabelSTR.length() > 0) {
            this.AddText(bPoint,textHeight,myLabelSTR);
        }
    }

    /**
      * AddShape803Part(L3,A,H1)
      * <pre>Add shape 803 into the Entities' Section
      * @param L3 - Length;
      * @param A - ;
      * @param H1 - ;
     *	</pre>
     */
    public void AddShape803Part(double L3,double A,double H1) {
        String myLabelSTR;
        double textHeight;
        wPoint2D bPoint;

        this.AddShape803(L3,A,H1);

        myLabelSTR = pLabel.GetLabelSTR();
        textHeight = (A + H1) / 50;
        bPoint = new wPoint2D(0,- textHeight * 2);

        this.dxf_filename = this.pLabel.PartNumber + ".dxf";

        if ( myLabelSTR.length() > 0) {
            this.AddText(bPoint,textHeight,myLabelSTR);
        }
    }

    /**
      * AddShape804Part(L3,A,H1)
      * <pre>Add shape 803 into the Entities' Section
      * @param L3 - Length;
      * @param A - ;
      * @param H1 - ;
     *	</pre>
     */
    public void AddShape804Part(double L3,double A,double H1) {
        String myLabelSTR;
        double textHeight;
        wPoint2D bPoint;

        this.AddShape804(L3,A,H1);

        myLabelSTR = pLabel.GetLabelSTR();
        textHeight = (A + H1) / 50;
        bPoint = new wPoint2D(0,- textHeight * 2);

        this.dxf_filename = this.pLabel.PartNumber + ".dxf";

        if ( myLabelSTR.length() > 0) {
            this.AddText(bPoint,textHeight,myLabelSTR);
        }
    }

    /**
      * AddShape805Part(A,B,C,D,E)
      * <pre>Add one gusset into the Entities' Section
      * @param A - Length;
      * @param B - Length;
      * @param C - Length;
      * @param D - Length;
      * @param E - Chamfer size;
     *	</pre>
     */
    public void AddShape805Part(double A,double B,double C,double D,double E) {
        String myLabelSTR;
        double textHeight;
        wPoint2D bPoint;

        this.AddShape805(A,B,C,D,E);

        myLabelSTR = pLabel.GetLabelSTR();
        textHeight = (A + B) / 40;
        bPoint = new wPoint2D(0,- textHeight * 2);

        this.dxf_filename = this.pLabel.PartNumber + ".dxf";

        if ( myLabelSTR.length() > 0) {
            this.AddText(bPoint,textHeight,myLabelSTR);
        }
    }

    /**
      * AddShape806Part(A,B,C,D,E,F)
      * <pre>Add one gusset into the Entities' Section
      * @param A - Length;
      * @param B - Length;
      * @param C - Length;
      * @param D - Length;
      * @param E - Chamfer size;
      * @param F - Chamfer size;
     *	</pre>
     */
    public void AddShape806Part(double A,double B,double C,double D,double E,double F) {
        String myLabelSTR;
        double textHeight;
        wPoint2D bPoint;

        this.AddShape806(A,B,C,D,E,F);

        myLabelSTR = pLabel.GetLabelSTR();
        textHeight = (A + B) / 40;
        bPoint = new wPoint2D(0,- textHeight * 2);

        this.dxf_filename = this.pLabel.PartNumber + ".dxf";

        if ( myLabelSTR.length() > 0) {
            this.AddText(bPoint,textHeight,myLabelSTR);
        }
    }

    /**
      * AddShape807Part(A,B,C,D,E,F,G)
      * <pre>Add one gusset into the Entities' Section
      * @param A - Length;
      * @param B - Length;
      * @param C - Length;
      * @param D - Length;
      * @param E - Length;
      * @param F - Length;
      * @param G - Chamfer size;
     *	</pre>
     */
    public void AddShape807Part(double A,double B,double C,double D,double E,double F,double G) {
        String myLabelSTR;
        double textHeight;
        wPoint2D bPoint;

        this.AddShape807(A,B,C,D,E,F,G);

        myLabelSTR = pLabel.GetLabelSTR();
        textHeight = (A + B) / 50;
        bPoint = new wPoint2D(0,- textHeight * 2);

        this.dxf_filename = this.pLabel.PartNumber + ".dxf";

        if ( myLabelSTR.length() > 0) {
            this.AddText(bPoint,textHeight,myLabelSTR);
        }
    }

    /**
     * AddShape808Part(A,B,C,D)
     * <pre>Add one gusset into the Entities' Section
     * @param A - Length;
     * @param B - Length;
     * @param C - Diameter;
     * @param D - l;
     *	</pre>
    */
    public void AddShape808Part(double A,double B,double C,double D) {
        String myLabelSTR;
        double textHeight;
        wPoint2D bPoint;

        this.AddShape808(A,B,C,D);

        myLabelSTR = pLabel.GetLabelSTR();
        textHeight = (A + B) / 50;
        bPoint = new wPoint2D(0,- textHeight * 2);

        this.dxf_filename = this.pLabel.PartNumber + ".dxf";

        if ( myLabelSTR.length() > 0) {
            this.AddText(bPoint,textHeight,myLabelSTR);
        }
    }

    /**
      * AddShape809Part(A,B,C,D,E,F,G,H,I)
      * <pre>Add one gusset into the Entities' Section
      * @param A - Length;
      * @param B - Length;
      * @param C - Length;
      * @param D - Length;
      * @param E - Length;
      * @param F - Length;
      * @param G - Diameter;
      * @param H - l;
      * @param I - l;
     *	</pre>
     */
    public void AddShape809Part(double A,double B,double C,double D,double E,double F,double G,double H,double I) {
        String myLabelSTR;
        double textHeight;
        wPoint2D bPoint;

        this.AddShape809(A,B,C,D,E,F,G,H,I);

        myLabelSTR = pLabel.GetLabelSTR();
        textHeight = (A + B) / 50;
        bPoint = new wPoint2D(0,- textHeight * 2);

        this.dxf_filename = this.pLabel.PartNumber + ".dxf";

        if ( myLabelSTR.length() > 0) {
            this.AddText(bPoint,textHeight,myLabelSTR);
        }
    }

    /**
     * AddShape810Part(A,C,E,F,G)
     * <pre>Add one gusset into the Entities' Section
     * @param A - Length;
     * @param C - Length;
     * @param E - Diameter;
     * @param F - Length;
     * @param G - Radius;
     *	</pre>
    */
    public void AddShape810Part(double A,double C,double E,double F,double G) {
        String myLabelSTR;
        double textHeight;
        wPoint2D bPoint;

        this.AddShape810(A,C,E,F,G);

        myLabelSTR = pLabel.GetLabelSTR();
        textHeight = (A + C) / 50;
        bPoint = new wPoint2D(-A,- C / 2 - textHeight * 2);

        this.dxf_filename = this.pLabel.PartNumber + ".dxf";

        if ( myLabelSTR.length() > 0) {
            this.AddText(bPoint,textHeight,myLabelSTR);
        }
    }

    /**
     * AddShape811Part(B,C,D,E,F,G,H)
     * <pre>Add one gusset into the Entities' Section
     * @param B - Length;
     * @param C - Length;
     * @param D - Length;
     * @param E - Diameter;
     * @param F - Length;
     * @param G - Radius;
     * @param H - l;
     *	</pre>
    */
    public void AddShape811Part(double B,double C,double D,double E,double F,double G,double H) {
        String myLabelSTR;
        double textHeight;
        wPoint2D bPoint;

        this.AddShape811(B,C,D,E,F,G,H);

        myLabelSTR = pLabel.GetLabelSTR();
        textHeight = (C + B) / 50;
        bPoint = new wPoint2D(0,- C / 2 - textHeight * 2);

        this.dxf_filename = this.pLabel.PartNumber + ".dxf";

        if ( myLabelSTR.length() > 0) {
            this.AddText(bPoint,textHeight,myLabelSTR);
        }
    }

    /*
     * AddShape812Part(A,B,C,D,E,F,G,H)
     * <pre>Add one gusset into the Entities' Section
     * @param A - Length;
     * @param B - Length;
     * @param C - Length;
     * @param D - Length;
     * @param E - Diameter;
     * @param F - Length;
     * @param G - Radius;
     * @param H - l;
     *	</pre>
    */
    public void AddShape812Part(double A,double B,double C,double D,double E,double F,double G,double H) {
        String myLabelSTR;
        double textHeight;
        wPoint2D bPoint;

        this.AddShape812(A,B,C,D,E,F,G,H);

        myLabelSTR = pLabel.GetLabelSTR();
        textHeight = (A + B) / 50;
        bPoint = new wPoint2D(-A ,- C / 2 - textHeight * 2);

        this.dxf_filename = this.pLabel.PartNumber + ".dxf";

        if ( myLabelSTR.length() > 0) {
            this.AddText(bPoint,textHeight,myLabelSTR);
        }
    }

    /**
     * AddShape820Part(A,B,R)
     * <pre>Add shape 820 into the Entities' Section
     * @param A - Length;
     * @param B - Height;
     * @param R - big radius of the Arc;
     *	</pre>
    */
    public void AddShape820Part(double A,double B,double R) {
        String myLabelSTR;
        double textHeight;
        wPoint2D bPoint;

        this.AddShape820(A,B,R);

        myLabelSTR = pLabel.GetLabelSTR();
        textHeight = (A + B) / 40;
        bPoint = new wPoint2D(0,- textHeight * 2);

        this.dxf_filename = this.pLabel.PartNumber + ".dxf";

        if ( myLabelSTR.length() > 0) {
            this.AddText(bPoint,textHeight,myLabelSTR);
        }
    }

    /**
      * AddShape850Part(L,L1,D)
      * <pre>Add shape 850 into the Entities' Section
      * @param L - Length;
      * @param L1 - Height;
      * @param D - Diameter of the Circle;
     *	</pre>
     */
    public void AddShape850Part(double L,double L1,double D) {
        String myLabelSTR;
        double textHeight;
        wPoint2D bPoint;

        this.AddShape850(L,L1,D);

        myLabelSTR = pLabel.GetLabelSTR();
        textHeight = (L + L) / 40;
        bPoint = new wPoint2D(0,- textHeight * 2);

        this.dxf_filename = this.pLabel.PartNumber + ".dxf";

        if ( myLabelSTR.length() > 0) {
            this.AddText(bPoint,textHeight,myLabelSTR);
        }
    }

    /**
      * AddShape851Part(L,H,L1,D)
      * <pre>Add shape 851 into the Entities' Section
      * @param L - Length;
      * @param H - Height;
      * @param L1 - Height;
      * @param D - Diameter of the Circle;
     *	</pre>
     */
    public void AddShape851Part(double L,double H,double L1,double D) {
        String myLabelSTR;
        double textHeight;
        wPoint2D bPoint;

        this.AddShape851(L,H,L1,D);

        myLabelSTR = pLabel.GetLabelSTR();
        textHeight = (L + H) / 40;
        bPoint = new wPoint2D(0,- textHeight * 2);

        this.dxf_filename = this.pLabel.PartNumber + ".dxf";

        if ( myLabelSTR.length() > 0) {
            this.AddText(bPoint,textHeight,myLabelSTR);
        }
    }

    /**
     * AddShape852Part(A,B,C,D,E,F,G,H)
     * <pre>Add shape 852 into the Entities' Section
     * @param A - Length;
     * @param B -
     * @param C -
     * @param D - ;
     * @param E - ;
     * @param F - ;
     * @param G - ;
     * @param H - ;
     *	</pre>
    */
    public void AddShape852Part(double A,double B,double C,double D,double E,double F,double G,double H) {
        String myLabelSTR;
        double textHeight;
        wPoint2D bPoint;

        this.AddShape852(A,B,C,D,E,F,G,H);

        myLabelSTR = pLabel.GetLabelSTR();
        textHeight = ( A + B ) / 40;
        bPoint = new wPoint2D(0,- textHeight * 2);

        this.dxf_filename = this.pLabel.PartNumber + ".dxf";

        if ( myLabelSTR.length() > 0) {
            this.AddText(bPoint,textHeight,myLabelSTR);
        }
    }

    /**
     * AddShape853Part(A,B,C,D,E,F)
     * <pre>Add shape 853 into the Entities' Section
     * @param A - Length;
     * @param B -
     * @param C -
     * @param D - ;
     * @param E - ;
     * @param F - ;
     *	</pre>
    */
    public void AddShape853Part(double A,double B,double C,double D,double E,double F) {
        String myLabelSTR;
        double textHeight;
        wPoint2D bPoint;

        this.AddShape853(A,B,C,D,E,F);

        myLabelSTR = pLabel.GetLabelSTR();
        textHeight = ( A + B ) / 40;
        bPoint = new wPoint2D(0,- textHeight * 2);

        this.dxf_filename = this.pLabel.PartNumber + ".dxf";

        if ( myLabelSTR.length() > 0) {
            this.AddText(bPoint,textHeight,myLabelSTR);
        }
    }

    /**
       * AddCYL2CYLPart(Diameter,diameter,length,h0,slice_n,Gama,Alpha,Beita,Thyta0,maxDeviation)
       * <pre>Add one donut into the Entities' Section
       * @param Diameter - Diameter of the big Pipe;
       * @param diameter - diameter of the small Pipe;
       * @param thickness - thickness of the small pipe;
       * @param length - length of the small pipe;
       * @param h0 - normally = 0;
       * @param slice_n - slice number of the expand small pipe;
       * @param Gama - rotate angle of x axis;
       * @param Alpha - rotate angle of y axis;
       * @param Beita - rotate angle of z axis;
       * @param Thyta0 - adjust angle of the expanded small pipe;
       * @param maxDeviation - maxDeviation;
     *	</pre>
      */
    public void AddCYL2CYLPart(double Diameter,double diameter,double thickness,double length,double h0,int slice_n,double Gama,double Alpha,double Beita,double Thyta0,double maxDeviation) throws Exception {
        String myLabelSTR;
        double textHeight;
        wPoint2D bPoint;

        BiArcFitting_Loft myBiArcs = new BiArcFitting_Loft();
        LoftCYL2CYL_Qian myLoft=new LoftCYL2CYL_Qian();

        myLoft.Radius = Diameter/2.0;
        myLoft.radius = diameter/2.0;

        myLoft.Sheet_Thickness = thickness;
        myLoft.L = length;
        myLoft.H0 = h0;
        myLoft.number = slice_n;
        myLoft.gama = Gama;
        myLoft.alpha = Alpha;
        myLoft.beita = Beita;
        myLoft.thyta0 = Thyta0;

        myLoft.ExpandCylinder_Qian();

        myBiArcs.stdDeviation = maxDeviation;
        myBiArcs.FittingExpandedCurve(myLoft.lofted_points);
        //myBiArcs.FittingClosedCurve(myLoft.lofted_points);

        this.secEntities.entities.add(new EntLine(0,0,0,myLoft.lofted_points[0][1]));
        this.secEntities.entities.add(new EntLine(0,0,myLoft.lofted_points[myLoft.lofted_points.length-1][0],0));
        this.secEntities.entities.add(new EntLine(myLoft.lofted_points[myLoft.lofted_points.length-1][0],0,myLoft.lofted_points[myLoft.lofted_points.length-1][0],myLoft.lofted_points[myLoft.lofted_points.length-1][1]));

        for (int j  =  0; j < myBiArcs.ExpandedCurveArcs.size(); j++) {
            //System.out.println(myBiArcs.ExpandedCurveArcs.get(j));
            this.secEntities.entities.add(myBiArcs.ExpandedCurveArcs.get(j));
        }

        myLabelSTR = pLabel.GetLabelSTR();
        textHeight = diameter * Math.PI / 30;
        bPoint = new wPoint2D(0,- textHeight * 2);

        this.dxf_filename = this.pLabel.PartNumber + ".dxf";

        if ( myLabelSTR.length() > 0) {
            this.AddText(bPoint,textHeight,myLabelSTR);
        }
    }

    /**
     * AddCYL2CYLPart(Diameter,diameter,length,h0,slice_n,Gama,Alpha,Beita,Thyta0,maxDeviation)
     * <pre>Add one donut into the Entities' Section
     * @param Diameter - Diameter of the big Pipe;
     * @param diameter - diameter of the small Pipe;
     * @param thickness - thickness of the small pipe;
     * @param length - length of the small pipe;
     * @param Thyta0 - adjust angle of the expanded small pipe;
     * @param maxDeviation - maxDeviation;
     *	</pre>
    */
    public void AddCYL2CYLPart(double Diameter,double diameter,double thickness,double length,double Thyta0,double maxDeviation) throws Exception {
        String myLabelSTR;
        double textHeight;
        wPoint2D bPoint;

        LoftCYL2CYL_Qian myLoft=new LoftCYL2CYL_Qian();

        myLoft.Radius = Diameter/2.0;
        myLoft.radius = diameter/2.0;

        myLoft.Sheet_Thickness = thickness;
        myLoft.L = length;
        myLoft.H0 = 0.0;
        //myLoft.number = 5000;
        myLoft.gama = 0.0;
        myLoft.alpha = 0.0;
        myLoft.beita = 0.0;
        myLoft.thyta0 = Thyta0;

        myLoft.number = 60;
        myLoft.ExpandCylinder_Qian();
        //myLoft.ExpandCylinder_p();

        EntLWPolyline myLWPolyline = new EntLWPolyline();
        for (int i = 0; i < myLoft.lofted_points.length; i++) {
            //System.out.println(myLoft.lofted_points[i][0] + "   " + myLoft.lofted_points[i][1]);
            myLWPolyline.AddVertex(new wPoint(myLoft.lofted_points[i][0],myLoft.lofted_points[i][1]));
        }
        this.secEntities.entities.add(myLWPolyline);

        this.AddLine(0,0,0,myLoft.lofted_points[0][1]);
        this.AddLine(0,0,myLoft.lofted_points[myLoft.lofted_points.length-1][0],0);
        this.AddLine(myLoft.lofted_points[myLoft.lofted_points.length-1][0],0,myLoft.lofted_points[myLoft.lofted_points.length-1][0],myLoft.lofted_points[myLoft.lofted_points.length-1][1]);

        this.dxf_filename = this.pLabel.PartNumber + "_pline" + ".dxf";
        this.DXF_WRITER();

        //Output JPG image
        ArrayList<Double> dataX, dataY;

        dataX = new ArrayList<Double>();
        dataY = new ArrayList<Double>();

        dataX.add(0.0);
        dataY.add(0.0);
        for (int i = 0; i < myLoft.lofted_points.length; i++) {
            dataX.add(myLoft.lofted_points[i][0]);
            dataY.add(myLoft.lofted_points[i][1]);
        }
        dataX.add(myLoft.lofted_points[myLoft.lofted_points.length-1][0]);
        dataY.add(0.0);
        dataX.add(0.0);
        dataY.add(0.0);

        this.jpg_filename = this.pLabel.PartNumber + "_image" +".jpg";

        AxisImage axisImage = new AxisImage(this.jpg_filename,dataX,dataY);
        axisImage.SetTitle("Expanded line of the pipe","Axis X","Axis Y");
        System.out.println(axisImage.generate());

        //For BiArcFitting
        myLoft=new LoftCYL2CYL_Qian();
        BiArcFitting_Loft myBiArcs = new BiArcFitting_Loft();
        myLoft.Radius = Diameter/2.0;
        myLoft.radius = diameter/2.0;

        myLoft.Sheet_Thickness = thickness;
        myLoft.L = length;
        myLoft.H0 = 0.0;
        myLoft.number = 4000;
        myLoft.gama = 0.0;
        myLoft.alpha = 0.0;
        myLoft.beita = 0.0;
        myLoft.thyta0 = Thyta0;

        this.secEntities = new SecEntities();
        myLoft.ExpandCylinder_Qian();

        myBiArcs.stdDeviation = maxDeviation;
        myBiArcs.FittingExpandedCurve(myLoft.lofted_points);

        for (int j  =  0; j < myBiArcs.ExpandedCurveArcs.size(); j++) {
            //System.out.println(myBiArcs.ExpandedCurveArcs.get(j));
            this.AddArc(myBiArcs.ExpandedCurveArcs.get(j));
        }

        this.AddLine(0,0,0,myLoft.lofted_points[0][1]);
        this.AddLine(0,0,myLoft.lofted_points[myLoft.lofted_points.length-1][0],0);
        this.AddLine(myLoft.lofted_points[myLoft.lofted_points.length-1][0],0,myLoft.lofted_points[myLoft.lofted_points.length-1][0],myLoft.lofted_points[myLoft.lofted_points.length-1][1]);

        myLabelSTR = pLabel.GetLabelSTR();
        textHeight = (diameter + Diameter) * Math.PI / 200;
        bPoint = new wPoint2D(0,- textHeight * 2);

        this.dxf_filename = this.pLabel.PartNumber + ".dxf";

        if ( myLabelSTR.length() > 0) {
            this.AddText(bPoint,textHeight,myLabelSTR);
        }


        /*
        BiArcFitting_Loft myBiArcs = new BiArcFitting_Loft();
        LoftCYL2CYL_Qian myLoft=new LoftCYL2CYL_Qian();

        myLoft.Radius = Diameter/2.0;
        myLoft.radius = diameter/2.0;

        myLoft.Sheet_Thickness = thickness;
        myLoft.L = length;
        myLoft.H0 = 0.0;
        myLoft.number = 5000;
        myLoft.gama = 0.0;
        myLoft.alpha = 0.0;
        myLoft.beita = 0.0;
        myLoft.thyta0 = Thyta0;

        myLoft.ExpandCylinder_Qian();

        myBiArcs.stdDeviation = maxDeviation;
        myBiArcs.FittingExpandedCurve(myLoft.lofted_points);
        //myBiArcs.FittingClosedCurve(myLoft.lofted_points);

        this.secEntities.entities.add(new EntLine(0,0,0,myLoft.lofted_points[0][1]));
        this.secEntities.entities.add(new EntLine(0,0,myLoft.lofted_points[myLoft.lofted_points.length-1][0],0));
        this.secEntities.entities.add(new EntLine(myLoft.lofted_points[myLoft.lofted_points.length-1][0],0,myLoft.lofted_points[myLoft.lofted_points.length-1][0],myLoft.lofted_points[myLoft.lofted_points.length-1][1]));

        for (int j  =  0; j < myBiArcs.ExpandedCurveArcs.size(); j++) {
        	//System.out.println(myBiArcs.ExpandedCurveArcs.get(j));
        	this.secEntities.entities.add(myBiArcs.ExpandedCurveArcs.get(j));
        }

        myLabelSTR = pLabel.GetLabelSTR();
        textHeight = diameter * Math.PI / 30;
        bPoint = new wPoint2D(0,- textHeight * 2);

        this.dxf_filename = this.pLabel.PartNumber + ".dxf";

        if ( myLabelSTR.length() > 0){
        	this.AddText(bPoint,textHeight,myLabelSTR);
        }
        */
    }

    /**
      * AddCYL2CYLPart(Radius,Diameter,diameter,thickness,BaseH,slice_n,Thyta0,maxDeviation)
      * <pre>Add one donut into the Entities' Section
      * @param Radius - Belted Radius of the Belted Pipe;
      * @param Diameter - Diameter of the big Pipe;
      * @param diameter - diameter of the small Pipe;
      * @param thickness - The thickness of the small Pipe;
      * @param BaseH - Height of the small pipe below the belted pipe;
      * @param slice_n - slice number of the expand small pipe;
      * @param Thyta0 - adjust angle of the expanded small pipe;
      * @param maxDeviation - maxDeviation;
     * Example: 915*610*426*2.0*300*4000*0*0.5
     *	</pre>
     */
    public void AddCYL2BeltedCYLPart(Double Radius,double Diameter,double diameter,double thickness,double BaseH,int slice_n,double Thyta0,double maxDeviation) throws Exception {
        String myLabelSTR;
        double textHeight;
        wPoint2D bPoint;

        LoftCYL2BeltedCYL_Qian myLoft=new LoftCYL2BeltedCYL_Qian();

        myLoft.R1 = Radius;
        myLoft.R2 = Diameter/2.0;
        myLoft.R3 = diameter/2.0;
        myLoft.Sheet_Thickness = thickness;
        myLoft.BaseH = BaseH;

        //myLoft.number = slice_n;
        myLoft.thyta0 = Thyta0;

        myLoft.number = 60;
        myLoft.ExpandCylinder();
        //myLoft.ExpandCylinder_p();

        EntLWPolyline myLWPolyline = new EntLWPolyline();
        for (int i = 0; i < myLoft.lofted_points.length; i++) {
            //System.out.println(myLoft.lofted_points[i][0] + "   " + myLoft.lofted_points[i][1]);
            myLWPolyline.AddVertex(new wPoint(myLoft.lofted_points[i][0],myLoft.lofted_points[i][1]));
        }
        this.secEntities.entities.add(myLWPolyline);

        this.AddLine(0,0,0,myLoft.lofted_points[0][1]);
        this.AddLine(0,0,myLoft.lofted_points[myLoft.lofted_points.length-1][0],0);
        this.AddLine(myLoft.lofted_points[myLoft.lofted_points.length-1][0],0,myLoft.lofted_points[myLoft.lofted_points.length-1][0],myLoft.lofted_points[myLoft.lofted_points.length-1][1]);

        this.dxf_filename = this.pLabel.PartNumber + "_pline" + ".dxf";
        this.DXF_WRITER();

        //Output JPG image
        ArrayList<Double> dataX, dataY;

        dataX = new ArrayList<Double>();
        dataY = new ArrayList<Double>();

        dataX.add(0.0);
        dataY.add(0.0);
        for (int i = 0; i < myLoft.lofted_points.length; i++) {
            dataX.add(myLoft.lofted_points[i][0]);
            dataY.add(myLoft.lofted_points[i][1]);
        }
        dataX.add(myLoft.lofted_points[myLoft.lofted_points.length-1][0]);
        dataY.add(0.0);
        dataX.add(0.0);
        dataY.add(0.0);

        this.jpg_filename = this.pLabel.PartNumber + "_image" +".jpg";

        AxisImage axisImage = new AxisImage(this.jpg_filename,dataX,dataY);
        axisImage.SetTitle("Expanded line of the pipe","Axis X","Axis Y");
        System.out.println(axisImage.generate());

        //For BiArcFitting
        myLoft=new LoftCYL2BeltedCYL_Qian();
        BiArcFitting_Loft myBiArcs = new BiArcFitting_Loft();
        myLoft.R1 = Radius;
        myLoft.R2 = Diameter/2.0;
        myLoft.R3 = diameter/2.0;
        myLoft.Sheet_Thickness = thickness;
        myLoft.BaseH = BaseH;

        myLoft.number = slice_n;
        myLoft.thyta0 = Thyta0;

        this.secEntities = new SecEntities();
        myLoft.ExpandCylinder();

        myBiArcs.stdDeviation = maxDeviation;
        myBiArcs.FittingExpandedCurve(myLoft.lofted_points);

        for (int j  =  0; j < myBiArcs.ExpandedCurveArcs.size(); j++) {
            //System.out.println(myBiArcs.ExpandedCurveArcs.get(j));
            this.AddArc(myBiArcs.ExpandedCurveArcs.get(j));
        }

        this.AddLine(0,0,0,myLoft.lofted_points[0][1]);
        this.AddLine(0,0,myLoft.lofted_points[myLoft.lofted_points.length-1][0],0);
        this.AddLine(myLoft.lofted_points[myLoft.lofted_points.length-1][0],0,myLoft.lofted_points[myLoft.lofted_points.length-1][0],myLoft.lofted_points[myLoft.lofted_points.length-1][1]);

        myLabelSTR = pLabel.GetLabelSTR();
        textHeight = (Radius + Diameter) * Math.PI / 200;
        bPoint = new wPoint2D(0,- textHeight * 2);

        this.dxf_filename = this.pLabel.PartNumber + ".dxf";

        if ( myLabelSTR.length() > 0) {
            this.AddText(bPoint,textHeight,myLabelSTR);
        }
    }

}

