package br.org.serratec.biblioteca.services;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import br.org.serratec.biblioteca.dtos.RestApiDto;

@Service
public class ClientRestService {
	public RestApiDto consultaId(Integer id) {
		RestTemplate restTemplate = new RestTemplate();
		String uri = "https://fakestoreapi.com/users/{id}";
		
		Map<String, Integer> params = new HashMap<String, Integer>();
		
		params.put("id", id);
		
		RestApiDto dto = restTemplate.getForObject(uri, RestApiDto.class, params);
		
		return dto;
	}
}
