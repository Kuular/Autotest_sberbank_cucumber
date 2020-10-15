Feature: ПО Сбербанк-АСТ клик по
  Клик по выпадающему меню

  @myFirstCucTest
  Scenario: Совершается клик и переход на другую страницу
    Given открыть сайт 'https://www.sberbank-ast.ru/'
    Then кликаем меню 'Главная' и 'СМИ о нас'


