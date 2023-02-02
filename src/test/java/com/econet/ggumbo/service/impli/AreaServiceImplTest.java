package com.econet.ggumbo.service.impli;




import com.econet.ggumbo.repository.AreaRepository;
import com.econet.ggumbo.service.Impl.AreaServiceImpl;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.*;

@ExtendWith(MockitoExtension.class)
public class AreaServiceImplTest {

    @InjectMocks
    AreaServiceImpl areaService;

    @Mock
    AreaRepository areaRepository;

    @Test
    void getAll() {
    }

    @Test
    void getAreaById() {
    }

    @Test
    void save() {
    }
}