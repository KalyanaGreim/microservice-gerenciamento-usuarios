package br.com.ebac.microservicegerenciamentousuarios;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories(basePackages = "br.com.ebac.microservicegerenciamentousuarios.repositories")
public class MicroserviceGerenciamentoUsuariosApplication {

	public static void main(String[] args) {
		SpringApplication.run(MicroserviceGerenciamentoUsuariosApplication.class, args);
	}

}
