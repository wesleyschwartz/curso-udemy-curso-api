package br.com.compass.services.impl;

import br.com.compass.domain.User;
import br.com.compass.domain.dto.UserDTO;
import br.com.compass.services.UserService;
import br.com.compass.services.exceptions.DataIntegrityViolationException;
import br.com.compass.services.exceptions.ObjectNotFoundException;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import br.com.compass.repositories.UserRepository;

import java.util.List;
import java.util.Optional;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private ModelMapper modelMapper;

    @Override
    public User findById(int id) {
        Optional<User> optionalUser = userRepository.findById(id);
        return optionalUser.orElseThrow(() -> new ObjectNotFoundException("Objeto não encontrado"));
    }

    @Override
    public List<User> findAll() {
        return userRepository.findAll();
    }

    @Override
    public User create(UserDTO userDTO) {
        findByEmail(userDTO);
        return userRepository.save(modelMapper.map(userDTO, User.class));
    }

    private void findByEmail(UserDTO userDTO){
       Optional<User> user = userRepository.findByEmail(userDTO.getEmail());
       if(user.isPresent()){
           throw new DataIntegrityViolationException("E-mail já cadastrado no sistema");
       }
    }

}
