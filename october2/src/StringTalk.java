public class StringTalk {

    public static void main(String[] args) {

        String word = "computer science"; //String word = new String("")
//        word.substring()

        // e x a m p l e -> "example"
        //0 1 2 3 4 5 6 7   subtring(0,3) --> "exa" substring(4) --> "ple"

//        String a = "hi";
//        String c = a;
//        System.out.println(a == c);  true

//        word.equals(anotherString)     use instead of ==
//        different objects same data

//        word.indexOf() returns the starting index of sub in word, -1 if not found
//        System.out.println(word.indexOf("science")); //9
//        word.indexOf("omp"); //1
//        if (word.indexOf(stringOther) >= 0) word contains stringOther
//        word.contains();
//        ascii vs. unicode --> every character has a numerical version you compare the letters based on numerical value
//        "B" 66 "A" 65 "B">"A"
        String s1 = "cat";
        String s2 = "dog";
        System.out.println(s1.compareTo(s2)); //d > c dog > cat
                    // < 0 --> s1 < s2
                    // > 0 --> s1 > s2
                    // == 0 --> s1 = s2



//        word.compareTo()

    }
}
