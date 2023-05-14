package ru.netology.service;
public class CashbackHackServiceTest {
    @org.junit.Test
    public void testCashbackHackService() {
        CashbackHackService service = new CashbackHackService();
        int amount = 500;
        int expected = 500;
        int actual = service.remain(amount);
        org.junit.Assert.assertEquals(expected,actual);
    }
    @org.junit.Test
    public void test0CashbackHackService() {
        CashbackHackService service = new CashbackHackService();
        int amount = 0;
        int expected = 1000;
        int actual = service.remain(amount);
        org.junit.Assert.assertEquals(expected,actual);
    }
    @org.junit.Test
    public void test1000CashbackHackService() {
        CashbackHackService service = new CashbackHackService();
        int amount = 1000;
        int expected = 0;
        int actual = service.remain(amount);
        org.junit.Assert.assertEquals(expected,actual);
    }
    @org.junit.Test
    public void test1900CashbackHackService() {
        CashbackHackService service = new CashbackHackService();
        int amount = 1900;
        int expected = 100;
        int actual = service.remain(amount);
        org.junit.Assert.assertEquals(expected,actual);
    }
  
}