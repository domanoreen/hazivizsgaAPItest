Ez a projekt a Junior Automata Tesztelő házivizsga részeként készült,
a JSONPlaceholder nyilvános REST API tesztelésére.

A megoldás egy Java alapú Maven projekt, amely JUnit 5 és RestAssured
használatával valósít meg automatizált API teszteket a /posts végpontra.
A tesztek a feladatkiírásban megadott elvárások alapján készültek,
pozitív és negatív teszteseteket is lefedve.

A tesztek futtathatók Eclipse környezetből és parancssorból is. A projekt GitHub Actions CI-be van integrálva, így
push hatására a tesztek automatikusan lefutnak, és Maven Surefire
tesztriport készül.
