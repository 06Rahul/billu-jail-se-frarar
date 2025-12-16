import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class RelativeRanks {
    static void main(String[] args) {

    }
    public static String[] findRelativeRanks(int[] score) {
        String [] words = new String[score.length];
        List<Integer> list = new ArrayList<>();
        for (int n : score) list.add(n);
        Collections.sort(list, Collections.reverseOrder());
        for (int i = 0; i < score.length; i++) {
            int index = list.indexOf(score[i]);
            switch (index) {
                case 0:
                    words[i] = "Gold Medal";
                    break;
                case 1:
                    words[i] = "Silver Medal";
                    break;
                case 2:
                    words[i] = "Bronze Medal";
                    break;
                default:
                    words[i] = String.valueOf(index + 1);
            }
        }
        return words;
    }
}
