package com.mylab.cromero;

import com.mylab.cromero.api.service.User;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.context.embedded.LocalServerPort;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.restdocs.JUnitRestDocumentation;
import org.springframework.test.context.junit4.SpringRunner;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.net.URI;

import static io.github.restdocsext.jersey.JerseyRestDocumentation.document;
import static io.github.restdocsext.jersey.JerseyRestDocumentation.documentationConfiguration;
import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;

@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class GreetingResourceDocumentation {

    @LocalServerPort
    private int port;
    
    private URI uri;


    @Rule
    public JUnitRestDocumentation restDocumentation
            = new JUnitRestDocumentation("target/generated-snippets");


    @MockBean
    private User user;
    
    @Before
    public void setUp() throws Exception {
        this.uri = new URI("http://localhost:" + port);
    }
    
    @Test
    public void testGreeting() {


        when(user.method())
                .thenReturn("Hello, World!");
        Client client = ClientBuilder.newClient();
        Response response = client.target(uri).path("api").path("greetings")
                .register(documentationConfiguration(this.restDocumentation))
                .register(document("get-all-greeting"))

                                  .request(MediaType.TEXT_PLAIN).get();
   
        String entity = response.readEntity(String.class);
        assertEquals("Hello, World!", entity);
    }
}
