package cm.cti.cinema.servicefilm;

import org.junit.jupiter.api.Test;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
@EntityScan("cinema.servicefilm.models")
class CinemaServiceFilmApplicationTests {

	@Test
	void contextLoads() {
	}

}
