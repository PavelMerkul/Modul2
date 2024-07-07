public class Main {
    public static void main(String[] args) {
        double ticketPrice = 13676; // стоимость билета
        int milesPerRubles = 20; // количество рублей для одной бонусной мили
        int bonusMiles = (int) (ticketPrice / milesPerRubles);// Расчитываем бонус
        System.out.println("За билет стоимостью " + ticketPrice + " руб. будет начислено " + bonusMiles + " бонусных миль");
    }
}
