import processing.core.PApplet;

public class Sketch extends PApplet {
	
  /**
   * A program Sketch.java that is design to make a flower!
   * @author : Simon Tse
   */

  public void settings() {
	// Size of the drawing
    size(600, 600);
  }

  public void setup() {
  // Colour of the background
    background(184, 211, 255);
  }

  public void draw() {
	  
  // Stem 
    strokeWeight (30);
    stroke (42, 130, 22);
    line (width / 2, height / 2, width / 2, height * 11 / 12 );

  // Petals
    strokeWeight (1);
    stroke (0);
    fill (235, 156, 255);
    ellipse (width * 5 / 12, height * 5 / 12, width / 6, height / 6); 
    ellipse (width * 7 / 12, height * 7 / 12, width / 6, height / 6);
    ellipse( width * 5 / 12, height * 7 / 12, width / 6, height / 6);
    ellipse(width * 7 / 12, height * 5 / 12, width / 6, height / 6);

  // Middle section of flower
    strokeWeight (1);
    stroke (0);
    fill( 255, 234, 0);
    ellipse(width / 2, height / 2, width / 6, height / 6);

  // Sun
    fill( 255, 234, 0);
    ellipse(width / 6, height / 6, width / 12, height / 12);
    triangle(width * 7 / 40, height * 13 / 60, width * 19 / 120, height * 13 / 60, width / 6, height / 4);
    triangle(width * 7 / 40, height * 7 / 60, width * 19 / 120, height * 7 / 60, width / 6, height / 12);
    triangle(width * 13 / 60, height * 7 / 40, width * 13 / 60, height * 19 / 120, width / 4, height / 6);
    triangle(width * 7 / 60, height * 7 / 40, width * 7 / 60, height * 19 / 120, width / 12, height / 6);
    triangle(width / 8, height * 17 / 120, width * 17 / 120, height / 8, width * 13 / 120, height * 13 / 120);
    triangle(width * 5 / 24, height * 17 / 120, width * 23 / 120, height / 8, width * 9 / 40, height * 13 / 120);
    triangle(width / 8, height * 23 / 120 , width * 17 / 120, height * 5 / 24, width * 13 / 120, height * 9 / 40);
    triangle(width * 5 / 24, height * 23 / 120, width * 23 / 120, height * 5 / 24, width * 9 / 40, height * 9 / 40);

  // ant house
   fill (242, 202, 172);
   triangle(width * 17 / 24, height * 5 / 6, width * 19 / 24, height * 5 / 6, width * 3 / 4, height * 3 / 4);
   rect(width * 17 / 24, height * 5 / 6, width / 12, height / 12);
   fill (102, 94, 71);
   ellipse (width * 3 / 4, height * 11 / 12, width / 60, width / 24);

  // The ground
   fill( 48, 31, 18);
   rect ( 0, height * 11 / 12, width, height);
  }
}
  
