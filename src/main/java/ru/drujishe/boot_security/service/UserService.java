package ru.drujishe.boot_security.service;


import ru.drujishe.boot_security.model.MyUser;

import java.util.List;

public interface UserService {
    void add(MyUser myUser);

    void update(int id, MyUser updatedMyUser);

    void delete(int id);

    List<MyUser> getAll();

    MyUser getUserById(int id);
}