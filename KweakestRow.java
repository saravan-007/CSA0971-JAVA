import java.util.*;

class KweakestRow{
public static int[] kweakestRows(int[][] mat,int k){
List<int[]>rowStrength = new ArrayList<>();
for(int i=0; i<mat.length; i++)
{
int soliders =0;
for (int j=0;j<mat[i].length;j++)
{
if(mat[i][j]==1)
{
soliders++;
}
else
{
break;
}
}
rowStrength.add(new int[]{soliders,i});
}
Collections.sort(rowStrength, (a, b) -> a[0] == b[0] ? a[1] - b[1] : a[0] - b[0]);
 int[] weakestRows = new int[k];
        for (int i = 0; i < k; i++) {
            weakestRows[i] = rowStrength.get(i)[1];
        }
        
        return weakestRows;       
}
public static void main(String[] args) {
        int[][] mat = {
            {1, 1, 0, 0, 0},
            {1, 1, 1, 1, 0},
            {1, 0, 0, 0, 0},
            {1, 1, 0, 0, 0},
            {1, 1, 1, 1, 1}
        };
        int k = 3;

        int[] result = kweakestRows(mat, k);
		System.out.println("\nIndices of the weakest rows:");
        System.out.println(Arrays.toString(result));


}
}