import ru.netology.services.MonthCalcService;

public class Main {
    public static void main(String[] args) {
        MonthCalcService service = new MonthCalcService();
        int vacation = (int) service.calculate(100000, 60000 , 150000);

        System.out.println("Количество месяцев отдыха " + vacation);
    }
}
