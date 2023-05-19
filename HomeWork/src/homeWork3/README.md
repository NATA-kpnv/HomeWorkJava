homeWork3.api - содержит Интерфейсы <br>
homeWork3.test - содержит Тесты для калькуляторов<br>
homeWork3.runners - классы для запуска всех калькуляторов<br>
homeWork3.simple - три класса базовых калькуляторов; <br>
homeWork3.additional : классы калькуляторов с доплнительной логикой <br>
 - CalculatorStringExpression  - парсинг строки с математическим выражением<br>
 - CalculatorWithCounterAutoAgregation -  тип калькулятора определяется в классе;<br>
 - CalculatorWithCounterAutoAgregationInterface<br>
 - CalculatorWithCounterAutoChoiceAggregation - тип калькулятора -  входной параметр конструктора <br>
 - CalculatorWithCounterAutoComposite - демонстрирует агрегацию и делегацию ( в конструктор входным параметром один из базовых калькуляторов,  реализующие интерфейс ICalculator )<br>
 - CalculatorWithCounterAutoDecorator - используется для патерна декораторы, для реализации доп логики памяти<br>
 - CalculatorWithCounterAutoSuper  - доп. логика по подсчет количества операций автоматически<br>
 - CalculatorWithCounterClassic - доп. логика по подсчет количества операций, не автоматически<br>
 - CalculatorWithMemory - доп. логика по записи последней операции в память<br>
 - CalculatorWithMemoryDecorator - используется для патерна декораторы, для реализации доп логики подсчета операций<br>

