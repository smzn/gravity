package gravity;

public class Gravity_lib {
	
	private double K = 0.145722117443322;
	private double a, b, c;
	private double [][] d;
	private double []p;
	
	public Gravity_lib(double a, double b, double c, double[][] d, double[] p) {
		this.a = a;
		this.b = b;
		this.c = c;
		this.d = d;
		this.p = p;
	}
	
	public double [][] calcGravity(){
		
		double f[][] = new double[p.length][p.length];
		
		for(int i = 0; i < p.length; i++){
			for(int j = 0; j < p.length; j++){
				f[i][j] = K*p[i]*p[j]/d[i][j];
			}
		}
		//行和を１に正規化
		for(int i = 0; i < p.length; i++){
			double sum = 0;
			for(int j = 0; j < p.length; j++){
				sum += f[i][j];
			}
			for(int j = 0; j < p.length; j++){
				f[i][j] /= sum;
			}
		}
		
		return f;
		
	}
	
	

}
