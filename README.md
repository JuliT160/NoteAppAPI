# NoteAppAPI

NoteAppAPI es una aplicación de API REST para gestionar notas. Está construida con Spring Boot y utiliza una base de datos MySQL.

## Requisitos

- Java 17
- Maven
- MySQL

## Configuración

1. Clona el repositorio:
    ```sh
    git clone https://github.com/tu-usuario/NoteAppAPI.git
    cd NoteAppAPI
    ```

2. Configura la base de datos MySQL:
    - Crea una base de datos llamada `notas_db`.
    - Actualiza las credenciales de la base de datos en el archivo [application.properties](http://_vscodecontentref_/0).

3. Compila y ejecuta la aplicación:
    ```sh
    ./mvnw spring-boot:run
    ```

## Endpoints

- `GET /api/notes` - Obtiene todas las notas.
- `GET /api/notes/{id}` - Obtiene una nota por ID.
- `POST /api/notes` - Crea una nueva nota.
- `PUT /api/notes/{id}` - Actualiza una nota existente.
- `DELETE /api/notes/{id}` - Elimina una nota por ID.

## Estructura del Proyecto
src/ ├── main/ │ ├── java/ │ │ └── org/ │ │ └── example/ │ │ └── noteappapi/ │ │ ├── controller/ │ │ │ └── NoteController.java │ │ ├── model/ │ │ │ └── Note.java │ │ ├── repository/ │ │ │ └── NoteRepository.java │ │ ├── service/ │ │ │ └── NoteService.java │ │ └── NoteAppApiApplication.java │ └── resources/ │ └── application.properties └── test/ └── java/ └── org/ └── example/ └── noteappapi/ └── NoteAppApiApplicationTests.java

## Contribuciones

Las contribuciones son bienvenidas. Por favor, abre un issue o envía un pull request.

## Licencia

Este proyecto está licenciado bajo la Licencia Apache 2.0. Consulta el archivo `LICENSE` para más detalles.
