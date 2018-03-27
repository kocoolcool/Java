package Chris.Chapter09.AdvacedClass;

class CCircle{       
   private static double pi=3.14;
   private double radius;

   public CCircle(double r)
   {
      radius=r;
   }
   public  double average(CCircle c[]) {
	   double ave=0.0;
	   for(int i=0;i<c.length;i++)
		   ave+=c[i].radius;
	   return (ave/c.length);
   }
   public static double compare(CCircle c[])  // compare() method
   {
      double max=0.0;
      for(int i=0;i<c.length;i++)
         if(c[i].radius>max)
            max=c[i].radius;
      return max;
   }
}

public class Hw0914
{
   public static void main(String args[])
   {
      CCircle cir[];
      cir=new CCircle[3];
      cir[0]=new CCircle(3.0);
      cir[1]=new CCircle(4.0);
      cir[2]=new CCircle(2.0);
      CCircle a=new CCircle(0);
      System.out.println("Largest radius = "+CCircle.compare(cir));
      System.out.println("Average radius = "+a.average(cir));
      
   }
}

