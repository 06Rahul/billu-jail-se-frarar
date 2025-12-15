import java.util.Arrays;

public class Main{
    public static void main(String...args){
        String strs[] = {"flow" , "flower" , "flight"};
        StringBuilder sb = new StringBuilder();
        Arrays.sort(strs);
        char[] first = strs[0].toCharArray();
        char[] last = strs[strs.length-1].toCharArray();
        for(int i=0;i<first.length;i++){
            if(first[i]!=last[i]){
                break;
            }
            else{
                sb.append(first[i]);
            }
        }
        System.out.println(sb.toString());
    }
}