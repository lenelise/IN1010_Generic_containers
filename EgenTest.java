class EgenTest {
    public static void main(String[] args){
        IndeksertListe<String> myList = new IndeksertListe<String>();
        myList.leggTil("A");
        myList.leggTil("B");
        myList.leggTil("C");
        System.out.println(myList.toString());
        myList.fjern();
        System.out.println(myList.toString());
        myList.leggTil(1,"D");
        System.out.println(myList.toString());
        System.out.println("Storrelse: " + myList.stoerrelse());


        Prioritetskoe<String> myPrio = new Prioritetskoe<String>();

        String A = "A";
        String B = "B";
        String C = "C";
        String Anne = "Anne";
        String Berit = "Berit";
        String Chris = "Chris";

        System.out.println("A.compareTo(B): " + A.compareTo(B));
        System.out.println("A.compareTo(C): " + A.compareTo(C));
        System.out.println("B.compareTo(A): " + B.compareTo(A));
        System.out.println("B.compareTo(C): " + B.compareTo(C));
        System.out.println("C.compareTo(A): " + C.compareTo(A));
        System.out.println("C.compareTo(B): " + C.compareTo(B));
        
        System.out.println("Anne.compareTo(Berit): " + Anne.compareTo(Berit));
        System.out.println("Anne.compareTo(Chris): " + Anne.compareTo(Chris));
    }
}