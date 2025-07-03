package tech.blueglacier.stacks;

// celebrity knows none but everyone knows celebrity
// mat [a][b]  =  a knows b

public class CelebrityProblem {
    public int isCeleb(int[][] mat){
        int n = mat.length;
        int top = 0;
        int bottom = n-1;
        while(top<bottom){
            if(mat[top][bottom] == 1){
                top++;
            } else if (mat[bottom][top] == 1) {
                bottom--;
            }else{
                top++; bottom--;
            }
        }
        if(top>bottom){
            return -1;
        }
        // if the above conditions are false it means top = bottom
        for (int i = 0; i < n ; i++) {
            if (i == top){
                continue;
            }
            if(mat[top][i] == 0 && mat[i][top]==1){
                continue;
            }else{
                return -1;
            }
        }
        return top;
    }
}
