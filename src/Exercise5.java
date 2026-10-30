public class Exercise5 {
    public static void main(String[] args) {
        Switchboard centralita = new Switchboard(1000);
        centralita.registerCall(new Llamada("555-43434" , "555-434324", 30, 1, true));
        centralita.registerCall(new Llamada("555-46666" , "555-434777", 24, 2, true));
        centralita.registerCall(new Llamada("555-43777" , "555-434656", 24, 3, true));
        System.out.println("Número total de llamadas: " + centralita.getNumCalls());
        System.out.println("Coste total de las llamadas: " +centralita.getTotalCost());


    }
}
