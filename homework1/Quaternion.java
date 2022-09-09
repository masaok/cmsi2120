public class Quaternion {

   private double x;
   private double y;
   private double z;
   private double s;

   public Quaternion(double x, double y, double z, double s) {

      if (Double.isNaN(x) || Double.isNaN(y) || Double.isNaN(z) || Double.isNaN(s)) {
         throw new IllegalArgumentException("NaN");
      }

      // Copilot wrote this, Github
      this.x = x;
      this.y = y;
      this.z = z;
      this.s = s;

   }

   public double a() {
      return x;
   }

   public double b() {
      return y;
   }

   public double c() {
      return z;
   }

   public double d() {
      return s;
   }

}
