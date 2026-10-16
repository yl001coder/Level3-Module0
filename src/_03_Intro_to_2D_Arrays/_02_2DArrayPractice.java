package _03_Intro_to_2D_Arrays;

/*
 *  A 2D array is comparable to a matrix/grid ordered by rows and columns.
 *  A 2D array that holds 3, 1D arrays with each 1D array having 3 elements
 *  can be thought of a 3x3 matrix/grid:
 *                 col0 col1 col2
 *                  \/   \/   \/
 *          row 0  { 1,  2,  3 }
 *          row 1  { 4,  5,  6 }
 *          row 2  { 7,  8,  9 }
 * 
 *  Where row 0 contains the numbers 1, 2, 3.
 *  and column 0 contains the numbers 1, 4, 7.
 * 
 *  Java stores a 2D array in 'row-major order', meaning the row number is
 *  the first number in the square brackets. The row 0 elements are:
 * 
 *  Row 0 = matrix[0][0], matrix[0][1], matrix[0][2]    // 1, 2, 3
 * 
 *  The second number in the square brackets is the column number.
 *  The column 0 elements are:
 * 
 *  Column 0 = matrix[0][0], matrix[1][0], matrix[2][0] // 1, 4, 7
 */
public class _02_2DArrayPractice {
    /*
     * Return a 2D array that can accommodate the grid of values below:
     *          0, 1, 2
     *          3, 4, 5
     *          6, 7, 8
     */
    public Integer[][] test1() {
        Integer[][] ints = new Integer[3][3];
        ints[0][0] = 0;
        ints[0][1] = 1;
        ints[0][2] = 2;
        ints[1][0] = 3;
        ints[1][1] = 4;
        ints[1][2] = 5;
        ints[2][0] = 6;
        ints[2][1] = 7;
        ints[2][2] = 8;
        
        return ints;
    }
    
    /*
     * Return a 2D array that can accommodate the grid of values below:
     *            0	   1    2    3
     *          0 "a", "b", "c", "d",
     *          1 "e", "f", "g", "e"
     */
    public String[][] test2() {
        String[][] chars = new String[2][4];
        chars[0][0] = "a";
        chars[0][1] = "b";
        chars[0][2] = "c";
        chars[0][3] = "d";
        chars[1][0] = "e";
        chars[1][1] = "f";
        chars[1][2] = "g";
        chars[1][3] = "e";
        return chars;
    }
    
    /*
     * Return a 2D array that can accommodate the grid of values below:
     *           0	   1
     *         0 true, false,
     *         1 false, false,
     *         2 false, true,
     *         3 true, true,
     *         4 true, false
     */
    public Boolean[][] test3() {
    	Boolean[][] jellys = new Boolean[5][2];
    	jellys[0][0] = true;
    	jellys[2][1] = true;
    	jellys[3][0] = true;
    	jellys[3][1] = true;
    	jellys[4][0] = true;
    	jellys[0][1] = false;
    	jellys[1][0] = false;
    	jellys[1][1] = false;
    	jellys[2][0] = false;
    	jellys[4][1] = false;
    	return jellys;
    }
    
    /*
     * Draw the grid of values for the following 2D array of ints:
     * Assume all the elements in the 2D array are initialized to random ints
     * 
     * int[][] grid = new int[2][3];
     * 
     * 			1,4,2,3
     * 			2,4,234,52
     * 
     * 
     * 
     * Show your teacher the grid you created
     */
    
    /*
     * Draw the grid of values for the following 2D array of Robots
     * Assume all the elements in the 2D array are initialized.
     * 
     * Robot[][] robots = new Robot[4][2];
     * 
     * 			robot, robot, robot, robot
     * 			robot, robot, robot, robot
     * 
     * 
     * Show your teacher the grid you created
     */
    
    /* Given the array of Objects below, return the element that is not null
     *          null, null, null, null
     *          null, null, null, Object
     */
    public Object test4() {
        Object[][] objects = { {null, null, null, null}, {null, null, null, new Object()} };
        
        return objects[1][3];
    }
    
    /* Given the array of Objects below, return the element that is not null
     *          null, null, Object, null
     *          null, null, null, null
     */
    public Object test5() {
        Object[][] objects = { {null, null, new Object(), null}, {null, null, null, null} };
        
        return objects[0][3];
    }
    
    /*
     * Write an algorithm to return the sum of all the numbers in the
     * first row (row 0)
     */
    public Integer test6() {
        int[][] nums = { {8, 7, 6, 5}, {4, 3}, {2, 1, 0} };
        int num = 0;
        for(int i = 0; i < 4; i++) {
        	
        	num = num + nums[0][i];
        }
        
        
        return num;
    }
    
    /*
     * Write an algorithm to return the sum of all the numbers in the
     * first column (column 0)
     */
    public Integer test7() {
        int num = 0;
    	int[][] nums = { {8, 7, 6, 5}, {4, 3}, {2, 1, 0} };
        for(int i = 0; i < 3; i++) {
        	num = num + nums[i][0];
        }
      
        return num;
    }
    
    /*
     * Write an algorithm to return the sum of all the numbers in the
     * specified row
     */
    public Integer getSumByRow(int[][] matrix, int row) {
        	
        return null;
    }
    
    /*
     * Write an algorithm to return the sum of all the numbers in the
     * specified column
     */
    public Integer getSumByColumn(int[][] matrix, int col) {
        
        return null;
    }
    
    /*
     * Return the value of the element adjacent to the specified row and column
     * The directions East, West, North, South are relative to the 2D array
     * matrix/grid. For example in this 3x3 2D array:
     * 
     *          [1][2][3]
     *          [4][5][6]
     *          [7][8][9]
     * 
     * for the 5 in the middle (row = 1, column = 1), then
     * East neighbor = 6
     * West neighbor = 4
     * North neighbor = 2
     * South neighbor = 8
     * 
     * 1. Assume input row and column values are valid indexes in the matrix.
     * 2. If the neighbor does not exist, i.e. it's outside the grid
     *    boundaries, return null.
     */
    public Integer getEastNeighbor(int[][] matrix, int row, int col) {
        matrix[row][col];
        return null;
    }
    
    public Integer getWestNeighbor(int[][] matrix, int row, int col) {
        
        return null;
    }
    
    public Integer getNorthNeighbor(int[][] matrix, int row, int col) {
        
        return null;
    }
    
    public Integer getSouthNeighbor(int[][] matrix, int row, int col) {
        
        return null;
    }
}
