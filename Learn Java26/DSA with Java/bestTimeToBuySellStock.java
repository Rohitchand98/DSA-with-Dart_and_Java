
void main(){
    //not working but Brute force
    int[] prices={7,6,4,3,1};
    int less=prices[0];
    int indexofless=0;
    int prof=0;
    for (int i = 0; i < prices.length-1; i++) {
        if(prices[i]<=less){
            less=prices[i];
            indexofless=i;//find index in array
            if(prices[indexofless]<prices[indexofless+1]){
                prof=prices[indexofless+1];
                prices[indexofless]++;
            }
        }
    }

        
    IO.print(less+" "+prof);

    /*
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
    IO.print(max);*/
}