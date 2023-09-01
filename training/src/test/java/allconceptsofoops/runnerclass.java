package allconceptsofoops;

public class runnerclass extends abstraction {

	public static void main(String[] args) {
		
		
			dairyproudts dp=new dairyproudts();
			dp.name();
			
			dp.available();
			dp.details();
			Dmart dm=new Dmart();
			dm.productnum(1,2);
			dm.productnum(1, 2, 3);
			
		runnerclass rc=new runnerclass();
		rc.completetask();
		rc.timing();
		}

	@Override
	public void timing() {
		System.out.println("timeings are recorded");
		
	}
}