
import java.util.Arrays;

class CheckValidity {
    String[][] board = {{ "5", "3", ".", ".", "7", ".", ".", ".", "." },
                        { "6", ".", ".", "1", "9", "5", ".", ".", "." },
                        { ".", "9", "8", ".", ".", ".", ".", "6", "." },
                        { "8", ".", ".", ".", "6", ".", ".", ".", "3" },
                        { "4", ".", ".", "8", ".", "3", ".", ".", "1" },
                        { "7", ".", ".", ".", "2", ".", ".", ".", "6" },
                        { ".", "6", ".", ".", ".", ".", "2", "8", "." },
                        { ".", ".", ".", "4", "1", "9", ".", ".", "5" },
                        { ".", ".", ".", ".", "8", ".", ".", "7", "9" }};

    boolean res = true;
    int[] nums = new int[9];
    int k = 0;

    void checkRepeatation() {
        Arrays.sort(nums);
        for (int index = 0; index < nums.length - 1; index++) {
            if (nums[index] != 0) {
                if (nums[index + 1] == (nums[index])) {
                    res = false;
                    System.out.println("The Sudoku is Invalid!");
                }
            }
        }
    }

    void rowCheck() {
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board.length; j++) {
                if (!(board[i][j].equals("."))) {
                    nums[k] = Integer.parseInt(board[i][j]);
                    this.k++;
                }
            }
            this.checkRepeatation();
            this.clearNums();
            this.k = 0;
        }
    }
    void columnCheck() {
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board.length; j++) {
                if (!(board[j][i].equals("."))) {
                    nums[k] = Integer.parseInt(board[j][i]);
                    this.k++;
                }
            }
            this.checkRepeatation();
            this.clearNums();
            this.k = 0;
        }
    }
    void squareCheck(int row, int col) {
        for (int i = row; i < row+3; i++) {
            for (int j = col; j < col+3; j++) {
                if (!(board[i][j].equals("."))) {
                    nums[k] = Integer.parseInt(board[i][j]);
                    this.k++;
                }
            }
        }
        this.checkRepeatation();
        this.clearNums();
        this.k = 0;
    }

    void getSquare(){
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                this.squareCheck(3*i, 3*j);
            }
        }
    }

    void printResult() {
        if(res){
            System.out.println("The Sudoku is Valid!");
        }
    }

    void clearNums() {
        Arrays.fill(nums, 0);
    }
}

class ValidSudoku {

    public static void main(String[] args) {
        // String [][] board = new String[][];
        CheckValidity ch = new CheckValidity();
        ch.rowCheck();
        ch.columnCheck();
        ch.getSquare();
        ch.printResult();
    }
}
