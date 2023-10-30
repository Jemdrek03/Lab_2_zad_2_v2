import java.util.ArrayList;
import java.util.List;

public class Array {
    //Tworzenie ArrayList
    static List<Integer> arrayList = new ArrayList<>();
    public static int elements = 90000;

    //Dodawanie
    public static long Dodawanie() {
        //Sprawdzenie czasu rozpoczecia procesu dodawania
        long StartTimeArrayAdd = System.nanoTime();
        //Dodawanie elementow w petli
        for (int i = 0; i < elements; i++) {
            arrayList.add(i);
        }
        //Sprawdzenie czasu zakonczenia procesu dodawania
        long EndTimeArrayAdd = System.nanoTime();
        //Obliczenie czasu procesu dodawania
        long FinalTimeArrayAdd = EndTimeArrayAdd - StartTimeArrayAdd;
        return FinalTimeArrayAdd;
    }


    //Modyfikacja
    public static long Modyfikacja() {

        //Sprawdzenie czasu rozpoczecia procesu modyfikacji
        long StartTimeArrayModification = System.nanoTime();
        //Modyfikacja elementow w petli
        for (int i = 0; i < elements; i++) {
            arrayList.set(i, i + 1);
        }
        //Sprawdzenie czasu zakonczenia procesu modyfikacji
        long EndTimeArrayModification = System.nanoTime();
        //Obliczenie czasu calego procesu modyfikacji
        long FinalTimeArrayModification = EndTimeArrayModification - StartTimeArrayModification;
        return FinalTimeArrayModification;
    }


    //Usuwanie
    public static long Usuwanie() {
        //Sprawdzenie czasu rozpoczecia procesu usuwania
        long StartTimeArrayRemove = System.nanoTime();
        //Usuwanie elementow w petli
        for (int i = 0; i < elements; i++) {
            arrayList.remove(arrayList.size() - 1);
        }
        //Sprawdzenie czasu zakonczenia procesu usuwania
        long EndTimeArrayRemove = System.nanoTime();
        long FinalTimeArrayRemove = EndTimeArrayRemove - StartTimeArrayRemove;
        return FinalTimeArrayRemove;
    }
}
