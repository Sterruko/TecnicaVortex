# API REST PARA SISTEMA DE TRANSPORTE
Esta API REST proporciona endpoints para el registro y gestión de documentos y vehículos, donde cada vehículo está asignado a un conductor. La API utiliza estándares RESTful para la creación, consulta y actualización de recursos.


### Configuración
Asegúrate de tener las siguientes herramientas instaladas en tu entorno de desarrollo:
* Java 17
* SringBoot 3.2.0
* Base de datos MySQL

### La aplicación se ejecutará en http://localhost:8030 por defecto.
Los siguientes Endpoints a ejecutar son:

#### - Crear Conductores
```bash
  curl --location --request POST 'http://localhost:8030/driver/createDriver'
  ```
Formato JSON
```bash
  {
    "dni":"123456",
    "surname":"apellido prueba",
    "name":"nombre prueba",
    "phone":"123456",
    "address":"dirección prueba"
}
  ```
#### - Listar todos los conductores
```bash
  curl --location --request GET 'http://localhost:8030/driver/findAll'
  ```
Formato JSON
```bash
no es necesario enviar un body para obtener la información.
  ```

#### - Crear vehiculos
```bash
  curl --location --request POST 'http://localhost:8030/vehicle/create_vehicle'
  ```

Formato JSON
```bash
{
    "model":"2000",
    "plate":"QPP70G",
    "capacity":"1000kg",
    "driverId":"52"
}
  ```