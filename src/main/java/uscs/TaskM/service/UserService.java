package uscs.TaskM.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import uscs.TaskM.model.User;
import uscs.TaskM.repository.UserRepository;

import java.util.List;
import java.util.Optional;

@Service
public class UserService{
    @Autowired

    private UserRepository userRepository;
    public User create(User user){
        return userRepository.save(user);
    }

    public List<User> findAll(){
        return userRepository.findAll();
    }

    public Optional<User> findById(String id){
        return userRepository.findById(id);
    }

    public User update (String id, User user){
        user.setId(id);
        return userRepository.save(user);
    }

    public void delete(String id){
        userRepository.deleteById(id);
    }
}