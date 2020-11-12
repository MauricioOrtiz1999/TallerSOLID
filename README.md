# TallerSOLID

1.	Clases Helado y Pastel. Tienen mucha similitud, se debería crear una clase padre llamada Postre. 
Se está violando el principio de responsabilidad única, este principio nos habla que una clase debe 
tener una sola razón para existir, en este caso ambas clases son prácticamente idénticas solo cambia 
su método toString(), de tal forma que si se sintetizaran se reducirían procesos innecesarios, también 
puede alegarse que no se está usando el principio de sustitución de liskov.

2.	Clases Procesos.OperacionesAderezo y Postre. La clase OperacionesAderezo no es necesaria, sus 
métodos de añadir y quitar aderezos pueden ser incluidas dentro de la clase postre, se está violando 
principio de Inversión de dependencia, las implementaciones completas no deben depender de otras, en 
este caso la clase de Postre debe de cumplir con una implementación completa y por ello debe de tener 
los métodos que yacen en la clase OperacionesAderezo. 

3.	Métodos calcularPrecioFinal() y  showPrecioFinal() de las clases Helado y Postre están muy 
relacionados, deben estar en otra clase por si cambia la fórmula de cálculo. La clase nueva debe 
llamarse Procesos.ManejadorDePrecio. se está violando el principio abierto cerrado, el cual explica que 
una clase debe estar abierta a expansión pero cerrada a modificación.

4.	Enum Adicionales.Aderezo es muy estático, debe convertirse en clase abstract con un atributo nombre 
y un método abstracto setNombre para que cada tipo de aderezo sea una subclase de Aderezo e implemente 
dicho método. También, sobrescriba el método toString() en la clase Aderezo, para que devuelva el nombre 
del aderezo en mayúsculas. Los cambios que se están realizando se debe a que se está violando el principio 
Inversión de dependencia, la clase Aderezo debe depender de una interfaz.

5.	Paquete Leche y la clase Procesos.ManejadorDeLeche. Existe un error con respecto a la leche descremada 
en pastel que lanza una excepción, se viola principio inversión de dependencia puesto que los módulos de alto 
nivel dependen de módulos de bajo nivel, y eso ocasiona una excepción.
