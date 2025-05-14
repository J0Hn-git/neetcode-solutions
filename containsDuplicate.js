class Solution {
    public boolean hasDuplicate(int[] nums) {
        // create a hashset to store the visited elements.
        HashSet<Integer> seenNumbers = new HashSet<>();

        // iterate through the array.
        for(int num : nums) {
            // check if the number is already in hashset.
            if (seenNumbers.contains(num)) {
                return true;

            }
            // add the element to hashset.
            seenNumbers.add(num);
            
        }
        return false; // no dulicate found.
    }
}
