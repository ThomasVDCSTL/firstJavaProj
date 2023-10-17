//// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
//// then press Enter. You can now see whitespace characters in your code.
//public class Main {
//    public static void main(String[] args) {
//        // Press Alt+Entrée with your caret at the highlighted text to see how
//        // IntelliJ IDEA suggests fixing it.
//        System.out.printf("Hello and welcome!");
//
//        // Press Maj+F10 or click the green arrow button in the gutter to run the code.
//        for (int i = 1; i <= 5; i++) {
//
//            // Press Maj+F9 to start debugging your code. We have set one breakpoint
//            // for you, but you can always add more by pressing Ctrl+F8.
//            System.out.println("i = " + i);
//        }
//    }
//}

public class Main {
    public static void main(String[] args){
        int cartons = 0;
        int capaciteCamion = 9;
        int x = 0;
        while (cartons<34){
            x++;
            cartons++;
            if (cartons%capaciteCamion==0){
                System.out.println("un voyage de "+x+" cartons");
                x=0;
            }
        }
        System.out.println("un voyage de "+x+" cartons");
    }

}
