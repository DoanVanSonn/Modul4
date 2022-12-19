package codegym.vn.ss5.service;

import codegym.vn.ss5.bean.Picture;

import java.util.List;

public interface IPicktureService {
    Picture findById(int id);
    void create(Picture picture);
    void update(Picture picture);
    void deleteById(int id);
    List<Picture> findAll();
}
