homeWork3.api - содержит Интерфейсы
homeWork3.test - содержит Тесты для калькуляторов
homeWork3.runners - классы для запуска всех калькуляторов
homeWork3.simple - три класса базовых калькуляторов;
homeWork3.additional : классы калькуляторов с доплнительной логикой 
 - CalculatorStringExpression  - парсинг строки с математическим выражением
 - CalculatorWithCounterAutoAgregation -  тип калькулятора определяется в классе;
 - CalculatorWithCounterAutoAgregationInterface
 - CalculatorWithCounterAutoChoiceAggregation - тип калькулятора -  входной параметр конструктора
 - CalculatorWithCounterAutoComposite - демонстрирует агрегацию и делегацию ( в конструктор входным параметром один из базовых калькуляторов,  реализующие интерфейс ICalculator )
 - CalculatorWithCounterAutoDecorator - используется для патерна декораторы, для реализации доп логики памяти
 - CalculatorWithCounterAutoSuper  - доп. логика по подсчет количества операций автоматически
 - CalculatorWithCounterClassic - доп. логика по подсчет количества операций, не автоматически
 - CalculatorWithMemory - доп. логика по записи последней операции в память
 - CalculatorWithMemoryDecorator - используется для патерна декораторы, для реализации доп логики подсчета операций

