
public class Lottery {

	public static void main(String[] args) {
		int[] nums = new int[40];
		for(int i = 1; i<40; i++) {
			nums[i]=i;
		}
		for(int i =1; i<40;i++) {
			int r = (int)Math.ceil(Math.random()* 39);
			int temp = nums [i];
			nums[i]=nums[r];
			nums[r]=temp;
			
		}
		for(int i =1; i<7;i++) {
			System.out.println(Integer.toString(nums[i]) + "");
		}

	}

}
