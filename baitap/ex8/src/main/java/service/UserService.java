package service;

import bean.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import repository.IUserRepository;

import java.util.List;
@Service
public class UserService implements IUserService<User> {
    private IUserRepository repository;
    @Autowired
    public UserService(IUserRepository repository) {
        this.repository = repository;
    }
    @Override
    public List<User> findAll() {
        return repository.findAll();
    }

    @Override
    public void save(User user) {
        repository.save(user);
    }

    @Override
    public void deleteById(int id) {
        repository.deleteById(id);
    }

    @Override
    public void findById(int id) {
        repository.findById(id);
    }
}
