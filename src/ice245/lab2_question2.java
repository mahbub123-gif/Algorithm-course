package ice245;

public class lab2_question2 {
	public static int MinDistance(int [] ar) {
		int[] a =ar;
		int aSize = a.length-1;
		int dMin = 999999;
		for(int i=0; i<aSize;i++) {
			for(int j=i+1;j < aSize; j++) {
				if(i!=j && (Math.abs(a[i]-a[j])<dMin)){
					dMin = Math.abs(a[i]-a[j]);
				}
			}
		}
		return dMin;
	}

	public static void main(String[] args) {
		int [] Array1= {2,5,9,15};
		System.out.println("Array lenght =" +Array1.length);
		System.out.println("the distance between the closest elements :" + MinDistance(Array1));

	}

}
