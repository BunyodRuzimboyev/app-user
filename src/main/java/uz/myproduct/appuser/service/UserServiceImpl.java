package uz.myproduct.appuser.service;

import org.springframework.stereotype.Service;
import uz.myproduct.appuser.model.User;

import java.util.ArrayList;
import java.util.List;

@Service
public interface UserServiceImpl {

     List<User> getAllUsers();

     User getUser(Integer id);

     User addUser(User user);

     User editUser(User user);

     User deleteUser(User user);
}
