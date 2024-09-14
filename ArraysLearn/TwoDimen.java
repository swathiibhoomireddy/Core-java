package ArraysLearn;

public class TwoDimen {
    public static void main(String[] args) {
        int[][] a = new int[][]{{1,0},{67,89},{785,89}};
        for(int i=0;i<a.length;i++){
            for(int j=0;j<a[i].length;j++){
                System.out.print( a[i][j]+" ");
            }
        }
    }
}
