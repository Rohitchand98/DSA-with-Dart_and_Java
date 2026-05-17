
void main(){
    int[] prices={7,1,5,3,6,4};
    

    //This is Optimal Solution
    int left=0;
    int rig=1;
    int max=0;

    while(rig!=prices.length){
        if(prices[left]<prices[rig]){
            int prof=prices[rig]-prices[left];
            max=Math.max(max, prof);
        }else{
            left=rig;
        }
        rig++;
    }
    IO.print(max);
}