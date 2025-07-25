# 🪖 Holidays for Cadets – Spring Boot Web App

Цей проєкт — це вебзастосунок, створений на базі **Spring Boot** і **Thymeleaf**, який дозволяє:
- Додавати інформацію про курсантів (імʼя, прізвище, місто)
- Зберігати дані у списку
- Генерувати документи для відпустки у форматах PDF та Excel

---

## 🚀 Технології

- Java 17+ (можна адаптувати під 11 або 21)
- Spring Boot
- Thymeleaf
- Bootstrap 4/5 (через CDN або локальний CSS)
- Apache POI / iText (для PDF/Excel експорту)
- Maven

---

## 📦 Структура проєкту

src/
├── main/
│ ├── java/com/example/cadets/
│ │ ├── controller/
│ │ ├── model/
│ │ ├── service/
│ │ └── Application.java
│ └── resources/
│ ├── templates/
│ │ └── index.html
│ └── static/css/bootstrap.min.css
├── test/

yaml
Copy
Edit

---

## 🖼️ Інтерфейс

Головна сторінка (`/`) містить:
- Форму для додавання нового курсанта
- Посилання для завантаження документів
- Таблицю з усіма доданими курсантами

---

## 📥 Як запустити

1. **Клонуй репозиторій:**
```bash
git clone https://github.com/your-username/holidays-for-cadets.git
cd holidays-for-cadets
Збірка та запуск:

bash
Copy
Edit
./mvnw spring-boot:run
Перейди у браузері:

arduino
Copy
Edit
http://localhost:8080
📄 Завантаження документів
PDF: /download/pdf

Excel: /download/excel

Ці ендпоінти створюють файли на основі даних з таблиці курсантів.

💡 Приклад Thymeleaf-шаблону
html
Copy
Edit
<form th:action="@{/add}" th:object="${cadet}" method="post">
  <input type="text" th:field="*{name}" />
  <input type="text" th:field="*{surname}" />
  <input type="text" th:field="*{city}" />
  <button type="submit">Add</button>
</form>
