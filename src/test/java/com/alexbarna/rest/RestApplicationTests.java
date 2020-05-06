package com.alexbarna.rest;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.boot.web.server.LocalServerPort;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.test.context.jdbc.Sql;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.assertTrue;

@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class RestApplicationTests {

	@LocalServerPort
	private int port;
	TestRestTemplate restTemplate = new TestRestTemplate();
	HttpHeaders headers = new HttpHeaders();

	@Test
	public void testAuthentication() throws Exception {
		ObjectMapper objectMapper = new ObjectMapper();
		String o = objectMapper.createObjectNode().put("username", "alex")
				.put("password", "password").toString();
		HttpEntity<String> entity = new HttpEntity<String>(o, headers);
		ResponseEntity<String> response = restTemplate.exchange(
				createURLWithPort("/authentication"), HttpMethod.POST, entity, String.class);
		assertTrue(response.getBody().contains("token"));
		JsonNode json = objectMapper.readTree(response.getBody());
		headers.add("Authorization", "Bearer "+json.get("token").asText());
	}

    @Test
    public void testGetSelfData() {
        HttpEntity<String> entity = new HttpEntity<String>(null, headers);
        ResponseEntity<String> response = restTemplate.exchange(
                createURLWithPort("/user"), HttpMethod.GET, entity, String.class);
        assertTrue(response.getBody().contains("alex"));
    }

    @Test
    public void testCreateUser() {
        ObjectMapper objectMapper = new ObjectMapper();
        String o = objectMapper.createObjectNode().put("name", "alex2").toString();
        HttpEntity<String> entity = new HttpEntity<String>(o, headers);
        ResponseEntity<String> response = restTemplate.exchange(
                createURLWithPort("/user"), HttpMethod.POST, entity, String.class);
        assertTrue(response.getBody().contains("alex2"));
    }

    @Test
    public void testGetNewUser() {
        HttpEntity<String> entity = new HttpEntity<String>(null, headers);
        ResponseEntity<String> response = restTemplate.exchange(
                createURLWithPort("/user/2"), HttpMethod.GET, entity, String.class);
        assertTrue(response.getBody().contains("alex2"));
    }

    @Test
    public void testDeleteNewUser() throws Exception {
        HttpEntity<String> entity = new HttpEntity<String>(null, headers);
        ResponseEntity<String> response = restTemplate.exchange(
                createURLWithPort("/user/2"), HttpMethod.DELETE, entity, String.class);
        assertTrue(response.getStatusCode().is2xxSuccessful());
    }

	private String createURLWithPort(String uri) {
		return "http://localhost:" + port + uri;
	}

}
