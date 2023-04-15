package HW8;

public class Task6 {
    public static void main(String[] args) {

       /* Create 2D array of countries: north america countries, south america countries,
        europe countries, asian countries, african countries.
        Then print all values from that array using 2 different loops
        and calculate how many total countries been stored.*/


        String[][] counties = {
                {"USA", "Canada"},
                {"Brazil", "Chile", "Peru", "Colombia"},
                {"France", "Spain", "Germany", "Poland"},
                {"China", "Japan", "India", "Pakistan"}
        };
        int x = counties[0].length;
        int y = counties[1].length;
        int q = counties[2].length;
        int t = counties[3].length;
        int z = x + y + q + t;


        int sum=0;
        for (int i = 0; i < counties.length; i++) {
            for (int j = 0; j < counties[i].length; j++) {
                    System.out.print(counties[i][j] + ", ");
                    sum++;
                }
            System.out.println();
            }

        System.out.println(sum);

        System.out.println();


        int sum1=0;
        for (int i=0; i<counties.length; i++){

            sum1+=counties[i].length;
        }
        System.out.println(sum1);

        System.out.println();

        System.out.println(z);

        }

    }
