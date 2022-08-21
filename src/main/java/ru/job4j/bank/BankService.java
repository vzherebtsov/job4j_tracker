package ru.job4j.bank;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Класс описывает сервис для банковской системы
 * В нем можно добавлять пользователя, добавлять пользователю банковские счета,
 * находить пользователя по паспорту, находить счета пользователя по реквизитам,
 * переводить деньги с одного счета на другой.
 * @author job4j
 * @version 1.0
 */
public class BankService {
    /**
     * Хранение пользователей с привязанными к ним счетами осуществляется
     * в структуре данных HashMap.
     */
    private final Map<User, List<Account>> users = new HashMap<>();

    /**
     * Метод принимает на вход пользователя и добавляет его в систему, если в системе
     * такого пользователя еще нет.
     * @param user пользователь, который добавляется.
     */
    public void addUser(User user) {
        users.putIfAbsent(user, new ArrayList<Account>());
    }

    /**
     * Метод принимает на вход паспорт пользователя и счет. Затем добавляет новый счет к пользователю,
     * если такой пользователь есть в системе и такого счета у пользователя еще нет.
     * @param passport паспорт пользователя, по которому осуществляется проверка на наличие
     *                 пользователя в системе.
     * @param account новый счет, который должен быть добавлен пользователю, если такого счета еще нет.
     */
    public void addAccount(String passport, Account account) {
        User user = findByPassport(passport);
        if (user != null) {
            List<Account> accounts = users.get(user);
            if (!accounts.contains(account)) {
                accounts.add(account);
            }
        }
    }

    /**
     * Метод принимает на вход паспорт и осуществляет поиск пользователя по этому паспорту.
     * @param passport паспорт, по которому осуществляется поиск пользователя.
     * @return возвращает пользователя или null, если пользователь не найден.
     */
    public User findByPassport(String passport) {
        User rsl = null;
        for (User user : users.keySet()) {
            if (user.getPassport().equals(passport)) {
                rsl = user;
                break;
            }
        }
        return rsl;
    }

    /**
     * Метод принимает на вход паспорт и реквизиты и осуществляет поиск пользователя по паспорту.
     * Затем у этого пользователя ищет счет по реквизитам, при условии, что пользователь найден.
     * @param passport паспорт, по которому осуществляется поиск пользователя.
     * @param requisite реквизиты, по которым осуществляется поиск счета пользователя.
     * @return возвращает счет пользователя или null, если пользователь или счет не найдены.
     */
    public Account findByRequisite(String passport, String requisite) {
        Account rsl = null;
        User user = findByPassport(passport);
        if (user != null) {
            List<Account> accounts = users.get(user);
            for (Account account : accounts) {
                if (account.getRequisite().equals(requisite)) {
                    rsl = account;
                    break;
                }
            }
        }
        return rsl;
    }

    /**
     * Метод принимает на вход паспорт пользователя и реквизиты его счетов.
     * Затем перечисляет деньги с одного счета на другой, при условии, что такой пользователь есть,
     * его счета найдены и хвататет денег на счете, с которого переводят.
     * @param srcPassport паспорт, по которому осуществляется поиск пользователя.
     * @param srcRequisite реквизиты, по которым осуществляется поиск счета пользователя. С этого аккаунта осуществляется перевод.
     * @param destPassport паспорт, по которому осуществляется поиск пользователя.
     * @param destRequisite реквизиты, по которым осуществляется поиск счета пользователя. На этот аккаунт осуществляется перевод.
     * @param amount сумма перевода.
     * @return возвращает true, если перевод осуществлен успешно и false, если нет
     */
    public boolean transferMoney(String srcPassport, String srcRequisite,
                                 String destPassport, String destRequisite, double amount) {
        boolean rsl = false;
        Account srcAccount = findByRequisite(srcPassport, srcRequisite);
        Account destAccount = findByRequisite(destPassport, destRequisite);
        if (srcAccount != null && destAccount != null && srcAccount.getBalance() >= amount) {
            srcAccount.setBalance(srcAccount.getBalance() - amount);
            destAccount.setBalance(destAccount.getBalance() + amount);
            rsl = true;
        }
        return rsl;
    }
}