public class LastWordLength {
    public static void main(String[] args) {
        String s = "Hello World";
        System.out.println(lengthOfLastWord(s)); // Output: 5
    }

    public static int lengthOfLastWord(String s) {
        // Trim any trailing spaces
        s = s.trim();
        
        // Find the last space in the trimmed string
        int lastSpaceIndex = s.lastIndexOf(' ');
        
        // The length of the last word is the difference between the total length
        // of the string and the index of the last space, minus one.
        return s.length() - lastSpaceIndex - 1;
    }
}
