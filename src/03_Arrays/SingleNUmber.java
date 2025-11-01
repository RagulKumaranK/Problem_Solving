;
public class SingleNUmber {
    public static void main(String[] args) {
        int[] nums = {4,1,2,2,1,3,3};
        int result = singleNumber(nums);
        System.out.println(result);
    }
    public static int singleNumber(int[] nums) {
        /* 
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int num : nums){
            map.put(num,map.getOrDefault(num,0)+1);
        }
        for(int num : nums){
            if(map.get(num)==0) return num;
        }
        return -1;
        */
        int resul =0;
        for(int num :nums){
            resul^=num;
        }
        return resul;
        
    }
    
}
