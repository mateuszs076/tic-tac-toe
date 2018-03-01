package application;

public class Area {
	static int[] area={0,0,0,0,0,0,0,0,0,0};//area[0] number of move
	
	public static Boolean compare(int a, int b, int c)
	{
		if(Area.area[a]==Area.area[b] && Area.area[a]==Area.area[c] && Area.area[a]!=0)
			return true;
		else
			return false;
	}

	public static int[] getArea() {
		return area;
	}

	public static void setArea(int[] area) {
		Area.area = area;
	}
}
