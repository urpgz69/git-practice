public class sada {

    static void main(String[] args) {


        for (int i = 0; i < 5 ; i++) {
            for (int j = 0; j < 5 ; j++) {
                System.out.print("*");

            }
            System.out.println("");
        }


        System.out.println("e");
        Random r = new Random();

        int a = r.next(6);
        System.out.println(a);


    }

}