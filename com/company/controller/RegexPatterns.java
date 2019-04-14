package com.company.controller;

public interface RegexPatterns {
    String NAME_RU = "^[А-Я][а-я]{1,20}";
    String NAME_EN = "^[A-Z][a-z]{1,20}";
    String LOGIN = "^[A-Z][a-z0-9_-]{8,20}";
    String PHONE = "^[\\+]380[0-9]{9}";
}
