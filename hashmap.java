import java.util.HashMap;
import java.util.Map;

public class MapDemo {
   public MapDemo() {
   }

   public static void main(String[] var0) {
      HashMap var1 = new HashMap();
      var1.put(1, 10);
      var1.put(202, 39);
      var1.put(102, 62);

      for(Map.Entry var3 : var1.entrySet()) {
         System.out.println(var3.getKey() + ":" + var3.getValue());
      }

      var1.put(202, 33);
      var1.remove(1);
   }
}