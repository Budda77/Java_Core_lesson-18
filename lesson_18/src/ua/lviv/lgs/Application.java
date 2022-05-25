package ua.lviv.lgs;

import java.util.ArrayList;
import java.util.List;

public class Application {
	public static void main(String[] args) {
		
		//with one generic
		SimpleGenerics<Integer> iObj = new SimpleGenerics<Integer>(88);
		iObj.showType();
		
		int value = iObj.getOb();
		System.out.println("Value of simple object is " + value);
		
		SimpleGenerics<String> sObj = new SimpleGenerics<String>("Java");
		sObj.showType();
		
		String values = sObj.getOb();
		System.out.println("Value of simple object is " + values);
		
		System.out.println();
		//with two generic
		TwoGen<Integer, String> tgObj = new TwoGen<Integer, String>(90, "Run Forest run");
		tgObj.showType();
		
		int valuetgObj = tgObj.getOb1();
		System.out.println("Value of simple object is " + valuetgObj);
		String valuestgObj = tgObj.getOb2();
		System.out.println("Value of simple object is " + valuestgObj);
		
		System.out.println();
		
		Integer[] iNums = {1,2,3,4,5};
		Restriction<Integer> iObRes = new Restriction<Integer>(iNums);
		
		double averageiObRes = iObRes.average();
		System.out.println("Average value of iNums is "+ averageiObRes);
		
		Double[] dNums = {1.1,2.2,3.3,4.4,5.5};
		Restriction<Double> dObRes = new Restriction<Double>(dNums);
		
		double averagedObRes = dObRes.average();
		System.out.println("Average value of iNums is "+ averagedObRes);
		
		//will not work because of boundmismatch
//		String[] strNums = {"1","2","3"};
//		Restriction<String> stringRes = new Restriction<String>(strNums);
		
		
		//wild cards
		TwoC tc [] = {
				new TwoC(0,0),
				new TwoC(7,8),
				new TwoC(18,4),
				new TwoC(-1,-23),
		};
		
		Coords<TwoC> tclocs = new Coords<>(tc);
		System.out.println("Value of tclocs");
		Coords.showXY(tclocs);
		
		//will not compile
//		tclocs.showXYZ(tc);
//		tclocs.showXYZT(tc);
		
		FourC fd [] = {
				new FourC(1,2,3,4),
				new FourC(6,8,14,8),
				new FourC(22,21,33,44),
				new FourC(71,42,63,45),
				new FourC(31,12,32,41)
		};
		
		Coords<FourC> fclocs = new Coords<>(fd);
		System.out.println("Value of fclocs is");
		Coords.showXY(fclocs);
		Coords.showXYZ(fclocs);
		Coords.showXYZT(fclocs);
		
		Generic3<String, Integer> x = new Generic3<>("Value is",99);
		System.out.println(x.getOb());
		System.out.println(x.getOb2());
		
		
		
		

		

		
		
		
	}

}
