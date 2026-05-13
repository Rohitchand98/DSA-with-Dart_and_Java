class MinimumTimeVisitingAllPoints{
    public int minTimeToVisitAllPoints(int[][] points) {
        int total=0;
        for(int iteration=0; iteration<points.length-1; iteration++){
            int xdiff=Math.abs(points[iteration+1][0]-points[iteration][0]);
            int ydiff=Math.abs(points[iteration+1][1]-points[iteration][1]);
            total+=Math.max(xdiff,ydiff);
        }
        return total;
    }

    void main() {
        int[][] points={{1,2},{4,3}};
        IO.println(minTimeToVisitAllPoints(points));
    }
}