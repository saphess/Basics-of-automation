package ru.netology.service;

import org.junit.Assert;
import org.junit.Test;

public class TestCashbackHackService {
    @Test
    public void shouldRemainIfAmountIsOne(){
        CashbackHackService cashbackHackService = new CashbackHackService();

        int actual = cashbackHackService.remain(1);
        int expect = 999;

        Assert.assertEquals(expect, actual);
    }

    @Test
    public void shouldRemainIfAmountIsNoun(){
        CashbackHackService cashbackHackService = new CashbackHackService();

        int actual = cashbackHackService.remain(0);
        int expect = 0;

        Assert.assertEquals(expect, actual);
    }
    @Test
    public void shouldRemainIfAmountIs500(){
        CashbackHackService cashbackHackService = new CashbackHackService();

        int actual = cashbackHackService.remain(500);
        int expect = 500;

        Assert.assertEquals(expect, actual);
    }
    @Test
    public void shouldRemainIfAmountIs1001(){
        CashbackHackService cashbackHackService = new CashbackHackService();

        int actual = cashbackHackService.remain(1001);
        int expect = 999;

        Assert.assertEquals(expect, actual);
    }
}
