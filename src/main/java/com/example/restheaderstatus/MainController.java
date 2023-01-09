package com.example.restheaderstatus;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainController {


    //иногда требования, предъявляемые к приложению, вынуждают создать специальный статус. Как это сделать? Самый простой и наиболее распространенный
    //способ изменить HTTP-ответ — применить класс ResponseEntity.
    //Этот класс Spring позволяет модифицировать тело, статус и заголовки
    //HTTP-ответа. Использование ResponseEntity показано в проекте sq-ch10-
    //ex4. В листинге 10.7 действие контроллера вместо объекта, который должен
    //быть помещен непосредственно в тело HTTP-ответа, возвращает экземпляр
    //ResponseEntity.

    @GetMapping("/france")
    public ResponseEntity<Country> france(){
         Country c = Country.of("France", 67);
         return ResponseEntity
                 .status(HttpStatus.ACCEPTED)//Меняем статус HTTP-ответа  на 202 Accepted
                 .header("continent", "Europe")
                 .header("capital", "Paris")
                 .header("favorite_food", "cheese and wine")//добавляем 3 доп заголовка
                 .body(c);//тело

     }
}
