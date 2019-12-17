package com.example2.test;



import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Map;

@Controller
public class GreetingController {
//  controller программный модуль, кот. по пути (greeting) слушает запросы от пользователя и возвращает какие-то данные
// у нас будет возвращать шаблон (еще не написали)

    @GetMapping("/greeting1")
// Аннотация @GetMapping гарантирует, что HTTP-запросы GET к /greeting отображаются в методе greeting().
    public String greeting(
// @RequestParam связывает значение имени параметра строки запроса с параметром name метода приветствия ().
// Этот параметр строки запроса не является обязательным. Если он отсутствует в запросе, используется defaultValue of World.
// Значение параметра name добавляется в объект Model, что в конечном итоге делает его доступным для шаблона представления.

            // ожидаем на вход name, defaultValue="World"-необязательный параметр;
            @RequestParam(name="name", required=false, defaultValue="World") String name,
            Map<String, Object> model) {
        model.put("name", name);
        // model - сюда будем складывать данные, кот. хотим вернуть пользователю
        return "greeting1";
        // возвращаем имя файла спринговому контейнеру, кот. хотим отбразить (в шашем случае greeting.html)
    }
// Реализация тела метода основывается на технологии представления (в данном случае Thymeleaf) для выполнения рендеринга
// HTML на стороне сервера. Thymeleaf анализирует шаблон приветствия.html и оценивает выражение th: text, чтобы отобразить
// значение параметра $ {name}, установленного в контроллере.
// смотри: Следующий листинг (из src / main / resources / templates /greeting.html) показывает шаблон приветствия.html:

// Убедитесь, что на вашем пути к классу есть Thymeleaf (координаты артефакта: org.springframework.boot: spring-boot-starter-thymeleaf).
// Это уже есть в «initial» и «complete» samples в Github.

    @GetMapping
//   @GetMapping -  здесь означает, что при входе на lokalhost будем получать результаты, кот. пропишем здесь
    public String main(Map<String, Object> model){
        model.put("some", "Hello, letsGode!");
        return "main";
    }

}
