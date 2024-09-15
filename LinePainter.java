import org.code.neighborhood.*;

/*
 * LinePainter is a PainterPlus that paints
 * lines in The Neighborhood
 */
public class LinePainter extends PainterPlus {

  
  /*
   * Paints a line with the color where the length
   * of the line is specified by spaces
   */
  public void paintLine(String color, int spaces) {
    int space = spaces;

    while (space>0) {
      paint(color);

      if (canMove()) {
        move();
      }
      space = space - 1;
    }
  }
    /* moveSpaces - moves painter forward a 
    specified number of spaces*/
    
  public void moveSpaces (int spaces){
    int space = spaces;
    while (space>0){
      move();
      space = space - 1;
    }
    
  }
  }

  