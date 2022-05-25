package ua.lviv.lgs;

public class Restriction<T extends Number>{
	
	T[]nums;

	public Restriction(T[] nums) {
		super();
		this.nums = nums;
	}
	
	public double average() {
		double sum =0;
		for(int i = 0; i< nums.length; i++) {
			sum += nums[i].doubleValue(); 
		}
		return sum/nums.length;
	}

}
