package mockito;

import mock.DoorPanel;
import mock.SecurityCenter;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import static org.mockito.Mockito.verify;

public class SecurityCenterTest {

    DoorPanel doorPanel;
    SecurityCenter securityCenter;

    @BeforeEach
    public void setUp(){
        doorPanel= Mockito.mock(DoorPanel.class);
        securityCenter = new SecurityCenter(doorPanel);
    }

    @Test
    public void should_verify_door_panel_close() {
        securityCenter.switchOn();
        verify(doorPanel).close();
    }
}
