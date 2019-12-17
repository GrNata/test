package com.example2.test;
// Spring Initializr создает класс приложения для вас. В этом случае вам не нужно дополнительно изменять класс,
// предоставляемый Spring Initializr.
// В следующем листинге (из src / main / java / com / example / sweater / Application.java)
// показан класс приложения:

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
/*
@SpringBootApplication - это удобная аннотация, которая добавляет следующее:

@Configuration: помечает класс как источник определений компонентов для контекста приложения.

@EnableAutoConfiguration:   сообщает Spring Boot о необходимости добавления компонентов на основе
 параметров пути к классам, других компонентов и различных параметров свойств.
 Например, если spring-webmvc находится в пути к классам, эта аннотация помечает приложение как веб-приложение
 и активирует ключевые поведения, такие как настройка DispatcherServlet.

@ComponentScan:     Говорит Spring искать другие компоненты, конфигурации и сервисы
 в пакете com / example, позволяя ему найти контроллеры.

Метод main ()   использует метод Spring Boot SpringApplication.run () для запуска приложения.
 Вы заметили, что не было ни одной строки XML? Также нет файла web.xml. Это веб-приложение на 100% чисто Java,
 и вам не приходилось сталкиваться с настройкой какой-либо сантехники или инфраструктуры.
 */

}
