# Zaliczenie-android

Aplikacja składa się z dwóch stron.
Pierwsza strona: Model: MainActivity.java wraz z Layout activity_main.xml 
Druga strona: Model: Activity2.java wraz z Layout activity_2.xml

Metody użyte w projekcie: 

1) RecyclerView
2) Button wraz z metodą przejścia na kolejna strone
3) Logowanie: 
      LOGIN/EMAIL - admin
      HASŁO - Password
4) Spinner


1) RecyclerView służy do wyświetlania dużej ilości zestawów danych, które można przewijać przy ograniczonej liczbie kodu oraz widoków.
Tworzy się jeden wygląd dla wszystkich elementów, a RecyclerView dynamicznie tworzy i odtwarza poszczególne elementy. 

2) Button – to przycisk, który informuje, jakie działanie się wykonana, gdy użytkownik go przyciśnie. 
W naszym projekcie klikając button o tekście: Zaloguj się.; przekierowuje użytkownika do strony logowania. 

3) Spinner -  umożlwia szybki wybór jednej wartości z zetawu wartości.
Dotknięcie „pokrętła” spowoduje wyświetlenie menu rozwijanego  ze wszystkimi dostępnymi wartościami, z których użytkownik może wybrać nową wartość, która będzie się w stanie domyślnym pokazywać aktualaną wybraną wartość.

Druga strona aplikacji składa się z Logowania do aplikacji oraz przycisku Button, który służy do powrotu do strony głównej. DANE DO LOGOWANIA:	  LOGIN/EMAIL – admin 	HASŁO - Password
Logowanie z hasłem:  Gdy użytkownik nie wprowadzi żadnych danych pojawi się komunikat „Puste dane” 
Gdy użytkownik wpisze login oraz hasło nie poprawne pojawi się komunikat „Niepoprawny login/hasło”
Gdy użytkownik wpisze poprawny login oraz hasło wybije komunikat „Udane logowanie”
Przycisk Button Login służy do zweryfikowania porawności wpisanych danych w logowaniu oraz przekierowania do pierwotnej strony. 
![Obraz1](https://user-images.githubusercontent.com/62775334/213670688-104a4097-c50d-4b1d-a09f-286254a6d0d7.png)

