public class Main {
    public static void main(String[] args) {


        //Wyswietlanie
        System.out.println("Prezentacja czasu wykonan poszczegolnych operacji dla dwoch typow list: ");
        System.out.println("Dodawanie: ");
        System.out.println("Czas dodawania elementow w ArrayList to: " + Array.Dodawanie() + " , a w LinkedList to: " + Linked.Dodawanie());
        System.out.println("Modyfikacja: ");
        System.out.println("Czas Modyfikacji elementow w ArrayList to: " + Array.Modyfikacja() + " , a w LinkedList to: " + Linked.Modyfikacja());
        System.out.println("Odejmowanie");
        System.out.println("Czas Odejmowania elementow w ArrayList to: " + Array.Usuwanie() + " , a w LinkedList to: " + Linked.Usuwanie());
    }
}