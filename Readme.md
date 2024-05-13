# DAW-Programación

## Examen Evaluación Ordinaria

**NOMBRE:** *Tu nombre aquí*

### Descripción del problema

Una tienda de venta de electrodomésticos quiere organizar su stock para ventas teniendo en cuenta los siguientes criterios:

- De todos los electrodomésticos se desea almacenar su código, descripción, fabricante, modelo, stock y precio unitario.
- El código será un objeto de la clase `Codigo` que contendrá un valor alfanumérico formado por 8 caracteres que podrán ser letras mayúsculas y/o números.
- Cuando se registre un nuevo electrodoméstico el usuario introducirá su código y el sistema, antes de crear el código y dar de alta el electrodoméstico, comprobará si el código es correcto, de no serlo, se volverá a pedir al usuario.
- Los electrodomésticos pueden clasificarse en grandes electrodomésticos o pequeños electrodomésticos.
- De los grandes electrodomésticos se almacenará además su peso y medidas (alto, ancho y fondo) en cm.
- Los grandes electrodomésticos implementarán una interfaz que les obligará a desarrollar un método que calcule los gastos de envío que se calculan multiplicando el peso por los metros cúbicos (los metros cúbicos se calculan multiplicando ancho x alto x fondo y dividiendo el resultado entre 1000000), sin pasar nunca los 50€, que es el precio máximo de envío.
- Los grandes electrodomésticos, a su vez, se dividen en electrodomésticos que requieren instalación y electrodomésticos que no requieren instalación.
- Todos los electrodomésticos tendrán un método para calcular su precio, que se calculará de la siguiente forma:
    - Pequeños electrodomésticos: su precio.
    - Grandes electrodomésticos: su precio + gastos de envío. En el caso de los electrodomésticos que requieren instalación habrá un coste adicional de 15€.

### Requisitos del programa

El programa principal constará de un menú con las siguientes opciones:

1. **Añadir electrodoméstico:** preguntará al usuario por el tipo de electrodoméstico a añadir con toda la información necesaria y lo añadirá en una lista, única para todos los tipos de electrodomésticos, de tamaño variable.
2. **Vender electrodoméstico:** preguntará al usuario si desea comprar un gran electrodoméstico o un pequeño electrodoméstico, mostrando a continuación todos los que se correspondan con la petición del usuario. El usuario introducirá el código y la cantidad del que se va a vender y, en caso de que haya stock suficiente, actualizará el stock y mostrará el precio total. De no haber stock se lo comunicará al usuario y volverá a mostrar el listado de electrodomésticos que se corresponden con la elección del usuario.
3. **Eliminar electrodoméstico:** mostrará un listado de todos los electrodomésticos y se pedirá el código del que se desea eliminar. Si existe, lo elimina de la lista. Si no existe, muestra un aviso indicando que no existe el código proporcionado.
4. **Salir:** se sale del programa.

Para evitar que al cerrar el programa se pierdan los datos introducidos, se implementará el código necesario para que, al iniciarse el programa, cargue el listado de electrodomésticos desde un fichero binario (en caso del que fichero exista). Al salir del programa deberá guardar en dicho fichero el listado de electrodomésticos actualizado.
