package ada;
public class MatrixMulti {
    public static void main(String[] args) {
    	
    	        int[][] A = {
    	            {1, 2},
    	            {3, 4}
    	        };

    	        int[][] B = {
    	            {5, 6},
    	            {7, 8}
    	        };

    	        int[][] result = new int[2][2];

    	        // Multiplying matrices using index values
    	        for (int i = 0; i < 2; i++) {
    	            for (int j = 0; j < 2; j++) {
    	                result[i][j] = 0;
    	                for (int k = 0; k < 2; k++) {
    	                    result[i][j] += A[i][k] * B[k][j];
    	                }
    	            }
    	        }

    	        // Printing the result
    	        for (int i = 0; i < result.length; i++) {
    	            for (int j = 0; j < result[0].length; j++) {
    	                System.out.print(result[i][j] + " ");
    	            }
    	            System.out.println();
    	        }
    	    }
    	}

