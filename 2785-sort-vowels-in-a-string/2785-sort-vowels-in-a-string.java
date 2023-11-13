class Solution {
    public String sortVowels(String s) {
        
        List<Integer> listA = new ArrayList<>();
        List<Character> listB = new ArrayList<>();

        StringBuilder str = new StringBuilder();

        for(int i=0; i<s.length(); i++){
            
            char c = s.charAt(i);

            if(c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u' || c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U'){
                listA.add(i);
                listB.add(c);
            }
            else{
                str.append(c);
            }

        }

        Collections.sort(listB);
        
        for(int i=0; i<listA.size(); i++){

            str.insert(listA.get(i), listB.get(i)+"");

        }

        return str.toString();

    }
}