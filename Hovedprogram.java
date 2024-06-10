class Hovedprogram{

    public static void main (String[] args){

        IndeksertListe2<String> liste = new IndeksertListe2<>();
        liste.leggTil(0, "LL");
        liste.leggTil(1, "ES");
        liste.leggTil(1, "HS");
        liste.sett(1,"KS");
        System.out.println(liste.hent(0));
        System.out.println(liste.hent(1));
        System.out.println(liste.hent(2));
        liste.fjern(2);
        System.out.println(liste.hent(0));
        System.out.println(liste.hent(1));
        // System.out.println(liste.hent(2));
        // koe1.skrivUtRekursivt();
        // koe1.skrivUtMotsattRekursivt();
        // System.out.println("Str rekursivt: " + koe1.hentStrRekursivt());

    }//avslutter main
}//avslutter hovedprogram