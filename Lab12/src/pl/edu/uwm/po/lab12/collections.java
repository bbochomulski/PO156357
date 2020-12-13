package pl.edu.uwm.po.lab12;

import java.util.*;

public class collections {
    public static void main(String[] args) {

        LinkedList<String> pracownicy = new LinkedList<>();
        for(int i =0;i<20;i++)
            pracownicy.add("pracownik"+i);

        System.out.println(pracownicy);
        redukuj(pracownicy,2);
        System.out.println(pracownicy);
        odwroc(pracownicy);
        System.out.println(pracownicy);
        String tekst = "Ala ma kota. Jej kot lubi myszy.";
        tekst = odwrocZdanie(tekst);
        System.out.println(tekst);
        odwrocLiczbe();
        prime();
        ArrayList<Integer> tab = new ArrayList<>();
        List<Integer> tmpInt = Arrays.asList(10,20,40,80,30,18,45,78,46);
        tab.addAll(tmpInt);
        print(tab);
        TreeSet<Integer> tab2 = new TreeSet<>();
        tab2.addAll(tmpInt);
        print(tab2);
    }

    public static <T> void redukuj(LinkedList<T> pracownicy, int n){
        int tmp = n - 1;
        while(tmp<pracownicy.size()){
            pracownicy.remove(tmp);
            tmp += n - 1;
        }
    }

    public static <T> void odwroc(LinkedList<T> lista){
        LinkedList<T> tmp = new LinkedList<>();
        for(T e : lista)
            tmp.add(e);
        lista.clear();
        for(int i = tmp.size()-1; i>=0;i--)
            lista.add(tmp.get(i));
    }

    public static String odwrocZdanie(String zdanie){
        Stack<String> stos = new Stack<>();
        StringBuilder sb = new StringBuilder();
        String[] zdania = zdanie.split(" ");
        zdanie = "";
        for(String s: zdania){
            stos.add(s);
            if(s.endsWith(".")){
                while(!stos.empty())
                    sb.append(stos.pop().replace(".","") + " ");
                sb.replace(sb.length()-1,sb.length(),". ");
                sb.setCharAt(0,sb.substring(0,1).toUpperCase().toCharArray()[0]);
                zdanie += sb.toString();
                sb.delete(0,sb.length());
            }
        }
        return zdanie;
    }

    public static void odwrocLiczbe(){
        Stack stack = new Stack();
        Scanner s = new Scanner(System.in);
        System.out.print("Podaj liczbe: ");
        int liczba = s.nextInt();
        for(int i=10;i<=liczba*10;i*=10){
            int modulo = liczba % i;
            stack.add(modulo/(i/10));
            liczba -= modulo;
        }
        StringBuilder sb = new StringBuilder();
        while(!stack.isEmpty())
            sb.append(stack.pop() + " ");
        System.out.println(sb);
    }

    public static void prime() {
        Scanner s = new Scanner(System.in);
        System.out.print("Podaj liczbe n: ");
        int n = s.nextInt();
        ArrayList<Integer> pierwsze = new ArrayList<>();
        for(int i = 2;i<=n;i++)
            pierwsze.add(i);
        for(int i = 2; i < Math.sqrt(n);i++)
            for(int j = i*2;j<=n;j+=i)
                pierwsze.remove((Object) j);
        System.out.println(pierwsze);
    }

    public static <T extends Iterable<?>> void print(T obj){
        StringBuilder sb = new StringBuilder();
        Iterator<?> objIter = obj.iterator();
        while(objIter.hasNext())
            sb.append(objIter.next() + ", ");
        sb.delete(sb.length()-2,sb.length());
        System.out.println(sb);
    }
}
