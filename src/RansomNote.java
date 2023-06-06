public class RansomNote {
    public boolean canConstruct(String ransomNote, String magazine) {
        int[] counts = new int[27];

        for (Character ch: magazine.toCharArray()) {
            counts[ch-97]++;
        }

        for (Character ch: ransomNote.toCharArray()) {
            if (counts[ch-97] <= 0) {
                return false;
            }
            counts[ch-97]--;
        }

        return true;
    }
}
