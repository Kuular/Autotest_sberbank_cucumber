Feature: Проверка открытия
  Проверяем сайт по тайтлу

  @myFirstCucTest
  Scenario: Тайтл соответсвует
    Given перейти на сайт 'https://www.sberbank-ast.ru/'
    Then тайтл содержит текст 'Сбербанк-АСТ'
    Then закончить работу сайта
