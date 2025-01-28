# Libreria_Distrital
Este repositorio contiene el desarrollo del proyecto final de Modelos de Programación, titulado "Librería Distrital". El objetivo principal de este sistema es ofrecer una solución eficiente y estructurada para la gestión de documentos, permitiendo el almacenamiento, consulta y organización de información de manera óptima.

📌 Características
Gestión de documentos: Registro, actualización y eliminación de documentos.
Consulta eficiente: Búsqueda de documentos según diferentes criterios.
Interfaz intuitiva: Diseño pensado en la experiencia del usuario.

💡 Patrones de diseño implementados
1. DAO (Data Access Object) y DTO
Propósito:
Separar la lógica de acceso a la base de datos del resto de la aplicación.
Aplicación:
CRUD de documentos y usuarios.
2. Factory Method
Propósito:
Crear diferentes tipos de documentos (libros, ponencias, artículos) mediante una interfaz común.
Aplicación:
Simplifica la creación y extensión de nuevas clases de documentos.
3. Singleton
Propósito:
Asegurar que solo exista una instancia del sistema de autenticación o conexión a la base de datos.
4. Proxy
Propósito:
Actuar como intermediario para el control de acceso a ciertos recursos o servicios.
5. Observer
Propósito:
Notificar cambios en el estado de los documentos, como reservas o devoluciones.
6. Template Method (Por analizar)
Propósito:
Definir la estructura de una operación dejando que las subclases implementen pasos específicos.
Aplicación:
Estandarizar operaciones comunes entre los tipos de documentos.
7. Builder
Propósito:
Construir objetos complejos (documentos) de manera controlada.
Aplicación:
Garantiza que todos los campos requeridos estén completados correctamente.

💻 Tecnologías utilizadas
Java: Lenguaje de programación principal.
Estructuras de datos avanzadas: Para optimizar la búsqueda y almacenamiento.
Gestión de archivos: Persistencia de datos en el sistema.

👥 Equipo de desarrollo
David Ospino
Julian Cabrera
Daniel Gomez
Laura Santana
Este proyecto refleja el trabajo colaborativo de un equipo comprometido con la creación de un sistema funcional y bien diseñado, como parte de su formación académica.
