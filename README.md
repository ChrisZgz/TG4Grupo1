# TG4Grupo1
## Introducción

    # Estructuras de aplicacion

        La aplicacion se divide en diversas carpetas donde cada uno representa una funcion 
        diferente al resto cada paquete contiene sus clases correspondientes y estas se dividen 
        en Codigo y Interfaz.


        BBDD {
            Aqui se encuentran todas las clases que conectan con la base de datos y interactuan de alguna manera con esta
            DownloadJson : Permite la descarga del JSON para poder trabajar sobre esta
            ModeloAdo : En esta clase se generan los metodos para para poder interactuar con la base de datos 
            ModeloHelper : Crea la base de datos 
        }

        Utilidades {
            Métodos: Aqui se encuentran los métodos que tienden a utilizarse en varias clases, para
            no repetir código
        }

        Vista {
            Main: Aqui se encuentra un ScrollView con una amplia selección de juegos de Steam
            Splash: Esta sería la pantalla de login
            
        }

        

    #Estructuras de proyecto
        #Actividades
            #(Nicolas Del Amo / Código (Vistas y JSON))
                Se encargará de la gestión del archivo JSON y la programación de las vistas
                    Programación / AlertDialogs / Vistas

            #(Daniel Alvaro del Rio / Interfaz)
                Se encargará de la interfaz y las decisiones de diseño
                    Diseño / ActivityMain / 

            #(Christian Martinez / Jefe de Proyecto - Código(BBDD y Adapter))
                Se encargará de la gestión de la Base de datos y la programación del adapter
                    Programación / BBDD / Utilidades

            #(Miguel Lizaranzu / Interfaz)
                Se encargará de ayudar al deseño de las interfazes
                    Diseño / Alert Dialogs / 

        # Controles:
            - Un boton en el login para poder ir a la biblioteca
            -

    #Descripción del proyecto
        #Descripción general
            La aplicación consiste en una biblioteca de Steam, empezará con una pantalla de login, y
            si los datos introducidos son correctos, nos llevará directamente a la biblioteca, donde 
            se podrá ver una gran variedad de juegos
            
        #Descripción detallada de cada uno
            (Nicolas del amo)
            [Se ocupa de la programación de las vistas así como de la programación de los alertdialogs
            y la creación del modelo de la biblioteca]

            (Daniel del rio)
            [Se ocupa de las ideas de diseño, la interfaz y lo que conlleva(estilos, fuentes, etc...)]

            (Christian martinez)
            [Se ocupa de la gestión del JSON y una clase de métodos a utilizar en la aplicación]

            (Miguel Lizaranzu)
            [Se ocupa de la creación de los alert dialogs y asistir en el diseño de la interfaz]
