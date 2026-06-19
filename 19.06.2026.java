//its pretty simple ,though the description is worse ,we need to find the highest altitude biker has reached while gain has given the upside or dowside we went by we simply add them and make a diffrent array named altitude biker has reached starting ffrom 0 and then eventually adding all gain values one by one 
class Solution {
    public int largestAltitude(int[] gain) {
        int temp = gain.length+1;
        int[] altitude = new int[temp];
        altitude[0] = 0;

        for(int i=1;i<altitude.length;i++){
            altitude[i] = gain[i-1]+altitude[i-1];
        }
        
        Arrays.sort(altitude);

        return altitude[altitude.length-1];
        
    }
}
//[-5 1 5 0 -7] -->[0&1,1&2,2&3,3&4,4&5]