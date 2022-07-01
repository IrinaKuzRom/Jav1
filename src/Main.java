public class Main {
    public static void main(String[] args) {

        int incore = 70000; // доход
        int spending = 100000; // расход

        int tax = incore * 6 / 100; // налог 6% на доходы
        int tax2 = (incore - spending) * 15 / 100; // налог 15% на разницу доходов и расходов
        int spices = 10; // ложек специй

        System.out.println("Ваш налог на первой системе: " + tax + "рублей");
        System.out.println("Ваш налог на второй системе: " +tax2 + "рублей");


    }
}
