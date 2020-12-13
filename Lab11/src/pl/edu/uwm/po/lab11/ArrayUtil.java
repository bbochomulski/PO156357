package pl.edu.uwm.po.lab11;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayUtil {

    public static <T extends Comparable<? super T>> boolean isSorted(ArrayList<T> tab) {
        ArrayList<T> tmp = new ArrayList();
        for (T element : tab)
            tmp.add(element);
        Collections.sort(tmp);
        return tab.equals(tmp);
    }

    public static <T extends Comparable<? super T>> int binSearch(ArrayList<T> tab, T obj) {
        if(!ArrayUtil.isSorted(tab)){
            System.out.println("ArrayList must be sorted!");
            return -1;
        }
        int l = 0;
        int r = tab.size() - 1;
        int mid;
        while(l<=r)
        {
            mid = (l + r)/2;

            if(tab.get(mid).equals(obj))
                return mid;

            if(tab.get(mid).compareTo(obj)>0)
                r = mid - 1;
            else
                l = mid + 1;
        }
        return -1;
    }
    public static <T extends Comparable<? super T>>void selectionSort(ArrayList<T> tab) {

        int mn_index;
        for(int i=0;i<tab.size();i++)
        {
            mn_index = i;
            for(int j=i+1;j<tab.size();j++)
                if(tab.get(j).compareTo(tab.get(mn_index))<0)
                    mn_index = j;

            T tmp = tab.get(i);
            tab.set(i,tab.get(mn_index));
            tab.set(mn_index, tmp);
        }
    }

    public static <T extends Comparable<? super T>>void mergeSort(ArrayList<T> tab) {
        mergeS(tab, 0, tab.size()-1);
    }
    private static <T extends Comparable<? super T>> void mergeS (ArrayList<T> a, int i, int j) {
        if (j-i < 1) return;
        int mid = (i+j)/2;
        mergeS(a, i, mid);
        mergeS(a, mid+1, j);
        merge(a, i, mid, j);
    }
    private static <T extends Comparable<? super T>> void  merge(ArrayList<T> a, int p, int mid, int q) {

        Object[] tmp = new Object[q-p+1];
        int i = p;
        int j = mid+1;
        int k = 0;
        while (i <= mid && j <= q) {
            if (a.get(i).compareTo(a.get(j))<=0)
                tmp[k] = a.get(i++);
            else
                tmp[k] = a.get(j++);
            k++;
        }
        if (i <= mid && j > q) {
            while (i <= mid)
                tmp[k++] = a.get(i++);
        } else {
            while (j <= q)
                tmp[k++] = a.get(j++);
        }
        for (k = 0; k < tmp.length; k++) {
            a.set(k+p, (T) tmp[k]);
        }
    }
}

