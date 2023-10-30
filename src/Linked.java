import java.util.LinkedList;
import java.util.List;

public class Linked {

    //Tworzenie LinkedList
    static List<Integer> linkedList = new LinkedList<>();
    public static int elements = 90000;

    //Dodawanie
    public static long Dodawanie() {
        //Sprawdzenie czasu rozpoczecia procesu dodawania
        long StartTimeLinkedAdd = System.nanoTime();
        //Dodawanie elementow w petli
        for (int i = 0; i < elements; i++) {
            linkedList.add(i);
        }
        //Sprawdzenie czasu zakonczenia procesu dodawania
        long EndTimeLinkedAdd = System.nanoTime();
        //Obliczenie czasu procesu dodawania
        long FinalTimeLinkedAdd = EndTimeLinkedAdd - StartTimeLinkedAdd;
        return FinalTimeLinkedAdd;
    }



    //Modyfikacja
    public static long Modyfikacja() {
        //Sprawdzenie czasu rozpoczecia procesu modyfikacji
        long StartTimeLinkedModification = System.nanoTime();
        //Modyfikacja elementow w petli
        for (int i = 0; i < elements; i++) {
            linkedList.set(i, i + 1);
        }
        //Sprawdzenie czasu zakonczenia procesu modyfikacji
        long EndTimeLinkedMOdification = System.nanoTime();
        //Obliczenie czasu calego procesu modyfikacji
        long FinalTimeLinkedModification = EndTimeLinkedMOdification - StartTimeLinkedModification;
        return FinalTimeLinkedModification;
    }



    //Usuwanie
    public static long Usuwanie() {
        //Sprawdzenie czasu rozpoczecia procesu usuwania
        long StartTimeLinkedRemove = System.nanoTime();
        //Usuwanie elementow w petli
        for (int i = 0; i < elements; i++) {
            linkedList.remove(linkedList.size() - 1);
        }
        //Sprawdzenie czasu zakonczenia procesu usuwania
        long EndTimeLinkedRemove = System.nanoTime();
        long FinalTimeLinkedRemove = EndTimeLinkedRemove - StartTimeLinkedRemove;
        return FinalTimeLinkedRemove;
    }

}
