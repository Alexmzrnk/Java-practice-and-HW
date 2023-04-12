package class9;

public class E4Arrays {
    public static void main(String[] args) {

        String[] names = {"JC", "JB", "JZ", "JF", "JD"};

        System.out.println(names.length);

        for (int i = 0; i < names.length-1; i++) {//we can add -1(..) to reduce the number of elemets
            System.out.print(names[i] + " ");
        }
        System.out.println();
        int counter=0;
        while (counter<=names.length){
            System.out.print(names[counter]+" ");
            counter++;
        }

    }
}
