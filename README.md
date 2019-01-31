# DXFR2000
Operate AutoCAD DXF file without AutoCAD environment. compatible with AutoCAD R2000 at least.

ENTITIES:<BR>
----ARC<BR>
----CIRCLE<BR>
----LINE<BR>
----LWPOLYLINE<BR>
----POINT<BR>
----TEXT<BR>
----ELLIPSE<BR>
  
  
  Vesatile Contructors:
  
void	AddEllipse()<BR>
AddEllipse(empty) default Ellipse.

void	AddEllipse(double x_value, double y_value, double ratio_value)<BR>
AddEllipse(x_value,y_value,ratio_value)

void	AddEllipse(double x_value, double y_value, double z_value, double ratio_value)<BR>
AddEllipse(x_value,y_value,z_value,ratio_value)

void	AddEllipse(double xc_value, double yc_value, double xl_value, double yl_value, double ratio_value)<BR>
AddEllipse(xc_value, yc_value, zc_value, xl_value, yl_value, zl_value, ratio_value)

void	AddEllipse(double x_value, double y_value, double z_value, double ratio_value, double sAngle_value, double eAngle_value)<BR>
AddEllipse(x_value,y_value,z_value,ratio_value,sAngle_value,eAngle_value)

void	AddEllipse(double xc_value, double yc_value, double xl_value, double yl_value, double ratio_value, double sAngle_value, double eAngle_value)<BR>
AddEllipse(xc_value, yc_value, zc_value, xl_value, yl_value, zl_value, ratio_value, sAngle_value,eAngle_value)

void	AddEllipse(double xc_value, double yc_value, double zc_value, double xl_value, double yl_value, double zl_value, double ratio_value, double sAngle_value, double eAngle_value)<BR>
AddEllipse(xc_value, yc_value, zc_value, xl_value, yl_value, zl_value, ratio_value, sAngle_value,eAngle_value)

void	AddEllipse(EntEllipse oneEllipse)<BR>
AddEllipse(oneEllipse)

void	AddEllipse(wPoint2D lP, double ratio_value)<BR>
AddEllipse(lP,ratio_value)

void	AddEllipse(wPoint2D cP, double Radius, double radius)<BR>
AddEllipse(cP,Radius,radius)

void	AddEllipse(wPoint2D lP, double ratio_value, double sAngle_value, double eAngle_value)<BR>
AddEllipse(lP,ratio_value,sAngle_value,eAngle_value)

void	AddEllipse(wPoint2D cP, wPoint2D lP, double ratio_value)<BR>
AddEllipse(cP,lP,ratio_value)

void	AddEllipse(wPoint2D cP, wPoint2D lP, double ratio_value, double sAngle_value, double eAngle_value)<BR>
AddEllipse(cP,lP,ratio_value,sAngle_value,eAngle_value)

void	AddEllipse(wPoint2D Pc, wPoint2D Pa, wPoint2D Pb)<BR>
AddEllipse(Pc,Pa,Pb)

void	AddEllipse(wPoint cP, wPoint lP, double ratio_value)<BR>
AddEllipse(cP,lP,ratio_value)

void	AddEllipse(wPoint cP, wPoint lP, double ratio_value, double sAngle_value, double eAngle_value)<BR>
AddEllipse(cP,lP,ratio_value,sAngle_value,eAngle_value)

Now, this project supports chinese character set(use system truetype font Arial.ttf). Thanks to JadeChong https://github.com/JadeChong <BR>
Unicode convert：
  This is mine.\U+4e2d\U+6587\U+6d4b\U+8bd5
  
  This project supoorts 20W+ Entities.(Tested succeed)
  
  
