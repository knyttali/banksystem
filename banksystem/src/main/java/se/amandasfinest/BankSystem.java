package se.amandasfinest;

import static com.diogonunes.jcolor.Ansi.*;
import static com.diogonunes.jcolor.Attribute.*;

import java.time.LocalDateTime;
import java.time.LocalTime;

public class BankSystem {
    public void sattInPengar(){
        while (true) {
            System.out.println(colorize("TA UT PENGAR", GREEN_TEXT()));
            System.out.println("*****");
            System.out.println("Kontonummer: 2020");
            System.out.println("Amount: (0.0, 'SEK')");
            System.out.println(colorize("jaaa här behövs desperat sättas in pengar", GREEN_TEXT()));
            System.out.println("Tid: 2021-09-30 " + LocalTime.now());
            System.out.println("*****");
            System.out.println(colorize("Tillbaka1 till din sida?", BLUE_TEXT()));
            String tillbaka = System.console().readLine();
            if (tillbaka.length() > 0) {
                break;
            }
        }
    }
    public void taUtPengar(){
        while (true) {
            System.out.println(colorize("TA UT PENGAR", GREEN_TEXT()));
            System.out.println("*****");
            System.out.println("Kontonummer: 2020");
            System.out.println("Amount: (0.0, 'SEK')");
            System.out.println(colorize("ojdå du kan inte ta ut några pengar", GREEN_TEXT()));
            System.out.println("Tid: 2021-09-30 " + LocalTime.now());
            System.out.println("*****");
            System.out.println(colorize("Tillbaka till din sida?", BLUE_TEXT()));
            String tillbaka = System.console().readLine();
            if (tillbaka.length() > 0) {
                break;
            }
        }
    }
    public void transaktioner() {
        while (true) {
            System.out.println(colorize("TRANSAKTIONER", YELLOW_TEXT()));
            System.out.println("*****");
            System.out.println("Kontonummer: 2020");
            System.out.println("Amount: (0.0, 'SEK')");
            System.out.println("Typ: " + colorize("WITHDRAWL", YELLOW_TEXT()));
            System.out.println("Tid: 2021-09-30 " + LocalTime.now());
            System.out.println("*****");
            System.out.println("*****");
            System.out.println("Kontonummer: 2020");
            System.out.println("Amount: (100.0, 'SEK')");
            System.out.println("Typ: " + colorize("DEPOSIT", GREEN_TEXT()));
            System.out.println("Tid: " + LocalDateTime.now());
            System.out.println("*****");
            System.out.println(colorize("Tillbaka till din sida?", BLUE_TEXT()));
            String tillbaka = System.console().readLine();
            if (tillbaka.length() > 0) {
                break;
            }
        }
    }

    public void login() {
        System.out.print("Skriv in din email: ");
        String eMail = System.console().readLine();
        System.out.print("skriv din kod: ");
        int inskrivenKod = Integer.parseInt(System.console().readLine());
    }

    public void visaMeny2() {
        while (true) {
            System.out.println(colorize("*INLOGGAD* ", BLUE_TEXT()));

            System.out.println(colorize("1. Ta ut pengar", BLUE_TEXT()));
            System.out.println(colorize("2. Sätt in pengar", BLUE_TEXT()));
            System.out.println(colorize("3. Kolla saldo ", BLUE_TEXT()));
            System.out.println(colorize("4. Visa transaktioner ", BLUE_TEXT()));
            System.out.println(colorize("0. Logga ut ", RED_TEXT()));

            System.out.println(colorize("Välkommen till din sida! Vad vill du göra?", YELLOW_TEXT()));
            int valtNr = Integer.parseInt(System.console().readLine());

            if (valtNr == 0) {
                break;
            } else if (valtNr == 1) {
                taUtPengar();
            } else if (valtNr == 2) {
                sattInPengar();
            } else if (valtNr == 3) {

            } else if (valtNr == 4) {
                transaktioner();
            }

        }
    }

    public void Run() {
        while (true) {
            System.out.println(colorize("***HUVUDMENY***", YELLOW_TEXT(), BLACK_BACK()));
            System.out.println("1. logga in");
            System.out.println("2. skapa konto");
            System.out.println("3. avsluta programmet");
            System.out.print(
                    colorize("Hej! Välkommen till bankens huvudmeny, vad vill du göra?", YELLOW_TEXT(), BLACK_BACK()));
            int sel = Integer.parseInt(System.console().readLine());
            if (sel == 3) {
                break;
            }
            if (sel == 2) {

            }
            if (sel == 1) {
                login();
                visaMeny2();
            }

        }
    }
}
