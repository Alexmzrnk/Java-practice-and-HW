package class15;


    class SyntaxEmploee {
       String empID;
       double salary;
       static String CEO = "Sumair";


       public static void main(String[] args) {

           SyntaxEmploee ashar = new SyntaxEmploee();
           ashar.empID = "123456";
           ashar.salary = 90000;
           System.out.println(ashar.CEO);// not prefer way
           System.out.println(SyntaxEmploee.CEO); //99.99 this is how they are used

           SyntaxEmploee shohail = new SyntaxEmploee();
           shohail.empID = "234567";
           shohail.salary = 89000;
           System.out.println(shohail.empID);
           System.out.println(ashar.empID);


       }

}
