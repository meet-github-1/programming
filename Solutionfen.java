class Solutionfen{
    long fen[];
    int len;
    public Solution(int[] nums){
        len=nums.length;
        buildfen(nums);
    }
    public void buildfen(int nums[]){
        fen=new long[len+1];
        for(int i=0;i<len;i++){
            update(i+1,nums[i]);
        }
    }
    public void update(int ind,int delta){
        while(ind<len+1){
            fen[ind]=fen[ind]+delta;
            ind=ind+Integer.lowestOneBit(ind);
        }
    }
    public long getsum(int ind){
        long sum=0;
        while(ind>0){
            sum=sum+fen[ind];
            ind=ind-Integer.lowestOneBit(ind);
        }
        return sum;
    }
    public long sum(int num1,int num2){
        long sum1=getsum(num1);
        long sum2=getsum(num2+1);
        return(sum2-sum1);
        
    }
}