import java.util.*;

public class entity
{
    Random rnum = new Random();
    int x;
    int y;
    int maxRadiusSplashing = 10;
    int hue;
    int saturation;
    int bright;
    int maxColorChange = 5;
    
  public entity(int x,int y,int hue,int saturation,int bright)
  {
    int mutation = rnum.nextInt((maxRadiusSplashing * -1),(maxRadiusSplashing));
    int colorMutation = rnum.nextInt((maxColorChange), (- maxColorChange));
    this.x = x + mutation;
    this.y = y + mutation;
    this.hue = hue + colorMutation;
    this.saturation = saturation + colorMutation;
    this.bright = bright + colorMutation;
  }
  public ArrayList<entity> gen()
  {
    return
    new ArrayList<entity>
    (Arrays.asList(
    new entity(this.x, this.y, this.hue, this.saturation, this.bright),
    new entity(this.x, this.y, this.hue, this.saturation, this.bright)
        )
      )
    ;
  }
}
