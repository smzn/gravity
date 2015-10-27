package gravity;

public class Gravity_main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//拠点間距離表
		double d[][] = {{1000,5,8,10,15},{5,1000,3,5,3},{8,3,1000,2,4},{10,5,2,1000,3},{15,3,4,3,1000}};//行を入力
		//拠点人口表
		double p[] = {10,15,5,5,5};
		
		Gravity_lib glib = new Gravity_lib(1,1,1,d,p);
		double f[][] = new double [p.length][p.length];
		f = glib.calcGravity();
		
		for(int i = 0; i < p.length; i++){
			for(int j = 0; j < p.length; j++){
				System.out.print("f["+i+"]["+j+"]="+f[i][j]);
			}
			System.out.println("");
		}

	}

}
