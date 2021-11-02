
public class Plot {
	private int x, y, width, depth;
	
	public Plot() {
		this.x=0;
		this.y=0;
		this.width=0;
		this.depth=0;
	}
	
	public Plot(Plot p) {
		this.x=p.x;
		this.y=p.y;
		this.width=p.width;
		this.depth=p.depth;
	}
	
	public Plot(int x, int y, int width, int depth) {
		this.x=x;
		this.y=y;
		this.width=width;
		this.depth=depth;
	}
	
public Boolean overlaps(Plot plot) {
        int x1 = x;
        int widthx = width + x;
        int y1 = y;
        int depthy = depth + y;

        int x2 = plot.x;
        int width2 = plot.width + plot.x;
        int y2 = plot.y;
        int depth2 = plot.depth + plot.y;
        
        if(x1 < width2 && widthx > x2 && y1 < depth2 && depthy > y2) {
            return true;
        } else {
            return false; 
        }
        
    }
    
    public Boolean encompasses(Plot plot) {
        
        int x1 = x;
        int width1 = width + x;
        int y1 = y;
        int depth1 = depth + y;
        
        int x2 = plot.x;
        int width2 = plot.width + plot.x;
        int y2 = plot.y;
        int depth2 = plot.depth + plot.y;
        
        if(x2 >= x1 && width2 <= width1 && y2 <= depth1 && depth2 >= y1) {
            
            return true;
        } else {
            return false; 
        }
        
    }
	
	public String toString() {
		return "Upper left: (" + this.x + "," + this.y + "); Width: " + this.width + " Depth: " + this.depth;
	}
	
	//setter and getter for x
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x=x;
	}
	
	//setter and getter for y
	public int getY() {
		return this.y;
	}
	public void setY(int y) {
		this.y=y;
	}
	
	//setter and getter for width
	public void setWidth(int width) {
		this.width=width;
	}
	public int getWidth() {
		return this.width;
	}
	
	//setter and getter for depth
	public int getDepth() {
		return this.depth;
	}
	public void setDepth(int depth) {
		this.depth=depth;
	}
}
