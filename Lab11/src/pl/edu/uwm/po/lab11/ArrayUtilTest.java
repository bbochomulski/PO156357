package pl.edu.uwm.po.lab11;

import java.time.LocalDate;
import java.util.*;

public class ArrayUtilTest {
    public static void main(String[] args) {

        ArrayList<Integer> tablica1 = new ArrayList<>();
        List<Integer> tab1 = Arrays.asList(20,30,40);
        tablica1.addAll(tab1);

        ArrayList<Integer> tablica2 = new ArrayList<>();
        List<Integer> tab2 = Arrays.asList(80,32,40);
        tablica2.addAll(tab2);

        ArrayList<LocalDate> tablica3 = new ArrayList<>();
        List<String> tab3 = Arrays.asList("2020-06-12","2020-06-13","2020-06-14");
        for(String s:tab3)
            tablica3.add(LocalDate.parse(s));

        ArrayList<LocalDate> tablica4 = new ArrayList<>();
        List<String> tab4 = Arrays.asList("2020-06-12","2021-06-12","2016-06-12");
        for(String s:tab4)
            tablica4.add(LocalDate.parse(s));

        System.out.println(ArrayUtil.isSorted(tablica1));
        System.out.println(ArrayUtil.isSorted(tablica2));
        System.out.println(ArrayUtil.isSorted(tablica3));
        System.out.println(ArrayUtil.isSorted(tablica4));

        //////////////////////////// BinSearch ///////////////////////////////////////
        System.out.println("///////////// BinSearch /////////////");
        ArrayList<Integer> tablicaInt = new ArrayList<>();
        ArrayList<LocalDate> tablicaLD = new ArrayList<>();
        List<Integer> tmpInt = Arrays.asList(10,20,40,30,80,30,20,18,45,78,46);
        tablicaInt.addAll(tmpInt);
        List<String> tmpStr = Arrays.asList("2020-12-07","2020-12-08","2020-12-09","2020-12-10","2020-12-11");
        for(String e : tmpStr)
            tablicaLD.add(LocalDate.parse(e));

        Collections.sort(tablicaInt);
        Collections.sort(tablicaLD);

        int obj = 45;
        LocalDate obj2 = LocalDate.of(2020,12,10);
        System.out.println(tablicaInt);
        System.out.printf("Integer %d na indeksie: %d\n",obj,ArrayUtil.binSearch(tablicaInt, obj));

        System.out.println(tablicaLD);
        System.out.printf("LocalDate %s na indeksie: %d\n",obj2,ArrayUtil.binSearch(tablicaLD, obj2));
        //////////////////////////////////////////////////////////////////////////////

        //////////////////////////// SelectionSort ///////////////////////////////////
        System.out.println("///////////// SelectionSort /////////////");
        tmpInt = Arrays.asList(10,20,40,30,80,30,20,18,45,78,46);
        tablicaInt.addAll(tmpInt);
        tmpStr = Arrays.asList("2020-12-17","2020-12-14","2020-12-29","2020-12-10","2020-12-11");
        for(String e : tmpStr)
            tablicaLD.add(LocalDate.parse(e));

        System.out.println("Przed:");
        System.out.println(tablicaInt);
        System.out.println(tablicaLD);

        ArrayUtil.selectionSort(tablicaInt);
        ArrayUtil.selectionSort(tablicaLD);

        System.out.println("Po:");
        System.out.println(tablicaInt);
        System.out.println(tablicaLD);
        //////////////////////////////////////////////////////////////////////////

        //////////////////////////// MergeSort ///////////////////////////////////
        System.out.println("///////////// MergeSort /////////////");
        tmpInt = Arrays.asList(10,20,40,30,80,30,20,18,45,78,46);
        tablicaInt.addAll(tmpInt);
        tmpStr = Arrays.asList("2020-12-17","2020-12-14","2020-12-29","2020-12-10","2020-12-11");
        for(String e : tmpStr)
            tablicaLD.add(LocalDate.parse(e));
        System.out.println("Przed:");
        System.out.println(tablicaInt);
        System.out.println(tablicaLD);

        ArrayUtil.mergeSort(tablicaInt);
        ArrayUtil.mergeSort(tablicaLD);

        System.out.println("Po:");
        System.out.println(tablicaInt);
        System.out.println(tablicaLD);
        //////////////////////////////////////////////////////////////////////////
    }
}
