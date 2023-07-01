# Cats API

Это микросервисное приложение с названием Cats API, разработанное с использованием Spring Boot. Оно предоставляет API для управления информацией о котах.

## Требования

Перед запуском приложения убедитесь, что у вас установлены следующие компоненты:

- Java Development Kit (JDK) 8 или выше
- Docker
- Kubernetes (kubectl и кластер Kubernetes)

## Начало работы

1. Клонируйте репозиторий:

   ```bash
   git clone https://github.com/olejatorqq/cats-api)https://github.com/olejatorqq/cats-api
   cd cats-api
   ```
2. Запустите скрипт ./build_and_push.sh:
   ```bash
   chmod +x build_and_push.sh
   ./build_and_push.sh
   ```
3. Разверните приложение в Kubernetes
   ```bash
   kubectl apply -f kubernetes/deployment.yaml
   ```
4. Убедитесь что приложение работает
   ```bash
   kubectl get pods
   ```
5. Получите доступ к API
   ```bash
   kubectl port-forward service/cats-api 8080:8080
   ```
   API будет доступно по адресу http://localhost:8080

## Документация API
API Cats предоставляет следующие эндпоинты:

- `GET /cats`: Получить список всех котов.
- `POST /cats`: Создать нового кота.
