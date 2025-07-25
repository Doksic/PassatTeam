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

🔧 **Підлаштуй** такі частини під свою структуру:
- `groupId/package name`
- URL репозиторію
- Технології (якщо замість iText — використовується OpenPDF або щось інше)
- Паламарчук Б.Л. Атабаєв О.А.
