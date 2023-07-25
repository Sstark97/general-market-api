package com.sstark.generalmarket.infrastructure.configuration;

import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@EnableJpaRepositories(basePackages = "com.sstark.generalmarket.infrastructure.repositories")
public class PostgresSQLConfiguration {
}
