package com.driver.test;

import static org.junit.Assert.*;

import com.driver.*;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class TestCases {
    @Test
    public void testBankAccount1() {
        BankAccount bankAccount = new BankAccount("JccAio", 10000, 1000);
        assert (bankAccount.getName() == "JccAio");
        assert (bankAccount.getBalance() == 10000);
        assert (bankAccount.getMinBalance() == 1000);
    }

    @Test
    public void testBankAccount2() {
        BankAccount bankAccount = new BankAccount("JccAio", 10000, 1000);
        bankAccount.deposit(500);
        assert (bankAccount.getName() == "JccAio");
        assert (bankAccount.getBalance() == 10500);
        assert (bankAccount.getMinBalance() == 1000);
        bankAccount.deposit(1500);
        assert (bankAccount.getName() == "JccAio");
        assert (bankAccount.getBalance() == 12000);
        assert (bankAccount.getMinBalance() == 1000);
        bankAccount.deposit(373);
        assert (bankAccount.getName() == "JccAio");
        assert (bankAccount.getBalance() == 12373);
        assert (bankAccount.getMinBalance() == 1000);
    }

    @Test
    public void testBankAccount3() {
        BankAccount bankAccount = new BankAccount("JccAio", 10000, 1000);
        try {
            bankAccount.withdraw(500);
        } catch (Exception e) {
            assert (e.getMessage().equals("Insufficient Balan"));
        }
        assert (bankAccount.getName() == "JccAio");
        assert (bankAccount.getBalance() == 9500);
        assert (bankAccount.getMinBalance() == 1000);
        try {
            bankAccount.withdraw(1500);
        } catch (Exception e) {
            assert (e.getMessage().equals("Insufficient Balan"));
        }
        assert (bankAccount.getName() == "JccAio");
        assert (bankAccount.getBalance() == 8000);
        assert (bankAccount.getMinBalance() == 1000);
        try {
            bankAccount.withdraw(7500);
        } catch (Exception e) {
            assert (e.getMessage().equals("Insufficient Balance"));
        }
        assert (bankAccount.getName() == "JccAio");
        assert (bankAccount.getBalance() == 8000);
        assert (bankAccount.getMinBalance() == 1000);
    }

    @Test
    public void testBankAccount4() {
        BankAccount bankAccount = new BankAccount("JccAio", 10000, 1000);
        assert (bankAccount.getName() == "JccAio");
        assert (bankAccount.getBalance() == 10000);
        assert (bankAccount.getMinBalance() == 1000);
        try {
            String accountNumber = bankAccount.generateAccountNumber(30, 271);
            assert (accountNumber.length() == 30);
            int sum = 0;
            for (int i = 0; i < 30; i++) {
                sum += (accountNumber.charAt(i) - '0');
            }
            assert (sum == 271);
        } catch (Exception e) {
            assert (e.getMessage().equals("Account Number can not be generated"));
        }
        try {
            String accountNumber = bankAccount.generateAccountNumber(30, 270);
            assert (accountNumber.length() == 30);
        } catch (Exception e) {
            assert (e.getMessage().equals("Account Number can not be generated"));
        }
        try {
            String accountNumber = bankAccount.generateAccountNumber(30, 5000);
            assert (accountNumber.length() == 30);
            int sum = 0;
            for (int i = 0; i < 30; i++) {
                sum += (accountNumber.charAt(i) - '0');
            }
            assert (sum == 5000);
        } catch (Exception e) {
            assert (e.getMessage().equals("Account Number can not be generated"));
        }
        try {
            String accountNumber = bankAccount.generateAccountNumber(1, 10);
            assert (accountNumber.length() == 1);
            int sum = 0;
            for (int i = 0; i < 30; i++) {
                sum += (accountNumber.charAt(i) - '0');
            }
            assert (sum == 10);
        } catch (Exception e) {
            assert (e.getMessage().equals("Account Number can not be generated"));
        }
    }

    @Test
    public void testBankAccount5() {
        BankAccount bankAccount = new BankAccount("JccAio", 10000, 1000);
        assert (bankAccount.getName() == "JccAio");
        assert (bankAccount.getBalance() == 10000);
        assert (bankAccount.getMinBalance() == 1000);
        try {
            String accountNumber = bankAccount.generateAccountNumber(30, 123);
            assert (accountNumber.length() == 30);
            int sum = 0;
            for (int i = 0; i < 30; i++) {
                sum += (accountNumber.charAt(i) - '0');
            }
            assert (sum == 123);
        } catch (Exception e) {
            assert (e.getMessage().equals("Account Number can not be generated"));
        }
        try {
            String accountNumber = bankAccount.generateAccountNumber(30, 1);
            assert (accountNumber.length() == 30);
            int sum = 0;
            for (int i = 0; i < 30; i++) {
                sum += (accountNumber.charAt(i) - '0');
            }
            assert (sum == 1);
        } catch (Exception e) {
            assert (e.getMessage().equals("Account Number can not be generated"));
        }
        try {
            String accountNumber = bankAccount.generateAccountNumber(30, 270);
            assert (accountNumber.length() == 30);
            int sum = 0;
            for (int i = 0; i < 30; i++) {
                sum += (accountNumber.charAt(i) - '0');
            }
            assert (sum == 270);
        } catch (Exception e) {
            assert (e.getMessage().equals("Account Number can not be generated"));
        }
        try {
            String accountNumber = bankAccount.generateAccountNumber(30, 0);
            assert (accountNumber.length() == 30);
            int sum = 0;
            for (int i = 0; i < 30; i++) {
                sum += (accountNumber.charAt(i) - '0');
            }
            assert (sum == 0);
        } catch (Exception e) {
            assert (e.getMessage().equals("Account Number can not be generated"));
        }
        try {
            String accountNumber = bankAccount.generateAccountNumber(1, 9);
            assert (accountNumber.length() == 1);
            int sum = 0;
            for (int i = 0; i < 1; i++) {
                sum += (accountNumber.charAt(i) - '0');
            }
            assert (sum == 9);
        } catch (Exception e) {
            assert (e.getMessage().equals("Account Number can not be generated"));
        }
        try {
            String accountNumber = bankAccount.generateAccountNumber(1, 5);
            assert (accountNumber.length() == 1);
            int sum = 0;
            for (int i = 0; i < 1; i++) {
                sum += (accountNumber.charAt(i) - '0');
            }
            assert (sum == 5);
        } catch (Exception e) {
            assert (e.getMessage().equals("Account Number can not be generated"));
        }
    }

    @Test
    public void testStudentAccount() {
        StudentAccount studentAccount = new StudentAccount("Stud", 1, "accio");
        assert (studentAccount.getName().equals("Stud"));
        assert (studentAccount.getBalance() == 1);
        assert (studentAccount.getMinBalance() == 0);
        assert (studentAccount.getInstitutionName().equals("accio"));
        try {
            studentAccount.withdraw(2);
        } catch (Exception e) {
            assert (e.getMessage().equals("Insufficient Balance"));
        }
        try {
            studentAccount.withdraw(0);
            assert (studentAccount.getName().equals("Stud"));
            assert (studentAccount.getBalance() == 1);
            assert (studentAccount.getMinBalance() == 0);
            assert (studentAccount.getInstitutionName().equals("accio"));
        } catch (Exception e) {
            assert (e.getMessage().equals("Insufficient Balan"));
        }
        try {
            studentAccount.withdraw(1);
            assert (studentAccount.getName().equals("Stud"));
            assert (studentAccount.getBalance() == 0);
            assert (studentAccount.getMinBalance() == 0);
            assert (studentAccount.getInstitutionName().equals("accio"));
        } catch (Exception e) {
            assert (e.getMessage().equals("Insufficient Balan"));
        }
    }

    @Test
    public void testCurrentAccount1() {
        try {
            CurrentAccount currentAccount = new CurrentAccount("curr", 5000, "ABCDE");
            assert (currentAccount.getName().equals("curr"));
            assert (currentAccount.getBalance() == 5000);
            assert (currentAccount.getMinBalance() == 5000);
            assert (currentAccount.getTradeLicenseId().equals("ABCDE"));
        } catch (Exception e) {
            assert (e.getMessage().equals("Insufficient Balan"));
        }
        try {
            CurrentAccount currentAccount = new CurrentAccount("curr", 7000, "ABCDE");
            assert (currentAccount.getName().equals("curr"));
            assert (currentAccount.getBalance() == 7000);
            assert (currentAccount.getMinBalance() == 5000);
            assert (currentAccount.getTradeLicenseId().equals("ABCDE"));
        } catch (Exception e) {
            assert (e.getMessage().equals("Insufficient Balan"));
        }
        try {
            CurrentAccount currentAccount = new CurrentAccount("curr", 0, "ABCDE");
            assert (currentAccount.getName().equals("curr"));
            assert (currentAccount.getBalance() == 0);
            assert (currentAccount.getMinBalance() == 5000);
            assert (currentAccount.getTradeLicenseId().equals("ABCDE"));
        } catch (Exception e) {
            assert (e.getMessage().equals("Insufficient Balance"));
        }
        try {
            CurrentAccount currentAccount = new CurrentAccount("curr", 4999, "ABCDE");
            assert (currentAccount.getName().equals("curr"));
            assert (currentAccount.getBalance() == 4999);
            assert (currentAccount.getMinBalance() == 5000);
            assert (currentAccount.getTradeLicenseId().equals("ABCDE"));
        } catch (Exception e) {
            assert (e.getMessage().equals("Insufficient Balance"));
        }
    }

    @Test
    public void testCurrentAccount2() {
        try {
            CurrentAccount currentAccount = new CurrentAccount("curr", 10000, "ABCDE");
            assert (currentAccount.getName().equals("curr"));
            assert (currentAccount.getBalance() == 10000);
            assert (currentAccount.getMinBalance() == 5000);
            assert (currentAccount.getTradeLicenseId().equals("ABCDE"));
            currentAccount.withdraw(5000);
            assert (currentAccount.getName().equals("curr"));
            assert (currentAccount.getBalance() == 5000);
            assert (currentAccount.getMinBalance() == 5000);
            assert (currentAccount.getTradeLicenseId().equals("ABCDE"));
            currentAccount.deposit(777);
            assert (currentAccount.getName().equals("curr"));
            assert (currentAccount.getBalance() == 5777);
            assert (currentAccount.getMinBalance() == 5000);
            assert (currentAccount.getTradeLicenseId().equals("ABCDE"));
        } catch (Exception e) {
            assert (e.getMessage().equals("Insufficient Balan"));
        }
        try {
            CurrentAccount currentAccount = new CurrentAccount("curr", 10000, "ABCDE");
            assert (currentAccount.getName().equals("curr"));
            assert (currentAccount.getBalance() == 10000);
            assert (currentAccount.getMinBalance() == 5000);
            assert (currentAccount.getTradeLicenseId().equals("ABCDE"));
            currentAccount.withdraw(5001);
            assert (currentAccount.getName().equals("curr"));
            assert (currentAccount.getBalance() == 5000);
            assert (currentAccount.getMinBalance() == 5000);
            assert (currentAccount.getTradeLicenseId().equals("ABCDE"));
        } catch (Exception e) {
            assert (e.getMessage().equals("Insufficient Balance"));
        }
    }

    @Test
    public void testCurrentAccount3() {
        try {
            CurrentAccount currentAccount = new CurrentAccount("curr", 10000, "ABCDE");
            currentAccount.validateLicenseId();
            assert (currentAccount.getTradeLicenseId() == "ABCDE");
        } catch (Exception e) {
            assert (e.getMessage().equals("Insufficient Balance"));
        }
        try {
            CurrentAccount currentAccount = new CurrentAccount("curr", 10000, "ABAZAZAYAXAMAPAM");
            currentAccount.validateLicenseId();
            assert (currentAccount.getTradeLicenseId() == "ABAZAZAYAXAMAPAM");
        } catch (Exception e) {
            assert (e.getMessage().equals("Insufficient Balance"));
        }
    }

    @Test
    public void testCurrentAccount4() {
        try {
            CurrentAccount currentAccount = new CurrentAccount("curr", 10000, "AAAAAAAABBBCCC");
            currentAccount.validateLicenseId();
            assert (currentAccount.getTradeLicenseId() == "AAAAAAAABBBCCC");
        } catch (Exception e) {
            assert (e.getMessage().equals("Valid License can not be generated"));
        }
        try {
            CurrentAccount currentAccount = new CurrentAccount("curr", 10000, "ZZ");
            currentAccount.validateLicenseId();
            assert (currentAccount.getTradeLicenseId() == "ABAZAZAYAXAMAPAM");
        } catch (Exception e) {
            assert (e.getMessage().equals("Valid License can not be generated"));
        }
        try {
            CurrentAccount currentAccount = new CurrentAccount("curr", 10000, "ZYZZ");
            currentAccount.validateLicenseId();
            assert (currentAccount.getTradeLicenseId() == "ABAZAZAYAXAMAPAM");
        } catch (Exception e) {
            assert (e.getMessage().equals("Valid License can not be generated"));
        }
    }

    @Test
    public void testCurrentAccount5() {
        try {
            CurrentAccount currentAccount = new CurrentAccount("curr", 10000, "AAAAAAABBBCCC");
            currentAccount.validateLicenseId();
            String rearrangedId = currentAccount.getTradeLicenseId();
            assert (rearrangedId.length() == 13);
            for(int i = 0; i<12; i++){
                assert (rearrangedId.charAt(i) != rearrangedId.charAt(i+1));
            }
            char tempArray[] = rearrangedId.toCharArray();
            Arrays.sort(tempArray);
            String temp = new String(tempArray);
            assert (temp.equals("AAAAAAABBBCCC"));
        } catch (Exception e) {
            assert (e.getMessage().equals("Valid License can not be"));
        }
        try {
            CurrentAccount currentAccount = new CurrentAccount("curr", 10000, "ZZY");
            currentAccount.validateLicenseId();
            String rearrangedId = currentAccount.getTradeLicenseId();
            assert (rearrangedId.length() == 3);
            for(int i = 0; i<2; i++){
                assert (rearrangedId.charAt(i) != rearrangedId.charAt(i+1));
            }
            char tempArray[] = rearrangedId.toCharArray();
            Arrays.sort(tempArray);
            String temp = new String(tempArray);
            assert (temp.equals("YZZ"));
        } catch (Exception e) {
            assert (e.getMessage().equals("Valid License can not be"));
        }
        try {
            CurrentAccount currentAccount = new CurrentAccount("curr", 10000, "ZYZZ");
            currentAccount.validateLicenseId();
            String rearrangedId = currentAccount.getTradeLicenseId();
            assert (rearrangedId.length() == 4);
            for(int i = 0; i<3; i++){
                assert (rearrangedId.charAt(i) != rearrangedId.charAt(i+1));
            }
            char tempArray[] = rearrangedId.toCharArray();
            Arrays.sort(tempArray);
            String temp = new String(tempArray);
            assert (temp.equals("YZZZ"));
        } catch (Exception e) {
            assert (e.getMessage().equals("Valid License can not be generated"));
        }
        try {
            CurrentAccount currentAccount = new CurrentAccount("curr", 10000, "ABCABCABC");
            currentAccount.validateLicenseId();
            String rearrangedId = currentAccount.getTradeLicenseId();
            assert (rearrangedId.length() == 9);
            for(int i = 0; i<8; i++){
                assert (rearrangedId.charAt(i) != rearrangedId.charAt(i+1));
            }
            char tempArray[] = rearrangedId.toCharArray();
            Arrays.sort(tempArray);
            String temp = new String(tempArray);
            assert (temp.equals("AAABBBCCC"));
        } catch (Exception e) {
            assert (e.getMessage().equals("Valid License can not be generated"));
        }
        try {
            CurrentAccount currentAccount = new CurrentAccount("curr", 10000, "BBBAAACCC");
            currentAccount.validateLicenseId();
            String rearrangedId = currentAccount.getTradeLicenseId();
            assert (rearrangedId.length() == 9);
            for(int i = 0; i<8; i++){
                assert (rearrangedId.charAt(i) != rearrangedId.charAt(i+1));
            }
            char tempArray[] = rearrangedId.toCharArray();
            Arrays.sort(tempArray);
            String temp = new String(tempArray);
            assert (temp.equals("AAABBBCCC"));
        } catch (Exception e) {
            assert (e.getMessage().equals("Valid License can not be generated"));
        }
    }

    @Test
    public void testSavingsAccount1() {
        SavingsAccount savingsAccount = new SavingsAccount("save", 0, 5, 50);
        assert (savingsAccount.getName().equals("save"));
        assert (savingsAccount.getBalance() == 0);
        assert (savingsAccount.getMinBalance() == 0);
        assert (savingsAccount.getMaxWithdrawalLimit() == 5);
        assert (savingsAccount.getRate() == 50);
        try {
            savingsAccount.withdraw(1);
        } catch (Exception e) {
            assert (e.getMessage().equals("Insufficient Balance"));
        }
        try {
            savingsAccount.deposit(500);
            assert (savingsAccount.getName().equals("save"));
            assert (savingsAccount.getBalance() == 500);
            assert (savingsAccount.getMinBalance() == 0);
            assert (savingsAccount.getMaxWithdrawalLimit() == 5);
            assert (savingsAccount.getRate() == 50);
            savingsAccount.withdraw(1);
            assert (savingsAccount.getName().equals("save"));
            assert (savingsAccount.getBalance() == 499);
            assert (savingsAccount.getMinBalance() == 0);
            assert (savingsAccount.getMaxWithdrawalLimit() == 5);
            assert (savingsAccount.getRate() == 50);
            savingsAccount.withdraw(5);
            assert (savingsAccount.getName().equals("save"));
            assert (savingsAccount.getBalance() == 494);
            assert (savingsAccount.getMinBalance() == 0);
            assert (savingsAccount.getMaxWithdrawalLimit() == 5);
            assert (savingsAccount.getRate() == 50);
        } catch (Exception e) {
            assert (e.getMessage().equals("Insufficient Balan"));
        }
        try {
            savingsAccount.withdraw(6);
            assert (savingsAccount.getName().equals("save"));
            assert (savingsAccount.getBalance() == 499);
            assert (savingsAccount.getMinBalance() == 0);
            assert (savingsAccount.getMaxWithdrawalLimit() == 5);
            assert (savingsAccount.getRate() == 50);
        } catch (Exception e) {
            assert (e.getMessage().equals("Maximum Withdraw Limit Exceeded"));
        }
        try {
            savingsAccount.withdraw(1000);
            assert (savingsAccount.getName().equals("save"));
            assert (savingsAccount.getBalance() == 499);
            assert (savingsAccount.getMinBalance() == 0);
            assert (savingsAccount.getMaxWithdrawalLimit() == 5);
            assert (savingsAccount.getRate() == 50);
        } catch (Exception e) {
            assert (e.getMessage().equals("Maximum Withdraw Limit Exceeded"));
        }
    }

    @Test
    public void testSavingsAccount2() {
        SavingsAccount savingsAccount = new SavingsAccount("acc1", 1000, 1, 10);
        Double diff = savingsAccount.getSimpleInterest(5) - 1500.00;
        assert (Math.abs(diff) <= 1);
    }

    @Test
    public void testSavingsAccount3() {
        SavingsAccount savingsAccount = new SavingsAccount("acc1", 1000, 1, 5);
        Double diff = savingsAccount.getCompoundInterest(2, 10) - 1638.52;
        assert (Math.abs(diff) <= 100);
    }

    @Test
    public void testSavingsAccount4() {
        SavingsAccount savingsAccount = new SavingsAccount("acc1",  5500, 1, 20);
        Double diff = savingsAccount.getCompoundInterest(12, 2) - 8178.033;
        assert (Math.abs(diff) <= 100);
    }
}