public class TicketpreisRechner {
    public static void main(String[] args) {

        int alter = 14;
        boolean hatErmaessigung = true;

        double preis;

        if (alter < 6) {
            preis = 0.0;
            System.out.println("Kategorie: Kleinkind");
        } else if (alter < 14) {
            preis = 5.0;
            System.out.println("Kategorie: Kind");
        } else if (alter < 18) {
            preis = 8.0;
            System.out.println("Kategorie: Jugendlicher");
        } else if (alter >= 65) {
            preis = 10.0;
            System.out.println("Kategorie: Senior");
        } else {
            preis = 15.0;
            System.out.println("Kategorie: Erwachsener");
        }

        if (hatErmaessigung) {
            preis = preis * 0.5;
            System.out.println("(50% Ermaessigung wird angewendet)");
        }

        System.out.println("Ticketpreis: " + preis + " Euro");
    }
}