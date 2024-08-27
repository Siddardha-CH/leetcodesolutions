package leetcodesolutions;

class Solution {
    public List<List<Integer>> threeSum(int[] nums){
        List<List<Integer>> ss=new ArrayList<>();
        int n=nums.length;
        Arrays.sort(nums);
        for(int i=0;i<n-2;i++){
            if(i>0&&nums[i]==nums[i-1]){ 
                continue; 
            }
            for(int j=i+1;j<n-1;j++){
                if(j>i+1&&nums[j]==nums[j-1]){ 
                    continue; 
                }
                int s=-(nums[i]+nums[j]);
                int l=j+1;
                int r=n-1;
                while(l<=r){
                    int m=l+(r-l)/2;
                    if(nums[m]==s){
                        ArrayList<Integer> nn=new ArrayList<>();
                        nn.add(nums[i]);
                        nn.add(nums[j]);
                        nn.add(nums[m]);
                        ss.add(nn);
                        break;
                    }
                    if(nums[m]<s){
                        l=m+1;
                    } else {
                        r=m-1;
                    }
                }
            }
        }
        return ss;
    }
}
