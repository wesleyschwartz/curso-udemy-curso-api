package br.com.compass.resources;

import br.com.compass.domain.User;
import br.com.compass.domain.dto.UserDTO;
import br.com.compass.services.impl.UserServiceImpl;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.modelmapper.ModelMapper;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class UserResourceTest {
    public static final Integer ID = 1;
    public static final String NAME = "Wesley";
    public static final String EMAIL = "wesley@email.com";
    public static final String PASSWORD = "12345";

    private User user;
    private UserDTO userDTO;

    @InjectMocks
    private UserResource userResource;
    @Mock
    private UserServiceImpl userServiceImpl;
    @Mock
    private ModelMapper modelMapper;

    @BeforeEach
    void setUp() {
        MockitoAnnotations.openMocks(this);
        startUser();
    }

    @Test
    void findById() {
    }

    @Test
    void findAll() {
    }

    @Test
    void create() {
    }

    @Test
    void update() {
    }

    @Test
    void delete() {
    }

    private void startUser() {
        user = new User(ID, NAME, EMAIL, PASSWORD);
        userDTO = new UserDTO(ID, NAME, EMAIL, PASSWORD);
    }
}