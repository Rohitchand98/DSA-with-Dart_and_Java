void main(){
    int[] duplicateremove= {1,2,3,3,4,5};
    
    //brute force solution wihout build in fancy keywords
    for (int i=0;i<duplicateremove.length-1;i++) {
        if (duplicateremove[i]!=duplicateremove[i+1]) {
            IO.println(duplicateremove[i]);
        }
    }
    IO.print(duplicateremove[duplicateremove.length-1]);


}