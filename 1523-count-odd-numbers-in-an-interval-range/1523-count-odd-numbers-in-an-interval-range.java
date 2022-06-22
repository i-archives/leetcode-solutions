class Solution {
    public int countOdds(int low, int high) {
        //find out the number of elements in the range
        int nums=high-low+1;
        System.out.println(nums);
        int count=0;
        if(low%2!=0 && high%2!=0)
            { System.out.println(nums/2+1);
            return nums/2+1;}
        else
            {System.out.println(nums/2);
            return nums/2;}
    }
}
