package ru.netology.service;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestCashbackHackService {
    @Test
    public void shouldRemainIfAmountIsOne(){
        CashbackHackService cashbackHackService = new CashbackHackService();

        int actual = cashbackHackService.remain(1);
        int expect = 999;

        Assert.assertEquals(actual, expect);
    }

    @Test
    public void shouldRemainIfAmountIsNoun(){
        CashbackHackService cashbackHackService = new CashbackHackService();

        int actual = cashbackHackService.remain(0);
        int expect = 0;

        Assert.assertEquals(actual, expect);
    }
    @Test
    public void shouldRemainIfAmountIs500(){
        CashbackHackService cashbackHackService = new CashbackHackService();

        int actual = cashbackHackService.remain(500);
        int expect = 500;

        Assert.assertEquals(actual, expect);
    }
    @Test
    public void shouldRemainIfAmountIs1001(){
        CashbackHackService cashbackHackService = new CashbackHackService();

        int actual = cashbackHackService.remain(1001);
        int expect = 999;

        Assert.assertEquals(actual, expect);
    }
    @Test
    public void shouldRemainIfAmountIs1000(){
        CashbackHackService cashbackHackService = new CashbackHackService();

        int actual = cashbackHackService.remain(1000);
        int expect = 1000;

        Assert.assertEquals(actual, expect);
    }
}
