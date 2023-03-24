

public class Main {
    public static void main(String[] args) {
        // задания полей
        float coat = 70; // пальто
        float hat = 25; // шляпа
        float business_suit = 53; // деловой костюм
        float shirt = 19; // сорочка
        float shoes = 41; // туфли

        float account = 312; // счет пользователя

        System.out.println("сейчас мы узнаем хватит ли денег или нет");


        if ((coat + hat + business_suit + shirt +shoes) < account) System.out.println("денег хватило ;)");
       else System.out.println ("денег не хватило на это иди работай");
       ц
    }
}