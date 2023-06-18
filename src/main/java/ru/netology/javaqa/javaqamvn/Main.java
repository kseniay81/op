package ru.netology.javaqa.javaqamvn;
public class Main {
    public static void main(String[] args) {
        Post post = new Post();
        post.name = "Михаил";
        post.patronymic = "Афанасьевич";
        post.surname = "Булгаков";
        post.passport = "3333 № 333333";
        post.phone = "+7 (921)-124-19-61";
        post.subscription = true;

        post.birthday = new FormDate();
        post.birthday.day = 15;
        post.birthday.month = 5;
        post.birthday.year = 1891;

    }
}

