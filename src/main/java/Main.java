import ru.netology.stats.StatsService;

public class Main {
    public static void main(String[] args){
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        StatsService service = new StatsService();
        System.out.println("1. Сумма всех продаж: " + service.allSales(sales) + ".");
        System.out.println("2. Средняя сумма продаж в месяц: " + service.averageSales(sales) + ".");
        System.out.println("3. Номер месяца, в котором был пик продаж: " + service.maxSales(sales) + ".");
        System.out.println("4. Номер месяца, в котором был минимум продаж: " + service.minSales(sales) + ".");
        System.out.println("5. Кол-во месяцев, в которых продажи были ниже среднего: " + service.belowAverage(sales) + ".");
        System.out.println("6. Кол-во месяцев, в которых продажи были выше среднего : " + service.aboveAverage(sales) + ".");
    }
}