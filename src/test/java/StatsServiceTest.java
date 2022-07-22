import org.junit.jupiter.api.Assertions;
import ru.netology.stats.StatsService;

public class StatsServiceTest {

    @org.junit.jupiter.api.Test
    void shouldCalculateAllSales1() {
        StatsService service = new StatsService();

        long[] sales = {5, 15, 5, 0, 10, 5, 30, 20, 10};

        int expected = 100;
        long actual = service.allSales(sales);

        Assertions.assertEquals(expected, actual);
    }

    @org.junit.jupiter.api.Test
    void shouldCalculateAverageSales2() {
        StatsService service = new StatsService();

        long[] sales = {4, 3, 5, 4};

        int expected = 4;
        long actual = service.averageSales(sales);

        Assertions.assertEquals(expected, actual);
    }

    @org.junit.jupiter.api.Test
    void shouldCalculateMaxSales3() {
        StatsService service = new StatsService();

        long[] sales = {8, 7, 9, 6, 12, 5, 15, 14, 15, 14, 10, 0};

        int expected = 9;
        long actual = service.maxSales(sales);

        Assertions.assertEquals(expected, actual);
    }

    @org.junit.jupiter.api.Test
    void shouldCalculateMinSales4() {
        StatsService service = new StatsService();

        long[] sales = {3, 2, 1, 4, 1, 5, 0, 0, 1, 6, 7, 8};

        int expected = 8;
        long actual = service.minSales(sales);

        Assertions.assertEquals(expected, actual);
    }

    @org.junit.jupiter.api.Test
    void shouldCalculateSalesBelowAverage5() {
        StatsService service = new StatsService();

        long[] sales = {8, 11, 8};

        int expected = 2;
        long actual = service.belowAverage(sales);

        Assertions.assertEquals(expected, actual);
    }

    @org.junit.jupiter.api.Test
    void shouldCalculateSalesAboveAverage6() {
        StatsService service = new StatsService();

        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expected = 5;
        long actual = service.aboveAverage(sales);

        Assertions.assertEquals(expected, actual);
    }
}
