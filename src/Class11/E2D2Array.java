package Class11;

public class E2D2Array {
    public static void main(String[] args) {

        String[][] names2DArray = {
                {"Sarah", "Artem", "Lean", "Semir"},
                {"Farwa", "Halima", "Alina", "Semir"}};


        for (String []name1DArr:names2DArray){
            for (String name:name1DArr){
                System.out.println(name);
            }
        }

      /*  for (int row = 0; row < names.length; row++) {
            for (int col = 0; col < names[row].length; col++) {
                System.out.println(names[row][col]);
            }
        }*/

    }
}
