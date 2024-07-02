# ConversorDeMonedas
Conversor de monedas obteniendo su tasa y valor real por medio de una API
Este proyecto se realizo en base a lo aprendido en el curso de Alura, llamado "Java orientacion a objetos G6" de parte del programa Oracle - One. 
Dentro de lo que es una aplicacion de conversion de monedas, esta misma esta conectada a una API donde extrae el valor de la moneda en tiempo real, pasando asi por la conexion y lectura de datos de la misma base de datos de EXCHANGE. 
Tenemos 4 clases que seran explicada

RecordMoneda: Esta clase se encargara de conseguir los atributos y grabarlos para su lectura para posteriormente convertirlos.


ConsultaMoneda: En esta clase hacemos la conexion hacia la API mediante nuestra API Key para poder buscar la informacion.


CambiarMoneda: Esta clase contendra los metodos converitr la cual se encargara de converitr monedas ya establecidas dentro de las opciones y recurriendo al RecordMoneda para encontrarlas. Por otro lado el metodo convertirOtraMoneda buscara las monedas solicitadas por el usuario


Principla: Este sera el main de nuestro aplicacion donde inicializaremos los objetos y desplegaremos un menu de opciones con un ciclo while para que el usuario pueda escoger.
