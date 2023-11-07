class Solution {
    public int eliminateMaximum(int[] dist, int[] speed) {
       double time_req[]=new double[dist.length];
        for(int i=0;i<dist.length;i++) time_req[i]=(double)dist[i]/speed[i];
        Arrays.sort(time_req);
        int count=0;
        for(int i=0;i<dist.length;i++){
             if(i >= time_req[i]) break;
            count++;
         }
        return count;
    }
}