# Car Library API
Car Library API - это API для телеграм бота Car Library. Он предоставляет информацию из базы данных в 
формате Json, а также позволяет добавлять новые автомобили в базу.

## Содержание
- [Технологии](#Технологии)
- [Использование](#Использование)
- [Запуск приложения](#Запуск-приложения)

## Технологии

- Язык программирования: Java, Web Technologies(HTML, CSS);
- Фреймворки и сторонние библиотеки: [CarLibrary](https://github.com/Reydel5212/ReydelBot), Spring Framework (Spring Data JPA, Spring Boot),
Lombok, Thymeleaf;
- База данных: PostgreSQL;
- Система контроля версий: Git;
- Сборщик проектов: Maven;

## Использование

С помощью Git Bash, перейдите в нужную папку и используя команду:

Скачайте репозиторий в выбранную Вами папку с помощью git команды:

```sh
$ git copy https://github.com/Reydel5212/ReydelBot
```

В файле "resources/application.properties", введите следующие значения:

```properties
//Укажите ссылку на свою базу данных
spring.datasource.url=
//Укажите логин
spring.datasource.username=postgres
//Укажите пароль
spring.datasource.password=12345
//Укажите Sql Driver
spring.datasource.driver-class-name=org.postgresql.Driver
spring.jpa.show-sql=true

//Укажите свободный порт(В случае если запуск производится через консоль)
server.port=8081
```

### Создание билда 
Используя командную строку, перейдите в репозиторий проекта.
Далее, выполните следующую команду:

```sh
mvnw.cmd package // для Windows

mvnw package // для Linux 
```

### Запуск билда
После перейдите в папку target и выполните команду:

```sh
java -jar [название файла]
```

Подробнее о том, как запустить maven проект [по ссылке](https://spring-projects.ru/guides/maven/).

## Запуск приложения

Приложение запускается вместе с CarLibrary - [ссылка](https://github.com/Reydel5212/ReydelBot).



