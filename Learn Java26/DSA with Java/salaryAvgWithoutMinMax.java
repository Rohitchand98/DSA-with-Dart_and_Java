void main(){
    int[] salary={4000,3000,1000,2000};
    Arrays.sort(salary);
    // this is brute force solution without any help
    /* double sum=0;
    double total=0;
    int count=0;
    IO.print(Arrays.toString(salary));
    for (int check = 0; check < salary.length; check++) {
        sum=salary[0]+salary[salary.length-1];
        total+=salary[check];
        count++;

    }
    double solution=(total-sum)/(count-2);
    IO.print(solution);*/
    
    //Now optimal Solution
    int first=salary[0];
    int last=salary[salary.length-1];
    double sum=0;
    for (int s=0; s<salary.length;s++) {
        if(first!=salary[s] && last!=salary[s]){
            sum+=salary[s];
        }
    }
    IO.print(sum/(salary.length-2));
    
}