public class MDArrayJava {
    public static void main(String[] args) {
        // One Dimensional Arrays
        int[] firstArray = {2, 5, 3};
        int[] secondArray = {9, 5, 3};
        int[] thirdArray = {2, 4, 9};
        int[] fourthArray = {10, 11, 12};
        int[] fifthArray = {13, 14, 15};
        int[] sixthArray = {16, 17, 18};
        int[] seventhArray = {19, 20, 21};
        int[] eighthArray = {22, 23, 24};
        int[] ninthArray = {25, 26, 27};
        
        // Two Dimensional Arrays
        int[][] twoDimensionalArray1 = {firstArray, secondArray, thirdArray};
        int[][] twoDimensionalArray2 = {fourthArray, fifthArray, sixthArray};
        int[][] twoDimensionalArray3 = {seventhArray, eighthArray, ninthArray};
        
        // Three Dimensional Array
        int[][][] threeDimensionalArray = {twoDimensionalArray1, twoDimensionalArray2, twoDimensionalArray3};
        
        // Print the three-dimensional array in the required format
        for (int[][] twoDimArray : threeDimensionalArray) {
            System.out.print("{{");
            for (int[] oneDimArray : twoDimArray) {
                System.out.print("{");
                for (int i = 0; i < oneDimArray.length; i++) {
                    System.out.print(oneDimArray[i]);
                    if (i < oneDimArray.length - 1) {
                        System.out.print(" ");
                    }
                }
                System.out.print("} ");
            }
            System.out.println("}}");
        }
    }
}