package Chris.Chapter09.AdvacedClass;

class CCircle2        
{
   private static double pi=3.14;
   private double radius;

   public CCircle2(double r)      
   {
      radius=r;
   }
   public void show()
   {
      System.out.println("area="+pi*radius*radius);
   }
   
}
public class Hw0916
{
   public static void main(String args[])
   {
      CCircle2 cir[];
      cir=new CCircle2[6];
//      cir[0]=new CCircle2(0.0);
//      cir[1]=new CCircle2(1.0);
//      cir[2]=new CCircle2(2.0);
//
//      cir[0].show();   
//      cir[1].show();   
//      cir[2].show();   
      
   	   for(int i=0;i<cir.length;i++) {
   		   cir[i]=new CCircle2((double) i);
   		  cir[i].show();
   	   }
      }
   }


