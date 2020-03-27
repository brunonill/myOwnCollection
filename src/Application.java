public class Application {

    public static void main(String[] args) {


        StringCollection sC = new StringCollection();
        sC.AddElement("Tomasz");
        sC.AddElement("Rafal");
        sC.AddElement("Adam");
        sC.AddElement("Adm");
       // System.out.println(sC.getElement(0));
      //  System.out.println(sC.getElement(1));
       // System.out.println(sC.getElement(2));
      //  System.out.println(sC.getElement(3));

        System.out.println( sC.getElement("Adam"));
        System.out.println( sC.getElement("Tomasz"));
        System.out.println( sC.getElement("Rafal"));
        System.out.println( sC.getElement("Kasia"));
    }
}

