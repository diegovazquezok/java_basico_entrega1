package Entrega789;

public class Punto4 {

    /* Indica cuál es el problema de utilizar un Vector con la capacidad por defecto si tuviésemos 1000 elementos para ser añadidos al mismo.

    El problema de utilizar un Vector con la capacidad por defecto si se tienen 1000 elementos para ser añadidos al mismo, es que el Vector tendrá que redimensionarse
    varias veces a medida que se agreguen más elementos, lo que puede causar una degradación significativa del rendimiento.

Por defecto, un Vector en Java tiene una capacidad inicial de 10 elementos. Esto significa que si se van a agregar 1000 elementos,
el Vector tendrá que redimensionarse varias veces para acomodarlos, lo que implica una sobrecarga significativa en términos de tiempo y recursos.

Para evitar este problema, se recomienda especificar una capacidad inicial adecuada al crear el Vector, para que tenga suficiente espacio para acomodar todos los elementos
sin necesidad de redimensionar el Vector varias veces. Esto se puede hacer pasando la capacidad inicial deseada al constructor del Vector, por ejemplo:

Vector<Object> vector = new Vector<>(1000);

De esta manera, se creará un Vector con una capacidad inicial de 1000 elementos, lo que permitirá agregar los 1000 elementos sin necesidad de redimensionar el Vector.
     */
}
