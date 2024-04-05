class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
     //Method 1: Catogrize by Sorting:

        //1) Sorting strings in the array
        //2) populate the HashMap to store the sorted string and List of Strings that Angrams

        if(strs == null || strs.length ==0) return new ArrayList<>();

        Map<String, List<String>> angramsMap = new HashMap<>();

//Populate the HashMap with sorted strings and strings 
        for(String s : strs){
            char[] arr = s.toCharArray();
            Arrays.sort(arr);
            String key = String.valueOf(arr); //Convert CharArray to String

            if(!angramsMap.containsKey(key)){
                angramsMap.put(key, new ArrayList<>());
            }
            angramsMap.get(key).add(s);
        }
        //Iterate through the HashMap
        List<List<String>> resultList = new ArrayList<>();
        for(Map.Entry<String, List<String>> stringAngrams : angramsMap.entrySet()){
            resultList.add(stringAngrams.getValue());
        }
        return resultList;
    }}