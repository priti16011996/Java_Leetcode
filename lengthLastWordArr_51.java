public class lengthLastWordArr_51 {
    public int lengthOfLastWord(String s) {
        String[] arr = s.split(" ");
        int n = arr.length;
        return arr[n-1].length();
    }
}
