public class Main {
    public static void main(String[] args) {
        int[] A = new int[]{100, 0, 15, 22, 69, 985, 47};
        int i, j, tmp;

        for(i=0;i <= A.length - 1; i++){
            for(j=0;j <= A.length - 1 - 1; j++){
                if(A[j] < A[j+1]){
                    tmp = A[j];
                    A[j] = A[j+1];
                    A[j + 1] = tmp;
                }
            }
        }

        for(i=0;i <= A.length - 1; i++){
            System.out.println(A[i]);
        }
    }
}