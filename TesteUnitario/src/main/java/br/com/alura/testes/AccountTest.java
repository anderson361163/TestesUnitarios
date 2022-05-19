package br.com.alura.testes;

import org.junit.Assert;
import org.junit.Test;

import br.com.alura.pontoDeTeste.Account;

public class AccountTest {
    private double epsilon = 1e-6;

    @Test
    public void accountCannotHaveNegativeOverdraftLimit() {
        Account account = new Account(-20);
        
        Assert.assertEquals(0d, account.getOverdraftLimit(), epsilon);
    }
}
