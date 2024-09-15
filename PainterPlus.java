import org.code.neighborhood.*;

public class PainterPlus extends Painter{
  
/* turnRight - turns painter object to the right*/
  
  public void turnRight() {
      turnLeft();
      turnLeft();
      turnLeft();    
    }

/* takeAllPaint - takes all the paint from the bucket the painter is standing on*/
  
  public void takeAllPaint() {
    while (isOnBucket()) {
      takePaint();
        }
  }

/* moveFast - painter moves forward until it hits an obstacle no longer allowing it to move forward*/
  
  public void moveFast() {
    while(canMove()) {
      move();
      }
    }

  /* paintToEmpty - paints the square the painter is standing on then moves forward until the painter runs out of paint*/
  
  public void paintToEmpty(String color) {
    while(hasPaint()) {
      paint(color);
      move();
    }
  }

/* paintDonut - paints a 3x3 square with an empty square in the middle if the painter has paint*/
  
  public void paintDonut(String color) {
    while(hasPaint()) {
      move();
      turnRight();
      paint(color);
      move();
      paint(color);
      
    }
  }
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
  
  }
  