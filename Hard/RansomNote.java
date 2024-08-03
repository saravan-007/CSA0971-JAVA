import java.util.HashMap;
import java.util.Map;

public class RansomNote {
    public static void main(String[] args) {
        String[] ransomNotes = {"a", "aa", "aa", "abc", "good", "xyz"};
        String[] magazines = {"b", "ab", "aab", "abc", "better", "123"};

        for (int i = 0; i < ransomNotes.length; i++) {
            boolean result = canConstruct(ransomNotes[i], magazines[i]);
            System.out.println("Test Case " + (i + 1) + " : ransomNote = \"" + ransomNotes[i] + "\", magazine = \"" + magazines[i] + "\" --> " + result);
        }
    }

    public static boolean canConstruct(String ransomNote, String magazine) {
        // Create a map to store the frequency of each character in the magazine
        Map<Character, Integer> magazineMap = new HashMap<>();
        for (char c : magazine.toCharArray()) {
            magazineMap.put(c, magazineMap.getOrDefault(c, 0) + 1);
        }

        // Check if we can construct the ransom note from the magazine
        for (char c : ransomNote.toCharArray()) {
            if (!magazineMap.containsKey(c) || magazineMap.get(c) <= 0) {
                return false;
            }
            magazineMap.put(c, magazineMap.get(c) - 1);
        }

        return true;
    }
}
