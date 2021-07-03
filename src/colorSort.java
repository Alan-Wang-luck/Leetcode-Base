public class colorSort {
    public static void main(String[] args) {
        int[] a = sortColors(new int[]{2,0,2,1,1,0});
        for (int i : a) {
            System.out.print(i);
        }

    }

    public static int[] sortColors(int[] colors) {
        int red = 0, white = 0, blue = 0;
        for (int i = 0; i < colors.length; i++) {
            if (colors[i] == 0) {
                colors[blue++] = 2;
                colors[white++] = 1;
                colors[red++] = 0;
            } else if (colors[i] == 1) {
                colors[blue++] = 2;
                colors[white++] = 1;
            } else {
                colors[blue++] = 2;
            }
        }
        return colors;
    }
}
