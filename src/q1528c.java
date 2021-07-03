import java.util.ArrayList;
import java.util.Collections;

public class q1528c {
    public static void main(String[] args) {
        String s = "codeleet";
        int[] indices = {4,5,6,7,0,2,1,3};
        System.out.println(restoreString(s, indices));

    }
    public static String restoreString(String s, int[] indices){
        char[] schar = s.toCharArray();
        int pre = 0;
        ArrayList indice = new ArrayList();
        ArrayList schars = new ArrayList();
        for(int i = 0; i < indices.length; i++){
            indice.add(indices[i]);
            schars.add(schar[i]);
        }
        for(int i  = 0; i < indices.length; i++){
            int index = indice.indexOf(i);
            Collections.swap(schars, i, index);
            Collections.swap(indice, i , index);
        }
        String res = "";
        for(Object a :schars){
            res += a;
        }
        return res;

    }
}
