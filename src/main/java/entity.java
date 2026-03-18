import java.util.*;

public class Entity{
    Random rnum = new Random();
    int x;
    int y;
    int maxRadiusSplashing = 10;
    int hue;
    int fatoration;
    int bright;
    int maxColorChange;
    
  public Entity(int x,int y,int maxRadiusSplashing,int hue,int fatoration,int bright,int maxColorChange){
    rnum mutation = rnum.nextInt((maxRadiusSplashing * -1),(2 * maxRadiusSplashing));
    this.x = x + mutation;
  
  }
}
