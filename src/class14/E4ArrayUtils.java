package class14;

public class E4ArrayUtils {
    /*
    create a method to add two int numbers and should return the result back when called name of the method ashpuld be add
    return type = int
    name of the method = add
    parameters= (int a, int b)
    body of the method =
    int sum=a+b;
    return sum;

     */
    int add (int a, int b){
    int sum = a+b;
    return sum;
    }

    public static void main(String[] args) {

        E4ArrayUtils obj= new E4ArrayUtils();
        int sum=obj.add(10,20);
        System.out.println(sum);



    }


}


