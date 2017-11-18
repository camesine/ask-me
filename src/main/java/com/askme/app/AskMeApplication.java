package com.askme.app;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.askme.app.Models.Concepto;
import com.askme.app.Models.TipoUsuario;
import com.askme.app.Models.Usuario;

@SpringBootApplication
public class AskMeApplication {

	public static void main(String[] args) {
		SpringApplication.run(AskMeApplication.class, args);

	}
}
