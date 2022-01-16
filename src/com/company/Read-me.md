<h1>Metodreferenser</h1>

<h2>Översikt</h2>
Uppgifterna behandlar metodreferenserFör att kunna genomföra uppgifterna bör man först ha genomfört de tidigare
övningsuppgifter som är knutna till funktionella interface och lambdas.
<h3>Genomförande</h3>
Övningsuppgifter är inte ett obligatoriskt moment i kursen och genomförs individuellt eller i grupp.
Uppgifterna är indelade i 2 nivåer.

Nivå 1 är generellt mer grundläggande uppgifter som ligger nära det vi diskutera under föreläsningarna och lektioner.
Har man god koll på uppgifterna i nivå 1 har man en god grund för att klara av att bli godkänd i kursen på de 
obligatoriska momenten.

Nivå 2 är uppgifterna som är lite svårare, och som kräver lite mer självständigt klurande och självständigt arbetande.
Har man god koll på uppgifterna i nivå 2 så har man en god grund att stå på för att kunna få ett högre betyg i kursen.

<h3>Uppgifter</h3>
<h4>Nivå 1</h4>
1.Vad innebär det att en lambda-expression är en s.k. pass-through lambda?

2.Vilka av följande kan omvandlas till metodreferenser:  x -> Integer.sum(x, 2),  x -> Math.sqrt(x),  x -> x.toString().toUpperCase();

3.Översätt följande lambda expressions till metodreferenser:str -> str.toUpperCase();str -> System.out.println(str);name ->  new Person(name);str -> Integer.valueOf(str)

4.Skapa tänkbara lambda-expressions från följande metodreferenser: String::length, Person::getName, Math::sqrtSystem.out::println, System.out::println

5.Översätt  (x, y) -> Integer.sum(x, y) till formen för metodreferens.

<h4>Nivå 2</h4>
1.Översätt Function<Integer, String> intToString =  x -> x.toString() till formen för metodreferens. Funkade det som förväntat? Om inte, vad föreslår intellij och vad kan problemet tänkas vara här