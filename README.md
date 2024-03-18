# Biblioteca La Pingüinera

Proyecto en consola realizado en Java para la administración de una biblioteca, usuarios y textos.

- [Tecnologías](#tecnologías)
- [Validaciones](#validaciones)
- [Patrones_de_diseño](#patrones_de_diseño)
- [Pruebas_unitarias](#pruebas_unitarias)

## Tecnologías

- Java
- Maven
- Mockito
- JUnit

## Validaciones

```console
/src/main/java/src/dalidations/*
```

## Patrones_de_diseño

Se encuentran guardados en los ultimos commits de la rama test/designpatterns. También están presententes en esta rama development que es la más actualizada y donde todo funciona bien.

A continuación donde están referenciados en esta rama:

Patrón asignado: Prototype.

Se encuentra presente en estos archivos:

```console
** Objetos con el método clone **

src/main/java/src/models/texts/Book.java
src/main/java/src/models/texts/Novel.java

** implementación **

src/main/java/src/usecases/book/UpdateBookUseCase.java
src/main/java/src/usecases/novel/UpdateNovelUseCase.java
```

Patrón escogido: Command.

Se encuentra presente en estos archivos:

```console

** La interfaz Command **

src/main/java/src/usecases/ui/menu/command/Command.java

** El invocador **

src/main/java/src/usecases/ui/menu/command/Invoker.java

** Los comandos **

src/main/java/src/usecases/ui/menu/command/AdministratorCommand.java
src/main/java/src/usecases/ui/menu/command/AssistantCommand.java
src/main/java/src/usecases/ui/menu/command/ReaderCommand.java

** Se implementa **

src/main/java/src/usecases/ui/menu/ShowLogInMenuUseCase.java
```

## Pruebas_unitarias

```console
src/test/java/usecases*
```
