package ru.netology.data;

import java.time.LocalDate;

public class RegistrationByCardInfo {
    public RegistrationByCardInfo(String city, String name, String number) {
        this.city = city;
        this.name = name;
        this.number = number;
    }

    public String getCity() {
        return city;
    }

    public String getName() {
        return name;
    }

    public String getNumber() {
        return number;
    }

    private final String city;
    private final String name;
    private final String number;
}
