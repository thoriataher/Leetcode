class Solution {
    public int[] topKFrequent(int[] nums, int k) {
       //1. populate an array of lists
       //2. Create hashMap to evaluate the frequency
       //3. populate the bucket that group the elements that have the same frequency
        //-> this is evaluate by iterating through the array
       //4. iterate through the bucket from the end to get the result

       List<Integer>[] bucket = new List[nums.length +1];
       Map<Integer, Integer> frequencyMap = new HashMap<>();

       for(int num : nums){
        frequencyMap.put(num, frequencyMap.getOrDefault(num, 0) + 1);
       }

       for(int key : frequencyMap.keySet()){
        int frequency = frequencyMap.get(key); //it gives the value of the key
        if(bucket[frequency] == null){
            //Each index of the 'bucket' array represents a frequency.
            bucket[frequency] = new ArrayList<>();
        }
        bucket[frequency].add(key);
       }

       int[] res = new int[k];
       int count = 0;

       for(int pos= bucket.length -1; pos >=0 & count < k; pos--){
        if(bucket[pos] != null){
            for(int integer : bucket[pos]){
            res[count++] = integer;
        }
        }
       }
       return res;
    }
}