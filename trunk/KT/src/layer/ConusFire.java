package layer;


import java.util.ArrayList;

import processing.core.PApplet;
import utils.Container;

import com.modestmaps.core.Point2f;
import com.modestmaps.geo.Location;

public class ConusFire{
	
	public PApplet p;
	public String discrStr, styleUrlStr;
	public Location location;
	
	
	ConusFire(PApplet p,float cLat,float cLon, String cDiscr,String cStyleUrl){
		this(p,new Location(cLat,cLon),cDiscr,cStyleUrl);
	}

	ConusFire(PApplet p,Location cLocation, String cDiscr,String cStyleUrl){
		location = cLocation;
		discrStr = cDiscr;
		styleUrlStr = cStyleUrl;
		this.p = p;
	}
	
	
	  public void drawFire(ArrayList<Container> listener){
		   	for(Container container : listener){
	    		Point2f point = container.locationPoint(location);
	    		if(!container.isInside((int)point.x, (int)point.y)){
	    			continue;
	    		}
		p.smooth();
//	p.fill(255);
//	p.stroke(0);
		p.noStroke();
//	Point2f myPoint = map.locationPoint(location);
	p.ellipse(point.x, point.y, 10, 10);
	//float tw = p.textWidth(styleUrlStr);
//	p.rect(point.x + 9, point.y - 21, tw + 6 , 18);
//	p.line(point.x, point.y, point.x + 8, point.y - 3);
//	p.fill(0);
//	p.text(styleUrlStr, point.x + 11, point.y - 8);
	}
	
	}
}