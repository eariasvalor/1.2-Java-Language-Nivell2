# Exercici 1

📄 **Descripció - Enunciat de l'exercici**

# Exercici 1 - Classe Entrada i control d’excepcions amb Scanner

📄 **Descripció - Enunciat de l'exercici**

Crea una classe anomenada `Entrada`.  
Aquesta classe ha de servir per controlar les diferents excepcions que poden aparèixer en Java a l’hora d’introduir dades per teclat utilitzant la classe `Scanner`.

El primer que s’ha de fer és instanciar un objecte de la classe `Scanner` i a partir d’aquí, crear mètodes estàtics per llegir els diferents tipus de dades des del teclat.  

**Important:**  
És important que si en algun mètode salta una excepció, la tractem i tornem a demanar la dada a l’usuari/ària fins que aquesta estigui ben introduïda.  
Per exemple: si introdueix un `float` amb un punt en lloc d'una coma, ha de mostrar “Error de format”.  
Fins que l’usuari/ària no introdueixi un `float` ben format, ha de seguir demanant la dada.

Tots els mètodes reben un `String` amb el missatge que es vol mostrar a l’usuari/ària (ex: *“Introdueix la teva edat”*) i retornen la dada introduïda pel teclat.


**Mètodes a implementar**

-> Capturant l’excepció de la classe `InputMismatchException`:
public static byte llegirByte(String missatge);
public static int llegirInt(String missatge);
public static float llegirFloat(String missatge);
public static double llegirDouble(String missatge);


->Capturant una excepció personalitzada de la classe Exception:
public static char llegirChar(String missatge);
public static String llegirString(String missatge);
public static boolean llegirSiNo(String missatge);
El mètode llegirSiNo retorna true si l’usuari/ària introdueix “s” i false si introdueix “n”.

-----------------------------------

💻 Tecnologies Utilitzades

- Java SE 21 (o superior)
- IDE (IntelliJ IDEA)
- Terminal per a compilar i executar amb javac i java

-----------------------------------

📋 Requisits

- JDK 17 o superior instal·lat
- Variable d’entorn JAVA_HOME configurada
- Accés a terminal/command prompt
- Opcional: un IDE per facilitar l’execució

---

🛠️ Instal·lació

1. Clona aquest repositori:
   git clone <URL-del-repositori>
2. Accedeix al directori del projecte:
   cd n1exercici1
3. Comprova que tens Java instal·lat:
   java -version

-----------------------------------

▶️ Execució

1. Compila el projecte:
   javac *.java
2. Executa la classe principal:
   java N1Exercici1

🌐 Desplegament

Per desplegar el projecte en un entorn de producció o servidor:
1. Empaqueta el projecte en un .jar:
   jar cfe n1exercici1.jar n1exercici1 *.class
2. Puja l’arxiu .jar al servidor.
3. Executa’l amb:
   java -jar n1exercici1.jar

🤝 Contribucions

Les contribucions són benvingudes! Si vols participar:
1. Fes un fork del repositori.
2. Crea una nova branca:
   git checkout -b feature/NovaFuncionalitat
3. Fes els teus canvis i commiteja’ls:
   git commit -m 'Afegeix Nova Funcionalitat'
4. Puja els canvis a la teva branca:
   git push origin feature/NovaFuncionalitat
5. Fes un pull request.
