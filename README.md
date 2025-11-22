<em> Challenge ONE G9 Conversor de Monedas </em>
Estado del proyecto: Completado :white_check_mark:

## Introduccion
Es un conversor de monedas simple que utiliza la API de ExchangeRate para consultar los valores de las monedas y realizar conversiones; parte de las tareas en el programa
ONE G9. Por ahora solo tiene 6 monedas disponibles pero con el tiempo quizas le añada mas o mejore el codigo. Las monedas disponibles son: Dolar Estadounidense, Bolivar 
Soberano, Peso Argentino, Real Brasileño, Peso Colombiano y Peso Chileno.

## :hammer:Como funciona el conversor?
- `Paso 1`: Lo primero que se ve al ejecutar el codigo es el menú mostrando las 6 monedas disponibles e indicandote que elijas el numero de las monedas que
- deseas usar para la conversion, ademas de la pregunta "Desde que moneda deseas realizar la conversion?", aca debes elegir la moneda base.-

[Imagen inicial al ejecutar el codigo]<img width="1141" height="307" alt="image" src="https://github.com/user-attachments/assets/32e28362-2dff-4b84-9408-044c19754059" />

  
- `Paso 2`: Muy bien, luego de elegir la moneda base te pedira que elijas la moneda objetivo, esto para hacer la consulta en pares a la API. Si te equivocas y
- terminas eligiendo una opcion invalida, no te preocupes, el codigo mostrara un mensaje y mostrará la pregunta "Desea salir? s/n", solo debes escribir y enviarle n para
- que el codigo vuelva a iniciar.-

[Solicitud de moneda objetivo]<img width="1150" height="330" alt="image" src="https://github.com/user-attachments/assets/644a41a3-4e12-4a14-b011-c3d39770c223" />
[Muestra de error de opcion invalida]<img width="1147" height="336" alt="image" src="https://github.com/user-attachments/assets/0fb376b7-7841-4dbb-9fca-d6480546d246" />

- `Paso 3`: En caso de que hayas hecho todo bien y el codigo se haya ejecutado con normalidad, por ultimo te pedira que escribas la cantidad que deseas
- convertir.-

  [Solicitud de cantidad de moneda que se desea convertir]<img width="1144" height="333" alt="image" src="https://github.com/user-attachments/assets/ba804180-03b5-4a48-b972-dff3af3023be" />

- `Paso 4`: Ya por ultimo te mostrara la conversion junto al radio de conversion y los codigos de las monedas que seleccionaste y te preguntará si deseas salir. (Ten en
- cuenta que la conversion seria "cantidad de moneda base a moneda objetivo", es decir, la cantidad que seleccionaste de la moneda base se convertirá a la moneda objetivo)

  [Resultado de la conversion y muestra de datos]<img width="1151" height="332" alt="image" src="https://github.com/user-attachments/assets/9f558705-820f-48c5-ae70-7657de023b60" />

## 📁 Acceso al proyecto
Para descargar el proyecto solo debes presionar el boton "<> Code" y te desplegara unas opciones, la forma mas facil sería darle a la opcion de "Download ZIP", este 
automaticamente descargará el archivo y se guardara en la carpeta de descargas de tu equipo. Tambien puedes clonarlo usando git para eso tendrias que crear un repositorio
local con git y poner este comando "git clone <url>" (reemplaza "url" por la url que te proporciona el repositorio).

[Abrir opciones de descarga]<img width="873" height="663" alt="image" src="https://github.com/user-attachments/assets/350ffc8e-8121-42d1-afb1-030125706f26" />
[lista de opciones]<img width="863" height="590" alt="image" src="https://github.com/user-attachments/assets/891245e2-5710-4563-bffc-bc4cb574d564" />

## 🛠️ Abre y ejecuta el proyecto
Para abrir en caso de que lo hayas descargado, solo tendrias que descomprimir el ZIP, abrir tu IDE, ir al menú File y darle a la opcion de "open", de ahi solo tienes que
navegar hasta donde está la carpeta del proyecto, seleccionarla y darle en "select folder" (el proceso varía segun el IDE).
En caso de que lo hayas clonado, el proceso es el mismo solo que se salta el paso de descomprimir el ZIP ya que al clonarlo el proyecto se descargará directamente en la 
carpeta que hayas seleccionado al crear el repositorio.

Ya por ultimo para ejecutarlo solo tienes que ir a la clase "Principal" y darle en "Run" (la opcion "Run" varia segun el IDE). (Si, no se crear ejecutables).

## Autor
[<img width="420" height="420" alt="image" src="https://github.com/user-attachments/assets/5906cc3b-ed4b-431b-b7be-67188694eaf9" /><br><sub>Geremy Quiñonez</sub>](https://https://github.com/Skewer25)
