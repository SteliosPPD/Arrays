package arrays;

public class Arrays {

    public static void main(String[] args) {

        int[] pinakas = new int[6];
        pinakas[0] = 2;
        pinakas[1] = 5;
        pinakas[2] = 7;
        pinakas[3] = 8;
        pinakas[4] = 3;
        pinakas[5] = 8;
        System.out.println(pinakas[3]);

        int[] pinakas2 = {3, 7, 1, 9, 0, -3};
        //for traditional
        for (int i = 0; i < pinakas2.length; i++) {
            System.out.println("The value of pinakas2[" + i + "] is: " + pinakas2[i]);

        }
        //for enhanced
        for (int x : pinakas2) {
            System.out.println(x);
        }

        //2D Array
        int[][] multiPinakas
                = {
                    {3, 5, 8},
                    {6},
                    {0, -1, 4, 8},
                    {8, 3} //Na vrw pws tha to ektypwnw me ta for ths teleutaias selidas tou pdf
                };
        int field = multiPinakas[1][0];
        System.out.println(field);
        System.out.println();

        //2D Array Loop
        for (int row = 0; row < multiPinakas.length; row++) {
            for (int col = 0; col < multiPinakas[row].length; col++) {
                System.out.print(multiPinakas[row][col] + "|");
            }
            System.out.println();
        }
    }

}
