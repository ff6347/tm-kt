package svnTest;

import processing.core.*;
// check this link in the processing reference for all PSahpe functions
// http://processing.org/reference/PShape.html
@SuppressWarnings("serial")
public class Main extends PApplet {
	
//	PImage img = new PImage();
//	PImage mask;
	PShape mySVG;
	
	public void setup(){
		size(800,800);
		mySVG = loadShape("../data/tmktSvgTest.svg");

//		img = loadImage("../resource/studio.jpg");
//		mask = new PImage(img.width,img.height); 
//		mask.format = ALPHA;
//		for(int x=0;x<mask.width/2;x++){
//			for(int y=0;y<mask.height/2;y++){
//				mask.pixels[y*mask.width + x] = 255;
//			}
//		}
	}
	
	public void draw(){
		int myX= width/2;
		int myY = height/2;
		background(0,0,0);
//		disables all svg intern styles and passes only the paths
		mySVG.disableStyle();
		shapeMode(CENTER);
		
		fill(255,0,0);
//		without a Coordiantes and width and height the Svg ist drawn at 0,0, with his own size
		shape(mySVG);
		fill(255,0,0,200);
// 		with coordinates and without size it is drawn at the defined location in his own size
		shape(mySVG,myX+5,myY+5);
		fill(255,0,0,100);
//		all Fields used Coordinates and width and height. 
		shape(mySVG,myX+23,myY+23,mySVG.width-42,mySVG.height-42);
		
		mySVG.enableStyle();

		
//		ellipse(50, 50, 30, 20);
//		ellipse(150, 50, 30, 20);
//		img.mask(mask.pixels);
//		image(img,0,0);
		
	}
}
