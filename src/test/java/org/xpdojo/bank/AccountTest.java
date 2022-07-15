package org.xpdojo.bank;

import org.xpdojo.bank.Account;

//import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
public class AccountTest {

    @Test
    public void depositAnAmountToIncreaseTheBalance() {

        Account ac = new Account();

        int balance = ac.addBalance(100);
        assertThat(100);
    }
}
