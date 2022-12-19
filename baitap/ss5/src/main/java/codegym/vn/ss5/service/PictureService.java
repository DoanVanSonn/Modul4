package codegym.vn.ss5.service;

import codegym.vn.ss5.bean.Picture;
import codegym.vn.ss5.repository.IRepositoryPicture;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PictureService implements IPicktureService {
@Autowired
IRepositoryPicture repositoryPicture;
    @Override
    public Picture findById(int id) {
        return repositoryPicture.findById(id).orElse(null);
    }

    @Override
    public void create(Picture picture) {
repositoryPicture.save(picture);
    }

    @Override
    public void update(Picture picture) {
repositoryPicture.save(picture);
    }

    @Override
    public void deleteById(int id) {
repositoryPicture.deleteById(id);
    }

    @Override
    public List<Picture> findAll() {
        return repositoryPicture.findAll();
    }
}
