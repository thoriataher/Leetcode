class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
     //Method 1: Sorting by frequency:
    //  1) build function to get the frequency
    //  2) create HashMap that store string and list of strings
    //  3) Populate the HashMap and return the result

    //creat the HashMap 
    if(strs == null || strs.length == 0) return new ArrayList<>();
    Map<String , List<String>> frequencyMap = new HashMap<>();

    for(String str: strs){
        String frequencyString = getFrequency(str);

        if(frequencyMap.containsKey(frequencyString)){
            frequencyMap.get(frequencyString).add(str);
        }else{
            List<String> strList = new ArrayList<>();
             strList.add(str);
            frequencyMap.put(frequencyString, strList);
        }
    }

    return new ArrayList<>(frequencyMap.values());
    }
    // build function to get the frequency
    private String getFrequency(String str){

        int[] freq = new int[26];

        for(char c : str.toCharArray()){
            freq[c - 'a']++;
        }

        //create string after calculate the frequency \e1a1t1\
        StringBuilder frequencyString = new StringBuilder(\\);
        char c ='a';
        for(int i : freq){
            frequencyString.append(c);
            frequencyString.append(i);
            c++;
        }
        return frequencyString.toString();
    }
}
    
    
