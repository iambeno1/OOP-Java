public class Main {
    public static void main(String[] args) {
        Parent p = new Parent();
        ChildA cA = new ChildA();
        ChildB cB = new ChildB();

        GrandChild gC = new GrandChild();

        System.out.println(p.toString());
        System.out.println(cA.toString());
        System.out.println(cB.toString());
        System.out.println(gC.toString());

        Parent castP;

        castP = cA;
        System.out.println(castP.toString());
        System.out.println(castP.number);
        // System.out.println(castP.methodChildA); //Error: tdk bisa override karena tdk ada method di parent nya, kalo mau bisa harus dibuat methodnya

        castP = gC;
        System.out.println(castP.toString());
        System.out.println(castP.number);


        castP = new GrandChild();
        System.out.println(castP.toString());
        // System.out.println(castP.methodChildA());

        // Downcasting
        GrandChild castG = (GrandChild) castP;
        System.out.println(castG.toString());
        System.out.println(castG.methodChildA());
        System.out.println(castG.methodGrand());

        ChildA castA = (ChildA) castP;
        System.out.println(castA.toString());
        System.out.println(castA.methodChildA());

        // castP = new Parent();
        // System.out.println(castP.toString());

        // castP = new ChildA();
        // System.out.println(castP.toString());


        // castP = new ChildB();
        // System.out.println(castP.toString());

        // castP = new GrandChild();
        // System.out.println(castP.toString());
        
        // GrandChild gC1 = new GrandChild();
        // ChildB cB1 = new ChildB();

        // castP = gC1;
        // System.out.println(castP.toString());
        // castP = cB1;
        // System.out.println(castP.toString());
    }
}
