abstract class Lenkeliste<E> implements Liste<E>{

    protected Node start; 
    protected int antElementer;

    Lenkeliste(){
        start = null;
        antElementer = 0;
    }

    public boolean erTom(){
        return start==null;
    }

    @Override 
    public int stoerrelse(){
        int teller = 0;
        
        if (start == null){
            return teller;
        } else{
            Node peker = start;
            while (peker.neste != null){
                teller++;
                peker = peker.neste;
            }
            teller = teller +1; //to account for the last node
            return teller;
        }
    }

    //Adding elements in the list, at the back
    @Override
    public void leggTil(E x){
        Node nyNode = new Node(x);

        if (start == null){
            start = nyNode;
            antElementer++;
        } else {
            Node peker = start;
            while(peker.neste != null){
                peker = peker.neste;
            }
            peker.neste = nyNode;
            antElementer++;
        }
    }

    //Get the first element in the list
    @Override
    public E hent(){
        return start.element;
    }

    //Remove and return the first element in the list
    @Override
    public E fjern(){
        if (start != null){
            Node peker = start;
            start = peker.neste;
            return peker.element;
        }
        throw new UgyldigListeindeks(0);
    }

    //Skriv ut i riktig rekkefølge, fra start til slutt
    public void skrivUtRekursivt(){ 
        skrivUtRekursivtHjelpemetode(start);
    }

    public void skrivUtRekursivtHjelpemetode(Node node){
        if(node.neste==null){
            System.out.println(node.element.toString());
        } else{
            System.out.println(node.element.toString());
            node = node.neste; 
            skrivUtRekursivtHjelpemetode(node);
        }
    }
    
    // Skriv ut i motsatt rekkefølge, fra slutt til start
    public void skrivUtMotsattRekursivt(){
        skrivUtMotsattHjelp(start);
    }

    public void skrivUtMotsattHjelp(Node node){
        if (node==null){
            return;
        } else{
            skrivUtMotsattHjelp(node.neste);
            System.out.println(node.element.toString());
        }
    }

    //Finns storrelse paa lenkelista ved rekursjon: 
    public int hentStrRekursivt(){
        return hentStrRekursivt(start);
    }

    public int hentStrRekursivt(Node node){

        if (node==null){
            return 0;
        } else{
            return 1 + hentStrRekursivt(node.neste);
        }
    }


    @Override
    public String toString(){
        String streng = "";
        if (start != null) {
            Node peker = start; 
            while (peker.neste != null){
                streng = streng + peker.element.toString() + ", ";//antar metoden finnes
                peker = peker.neste;
            }
            streng = streng + peker.element.toString();
            return streng;
        }
        throw new UgyldigListeindeks(0);
    }

    //Inner class
    protected class Node{
        Node neste;
        E element;

        Node (E x){
            neste = null;
            element = x;
        }
    }
}