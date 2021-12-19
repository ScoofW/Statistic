package ru.netology.stats;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StatsServiceTest {

    @Test
    void shouldCalculateSum() {
        StatsService service = new StatsService();

        int[] managerSales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 180;

        int actual = service.calculateSum(managerSales);

        assertEquals(expected, actual);

    }

    @Test
    void shouldfindAverage() {
        StatsService service = new StatsService();

        int[] managerSales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 15;

        int actual = service.findAverage(managerSales);

        assertEquals(expected, actual);

    }

    @Test
    void shouldfindmaxSales() {
        StatsService service = new StatsService();

        int[] managerSales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 8;

        int actual = service.findmaxSales(managerSales);

        assertEquals(expected, actual);

    }

    @Test
    void shouldfindminSales() {
        StatsService service = new StatsService();

        int[] managerSales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 9;

        int actual = service.findminSales(managerSales);

        assertEquals(expected, actual);

    }

    @Test
    void shouldfindlessthanAverage() {
        StatsService service = new StatsService();
        int[] managerSales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 5;

        int actual = service.findlessthanAverage(managerSales);

        assertEquals(expected, actual);
    }
    @Test
    void shouldfindmorethanAverage(){
        StatsService service = new StatsService();

        int[] managerSales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 5;

        int actual = service.findmorethanAverage(managerSales);

        assertEquals(expected,actual);

    }

}