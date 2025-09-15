class Solution {
    public int trap(int[] height) {
        int maxi = 0;
        int sum = 0;
        int[] temp = new int[height.length];
        
        for(int i=height.length-1;i>=0;i--){
            temp[i] = Math.max(height[i],maxi);
            maxi = Math.max(maxi,height[i]);
        }
        maxi = 0;
        for(int i=0;i<height.length;i++){
            int left_max = Math.max(height[i], maxi);
            maxi = Math.max(maxi,height[i]);
            int ans = Math.min(left_max,temp[i]);
            sum += ans - height[i];
            
        }
        return sum;
    }
}