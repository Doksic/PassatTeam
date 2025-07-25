# 🎓 Система обліку курсантів (Backend)

## 📌 Опис

Це простий backend-додаток на базі **Spring Boot**, який дозволяє вести облік курсантів. Зберігаються дані про ім’я, прізвище та місто. Реалізовано можливості додавання та перегляду курсантів через веб-інтерфейс із використанням **Thymeleaf**.

---

## 🧱 Технології

- Java 17+
- Spring Boot
- Spring Data JPA
- Thymeleaf
- MySQL
- Lombok
- Apache POI (експорт в Excel)
- iText PDF (експорт у PDF)

---

## 📁 Структура проєкту

src/
├── main/
│ ├── java/
│ │ └── com.example.Holidays/
│ │ ├── HolidaysApplication.java
│ │ ├── controller/
│ │ │ └── CadetController.java
│ │ ├── model/
│ │ │ └── Cadet.java
│ │ └── repository/
│ │ └── CadetRepository.java
│ └── resources/
│ ├── application.properties
│ └── templates/
│ └── index.html

yaml
Копіювати
Редагувати

---

## ⚙️ Налаштування `application.properties`

```properties
spring.datasource.url=jdbc:mysql://localhost:3306/cadets_db
spring.datasource.username=your_username
spring.datasource.password=your_password
spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true
spring.thymeleaf.cache=false
