# Docker Spar Aws Services

Aplicacion almacenada dentro de un contenedor de docker que utiliza a su vez una instancia de Mongo DB y permite guardar documentos dentro de la base. Por medio de una petición http POST, usando el framework SPARK.

### Prerequisitos
Se recomienda contar con las siguientes versiones instaladas:
```
version de java: 15
version de compilador: 1.8
Apache maven: 3.6.3 
```

### Instalación
Para uso del proyecto requerimos clonar este repositorio. Siga los pasos:

1. Clonamos el repositorio con ayuda de git
```
git clone https://github.com/JohannCepeda16/AREP-Lab4
```

2. Accedemos a la carpeta donde hemos clonado
```
cd AREP-Lab4
```

3. Compilamos nuestro proyecto para generar el target
```
mvn package
```

4. Abrimos el proyecto con nuestro editor de preferencia
```
code .
```

### Corriendo las pruebas
Si queremos ejecutar las pruebas de nuestro proyecto debemos ubicarnos en la raiz del pryecto y usar el comando
```
mvn test
```

## Programa hecho con

* [Maven](https://maven.apache.org/) - Dependency Management

## Actor

* **Johann Cepeda** - [johanncepeda16]("https://github.com/JohannCepeda16")


## Licencia

This project is licensed under the MIT License - see the [LICENSE.md](LICENSE.txt) file for details

## Diseño

La aplicacion se encuentra desplegada dentro de un contenedor de docker 
![](https://github.com/JohannCepeda16/AREP-Lab4/blob/main/resources/dockerPNG.PNG)

Conectada a una instancia de mongodb donde contamos con algunos registros realizados anteriormente
![](https://github.com/JohannCepeda16/AREP-Lab4/blob/main/resources/mongo.PNG)

A su vez, se encuentra desplegada en una maquina virtual ofrecida por AWS en el contexto EC2
![](https://github.com/JohannCepeda16/AREP-Lab4/blob/main/resources/aws.PNG)

## JavaDoc

La documentación del proyecto la puede econtrar siguiendo este  [enlace](https://github.com/JohannCepeda16/AREP-Lab4/tree/main/src/site/apidocs) o lo generamos con el siguiente comando 
```
mvn javadoc:javadooc
```




