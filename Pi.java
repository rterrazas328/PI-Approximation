//Ricardo Terrazas
//CS 113-H01
//ID - 21817096

public class Pi {

	private double areaSQ;
	private double radius;
	private double areaC;
	
	public Pi(double a){
		areaSQ = a;
		radius = Math.sqrt(areaSQ)/2;
		areaC = radius * radius * Math.PI;
	}
	
	
	public double getAreaRatios(){
		return (areaC / areaSQ);
	}
	
	public double probability(){
		return (areaC / areaSQ);
	}
	
	public double getPi(int times){
		double circle = 0;
		double square = 0;
		for (int i = 0; i < times; i++){
			double rand = Math.random() * areaSQ;
			if (rand <= areaC)
				circle++;
				square++;
		}
		return (circle/square) * 4;
	}
	
}