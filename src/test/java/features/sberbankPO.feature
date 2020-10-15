Feature: ПО Сбербанк-АСТ
  Открытие сайт Сбербанка-АСТ

  @myFirstCucTest
  Scenario: Проверка перехода
    Given перейти на 'https://www.sberbank-ast.ru/'
    When ищем меню 'Главная', кликаем
    Then закончить работу