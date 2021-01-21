package com.centroafuera.servered

import org.slf4j.LoggerFactory
import org.springframework.boot.CommandLineRunner
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration

@Configuration
class LoadDataBase {
    companion object{
        val logger = LoggerFactory.getLogger(LoadDataBase.javaClass)
    }

    @Bean
    fun initDatabase (studentRepository : StudentRepository) : CommandLineRunner{
        return CommandLineRunner { args : Array<String?>? ->
            logger.info("Preloading " + studentRepository.save(Student("Paquito", "Chocolatero")))
            logger.info("Preloading " + studentRepository.save(Student("Paquita", "Salas")))
         }
    }
}