import java.util.*;

public class Main{
  public static void main(){

    Random rnum = new Random();

    int repChance = rnum.nextInt(1, 100);
    int hueDoFundo = 32;
    int hueDiferença;

    entity vampire = new entity (120, 120, 120, 80, 70);
    hueDiferença = ((hueDoFundo - vampire.hue + 180) % 360) - 180;
  }
}
