# -poo_tp5_grupo8

# Ejercicio 1 - Ecommerce

## Historias de Usuario

**HU1.** Como cliente, quiero tener un carrito de compras asociado a mi usuario, para poder gestionar los productos que deseo comprar.

**HU2.** Como cliente, quiero agregar productos al carrito indicando producto y cantidad, para incorporarlos a mi compra.

**HU3.** Como cliente, quiero que al agregar un producto que ya está en el carrito se acumule la cantidad, para evitar ítems duplicados.

**HU4.** Como cliente, quiero remover un producto del carrito, para quitarlo de mi compra.

**HU5.** Como cliente, quiero vaciar el carrito, para eliminar todos los productos cargados.

**HU6.** Como cliente, quiero consultar el importe total del carrito, para saber cuánto debo pagar.

**HU7.** Como cliente, quiero visualizar el detalle del carrito con producto, cantidad y subtotal, para revisar mi compra antes de finalizarla.

**HU8.** Como cliente, quiero que el sistema impida agregar productos nulos, inactivos o cantidades menores o iguales a cero, para evitar operaciones inválidas.

**HU9.** Como cliente, quiero que el carrito calcule el subtotal de cada ítem como precio por cantidad, para reflejar correctamente el total de la compra.

**HU10.** Como administrador, quiero registrar productos con código, nombre y precio, para mantener actualizado el catálogo.

**HU11.** Como administrador, quiero que el sistema valide que el código y el nombre del producto no sean nulos y que el precio no sea negativo, para asegurar datos válidos.

**HU12.** Como administrador, quiero inicializar un conjunto de productos, para disponer de un catálogo inicial en el sistema.

**HU13.** Como administrador, quiero buscar productos por código, para localizarlos rápidamente.

**HU14.** Como administrador, quiero buscar productos por nombre, para localizarlos rápidamente.

**HU15.** Como administrador, quiero listar todos los productos, para consultar el catálogo disponible.

**HU16.** Como administrador, quiero eliminar productos, para darlos de baja del catálogo.

**HU17.** Como administrador, quiero evitar registrar productos duplicados, para no repetir productos en el catálogo.

**HU18.** Como administrador, quiero mostrar la información de un producto, para consultar sus datos.

**HU19.** Como administrador, quiero activar o desactivar productos, para controlar si pueden ser agregados al carrito.

**HU20.** Como administrador, quiero que los productos se comparen por código, para detectar duplicados aunque tengan otro nombre.

# Ejercicio 2 - Logística

## Historias de Usuario

**HU1.** Como operador logístico, quiero registrar un envío indicando remitente, destinatario y dirección de entrega, para poder iniciar su gestión y que quede en estado GENERADO.

**HU2.** Como operador logístico, quiero agregar paquetes a un envío, para especificar qué contiene.

**HU3.** Como operador logístico, quiero asignar un envío a una ruta diaria, para que sea trasladado por un vehículo.

**HU4.** Como operador logístico, quiero que el sistema impida asignar a una ruta un envío sin paquetes cargados, para evitar rutas vacías.

**HU5.** Como operador logístico, quiero que el sistema impida asignar un envío a una ruta si el peso total supera la capacidad del vehículo.

**HU6.** Como operador logístico, quiero consultar la información detallada de un envío, para hacer seguimiento.

**HU7.** Como administrador, quiero registrar vehículos con patente, capacidad de peso y capacidad de volumen para poder asociarlos a rutas.

**HU8.** Como administrador, quiero crear rutas diarias asociadas a una fecha y un vehículo, para organizar los envíos del día.
