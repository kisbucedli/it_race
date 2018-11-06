import java.util.*;
public class Spiral{

     public static void main(String []args){
        System.out.println("Hello World");
        int contents[][] = { {1, 2, 3, 4, 5},
                            {1, 2, 3, 4, 5}, 
                            {1, 2, 3, 4, 5},
                            {1, 2, 3, 4, 5},
                            {1, 2, 3, 4, 5},
                            {1, 2, 3, 4, 5} };
        System.out.println(korbejar(79, contents));                  
     }
     public static List<Integer> korbejar(int start, int[][] matrix){
    List<Integer> result = new ArrayList<Integer>();
    if(matrix==null||matrix.length==0||matrix[0].length==0)
        return result;
 
    int m = matrix.length;
    int n = matrix[0].length;
 
    int left=0;
    int right=n-1;
    int top = 0;
    int bottom = m-1;
 
    while(result.size()<m*n){
        for(int j=left; j<=right; j++){
            result.add(matrix[top][j]);
        }
        top++;
 
        for(int i=top; i<=bottom; i++){
            result.add(matrix[i][right]);
        }
        right--;
 
        //prevent duplicate row
        if(bottom<top)
            break;
 
        for(int j=right; j>=left; j--){
            result.add(matrix[bottom][j]);
        }
        bottom--;
 
        // prevent duplicate column
        if(right<left)
            break;
 
        for(int i=bottom; i>=top; i--){
            result.add(matrix[i][left]);
        }
        left++;
    }
 
    return result;
     }
     
}